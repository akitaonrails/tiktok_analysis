package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EX4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EX4 implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.CAPTION;
    public final C1664750tQH LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EX4.class, "epTextStickerApi", "getEpTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
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

    public C0EX4(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, C0EJ3.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return C349550Dn7.LJFF(nLETrackSlot);
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        C364440EQo c364440EQoLLLZIL = ((C0EJ3) this.LLILLL.getValue(this, LLILZ[0])).LLLZIL();
        C364470EQr c364470EQr = C364470EQr.LIZ;
        VideoPublishEditModel videoPublishEditModel = c0ey3.LIZIZ;
        NLEModel nLEModel = c0ey3.LIZ;
        c364470EQr.getClass();
        C364470EQr.LIZJ(videoPublishEditModel, nLEModel, c364440EQoLLLZIL);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
