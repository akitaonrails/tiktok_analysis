package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Etg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379100Etg extends AbstractC2255721DQs<InterfaceC379310Eu1> implements InterfaceC379310Eu1, InterfaceC379610EuV {
    public static final C379320Eu2 LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public static final List<String> LLJILLL;
    public final C376260Ep6 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C379120Eti.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379060Etc.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379270Etx.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379180Eto.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379090Etf.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379160Etm.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379250Etv.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377410Eqx.class, null);

    public InterfaceC379310Eu1 W1() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0Eu2] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C379100Etg.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelContext;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C379100Etg.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/preview/EPAIGCPreviewApiComponent;", 0), new C2217381BqS(C379100Etg.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/topbar/EPAICreateTopBarApiComponent;", 0), new C2217381BqS(C379100Etg.class, "configApi", "getConfigApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/configurations/EPAIGCConfigurationApiComponent;", 0), new C2217381BqS(C379100Etg.class, "editTextApi", "getEditTextApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextApiComponent;", 0), new C2217381BqS(C379100Etg.class, "rootApi", "getRootApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelRootApiComponent;", 0), new C2217381BqS(C379100Etg.class, "modelSelectApi", "getModelSelectApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/modelselect/EPAIGCModelSelectApiComponent;", 0), new C2217381BqS(C379100Etg.class, "editorProAIGCResultsPanelApi", "getEditorProAIGCResultsPanelApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/results/EditorProAIGCResultsPanelApi;", 0)};
        LLJIJIL = new Object() { // from class: X.0Eu2
        };
        LLJILJILJ = 8;
        LLJILLL = C1697810uHb.LJIIJJI("tt_face", "tt_face_extra");
    }

    private final C379120Eti G2() {
        return (C379120Eti) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    private final InterfaceC379060Etc H2() {
        return (InterfaceC379060Etc) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    private final InterfaceC379160Etm T2() {
        return (InterfaceC379160Etm) this.LLIZLLLIL.getValue(this, LLJILJIL[5]);
    }

    private final InterfaceC379270Etx W2() {
        return (InterfaceC379270Etx) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    private final InterfaceC379180Eto X1() {
        return (InterfaceC379180Eto) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    private final InterfaceC379090Etf Z1() {
        return (InterfaceC379090Etf) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    private final void c3() {
        ArrayList arrayList = new ArrayList();
        for (String str : LLJILLL) {
            boolean zIsResourceAvailable = C13Q5.LIZ().LIZLLL().isResourceAvailable(str);
            boolean zLJFF = Intrinsics.LJFF(C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str), "asset://md5_error");
            if (!zIsResourceAvailable || zLJFF) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            C13Q5.LIZ().LIZ(new String[]{""}, C2097908Jt.LIZJ(new Pair("models", arrayList)), null);
        }
    }

    private final InterfaceC377410Eqx o2() {
        return (InterfaceC377410Eqx) this.LLJI.getValue(this, LLJILJIL[7]);
    }

    private final InterfaceC379250Etv w2() {
        return (InterfaceC379250Etv) this.LLJ.getValue(this, LLJILJIL[6]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0Etv] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.13BV] */
    @Override // X.InterfaceC379310Eu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a7() {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379100Etg.a7():void");
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379310Eu1
    public void Z0(EnumC379210Etr enumC379210Etr) {
        int i;
        if (!T2().sz1() && (i = C379230Ett.LIZ[enumC379210Etr.ordinal()]) != 1 && i != 2) {
            throw new C1954807lC();
        }
    }

    public C379100Etg(C376260Ep6 c376260Ep6, C1DRG c1drg) {
        this.LL = c376260Ep6;
        this.LLILLJJLI = c1drg;
    }
}
