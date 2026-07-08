package X;

import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Plp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654510Plp {
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility LIZIZ(X.C19EG r3) {
        /*
            X.0QBs r0 = X.C666340QBs.LIZ
            r0.getClass()
            boolean r0 = X.C666340QBs.LIZIZ()
            r2 = 0
            if (r0 != 0) goto Ld
            return r2
        Ld:
            if (r3 == 0) goto L30
            X.198i r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r3)
            if (r0 == 0) goto L30
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility> r0 = com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility r1 = (com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility) r1
            if (r1 == 0) goto L31
            android.app.Activity r0 = r1.kp2()
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 != 0) goto L33
            return r2
        L30:
            r1 = r2
        L31:
            r0 = r2
            goto L29
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C654510Plp.LIZIZ(X.19EG):com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility");
    }

    public static boolean LIZJ(C19EG c19eg) {
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbilityLIZIZ = LIZIZ(c19eg);
        if (iVisualSearchHalfScreenAbilityLIZIZ != null && iVisualSearchHalfScreenAbilityLIZIZ.isShowing() && !C644560PPy.LJI().contains(EnumC669620QOi.LIVE.getTabName())) {
            return true;
        }
        return false;
    }

    public static void LIZ(C19EG c19eg, Function1 function1) {
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbilityLIZIZ = LIZIZ(c19eg);
        if (iVisualSearchHalfScreenAbilityLIZIZ != null && iVisualSearchHalfScreenAbilityLIZIZ.isShowing()) {
            function1.invoke(iVisualSearchHalfScreenAbilityLIZIZ);
        }
    }
}
