package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19618311pF extends C0FFE<SecretRepliesStickerModel> {
    public final Context LJIILIIL;
    public final SecretRepliesStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJI.getValue();
    }

    public final C1664680tQA<SecretRepliesStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJ.getValue();
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
        SecretRepliesStickerModel secretRepliesStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof SecretRepliesStickerModel) && (secretRepliesStickerModel = (SecretRepliesStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(secretRepliesStickerModel, 550), true);
            LJJJLIIL(((SecretRepliesStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 549), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        SecretRepliesStickerModel secretRepliesStickerModel = LJJJLL().LIZ;
        LJIIJJI(secretRepliesStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), secretRepliesStickerModel.visible, secretRepliesStickerModel.questionText, secretRepliesStickerModel.editable));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 42), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 43), true);
    }

    public C19618311pF(Context context, SecretRepliesStickerModel secretRepliesStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, secretRepliesStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = secretRepliesStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 823));
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 824));
        LJJJJ(frameLayout);
    }
}
