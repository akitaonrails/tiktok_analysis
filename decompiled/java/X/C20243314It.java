package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.service.II18nService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14It, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20243314It {
    public static final C20243314It LIZ = new C20243314It();

    public static boolean LIZ() {
        II18nService iI18nService = (II18nService) PluggableExtentionKt.pluggableSpi$default(II18nService.class, false, false, false, 14, null);
        return Intrinsics.LJFF(iI18nService != null ? iI18nService.getAppLanguage() : null, "en");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1295960jpS r5, boolean r6, android.content.Context r7, boolean r8, android.animation.Animator.AnimatorListener r9) {
        /*
            com.ss.android.ugc.aweme.tako.setting.TakoOnboardingParams r0 = X.C20242814Io.LIZ()
            int r2 = r0.type
            r0 = 1
            r1 = 3
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 == r0) goto L18
            if (r2 == r1) goto L1e
            java.lang.String r2 = ""
        L11:
            int r0 = r2.length()
            if (r0 != 0) goto L9b
            return
        L18:
            java.lang.String r3 = "tako_onboarding_B"
            goto L20
        L1b:
            java.lang.String r3 = "tako_onboarding_A"
            goto L20
        L1e:
            java.lang.String r3 = "tako_onboarding_C"
        L20:
            com.ss.android.ugc.aweme.tako.setting.TakoOnboardingParams r0 = X.C20242814Io.LIZ()
            int r0 = r0.type
            if (r0 != r1) goto L50
            boolean r0 = LIZ()
            java.lang.String r2 = "_text"
            if (r0 == 0) goto L7a
            if (r6 == 0) goto L40
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
        L40:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = "_en"
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L50:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            boolean r0 = X.C960203pA.LIZIZ(r7)
            if (r0 == 0) goto L77
            java.lang.String r0 = "_dark"
        L5f:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = ".json"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            goto L11
        L77:
            java.lang.String r0 = "_light"
            goto L5f
        L7a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = "_non-en"
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            if (r6 == 0) goto L50
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
            goto L50
        L9b:
            X.0XAj r4 = X.C844350XAj.LIZ
            X.14Ix r3 = new X.14Ix
            r3.<init>(r5, r8, r9, r6)
            r4.getClass()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onboarding/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r1 = "tikbot_bot_onboarding_resource"
            r4.getClass()
            r0 = 0
            X.C844350XAj.LIZLLL(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20243314It.LIZIZ(X.0jpS, boolean, android.content.Context, boolean, android.animation.Animator$AnimatorListener):void");
    }
}
