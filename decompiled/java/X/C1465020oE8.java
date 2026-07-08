package X;

import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import java.util.List;

/* JADX INFO: renamed from: X.0oE8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465020oE8 {
    public static final void LIZ(C0LAB c0lab, List<LinkStickerModel> list) {
        c0lab.LIZ(!list.isEmpty() ? 1 : 0, "has_link_sticker");
        LinkStickerModel linkStickerModel = (LinkStickerModel) C13LP.LJJJLL(list);
        if (linkStickerModel != null) {
            c0lab.LIZ(linkStickerModel.getTheme().getType(), "link_sticker_style");
        }
    }
}
