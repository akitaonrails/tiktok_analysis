package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19622011pq extends C0FFE<LiveEventStoryStickerModel> {
    public final Context LJIILIIL;
    public final LiveEventStoryStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final InterfaceC388760FMc LJIILLIIL;
    public final C0FFO LJIIZILJ;
    public final LifecycleOwner LJIJ;
    public final C390420FSm LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return (LiveEventStoryStickerModel) ((C1664690tQB) this.LJIJJ.getValue()).LIZ;
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        return new C0FUE(c1664680tQALJJIJ) { // from class: X.11pp
            @Override // X.C0FUE
            public final boolean LJJJJ() {
                return false;
            }
        };
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIJ;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIIZILJ;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        LiveEventStoryStickerModel liveEventStoryStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof LiveEventStoryStickerModel) && (liveEventStoryStickerModel = (LiveEventStoryStickerModel) stickerModel) != null) {
            ((C1664680tQA) this.LJIJJ.getValue()).LIZLLL(new AwS608S0100000_29(liveEventStoryStickerModel, 803), true);
            LJJJLIIL(((LiveEventStoryStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        ((C1664680tQA) this.LJIJJ.getValue()).LIZLLL(new AwS608S0100000_29(baseStickerModel, 802), true);
    }

    public C19622011pq(Context context, LiveEventStoryStickerModel liveEventStoryStickerModel, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, liveEventStoryStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = liveEventStoryStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = interfaceC388760FMc;
        this.LJIIZILJ = c0ffo;
        this.LJIJ = lifecycleOwner;
        this.LJIJI = c390420FSm;
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1059));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1061));
        LJJJJ(frameLayout);
        this.LJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1060));
    }
}
