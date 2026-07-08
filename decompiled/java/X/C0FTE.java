package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FTE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FTE extends C2217421BqW implements Function1<StickerModel, Unit> {
    public C0FTE(C0FTB c0ftb) {
        super(1, c0ftb, C0FTB.class, "onBubbleClickEditDone", "onBubbleClickEditDone(Lcom/ss/android/ugc/aweme/tools/sticker/core/StickerModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StickerModel stickerModel) {
        ((C0FTB) this.receiver).LJJI(stickerModel);
        return Unit.LIZ;
    }
}
