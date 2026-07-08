package X;

import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0y00, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840660y00 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetBackground.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetBottomMoney.webp", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetDefaultBubble.webp", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetBubble.webp");

    public static void LIZ() {
        Keva repo = Keva.getRepo("keva_repo_bonus_widget");
        Iterator it2 = C1697810uHb.LJIIJJI("main_title", "sub_title", "balance_amount", "bubble_info", "action_notice", "logistic_info", "bonus_center_schema", "event", "payload_raw").iterator();
        while (it2.hasNext()) {
            repo.storeString((String) it2.next(), "");
        }
        repo.storeInt("refresh_interval_seconds", 0);
        repo.storeLong("last_update_time", 0L);
    }
}
