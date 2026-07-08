package X;

import Y.AObjectS247S0100000_29;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordState;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12UD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UD extends AbstractC1643610ssB<FTCEditAudioRecordViewModel> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final C1664750tQH LLJIJIL;
    public final int LLJ = R.id.mhi;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1128));
    public final C01GW LLJILJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final AFwS218S0000000_29 LLJILJILJ = AFwS218S0000000_29.get$arr$(465);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12UD.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        ((C12U9) this.LLJI.getValue()).LLLLII(false);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLJILLL[0]);
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        ((C12U9) this.LLJI.getValue()).LLLLII(true);
    }

    public final InterfaceC1455860nzM w2() {
        return (InterfaceC1455860nzM) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        C11EA.LJII(this, X1(), new C2217381BqS() { // from class: X.12UH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditAudioRecordState) obj).getClearAudioData();
            }
        }, new AwS643S0100000_29(this, 182));
        ((FTCEditAudioRecordViewModel) X1()).LLIZLLLIL.LIZ(this, new AObjectS247S0100000_29(this, 101));
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditAudioRecordViewModel> W1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C12UD(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    public final void zp(float f, float f2) {
        if (getEditModel().isStitchMode()) {
            if (getEditModel().isMuted()) {
                w2().EY0(VEVolumeChangeOp.ofVoice(0.0f));
                w2().EY0(VEVolumeChangeOp.ofMusic(f));
                return;
            } else {
                w2().EY0(VEVolumeChangeOp.ofVoice(f2));
                w2().EY0(VEVolumeChangeOp.ofMusic(f));
                return;
            }
        }
        if ((getEditModel().isFastImport() || getEditModel().hasOriginalSound()) && !getEditModel().isMuted()) {
            if (f2 != -1.0f) {
                w2().EY0(VEVolumeChangeOp.ofVoice(f2));
            }
            if (getEditModel().getMMusicPath() == null || f == -1.0f) {
                return;
            }
            w2().EY0(VEVolumeChangeOp.ofMusic(f));
            return;
        }
        if (f == -1.0f) {
            return;
        }
        w2().EY0(VEVolumeChangeOp.ofMusic(f));
    }
}
