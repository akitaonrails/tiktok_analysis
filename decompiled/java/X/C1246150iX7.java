package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.profile.platform.exp.CampusConfigResponse;

/* JADX INFO: renamed from: X.0iX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246150iX7 {
    public static final C1246150iX7 LIZ = new C1246150iX7();
    public static final CampusConfigResponse LIZIZ = new CampusConfigResponse("https://sf16-va.tiktokcdn.com/obj/eden-va2/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/BG", 2035, 1970, false, false, "https://www.myunidays.com/content/identity-privacy-policy", "https://www.myunidays.com/content/identity-terms-of-service", "https://www.tiktok.com/support/", 0, 10, 10, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/intro_gradient", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/intro_illustration_btm_layer", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/intro_illustration_top_layer", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/yb_shpjvz_rvarpa/ljhwZthlaukjlkulzlp/campus_icon.png");

    public static CampusConfigResponse LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CampusConfigResponse campusConfigResponse = LIZIZ;
        CampusConfigResponse campusConfigResponse2 = (CampusConfigResponse) settingsManagerLIZLLL.LJIIIIZZ("campus_config", CampusConfigResponse.class, campusConfigResponse);
        return campusConfigResponse2 != null ? campusConfigResponse2 : campusConfigResponse;
    }
}
