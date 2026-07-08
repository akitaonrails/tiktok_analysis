package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0FVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391280FVu {
    public static void LIZ(C0FVT c0fvt, InterfaceC391240FVq interfaceC391240FVq) {
        TextStickerModel next;
        if (c0fvt != null && interfaceC391240FVq != null) {
            Iterator<TextStickerModel> it2 = c0fvt.Sb().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C0F8Y.LJII(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TextStickerModel textStickerModel = next;
            StickerModel stickerModel = (StickerModel) C13LP.LJJJLZIJ(0, interfaceC391240FVq.LLLILZLLLI(EnumC1466150oFx.AI_CAPTION_TAG));
            if (textStickerModel != null && stickerModel != null) {
                interfaceC391240FVq.kT1(stickerModel.getId(), textStickerModel.getBaseStickerModel().getId());
            }
        }
    }
}
