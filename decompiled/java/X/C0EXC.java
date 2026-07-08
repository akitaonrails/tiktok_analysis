package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EXC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXC implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.VOICE_CONVERSION;
    public final C1664740tQG LLILLL;
    public boolean LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXC.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
        if (C301670Bs5.LIZ()) {
            this.LLILZ = true;
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C0EXC(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1446740nke.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        if (!Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "AUDIO_RECORD") && !Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        InterfaceC1455860nzM interfaceC1455860nzM;
        AbstractC1452680nuE abstractC1452680nuEGc;
        if (!this.LLILZ) {
            return false;
        }
        this.LLILZ = false;
        AudioEffectParam veAudioEffectParam = c0ey3.LIZIZ.getVeAudioEffectParam();
        if (veAudioEffectParam != null && (interfaceC1455860nzM = (InterfaceC1455860nzM) this.LLILLL.getValue(this, LLILZIL[0])) != null && (abstractC1452680nuEGc = interfaceC1455860nzM.gc()) != null) {
            abstractC1452680nuEGc.LJJIII(veAudioEffectParam);
        }
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VoiceConversionModel voiceConversionModel = c0ey3.LIZIZ.creativeModel.voiceConversionModel;
        NLEModel nLEModel = c0ey3.LIZ;
        c363500EMy.getClass();
        C0EXR.LIZ.getClass();
        C0EXR.LIZIZ(voiceConversionModel, nLEModel, true);
        VideoPublishEditModel videoPublishEditModel = c0ey3.LIZIZ;
        C0EXR.LIZ(videoPublishEditModel, videoPublishEditModel, c0ey3.LIZ, true);
        this.LLILZ = true;
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
