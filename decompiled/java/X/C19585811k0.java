package X;

import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19585811k0 extends C0FFE<DonationStickerModel> {
    public final Context LJIILIIL;
    public final DonationStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C390420FSm LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        final C390420FSm c390420FSm = this.LJIJ;
        final C1664680tQA<DonationStickerModel> c1664680tQALJJJLL = LJJJLL();
        return new C0FUE(c1664680tQALJJIJ, c390420FSm, c1664680tQALJJJLL) { // from class: X.11k1
            public final C1664680tQA<DonationStickerModel> LLJJ;

            @Override // X.C0FUE
            public final float LJJIJIL(float f) {
                if (C19583911jh.LIZLLL(this.LLJJ.LIZ) != 0) {
                    float initialTransformScale = this.LLJJ.LIZ.getInitialTransformScale();
                    if (initialTransformScale <= 0.0f) {
                        initialTransformScale = this.LL.LIZ.getScale();
                    }
                    if (initialTransformScale > 0.0f) {
                        return C13LZ.LIZLLL(f, 1.0f * initialTransformScale, initialTransformScale * 1.15f);
                    }
                    return f;
                }
                return f;
            }

            {
                this.LLJJ = c1664680tQALJJJLL;
            }
        };
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJ.getValue();
    }

    public final C1664680tQA<DonationStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJI.getValue();
    }

    @Override // X.C0FFE
    public final void LJJIZ() {
        C21637819mC c21637819mC;
        if (C0FWJ.LIZIZ() && (c21637819mC = (C21637819mC) this.LJIJ.LIZJ(C13LE.LIZ(C21637819mC.class))) != null) {
            LJJIL().LIZ(new AwS430S0200000_29(this, c21637819mC, 114));
        }
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
        DonationStickerModel donationStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof DonationStickerModel) && (donationStickerModel = (DonationStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(donationStickerModel, 711), true);
            LJJJLIIL(donationStickerModel.getBaseStickerModel());
            HandlerHook.viewPost((View) this.LJIJJ.getValue(), new ARunnableS105S0100000_5(this, 120));
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        DonationStickerModel donationStickerModel = LJJJLL().LIZ;
        DonationStickerModel donationStickerModelCopy = donationStickerModel.copy(baseStickerModel, donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, donationStickerModel.displayStyle, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender);
        if (donationStickerModelCopy.getInitialTransformScale() <= 0.0f && baseStickerModel.getScale() > 0.0f) {
            donationStickerModelCopy = donationStickerModelCopy.copy(donationStickerModelCopy.baseStickerModel, donationStickerModelCopy.visible, donationStickerModelCopy.clickable, donationStickerModelCopy.name, donationStickerModelCopy.iconUri, donationStickerModelCopy.donateLink, donationStickerModelCopy.addTime, donationStickerModelCopy.orgId, donationStickerModelCopy.orgType, donationStickerModelCopy.fundraiserId, donationStickerModelCopy.fundraiserOwnerId, donationStickerModelCopy.fundraiserGoalDesc, donationStickerModelCopy.displayStyle, baseStickerModel.getScale(), donationStickerModelCopy.legacyDonationNoDisplayStyleAttr, donationStickerModelCopy.isDynamicRender);
        }
        LJJJLL().LIZLLL(new AwS608S0100000_29(donationStickerModelCopy, 710), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        DonationStickerModel donationStickerModel = LJJJLL().LIZ;
        LJIIJJI(donationStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, donationStickerModel.displayStyle, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 61), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 62), true);
    }

    public C19585811k0(Context context, DonationStickerModel donationStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, donationStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = donationStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 983));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 984));
        LJJJJ(frameLayout);
    }
}
