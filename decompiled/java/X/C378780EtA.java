package X;

import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378780EtA extends i<InterfaceC378860EtI, C378850EtH, C378800EtC, C07YG> implements InterfaceC379610EuV, InterfaceC378860EtI {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<C378800EtC> LLJJIII;
    public final Function0<C07YG> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C378780EtA.class, "contentApi", "getContentApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/format/api/CaptionFormatContentApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C378780EtA.class, "contextData", "getContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/format/ui/CaptionFormatPanelContext;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJIL = 8;
    }

    @Override // X.InterfaceC378860EtI
    public void G4(Function0<Unit> function0) {
    }

    public final C0ERC F4() {
        return (C0ERC) this.LLJJ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final C0ERA H4() {
        return (C0ERA) this.LLJJI.getValue(this, LLJJIJIIJIL[1]);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C378800EtC> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07YG> w2() {
        return this.LLJJIJI;
    }

    public C378780EtA(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C0ERC.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C0ERA.class, null);
        this.LLJJIII = new AwS549S0100000_5(this, 619);
        this.LLJJIJI = new AwS549S0100000_5(this, 620);
    }
}
