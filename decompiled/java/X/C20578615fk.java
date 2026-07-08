package X;

import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerState;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20578615fk extends C09AY implements Function1<EditPreviewStickerState, EditPreviewStickerState> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20578615fk(int i, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
        EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
        return editPreviewStickerState2.copy(editPreviewStickerState2.selectImage, editPreviewStickerState2.useSticker, editPreviewStickerState2.startCutoutSticker, editPreviewStickerState2.finishCutoutSticker, editPreviewStickerState2.mediaModel, editPreviewStickerState2.cutoutError, editPreviewStickerState2.cancel, editPreviewStickerState2.cutoutData, new C1644450stX<>(new Pair(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI))));
    }
}
