package X;

import com.bytedance.android.livesdk.livesetting.barrage.TtliveGameSpeedTestPersistManualSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.018D, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018D {
    public static final HashMap<Long, Long> LIZ = new HashMap<>();
    public static final int LIZIZ;
    public static final long LIZJ;

    static {
        LIZJ = Long.MAX_VALUE;
        try {
            JSONObject jSONObject = new JSONObject(TtliveGameSpeedTestPersistManualSetting.INSTANCE.getValue());
            LIZIZ = jSONObject.optInt("persist_type", 0);
            LIZJ = jSONObject.optLong("persist_time", Long.MAX_VALUE);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GameSpeedTestPersistManualHelper", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "persistType: "
            r2.append(r0)
            int r1 = X.C018D.LIZIZ
            r2.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r5 = "GameSpeedTestPersistManualHelper"
            X.C20441214yg.LIZIZ(r5, r0)
            r6 = 1
            if (r1 != 0) goto L1b
            return r6
        L1b:
            long r3 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r9
            if (r1 != r6) goto L69
            java.lang.String r0 = "getMemoryCacheData"
            X.C20441214yg.LIZIZ(r5, r0)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostUser> r0 = com.bytedance.android.livesdkapi.host.IHostUser.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostUser r0 = (com.bytedance.android.livesdkapi.host.IHostUser) r0
            long r7 = r0.getCurUserId()
            java.util.HashMap<java.lang.Long, java.lang.Long> r1 = X.C018D.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L8c
            long r7 = r0.longValue()
        L47:
            long r7 = r7 / r9
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "since last manual select: "
            r1.append(r0)
            long r3 = r3 - r7
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r5, r0)
            long r1 = X.C018D.LIZJ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8f
            java.lang.String r0 = "last manual select time > persistTime"
            X.C20441214yg.LIZIZ(r5, r0)
            r0 = 0
            return r0
        L69:
            r0 = 2
            if (r1 != r0) goto L8c
            X.14i1<java.lang.Long> r0 = X.InterfaceC772390URp.w
            java.lang.Object r2 = r0.LIZIZ()
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getLastManualFileTime: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r5, r0)
            long r7 = r2.longValue()
            goto L47
        L8c:
            r7 = 0
            goto L47
        L8f:
            java.lang.String r0 = "can use last manual select result"
            X.C20441214yg.LIZIZ(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018D.LIZ():boolean");
    }

    public static void LIZIZ(long j) {
        int i = LIZIZ;
        if (i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("storeMemoryCacheTime: ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("GameSpeedTestPersistManualHelper", C2188811AlT.LIZIZ(sbLIZ));
            LIZ.put(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), Long.valueOf(j));
            return;
        }
        if (i != 2) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("storeLastManualFileTime: ");
        sbLIZ2.append(j);
        C20441214yg.LIZIZ("GameSpeedTestPersistManualHelper", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC772390URp.w.LJFF(Long.valueOf(j));
    }
}
