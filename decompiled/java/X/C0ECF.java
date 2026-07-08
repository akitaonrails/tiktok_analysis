package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ECF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECF extends C0ECU implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C19A3 LLJ;
    public final C1DRG LLJI;
    public final C0EC4 LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664740tQG LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664740tQG LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;

    public C0ECF() {
        throw null;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ECF.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ECF.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ECF.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0ECF.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0ECF.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0ECF.class, "previewPanel", "getPreviewPanel()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0ECF.class, "captionApi", "getCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/CaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0ECF.class, "editorProAdjustCanvasApi", "getEditorProAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0ECF.class, "epPanelHeightApi", "getEpPanelHeightApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelHeightApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0ECF.class, "fullScreenApi", "getFullScreenApi()Lcom/ss/android/ugc/gamora/editorpro/framework/fullscreen/EditorProFullScreenApi;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
    }

    public final VideoPublishEditModel LJIIIIZZ() {
        C0EY2 c0ey2 = (C0EY2) this.LLJILJILJ.getValue(this, LLJJJIL[0]);
        if (c0ey2 != null) {
            return c0ey2.getEditModel();
        }
        return null;
    }

    public final C0E5S LJIIIZ() {
        return (C0E5S) this.LLJILLL.getValue(this, LLJJJIL[2]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ECF(C0E48 c0e48, C19A3 c19a3, C1DRG c1drg, C0EC4 c0ec4, int i) {
        super(c0e48, "audio_fade_panel");
        c0ec4 = (i & 8) != 0 ? new C0EC4(0, 3) : c0ec4;
        this.LLJ = c19a3;
        this.LLJI = c1drg;
        this.LLJIJIL = c0ec4;
        this.LLJILJIL = null;
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C0E5S.class, null);
        C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        C1664770tQJ.LIZIZ(c1drg, C0EPM.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC362230EIb.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC360570EBr.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC362600EJm.class, null);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(c0e48, 398));
    }
}
