package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.experiment.TitlePanelStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: renamed from: X.0SHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718860SHs {
    public static final C718860SHs LIZ = new C718860SHs();
    public static final List<String> LIZIZ = C1697810uHb.LJIILJJIL("homepage_hot", "general_search", "search_result");

    public static boolean LJ() {
        return C098600Yu.LIZ == TitlePanelStyle.DESC_AND_SEARCH.ordinal();
    }

    public static boolean LJI() {
        return C098600Yu.LIZ == TitlePanelStyle.DESC_AND_COMMENT_AND_SEARCH.ordinal();
    }

    public static boolean LIZJ(Aweme aweme) {
        AccountUserService accountUserServiceLJIIJ;
        if (aweme == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || ComplianceServiceProvider.LJIIJJI().LJIIIZ()) {
            return false;
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if ((iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.LIZ()) || C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        SearchSecurityControlConfig.LIZ.getClass();
        if (!SearchSecurityControlConfig.LJ() || aweme.isAd() || AwemeExtKt.isPhotoMode(aweme) || C10IT.LJIIJJI(aweme) || aweme.isAd() || C729510SjV.LJJIJIL(aweme) || AwemeExtKt.isPhotoMode(aweme) || C0NC0.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Aweme aweme) {
        if (aweme == null) {
            if (C098600Yu.LIZ != TitlePanelStyle.DESC_AND_COMMENT.ordinal() && !C2549009yq.LIZ) {
                return false;
            }
            return true;
        }
        if ((C098600Yu.LIZ != TitlePanelStyle.DESC_AND_COMMENT.ordinal() || AwemeExtKt.isAdTraffic(aweme)) && !AwemeExtKt.isTextMoreAd(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(Aweme aweme, String str) {
        if ((LJ() || LJFF(aweme) || LJI()) && C13LP.LJJJJ(str, LIZIZ)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme, String str) {
        if (!C13LP.LJJJJ(str, LIZIZ) || !LIZJ(aweme)) {
            return false;
        }
        return C2516009tW.LIZ;
    }

    public static boolean LIZLLL(Aweme aweme, String str) {
        if (!LIZJ(aweme) || !C0QQX.LIZ || !C13LP.LJJJJ(str, LIZIZ)) {
            return false;
        }
        return true;
    }
}
