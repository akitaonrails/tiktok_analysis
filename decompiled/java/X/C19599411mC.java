package X;

import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19599411mC extends C0FFE<SocialAvatarStickerModel> {
    public final Context LJIILIIL;
    public final SocialAvatarStickerModel LJIILJJIL;
    public final C0FFO LJIILL;
    public final LifecycleOwner LJIILLIIL;
    public final C390420FSm LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJI.getValue();
    }

    public final C1664680tQA<SocialAvatarStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJ.getValue();
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        final C390420FSm c390420FSm = this.LJIIZILJ;
        return new C0FUE(c1664680tQALJJIJ, c390420FSm) { // from class: X.11mD
            @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                String str;
                C0HWW c0hww = C0HWW.LIZ;
                List<String> expressions = this.LJIILJJIL.getExpressions();
                if (expressions == null || (str = (String) C13LP.LJJJLL(expressions)) == null) {
                    str = "";
                }
                c0hww.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("action_type", "click");
                c2344009Gk.LJIIIIZZ("social_avatar_sticker_type", str);
                C20684815ws.LJIILLIIL("story_social_avatar_sticker", c2344009Gk.LIZ);
                return super.onSingleTapConfirmed(motionEvent);
            }
        };
    }

    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return LJJJLL().LIZ;
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIILLIIL;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILL;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        SocialAvatarStickerModel socialAvatarStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof SocialAvatarStickerModel) && (socialAvatarStickerModel = (SocialAvatarStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(socialAvatarStickerModel, 887), true);
            LJJJLIIL(((SocialAvatarStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJIIZI(AwS406S0200000_5 awS406S0200000_5) {
        HandlerHook.viewPost((View) this.LJIJI.getValue(), new ARunnableS75S0200000_6(this, awS406S0200000_5, 148));
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 886), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        SocialAvatarStickerModel socialAvatarStickerModel = LJJJLL().LIZ;
        LJIIJJI(socialAvatarStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), socialAvatarStickerModel.id, socialAvatarStickerModel.expressions, socialAvatarStickerModel.lowResolutionUrl, socialAvatarStickerModel.midResolutionUrl, socialAvatarStickerModel.highResolutionUrl));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 94), true);
    }

    public C19599411mC(Context context, SocialAvatarStickerModel socialAvatarStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, socialAvatarStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = socialAvatarStickerModel;
        this.LJIILL = c0ffo;
        this.LJIILLIIL = lifecycleOwner;
        this.LJIIZILJ = c390420FSm;
        this.LJIJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1135));
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1136));
        LJJJJ(frameLayout);
    }
}
