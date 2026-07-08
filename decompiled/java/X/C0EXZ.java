package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXZ implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.NORMAL_EDIT_PAGE_RENDER;
    public final C0F3L LLILLL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXZ.class, "editProAdapterApi", "getEditProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C0EXZ(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = new C0F3L(c1drg);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C0EYP.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        C383310F1d subtitleMusicChangeChecker;
        C1DRG c1drgLJIIIZ;
        VideoPublishEditModel videoPublishEditModel = c0ey3.LIZIZ;
        NLEModel nLEModel = c0ey3.LIZ;
        C1462070o9N c1462070o9NLb2 = ((C0EYP) this.LLILZ.getValue(this, LLILZIL[0])).lb2();
        InterfaceC379580EuS interfaceC379580EuS = null;
        if (c1462070o9NLb2 != null && (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1462070o9NLb2)) != null) {
            interfaceC379580EuS = (InterfaceC379580EuS) c1drgLJIIIZ.LJIIL(null, InterfaceC379580EuS.class);
        }
        boolean z = c0eyd.LIZ;
        boolean zLIZ = C0EYG.LIZ(videoPublishEditModel);
        if (zLIZ && !z && (subtitleMusicChangeChecker = videoPublishEditModel.getSubtitleMusicChangeChecker()) != null) {
            subtitleMusicChangeChecker.getData(videoPublishEditModel);
        }
        C383310F1d subtitleMusicChangeChecker2 = videoPublishEditModel.getSubtitleMusicChangeChecker();
        if (subtitleMusicChangeChecker2 != null) {
            subtitleMusicChangeChecker2.setHasAudioChangeInEditorPro(z);
        }
        this.LLILLL.LJI(nLEModel, videoPublishEditModel, z, zLIZ, interfaceC379580EuS);
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
