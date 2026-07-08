package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0QNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669400QNm {
    public static final h LIZ;

    static {
        h hVar = new h();
        n nVar = new n();
        nVar.LJJIIJ("route", "//main?tab=0&com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=HOME");
        nVar.LJJIIJ("icon", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_follow.png");
        hVar.LJJIFFI(nVar);
        n nVar2 = new n();
        nVar2.LJJIIJ("route", "aweme://openShoot");
        nVar2.LJJIIJ("icon", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_post.png");
        hVar.LJJIFFI(nVar2);
        n nVar3 = new n();
        nVar3.LJJIIJ("route", "//main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=NOTIFICATION");
        nVar3.LJJIIJ("icon", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_inbox.png");
        hVar.LJJIFFI(nVar3);
        LIZ = hVar;
    }

    public static String LIZ(int i) {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            h hVar = LIZ;
            h hVar2 = (h) settingsManagerLIZLLL.LJIIIIZZ("search_widget_panel_config", h.class, hVar);
            if (hVar2 != null) {
                hVar = hVar2;
            }
            return hVar.LJJIIJZLJL(i).LJIILIIL().LJJIIZ("icon").LJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return "";
                    }
                    return "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_inbox.png";
                }
                return "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_post.png";
            }
            return "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_follow.png";
        }
    }

    public static String LIZIZ(int i) {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            h hVar = LIZ;
            h hVar2 = (h) settingsManagerLIZLLL.LJIIIIZZ("search_widget_panel_config", h.class, hVar);
            if (hVar2 != null) {
                hVar = hVar2;
            }
            return hVar.LJJIIJZLJL(i).LJIILIIL().LJJIIZ("route").LJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return "//main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=NOTIFICATION";
                    }
                    return "//main?tab=0&com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=HOME";
                }
                return "aweme://openShoot";
            }
            return "//main?tab=0&com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=HOME";
        }
    }
}
