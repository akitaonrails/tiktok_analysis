package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.experiment.prompt.ShowPromptToConfirmDynamicDataExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BVD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BVD {
    public static final C1BVD LIZ = new C1BVD();
    public static final Keva LIZIZ = Keva.getRepo("show_prompt_repo");
    public static Function0<Unit> LIZJ;
    public static final String LIZLLL;

    static {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("account_prompt_help_center_link", "https://support.tiktok.com/%s/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok");
        LIZLLL = strLJI != null ? strLJI : "https://support.tiktok.com/%s/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok";
    }

    public static boolean LIZ(String str) {
        return ShowPromptToConfirmDynamicDataExperiment.LIZ().nonAutoVerifyCountries.contains(str);
    }

    public static void LIZJ(C1BVI c1bvi) {
        Map<String, String> mapLJIIIIZZ;
        String curUserId = ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).getCurUserId();
        if (c1bvi == C1BVI.EMAIL) {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("source", "13"), new Pair("type", "2"), new Pair("decision_uid", curUserId));
        } else {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("source", "14"), new Pair("type", "1"), new Pair("decision_uid", curUserId));
        }
        ((C0XH0) C0XH0.LIZLLL()).LIZIZ("/passport/identity/update_source/", mapLJIIIIZZ, new AbstractC846040XGw<C846060XGy>() { // from class: X.1BVJ
            @Override // X.AbstractC846040XGw
            public final /* bridge */ /* synthetic */ void LIZ(C0XGA c0xga) {
            }
        });
    }

    public static void LIZIZ(String str, C1BVI c1bvi, int i, String str2, String str3) {
        String str4;
        int i2 = C1BVH.LIZ[c1bvi.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str4 = "phone";
            } else {
                throw new C1954807lC();
            }
        } else {
            str4 = "email";
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("show_index", String.valueOf(i)), new Pair("click", str2), new Pair("verify_type", str4), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3));
        mapLJIIJ.put("enter_method", "normal");
        C20684815ws.LJIILLIIL("verify_pii_page_click", mapLJIIJ);
    }
}
