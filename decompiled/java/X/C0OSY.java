package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinDoubleClickEmojis;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OSY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OSY {
    public static final BulletinDoubleClickEmojis LIZ;
    public static final List<String> LIZIZ;

    static {
        BulletinDoubleClickEmojis bulletinDoubleClickEmojis = new BulletinDoubleClickEmojis(C1697810uHb.LJIIJJI("❤️", "💙", "🧡", "💛", "💜", "💚", "🤎", "🩷", "🩵"));
        BulletinDoubleClickEmojis bulletinDoubleClickEmojis2 = (BulletinDoubleClickEmojis) C0C64.LJIILLIIL().LJJII(BulletinDoubleClickEmojis.class, bulletinDoubleClickEmojis, "bulletin_emoji_interaction_double_click_emojis", true);
        if (bulletinDoubleClickEmojis2 != null) {
            bulletinDoubleClickEmojis = bulletinDoubleClickEmojis2;
        }
        LIZ = bulletinDoubleClickEmojis;
        ArrayList arrayList = new ArrayList();
        arrayList.add("❤️");
        arrayList.add("💙");
        arrayList.add("🧡");
        arrayList.add("💛");
        arrayList.add("💜");
        arrayList.add("💚");
        arrayList.add("🤎");
        arrayList.add("🩷");
        arrayList.add("🩵");
        LIZIZ = arrayList;
    }
}
