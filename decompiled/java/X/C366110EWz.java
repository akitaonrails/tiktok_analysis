package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366110EWz implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C0EX2 LLILLJJLI = C0EX2.LYRIC_STICKER;
    public final C1664740tQG LLILLL;
    public final C1664740tQG LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C366110EWz.class, "editorProStickerApi", "getEditorProStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditorProApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C366110EWz.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    public final InterfaceC1461350o8D LJIIIIZZ() {
        return (InterfaceC1461350o8D) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C366110EWz(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, C0EHC.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1461350o8D.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return C351220Dpo.LLJLLIL(nLETrack);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return C351220Dpo.LLJLLIL(nLETrack);
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LJI(c366230EXl, C2107308Nj.LIZ, new C0EQT(this, null));
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
