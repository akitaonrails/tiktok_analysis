package X;

import Y.ARunnableS131S0100000_31;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15R0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15R0 extends AbstractC1643610ssB<FTCEditMusicCutViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ = R.id.mhi;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1630));
    public final AFwS221S0000000_31 LLJIJIL = AFwS221S0000000_31.get$arr$(555);

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        C15R2 c15r2 = (C15R2) this.LLJI.getValue();
        VideoPublishEditModel videoPublishEditModelLLLIL = c15r2.LLLIL();
        if (videoPublishEditModelLLLIL.getMMusicPath() == null || videoPublishEditModelLLLIL.isStickPointMode()) {
            return;
        }
        C1456140nzo.LIZIZ(c15r2.LLLII(), false, false, false, false, 12);
        if (videoPublishEditModelLLLIL.hasOriginalSound()) {
            c15r2.LLLII().EY0(VEVolumeChangeOp.ofVoice(0.0f));
        }
        int musicDuration = C1403010mc7.LIZ.getMusicService().getMusicDuration(videoPublishEditModelLLLIL.getMMusicPath());
        c15r2.LLJJLIIIJLLLLLLLZ = musicDuration;
        TextView textView = c15r2.LLJILLL;
        Integer numValueOf = null;
        if (textView == null) {
            textView = null;
        }
        textView.setText(C0F3O.LIZ(musicDuration));
        int mMusicStart = videoPublishEditModelLLLIL.getMMusicStart();
        c15r2.LLJJJJ = mMusicStart;
        c15r2.LLJJJJJIL = mMusicStart;
        Boolean isSoundLoop = videoPublishEditModelLLLIL.getIsSoundLoop();
        boolean zBooleanValue = isSoundLoop != null ? isSoundLoop.booleanValue() : false;
        c15r2.LLJJJJLIIL = zBooleanValue;
        c15r2.LLJJL = zBooleanValue;
        C12WG.LIZJ(c15r2, new ARunnableS131S0100000_31(c15r2, 217));
        if (!c15r2.LLLI) {
            c15r2.LLLIZZ(true);
        }
        InterfaceC1452170ntP value = c15r2.LLLII().g().getValue();
        if (value == null || (numValueOf = Integer.valueOf(value.Yf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, c15r2.LLLFF))) == null || numValueOf.intValue() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cutMusic seek error: ");
            sbLIZ.append(numValueOf);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC524950KiL interfaceC524950KiL = c15r2.LLJLLIL;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.kF(c15r2.LLLFFI);
        }
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditMusicCutViewModel> W1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C15R0(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
    }
}
