package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11lH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19593711lH extends C0FFE<AttributionLinkStickerModel> {
    public final Context LJIILIIL;
    public final AttributionLinkStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C390420FSm LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public final void LJJIZ() {
        C443120HZe c443120HZe;
        int width = this.LJIILL.getWidth();
        int height = this.LJIILL.getHeight();
        ((View) this.LJIJJ.getValue()).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        C19593411lE c19593411lE = EnumC19593011lA.Companion;
        Integer numValueOf = Integer.valueOf(this.LJIILJJIL.getMediaSize());
        c19593411lE.getClass();
        int i = C19593211lC.LIZ[C19593411lE.LIZ(numValueOf).ordinal()];
        if (i == 1) {
            c443120HZe = new C443120HZe(Double.valueOf(((double) width) * 0.56d), Double.valueOf(((double) height) * 0.25d), 0);
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            c443120HZe = new C443120HZe(Double.valueOf(((double) width) * 0.72d), Double.valueOf(((double) height) * 0.19d), Integer.valueOf(C19592611l6.LLJIJIL));
        }
        double dDoubleValue = ((Number) c443120HZe.getFirst()).doubleValue();
        double dDoubleValue2 = ((Number) c443120HZe.getSecond()).doubleValue();
        int iIntValue = ((Number) c443120HZe.getThird()).intValue();
        double measuredWidth = ((-dDoubleValue) / ((double) 2)) + ((double) (((View) this.LJIJJ.getValue()).getMeasuredWidth() / 2));
        double measuredHeight = ((double) ((-height) / 2)) + dDoubleValue2 + ((double) iIntValue) + ((double) (((View) this.LJIJJ.getValue()).getMeasuredHeight() / 2));
        AttributionLinkStickerModel attributionLinkStickerModel = this.LJIILJJIL;
        LJIIJJI(attributionLinkStickerModel.copy(BaseStickerModel.copy$default(attributionLinkStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null), true, attributionLinkStickerModel.editable, attributionLinkStickerModel.clickable, attributionLinkStickerModel.scenario, attributionLinkStickerModel.title, attributionLinkStickerModel.url, attributionLinkStickerModel.shareFormat, attributionLinkStickerModel.mediaSize));
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJ.getValue();
    }

    public final C1664680tQA<AttributionLinkStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJI.getValue();
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        final C390420FSm c390420FSm = this.LJIJ;
        return new C0FUE(c1664680tQALJJIJ, c390420FSm) { // from class: X.11lJ
            @Override // X.C0FUE
            public final boolean LJJJJ() {
                return false;
            }
        };
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
        AttributionLinkStickerModel attributionLinkStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof AttributionLinkStickerModel) && (attributionLinkStickerModel = (AttributionLinkStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(attributionLinkStickerModel, 326), true);
            LJJJLIIL(((AttributionLinkStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 325), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        AttributionLinkStickerModel attributionLinkStickerModel = LJJJLL().LIZ;
        LJIIJJI(attributionLinkStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), attributionLinkStickerModel.visible, attributionLinkStickerModel.editable, attributionLinkStickerModel.clickable, attributionLinkStickerModel.scenario, attributionLinkStickerModel.title, attributionLinkStickerModel.url, attributionLinkStickerModel.shareFormat, attributionLinkStickerModel.mediaSize));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 33), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 34), true);
    }

    public C19593711lH(Context context, AttributionLinkStickerModel attributionLinkStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, attributionLinkStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = attributionLinkStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 526));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 527));
        LJJJJ(frameLayout);
    }
}
