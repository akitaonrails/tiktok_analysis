package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import kotlin.jvm.internal.AwS14S0000001_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19610211nw extends C0FFE<SharedCommentStickerModel> {
    public static final int LJIL;
    public final Context LJIILIIL;
    public final FrameLayout LJIILJJIL;
    public final SharedCommentStickerModel LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C390420FSm LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250));
        LJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    }

    @Override // X.C0FFE
    public final void LJJIZ() {
        if (this.LJIILJJIL.getWidth() > 0 && this.LJIILJJIL.getHeight() > 0) {
            LJJJLL();
            return;
        }
        View view = (View) this.LJIJI.getValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setAlpha(0.0f);
        HandlerHook.viewPost(this.LJIILJJIL, new ARunnableS129S0100000_29(this, 92));
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00bd  */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r47v0, types: [X.0FTc] */
    /* JADX WARN: Type inference failed for: r48v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL() {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19610211nw.LJJJLL():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return (SharedCommentStickerModel) ((C1664690tQB) this.LJIJJLI.getValue()).LIZ;
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
        SharedCommentStickerModel sharedCommentStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof SharedCommentStickerModel) && (sharedCommentStickerModel = (SharedCommentStickerModel) stickerModel) != null) {
            ((C1664680tQA) this.LJIJJLI.getValue()).LIZLLL(new AwS608S0100000_29(sharedCommentStickerModel, 274), true);
            LJJJLIIL(((SharedCommentStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        ((C1664680tQA) this.LJIJJLI.getValue()).LIZLLL(new AwS608S0100000_29(baseStickerModel, 273), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        LJJIJ().LIZLLL(new AwS14S0000001_29(f, 3), true);
    }

    public C19610211nw(Context context, FrameLayout frameLayout, SharedCommentStickerModel sharedCommentStickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, sharedCommentStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = frameLayout;
        this.LJIILL = sharedCommentStickerModel;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 311));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 310));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 309));
        LJJJJ(frameLayout);
    }
}
