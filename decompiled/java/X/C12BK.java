package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12BK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BK {
    public static final C12BK LIZ = new C12BK();

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d5 A[PHI: r10
      0x03d5: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v6 java.lang.String) binds: [B:189:0x03d2, B:175:0x0386] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1 A[Catch: s -> 0x00d6, all -> 0x00e4, TryCatch #0 {s -> 0x00d6, blocks: (B:51:0x00b6, B:53:0x00ca, B:56:0x00d3, B:52:0x00c1), top: B:229:0x00af }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r36, com.bytedance.router.RouteIntent r37, com.ss.android.ugc.aweme.feed.model.Aweme r38, boolean r39, java.util.HashMap r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instruction units count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12BK.LIZIZ(android.content.Context, com.bytedance.router.RouteIntent, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
