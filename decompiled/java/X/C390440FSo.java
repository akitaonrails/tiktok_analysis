package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390440FSo extends C2217421BqW implements Function1<StickerModel, Unit> {
    public C390440FSo(C0FTB c0ftb) {
        super(1, c0ftb, C0FTB.class, "onDoubleClickEditDone", "onDoubleClickEditDone(Lcom/ss/android/ugc/aweme/tools/sticker/core/StickerModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StickerModel stickerModel) {
        ((C0FTB) this.receiver).LJFF(stickerModel);
        return Unit.LIZ;
    }
}
