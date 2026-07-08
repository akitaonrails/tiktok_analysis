package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19628111qp extends C0FFE<MentionStickerModel> {
    public final Context LJIILIIL;
    public final MentionStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final InterfaceC388760FMc LJIILLIIL;
    public final C0FFO LJIIZILJ;
    public final LifecycleOwner LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJ.getValue();
    }

    public final C1664680tQA<MentionStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJI.getValue();
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
        MentionStickerModel mentionStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof MentionStickerModel) && (mentionStickerModel = (MentionStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(mentionStickerModel, 758), true);
            LJJJLIIL(((MentionStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 757), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        MentionStickerModel mentionStickerModel = LJJJLL().LIZ;
        LJIIJJI(mentionStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), mentionStickerModel.user, mentionStickerModel.userId, mentionStickerModel.secUid, mentionStickerModel.userName, mentionStickerModel.avatarUrl, mentionStickerModel.nickname, mentionStickerModel.useNickName, mentionStickerModel.editable, mentionStickerModel.visible, mentionStickerModel.useCapsuleStyle));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 85), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 86), true);
    }

    public C19628111qp(Context context, MentionStickerModel mentionStickerModel, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, mentionStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = mentionStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = interfaceC388760FMc;
        this.LJIIZILJ = c0ffo;
        this.LJIJ = lifecycleOwner;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1015));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1016));
        LJJJJ(frameLayout);
    }
}
