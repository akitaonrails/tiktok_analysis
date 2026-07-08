package X;

import com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;

/* JADX INFO: renamed from: X.11mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19602611mi extends AbstractC19589811ke<EmojiSliderStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C19602511mh(6, LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        EmojiSliderStickerStruct emojiSliderStickerStruct = interactStickerStruct.getEmojiSliderStickerStruct();
        return new EmojiSliderStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.INTERACTIVE_EMOJI, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), false, true, emojiSliderStickerStruct.getQuestionText(), emojiSliderStickerStruct.getEmojiContent(), emojiSliderStickerStruct.getVoteVal(), emojiSliderStickerStruct.getAnswerCount(), emojiSliderStickerStruct.getVoteAverage(), emojiSliderStickerStruct.getAndroidVer(), emojiSliderStickerStruct.getIosVer());
    }
}
