package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0cMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008910cMT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(493));

    public static final void LIZIZ(CommerceInteractionComponent commerceInteractionComponent, C1009060cMi c1009060cMi) {
        Object obj;
        int i = C992130bvP.LIZ[c1009060cMi.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) commerceInteractionComponent.LLJJL.getValue();
                if (iViewPagerComponentAbility != null) {
                    iViewPagerComponentAbility.X20();
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) commerceInteractionComponent.LLJJL.getValue();
            if (iViewPagerComponentAbility2 != null) {
                iViewPagerComponentAbility2.rH();
            }
        }
        if (c1009060cMi.LIZJ) {
            C724270Sb3 c724270Sb3 = commerceInteractionComponent.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            String str = c1009060cMi.LIZLLL;
            if (str == null) {
                str = "homepage_hot";
            }
            C1440005kM.LIZ(new C1210880hcE(str, "FUNCTION_FROM_NOT_INTERESTED", c1009060cMi.LIZIZ, aweme));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:31:0x0097, B:33:0x00a5, B:35:0x00ab, B:41:0x00bb, B:43:0x00c1, B:45:0x00c6, B:47:0x00cc, B:38:0x00b3), top: B:126:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent r17, X.C1009000cMc r18, X.InterfaceC1007930cKt r19) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1008910cMT.LIZ(com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent, X.0cMc, X.0cKt):void");
    }
}
