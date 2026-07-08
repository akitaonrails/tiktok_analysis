package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362760EKc extends C0ECU implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C19A3 LLJ;
    public final C1DRG LLJI;
    public final C361860EGq LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public final Function0<Unit> LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664740tQG LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664740tQG LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final C1664740tQG LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final C1664740tQG LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C362760EKc.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C362760EKc.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C362760EKc.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C362760EKc.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C362760EKc.class, "editorProTextApi", "getEditorProTextApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C362760EKc.class, "editorProTextPanelApi", "getEditorProTextPanelApi()Lcom/ss/android/ugc/editorpro/components/api/text/editpanel/EPTextEditPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C362760EKc.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C362760EKc.class, "previewPanel", "getPreviewPanel()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C362760EKc.class, "editorProAdjustCanvasApi", "getEditorProAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public final InterfaceC361830EGn LJIIIIZZ() {
        C0EHF c0ehfRr2;
        C0EGY c0egy = (C0EGY) this.LLJJIII.getValue(this, LLJJJJ[3]);
        if (c0egy == null || (c0ehfRr2 = c0egy.Rr2()) == null) {
            return null;
        }
        return (InterfaceC361830EGn) c0ehfRr2.LIZJ(InterfaceC361830EGn.class);
    }

    public final MutableLiveData LJIIIZ() {
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null) {
            return c0e48.S7().LIZ("selected_nle_track_slot");
        }
        return null;
    }

    public final InterfaceC362230EIb LJIIJJI() {
        return (InterfaceC362230EIb) this.LLJJJIL.getValue(this, LLJJJJ[8]);
    }

    public final C0EY2 LJIIL() {
        return (C0EY2) this.LLJILLL.getValue(this, LLJJJJ[0]);
    }

    public final C0E55 LJIILIIL() {
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null) {
            return c0e48.getPlayer();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NLETrackSlot LJIIJ() {
        C351080Dpa c351080Dpa;
        MutableLiveData mutableLiveDataLJIIIZ = LJIIIZ();
        if (mutableLiveDataLJIIIZ == null || (c351080Dpa = (C351080Dpa) mutableLiveDataLJIIIZ.getValue()) == null) {
            return null;
        }
        return c351080Dpa.LIZ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public /* synthetic */ C362760EKc(C19A3 c19a3, C0E48 c0e48, C1DRG c1drg, C361860EGq c361860EGq, int i) {
        this(c19a3, c0e48, c1drg, (i & 8) != 0 ? new C361860EGq(0, 3) : c361860EGq, null, null);
    }

    public C362760EKc(C19A3 c19a3, C0E48 c0e48, C1DRG c1drg, C361860EGq c361860EGq, Function0<Unit> function0, Function0<Unit> function02) {
        super(c0e48, "sound_effect_panel");
        this.LLJ = c19a3;
        this.LLJI = c1drg;
        this.LLJIJIL = c361860EGq;
        this.LLJILJIL = function0;
        this.LLJILJILJ = function02;
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, C0E5S.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, C0EGY.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC384330F5b.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC362230EIb.class, null);
    }
}
