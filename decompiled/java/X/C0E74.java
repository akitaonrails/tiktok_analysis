package X;

import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E74, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E74 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C19EG LL;
    public final C1DRG LLILLJJLI;
    public final C1664740tQG LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final C1664740tQG LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1202));
    public double LLJILJILJ = 1.0d;
    public String LLJILLL = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E74.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E74.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E74.class, "consoleBar", "getConsoleBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0E74.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0E74.class, "previewPanel", "getPreviewPanel()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0E74.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0E74.class, "reduceNoiseApi", "getReduceNoiseApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/reducenoise/EditorProReduceNoiseApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public final C0EGY LIZ() {
        return (C0EGY) this.LLIZ.getValue(this, LLJJ[3]);
    }

    public final C0E48 LIZIZ() {
        return (C0E48) this.LLILLL.getValue();
    }

    public final C0EC7 LIZJ() {
        return (C0EC7) this.LLILZIL.getValue(this, LLJJ[1]);
    }

    public final C0EY2 LIZLLL() {
        return (C0EY2) this.LLILZ.getValue(this, LLJJ[0]);
    }

    public final C0E5S LJ() {
        return (C0E5S) this.LLJ.getValue(this, LLJJ[5]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C0E74(C19EG c19eg, C1DRG c1drg) {
        this.LL = c19eg;
        this.LLILLJJLI = c1drg;
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, C0EC7.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, C0EGY.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC361710EGb.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC358970E5n.class, null);
    }
}
