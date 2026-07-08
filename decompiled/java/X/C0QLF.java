package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0QLF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLF {
    public static final n LIZ;

    static {
        n nVar = new n();
        nVar.LJJIII(604800, "trigger_gap_seconds");
        nVar.LJJIII(2, "max_show_time");
        nVar.LJJIII(259200, "install_gap_seconds");
        nVar.LJJIIJ("guide_image_1", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/search_ic_widget_guide.png");
        nVar.LJJIIJ("guide_image_1_RTL", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/search_ic_widget_guide_rtl.png");
        LIZ = nVar;
    }

    public static n LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        n nVar = LIZ;
        n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("search_widget_guide_config", n.class, nVar);
        return nVar2 != null ? nVar2 : nVar;
    }
}
