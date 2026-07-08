package X;

import com.bytedance.pipo.verify.base.model.StatusReason;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.verify.PipoVerifyHybridJsbEventConfigModel;
import com.ss.android.ugc.aweme.verify.ReasonCodeToJsbEventItem;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AwS570S0100000_26;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ugx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713530ugx {
    public final C1713570uh1 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1597));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1599));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1598));
    public final AtomicReference<String> LJ;
    public final C01GW LJFF;
    public final AtomicBoolean LJI;

    public final String LIZIZ() {
        return this.LJ.get();
    }

    public final VerifyDetail LIZJ() {
        return this.LIZ.LJIIIIZZ();
    }

    public final VerifyInfo LIZLLL() {
        return this.LIZ.LJIIIZ();
    }

    public C1713530ugx(C1713570uh1 c1713570uh1) {
        this.LIZ = c1713570uh1;
        String str = c1713570uh1.LIZ.LIZJ.LIZ;
        this.LJ = new AtomicReference<>(str == null ? "" : str);
        this.LJFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1596));
        this.LJI = new AtomicBoolean(false);
    }

    public static void LJ(DoVerifyResponse doVerifyResponse) {
        int iIntValue;
        StatusReason statusReason;
        Integer num;
        try {
            PipoVerifyHybridJsbEventConfigModel pipoVerifyHybridJsbEventConfigModelLIZ = C1269004xs.LIZ();
            if (!pipoVerifyHybridJsbEventConfigModelLIZ.enablePublishEvPageLoaded) {
                return;
            }
            ReasonCodeToJsbEventItem reasonCodeToJsbEventItem = null;
            if (doVerifyResponse == null || (statusReason = doVerifyResponse.statusReason) == null || (num = statusReason.reasonCode) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
            Iterator<ReasonCodeToJsbEventItem> it2 = pipoVerifyHybridJsbEventConfigModelLIZ.reasonCodeToJsbEvent.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ReasonCodeToJsbEventItem next = it2.next();
                if (next.reasonCode == iIntValue) {
                    reasonCodeToJsbEventItem = next;
                    break;
                }
            }
            ReasonCodeToJsbEventItem reasonCodeToJsbEventItem2 = reasonCodeToJsbEventItem;
            if (reasonCodeToJsbEventItem2 != null) {
                String str = reasonCodeToJsbEventItem2.jsbEvent;
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("jsb_event_code", reasonCodeToJsbEventItem2.jsbEventCode);
                jSONObject.put("jsb_event_code_type", reasonCodeToJsbEventItem2.jsbEventCodeType);
                C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), str));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.AbstractC2252651DEx r6, X.InterfaceC1364105Vn<? super X.C189200o6<X.C0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.verify.base.model.response.GetPageResponse>>>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1706900uWG
            if (r0 == 0) goto L3b
            r4 = r7
            X.0uWG r4 = (X.C1706900uWG) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0uWS r1 = new X.0uWS
            r0 = 0
            r1.<init>(r5, r0)
            r4.LLILLL = r2
            java.lang.Object r1 = X.C23250099c.LJI(r4, r6, r1)
            if (r1 != r3) goto L22
            return r3
        L3b:
            X.0uWG r4 = new X.0uWG
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713530ugx.LIZ(X.1DEx, X.05Vn):java.lang.Object");
    }
}
