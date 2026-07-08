package X;

import android.util.LruCache;
import com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WOJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WOJ {
    public final BridgeHookDispatcher LIZ;
    public final LruCache<String, C0WLA> LIZIZ = new LruCache<>(100);
    public final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();

    public C0WOJ(BridgeHookDispatcher bridgeHookDispatcher) {
        this.LIZ = bridgeHookDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099 A[PHI: r0
      0x0099: PHI (r0v27 java.lang.String) = (r0v11 java.lang.String), (r0v28 java.lang.String) binds: [B:95:0x017a, B:47:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1 A[PHI: r0
      0x00a1: PHI (r0v13 java.lang.String) = (r0v27 java.lang.String), (r0v28 java.lang.String) binds: [B:49:0x009f, B:47:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab A[PHI: r0 r2
      0x00ab: PHI (r0v26 java.lang.String) = (r0v13 java.lang.String), (r0v27 java.lang.String) binds: [B:53:0x00a9, B:49:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r2v7 java.lang.String) = (r2v1 java.lang.String), (r2v9 java.lang.String) binds: [B:53:0x00a9, B:49:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0WLA LIZ(java.lang.Object r38, java.util.List r39, java.util.List r40) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WOJ.LIZ(java.lang.Object, java.util.List, java.util.List):X.0WLA");
    }

    public final void LIZIZ(String str, String str2, String str3) {
        int iLJJJJI;
        JSONObject jSONObject;
        Object c098200Yq;
        String strOptString;
        C0WLA c0wla;
        int iLJJJJI2 = a0.LJJJJI(str, str2, 0, 6);
        if (iLJJJJI2 > 0 && (iLJJJJI = a0.LJJJJI(str, str3, 0, 6)) > 0) {
            try {
                jSONObject = new JSONObject(str.substring(iLJJJJI2 + str2.length(), iLJJJJI));
                try {
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th2) {
                th = th2;
                jSONObject = null;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parseCallback failed: ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                sbLIZ.append(", stack: ");
                sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (jSONObject != null && (strOptString = jSONObject.optString("__callback_id")) != null && (c0wla = this.LIZIZ.get(strOptString)) != null && c0wla.LIZLLL) {
                C0WLA c0wlaLIZ = C0WLA.LIZ(c0wla, jSONObject, null, 1048511);
                Iterator<C0WON> it2 = this.LIZ.getChain().iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(c0wlaLIZ);
                }
                this.LIZIZ.remove(c0wla.LIZ);
                this.LIZJ.remove(c0wla.LIZ);
            }
        }
    }
}
