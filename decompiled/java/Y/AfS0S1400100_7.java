package Y;

import X.C098200Yq;
import X.C09JN;
import X.C0JCX;
import X.C0K2R;
import X.C0KFM;
import X.C0KLW;
import X.C0KM4;
import X.C0KM8;
import X.C0KMZ;
import X.C118300cf;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.C221600tK;
import X.C2252331DDr;
import X.C512160K6s;
import X.C516000KLm;
import X.C516050KLr;
import X.C783810Uot;
import X.InterfaceC472150IfN;
import X.RunnableC783840Uow;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.IPgcSubscribeSuccessLegacyBridge;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class AfS0S1400100_7 implements C09JN {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S1400100_7 afS0S1400100_7, Object obj) throws JSONException {
        Unit unit;
        C1C7U.LIZ("ResubscribeStrategy@155b.queryResubscribeStatus$1$6");
        C516050KLr c516050KLr = C516050KLr.LIZ;
        String str = afS0S1400100_7.s0;
        C0KM4 c0km4 = C0KM4.QUERY_ORDER_SUCCEED;
        c516050KLr.getClass();
        C516050KLr.LIZJ(str, -1, c0km4);
        C2252331DDr c2252331DDr = C512160K6s.LIZ;
        C512160K6s.LIZ(new C221600tK(((C0KFM) afS0S1400100_7.l2).LJIIIZ));
        C0KFM c0kfm = (C0KFM) afS0S1400100_7.l2;
        try {
            IPgcSubscribeSuccessLegacyBridge iPgcSubscribeSuccessLegacyBridgeLIZ = C0K2R.LIZ();
            if (iPgcSubscribeSuccessLegacyBridgeLIZ != null) {
                iPgcSubscribeSuccessLegacyBridgeLIZ.LIZ(c0kfm.LJIIIZ);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C0JCX.LIZ(2131839646);
        C516000KLm c516000KLm = C516000KLm.LIZ;
        String str2 = afS0S1400100_7.s0;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS0S1400100_7.j5;
        int i = ((C118300cf) afS0S1400100_7.l1).element;
        C0KFM c0kfm2 = (C0KFM) afS0S1400100_7.l2;
        String str3 = c0kfm2.LIZLLL;
        String str4 = ((C0KMZ) afS0S1400100_7.l3).LIZ;
        c0kfm2.LIZJ.get();
        c516000KLm.LJIILLIIL(true, str2, jCurrentTimeMillis, i, str3, str4, C0KM8.LIZ(), "success", C2097608Jq.LJ(), (C0KFM) afS0S1400100_7.l2);
        C0KLW c0klw = (C0KLW) afS0S1400100_7.l4;
        if (c0klw != null) {
            c0klw.LIZ(null, "resume subscription success", "resume subscription success", null);
        }
        C1C7U.LIZIZ("ResubscribeStrategy@155b.queryResubscribeStatus$1$6");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS0S1400100_7 r15, java.lang.Object r16) {
        /*
            r11 = r16
            java.lang.Object r9 = r15.l1
            X.0Uot r9 = (X.C783810Uot) r9
            java.lang.Object r4 = r15.l2
            X.0IfN r4 = (X.InterfaceC472150IfN) r4
            java.lang.String r10 = r15.s0
            long r0 = r15.j5
            java.lang.Object r14 = r15.l3
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r3 = r15.l4
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r9.getClass()
            java.lang.String r7 = "LiveServiceAdapter@4348.requestLivePermissionFromServer$3L"
            X.C1C7U.LIZ(r7)
            r2 = 0
            X.C783810Uot.LJII = r2
            r4.onFailed(r11)
            java.lang.String r4 = "shoot"
            boolean r2 = r4.equals(r10)
            if (r2 == 0) goto L38
            Y.ARunnableS107S0100000_7 r5 = new Y.ARunnableS107S0100000_7
            r2 = 272(0x110, float:3.81E-43)
            r5.<init>(r11, r2)
            X.C486790J7d.LIZ(r5)
        L38:
            boolean r2 = r11 instanceof X.C1494430ozZ     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L48
            r2 = r11
            X.0ozZ r2 = (X.C1494430ozZ) r2     // Catch: java.lang.Throwable -> L93
            int r2 = r2.getStatusCode()     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            goto L98
        L48:
            boolean r2 = r11 instanceof X.C1494690ozz     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L78
            r2 = r11
            X.0ozz r2 = (X.C1494690ozz) r2     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r2.getRequestLog()     // Catch: java.lang.Throwable -> L93
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L93
            if (r2 != 0) goto L97
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L93
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "base"
            org.json.JSONObject r6 = r5.optJSONObject(r2)     // Catch: java.lang.Throwable -> L93
            if (r6 == 0) goto L97
            java.lang.String r5 = "net_error"
            r2 = r11
            X.0ozz r2 = (X.C1494690ozz) r2     // Catch: java.lang.Throwable -> L93
            int r2 = r2.getStatusCode()     // Catch: java.lang.Throwable -> L93
            int r2 = r6.optInt(r5, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            goto L98
        L78:
            boolean r2 = r11 instanceof X.C501470JlZ     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L88
            r2 = r11
            X.0JlZ r2 = (X.C501470JlZ) r2     // Catch: java.lang.Throwable -> L93
            int r2 = r2.getErrorCode()     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            goto L98
        L88:
            boolean r2 = r11 instanceof X.C1494450ozb     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L97
            r2 = -106(0xffffffffffffff96, float:NaN)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L93
            goto L98
        L93:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
        L97:
            r15 = 0
        L98:
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r12 = r12 - r0
            X.0KYS r8 = new X.0KYS
            r8.<init>()
            X.C486790J7d.LIZ(r8)
            boolean r0 = r10.equals(r4)
            if (r0 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            boolean r0 = r11 instanceof X.C501470JlZ
            if (r0 != 0) goto Lb8
            boolean r0 = r11 instanceof X.C1494690ozz
            if (r0 != 0) goto Lb8
            r3.run()
        Lb8:
            X.C1C7U.LIZIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1400100_7.accept$1(Y.AfS0S1400100_7, java.lang.Object):void");
    }

    public AfS0S1400100_7(String str, C118300cf c118300cf, long j, C0KFM c0kfm, C0KMZ c0kmz, C0KLW c0klw, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = c118300cf;
        this.j5 = j;
        this.l2 = c0kfm;
        this.l3 = c0kmz;
        this.l4 = c0klw;
    }

    public AfS0S1400100_7(C783810Uot c783810Uot, InterfaceC472150IfN interfaceC472150IfN, String str, String str2, long j, Boolean bool, RunnableC783840Uow runnableC783840Uow, int i) {
        this.$t = i;
        this.l1 = c783810Uot;
        this.l2 = interfaceC472150IfN;
        this.s0 = str;
        this.j5 = j;
        this.l3 = bool;
        this.l4 = runnableC783840Uow;
    }
}
