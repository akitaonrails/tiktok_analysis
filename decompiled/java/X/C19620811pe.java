package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19620811pe extends C0FFE<MusicStickerModel> {
    public final Context LJIILIIL;
    public final MusicStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final C0FFO LJIILLIIL;
    public final LifecycleOwner LJIIZILJ;
    public final C390420FSm LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public final void LJJIZ() {
        C21637819mC c21637819mC = (C21637819mC) this.LJIJ.LIZJ(C13LE.LIZ(C21637819mC.class));
        if (c21637819mC == null) {
            return;
        }
        BaseStickerModel baseStickerModelLIZLLL = c21637819mC.LIZLLL(BaseStickerModel.copy$default(this.LJIILJJIL.getBaseStickerModel(), 0, 0, null, 0, 0, -10000.0f, -10000.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -97, 15, null));
        MusicStickerModel musicStickerModel = this.LJIILJJIL;
        float f = -1;
        LJIIJJI(musicStickerModel.copy(BaseStickerModel.copy$default(baseStickerModelLIZLLL, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModelLIZLLL.getTranslateX() * f, baseStickerModelLIZLLL.getTranslateY() * f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null), true, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJIJJ.getValue();
    }

    public final C1664680tQA<MusicStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJI.getValue();
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
        MusicStickerModel musicStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof MusicStickerModel) && (musicStickerModel = (MusicStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS608S0100000_29(musicStickerModel, 655), true);
            LJJJLIIL(((MusicStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS608S0100000_29(baseStickerModel, 654), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        MusicStickerModel musicStickerModel = LJJJLL().LIZ;
        LJIIJJI(musicStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), musicStickerModel.visible, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom));
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS41S0010000_29(z, 57), true);
        LJJJLL().LIZLLL(new AwS41S0010000_29(z, 58), true);
    }

    public C19620811pe(Context context, MusicStickerModel musicStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, musicStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = musicStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = c0ffo;
        this.LJIIZILJ = lifecycleOwner;
        this.LJIJ = c390420FSm;
        this.LJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 927));
        this.LJIJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 928));
        LJJJJ(frameLayout);
    }
}
