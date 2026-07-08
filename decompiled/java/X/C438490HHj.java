package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438490HHj {
    public static final C438490HHj LIZ = new C438490HHj();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(530));
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1292030jj7 LIZ(X.EnumC429390Gsb r8) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r0 = com.ss.android.ugc.aweme.services.IMainService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.services.IMainService r1 = (com.ss.android.ugc.aweme.services.IMainService) r1
            r7 = 0
            if (r1 == 0) goto L48
            java.lang.String r0 = "story_thought_bg_res"
            java.lang.String r1 = r1.getAnywhereChannelPath(r0)
            if (r1 == 0) goto L48
            int r0 = r1.length()
            r6 = 1
            if (r0 <= 0) goto L46
            r0 = 1
        L21:
            if (r0 != 0) goto L24
            r1 = r5
        L24:
            if (r1 == 0) goto L48
            X.0VSJ r5 = new X.0VSJ
            java.lang.String r0 = r8.getFileName()
            r5.<init>(r1, r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L44
            long r3 = r5.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L44
        L3f:
            if (r6 == 0) goto L48
        L41:
            if (r5 != 0) goto L4a
            return r7
        L44:
            r6 = 0
            goto L3f
        L46:
            r0 = 0
            goto L21
        L48:
            r5 = r7
            goto L41
        L4a:
            X.0VSP r1 = new X.0VSP     // Catch: java.lang.Throwable -> L53
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L53
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L53
            goto L5f
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L5f:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 != 0) goto L70
            java.io.InputStream r1 = (java.io.InputStream) r1
            java.lang.String r0 = r8.getFileName()
            X.0jj7 r0 = X.C1294250jmh.LJ(r1, r0)
            return r0
        L70:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C438490HHj.LIZ(X.0Gsb):X.0jj7");
    }
}
