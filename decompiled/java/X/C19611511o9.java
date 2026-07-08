package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11o9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19611511o9 extends AbstractC388880FMo<CommentStickerModel> {
    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
    }

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.COMMENT;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        CommentStickerModel commentStickerModel = (CommentStickerModel) stickerModel;
        return commentStickerModel.copy(BaseStickerModel.copy$default(commentStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), commentStickerModel.commentStickerModel, commentStickerModel.alpha, commentStickerModel.visible, commentStickerModel.isCommentDeleted);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        CommentStickerModel commentStickerModel = (CommentStickerModel) stickerModel;
        return new C19611411o8(this.LIZ, this.LIZIZ, commentStickerModel.copy(commentStickerModel.baseStickerModel, commentStickerModel.commentStickerModel, commentStickerModel.alpha, commentStickerModel.visible, commentStickerModel.isCommentDeleted), c0ffo, lifecycleOwner, this.LJFF);
    }

    public C19611511o9(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }
}
