package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SGE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SGE implements C0SH2 {
    public final C718360SFu LIZ;
    public final C707460Rp2 LIZIZ = new C707460Rp2("DefaultIFeedCommonBannerViewProvider");

    @Override // X.C0SH2
    public boolean LIZJ(VideoItemParams videoItemParams) {
        return true;
    }

    public C0SGE(C718360SFu c718360SFu) {
        this.LIZ = c718360SFu;
    }

    @Override // X.C0SH2
    public void LIZ(int i, String str) {
        Context context;
        C0RJN c0rjnLIZIZ;
        Fragment fragment;
        C690870R8b c690870R8b = this.LIZ.LJ;
        if (c690870R8b != null && (c0rjnLIZIZ = c690870R8b.LIZIZ()) != null && (fragment = c0rjnLIZIZ.LJ) != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        LIZLLL(context, str);
    }

    @Override // X.C0SH2
    public void LIZIZ(BannerCommonTailAction.BannerActionType bannerActionType, C0SH1 c0sh1) {
        String str;
        Context context;
        C0RJN c0rjnLIZIZ;
        Fragment fragment;
        if (C638280P1u.LIZ[bannerActionType.ordinal()] == 1) {
            BannerCommonAction bannerCommonAction = c0sh1.LIZIZ;
            if (bannerCommonAction != null && (str = bannerCommonAction.schema) != null) {
                if (str.length() > 0) {
                    C690870R8b c690870R8b = this.LIZ.LJ;
                    if (c690870R8b != null && (c0rjnLIZIZ = c690870R8b.LIZIZ()) != null && (fragment = c0rjnLIZIZ.LJ) != null) {
                        context = fragment.getContext();
                    } else {
                        context = null;
                    }
                    LIZLLL(context, str);
                    return;
                }
                this.LIZIZ.LJ("schema is empty");
                return;
            }
            return;
        }
        C707460Rp2 c707460Rp2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("default action is not supported ");
        sbLIZ.append(bannerActionType);
        c707460Rp2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(Context context, String str) {
        String str2;
        String str3;
        String str4;
        C0RJN c0rjnLIZIZ;
        BannerCommonKey bannerCommonKey;
        String str5 = str;
        if (context == null) {
            this.LIZIZ.LJIIIZ("navigateToPage action context is empty");
            return;
        }
        String str6 = "";
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        if (Intrinsics.LJFF(UriProtector.parse(str2).getHost(), "flex_panel")) {
            if (str5 == null) {
                str5 = "";
            }
            C718360SFu c718360SFu = this.LIZ;
            String str7 = c718360SFu.LJFF;
            if (str7 != null) {
                str6 = str7;
            }
            Aweme aweme = c718360SFu.LIZJ;
            BannerCommonStruct bannerCommonStruct = c718360SFu.LIZLLL;
            Fragment fragment = null;
            if (bannerCommonStruct != null && (bannerCommonKey = bannerCommonStruct.bannerKey) != null) {
                str3 = bannerCommonKey.componentKey;
            } else {
                str3 = null;
            }
            if (bannerCommonStruct != null) {
                str4 = bannerCommonStruct.customizedInfo;
            } else {
                str4 = null;
            }
            String strLIZ = C707720RpS.LIZ(aweme, str5, str6, str3, "bottom_banner", str4);
            C690870R8b c690870R8b = this.LIZ.LJ;
            if (c690870R8b != null && (c0rjnLIZIZ = c690870R8b.LIZIZ()) != null) {
                fragment = c0rjnLIZIZ.LJ;
            }
            SmartRouter.buildFragmentRoute(fragment, strLIZ).open(0);
            return;
        }
        SmartRouter.buildRoute(context, str5).open();
    }
}
