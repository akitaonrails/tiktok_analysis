package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EXK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXK implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C0EX2 LLILLJJLI = C0EX2.MAIN_TRACK;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(420));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXK.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EXK.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EXK.class, "audioEditApi", "getAudioEditApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/AudioEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EXK.class, "recommendLogicComponent", "getRecommendLogicComponent()Lcom/ss/android/ugc/gamora/editorpro/recommend/IEPMusicRecommendLogicComponent;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
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

    public C0EXK(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455720nz8.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1465140oEK.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return nLETrack.getMainTrack();
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        boolean zLIZ = C346800Dig.LIZ(c0ey3.LIZ);
        C140D c140d = C140D.LIZ;
        VideoPublishEditModel videoPublishEditModel = c0ey3.LIZIZ;
        c140d.getClass();
        C140D.LJJIIZ(videoPublishEditModel);
        C0F1Z.LIZ.getClass();
        VideoPublishEditModel videoPublishEditModel2 = C0F1Z.LIZLLL;
        if (videoPublishEditModel2 != null && (multiEditVideoRecordData = videoPublishEditModel2.getMultiEditVideoRecordData()) != null) {
            multiEditVideoRecordData.isMultiEditRetake = false;
        }
        return zLIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0318 A[EDGE_INSN: B:583:0x0318->B:137:0x0318 BREAK  A[LOOP:12: B:133:0x0302->B:584:?], EDGE_INSN: B:137:0x0318->B:138:0x0319 BREAK  A[LOOP:13: B:498:0x0a32->B:587:?]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0536 A[EDGE_INSN: B:603:0x0536->B:248:0x0536 BREAK  A[LOOP:20: B:228:0x04f2->B:605:?], EDGE_INSN: B:604:0x0536->B:248:0x0536 BREAK  A[LOOP:20: B:228:0x04f2->B:605:?]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0a38  */
    @Override // X.InterfaceC366210EXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C0EXH r18, X.C0EY3 r19, X.C366230EXl r20) {
        /*
            Method dump skipped, instruction units count: 2811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EXK.LJI(X.0EXH, X.0EY3, X.0EXl):java.lang.Object");
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
