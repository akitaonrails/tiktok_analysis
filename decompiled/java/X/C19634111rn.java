package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19634111rn extends C0FFE<LiveEventCountDownStickerModel> {
    public final Context LJIILIIL;
    public final LiveEventCountDownStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final InterfaceC388760FMc LJIILLIIL;
    public final C0FFO LJIIZILJ;
    public final LifecycleOwner LJIJ;
    public final C390420FSm LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;

    @Override // X.C0FFE, X.C0FTJ
    public final float LJ() {
        return ((C0FUH) this.LJIJJLI.getValue()).LJIIJ == EnumC391400FWg.RECORD ? 0.6f : 1.0f;
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIL.getValue();
    }

    public final C1664680tQA<LiveEventCountDownStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJJ.getValue();
    }

    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return LJJJLL().LIZ;
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
        LiveEventCountDownStickerModel liveEventCountDownStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof LiveEventCountDownStickerModel) && (liveEventCountDownStickerModel = (LiveEventCountDownStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(liveEventCountDownStickerModel, 636), true);
            LJJJLIIL(((LiveEventCountDownStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 635), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = LJJJLL().LIZ;
        LJIIJJI(liveEventCountDownStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), liveEventCountDownStickerModel.title, liveEventCountDownStickerModel.endTime, liveEventCountDownStickerModel.lastEditTime, liveEventCountDownStickerModel.subscribeNum, liveEventCountDownStickerModel.subscribe, liveEventCountDownStickerModel.textAlreadyExpired, liveEventCountDownStickerModel.textTobeSubscribed, liveEventCountDownStickerModel.textAlreadySubscribed, liveEventCountDownStickerModel.maxLine, liveEventCountDownStickerModel.clickable, liveEventCountDownStickerModel.editable, liveEventCountDownStickerModel.visible, liveEventCountDownStickerModel.eventId, liveEventCountDownStickerModel.isDefaultTitle));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 53), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 54), true);
    }

    public C19634111rn(Context context, LiveEventCountDownStickerModel liveEventCountDownStickerModel, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, liveEventCountDownStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = liveEventCountDownStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = interfaceC388760FMc;
        this.LJIIZILJ = c0ffo;
        this.LJIJ = lifecycleOwner;
        this.LJIJI = c390420FSm;
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 894));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 895));
        this.LJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 896));
        LJJJJ(frameLayout);
    }
}
