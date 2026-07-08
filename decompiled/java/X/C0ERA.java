package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ERA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ERA extends C0ECU implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C19A3 LLJ;
    public final C1DRG LLJI;
    public final C1914207ee LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public final C1664740tQG LLJILLL;
    public final C1664740tQG LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664740tQG LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ERA.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ERA.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ERA.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0ERA.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0ERA.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0ERA.class, "previewPanel", "getPreviewPanel()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0ERA.class, "captionApi", "getCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/CaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0ERA.class, "editorProAdjustCanvasApi", "getEditorProAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0ERA.class, "fullScreenApi", "getFullScreenApi()Lcom/ss/android/ugc/gamora/editorpro/framework/fullscreen/EditorProFullScreenApi;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public final VideoPublishEditModel LJIIIIZZ() {
        C0EY2 c0ey2 = (C0EY2) this.LLJILJILJ.getValue(this, LLJJIJIIJIL[0]);
        if (c0ey2 != null) {
            return c0ey2.getEditModel();
        }
        return null;
    }

    public final C0EJ3 LJIIIZ() {
        return (C0EJ3) this.LLJILLL.getValue(this, LLJJIJIIJIL[3]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C0ERA(C0E48 c0e48, C19A3 c19a3, C1DRG c1drg, C1914207ee c1914207ee, Function0<Unit> function0) {
        super(c0e48, "inline_caption_format");
        this.LLJ = c19a3;
        this.LLJI = c1drg;
        this.LLJIJIL = c1914207ee;
        this.LLJILJIL = function0;
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        C1664770tQJ.LIZIZ(c1drg, C0E5S.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC360800ECo.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        C1664770tQJ.LIZIZ(c1drg, C0EPM.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC362230EIb.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC362600EJm.class, null);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(c0e48, 627));
    }
}
