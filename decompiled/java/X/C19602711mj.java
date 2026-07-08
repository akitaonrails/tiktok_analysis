package X;

import com.ss.android.ugc.aweme.interactiveemoji.model.InteractiveEmojiStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;

/* JADX INFO: renamed from: X.11mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19602711mj extends AbstractC19589811ke<InteractiveEmojiStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C19602311mf(6, LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        InteractiveEmojiStickerStruct interactiveEmojiStickerStruct = interactStickerStruct.getInteractiveEmojiStickerStruct();
        if (interactiveEmojiStickerStruct != null) {
            return new InteractiveEmojiStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.INTERACTIVE_EMOJI, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), false, true, interactiveEmojiStickerStruct.getEmojiContent(), interactiveEmojiStickerStruct.getAndroidVer(), interactiveEmojiStickerStruct.getIosVer());
        }
        return new InteractiveEmojiStickerModel(new BaseStickerModel(100, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), false, true, "😍", "19", "8.3");
    }
}
