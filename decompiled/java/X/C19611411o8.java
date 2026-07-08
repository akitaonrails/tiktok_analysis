package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import kotlin.jvm.internal.AwS14S0000001_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import zoo.b;

/* JADX INFO: renamed from: X.11o8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19611411o8 extends C0FFE<CommentStickerModel> {
    public final Context LJIILIIL;
    public final FrameLayout LJIILJJIL;
    public final CommentStickerModel LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C390420FSm LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;

    @Override // X.C0FFE
    public final void LJJIZ() {
        Point point = new Point((this.LJIILJJIL.getLeft() + this.LJIILJJIL.getRight()) / 2, (this.LJIILJJIL.getTop() + this.LJIILJJIL.getBottom()) / 2);
        if (C391410FWh.LIZ[((C0FUH) this.LJIJI.getValue()).LJIIJ.ordinal()] == 1) {
            Context context = this.LJIILIIL;
            View viewLJJJJJ = LJJJJJ();
            CommentStickerModel commentStickerModel = LJJJLL().LIZ;
            viewLJJJJJ.measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)), 1073741824), -2);
            int containerLeft = point.x;
            if (containerLeft <= 0) {
                containerLeft = commentStickerModel.getBaseStickerModel().getContainerLeft() + (commentStickerModel.getBaseStickerModel().getContainerWidth() / 2);
            }
            int containerTop = point.y;
            if (containerTop <= 0) {
                containerTop = commentStickerModel.getBaseStickerModel().getContainerTop() + (commentStickerModel.getBaseStickerModel().getContainerHeight() / 2);
            }
            LJIIJJI(commentStickerModel.copy(BaseStickerModel.copy$default(commentStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, ((C19611011o4.LLJI + (viewLJJJJJ.getMeasuredWidth() / 2)) - containerLeft) * (C426750GoL.LIZLLL(context) ? -1 : 1), (C19611011o4.LLJIJIL + (viewLJJJJJ.getMeasuredHeight() / 2)) - containerTop, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null), commentStickerModel.commentStickerModel, commentStickerModel.alpha, true, commentStickerModel.isCommentDeleted));
        }
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        if (((C0FUH) this.LJIJI.getValue()).LJIIJ != EnumC391400FWg.RECORD) {
            return super.LJJJI();
        }
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        final C390420FSm c390420FSm = this.LJIJ;
        return new C0FUE(c1664680tQALJJIJ, c390420FSm) { // from class: X.11k2
            @Override // X.C0FUE
            public final boolean LJJJJ() {
                return false;
            }

            @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                if (C0GZ4.LIZ(f, f2, this.LL.LIZ.getVisibleRectWithoutRotation(), this.LL.LIZ.getRotation())) {
                    String string = this.LLJJ.LJIILIIL.getResources().getString(2131828286);
                    C1233040iBy c1233040iBy = new C1233040iBy(this.LLJJ.LJIILIIL);
                    c1233040iBy.LIZJ(string);
                    c1233040iBy.LIZLLL();
                    return true;
                }
                return super.LLLLLLLLL(bVar, f, f2);
            }
        };
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJLI.getValue();
    }

    public final C1664680tQA<CommentStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJJ.getValue();
    }

    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return LJJJLL().LIZ;
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIIZILJ;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        CommentStickerModel commentStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof CommentStickerModel) && (commentStickerModel = (CommentStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(commentStickerModel, 643), true);
            LJJJLIIL(((CommentStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 642), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        LJJIJ().LIZLLL(new AwS14S0000001_29(f, 7), true);
        LJJJLL().LIZLLL(new AwS14S0000001_29(f, 8), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 55), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 56), true);
    }

    public C19611411o8(Context context, FrameLayout frameLayout, CommentStickerModel commentStickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, commentStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = frameLayout;
        this.LJIILL = commentStickerModel;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 904));
        this.LJIJI = c01gwLIZIZ;
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 903));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 902));
        LJJJJ(frameLayout);
        if (((C0FUH) c01gwLIZIZ.getValue()).LJIIJ == EnumC391400FWg.RECORD) {
            setAlpha(0.3137255f);
        } else {
            setAlpha(1.0f);
        }
    }
}
