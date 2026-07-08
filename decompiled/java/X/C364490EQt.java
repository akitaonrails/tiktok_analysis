package X;

import android.text.TextPaint;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364490EQt extends C0ECU implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C19A3 LLJ;
    public final C1DRG LLJI;
    public final C364440EQo LLJIJIL;
    public final C0EJ2 LLJILJIL;
    public final List<TextStickerData> LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public final Function2<List<TextStickerData>, Boolean, Unit> LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664740tQG LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final C1664740tQG LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public final TextPaint LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C364490EQt.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C364490EQt.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C364490EQt.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C364490EQt.class, "editorProTextPanelApi", "getEditorProTextPanelApi()Lcom/ss/android/ugc/editorpro/components/api/text/editpanel/EPTextEditPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C364490EQt.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C364490EQt.class, "previewPanel", "getPreviewPanel()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C364490EQt.class, "captionRecognizeApi", "getCaptionRecognizeApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/EditorProCaptionRecognizeProviderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C364490EQt.class, "captionApi", "getCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/CaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C364490EQt.class, "editorProAdjustCanvasApi", "getEditorProAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C364490EQt.class, "fullScreenApi", "getFullScreenApi()Lcom/ss/android/ugc/gamora/editorpro/framework/fullscreen/EditorProFullScreenApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
    }

    public final VideoPublishEditModel LJIIIIZZ() {
        C0EY2 c0ey2 = (C0EY2) this.LLJJI.getValue(this, LLJJL[0]);
        if (c0ey2 != null) {
            return c0ey2.getEditModel();
        }
        return null;
    }

    public final C0EOK LJIIIZ() {
        return (C0EOK) this.LLJJIII.getValue(this, LLJJL[1]);
    }

    public final NLEModel LJIIJ() {
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null) {
            return C350870DpF.LJI(c0e48);
        }
        return null;
    }

    public final C0E55 LJIIJJI() {
        C0E48 c0e48 = this.LLILLJJLI;
        if (c0e48 != null) {
            return c0e48.getPlayer();
        }
        return null;
    }

    public final C0EJ3 LJIIL() {
        return (C0EJ3) this.LLJJIJI.getValue(this, LLJJL[2]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C364490EQt(C19A3 c19a3, C0E48 c0e48, C1DRG c1drg, C364440EQo c364440EQo, C0EJ2 c0ej2, List<TextStickerData> list, Function0<Unit> function0, Function2<? super List<TextStickerData>, ? super Boolean, Unit> function2) {
        super(c0e48, "INLINE_CAPTION_word_filter");
        this.LLJ = c19a3;
        this.LLJI = c1drg;
        this.LLJIJIL = c364440EQo;
        this.LLJILJIL = c0ej2;
        this.LLJILJILJ = list;
        this.LLJILLL = function0;
        this.LLJJ = function2;
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC384330F5b.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, C0ER1.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, C0EPM.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC362230EIb.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC362600EJm.class, null);
        this.LLJJJJLIIL = new TextPaint();
    }

    public /* synthetic */ C364490EQt(C19A3 c19a3, C0E48 c0e48, C1DRG c1drg, C364440EQo c364440EQo, C0EJ2 c0ej2, List list, AwS619S0100000_5 awS619S0100000_5, int i) {
        this(c19a3, c0e48, c1drg, (i & 8) != 0 ? new C364440EQo() : c364440EQo, (i & 16) != 0 ? new C0EJ2(0, false, null, 15) : c0ej2, (List<TextStickerData>) ((i & 32) != 0 ? null : list), (Function0<Unit>) null, (i & 128) == 0 ? awS619S0100000_5 : null);
    }
}
