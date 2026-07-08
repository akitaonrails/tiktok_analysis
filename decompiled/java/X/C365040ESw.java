package X;

import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ESw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365040ESw extends i<C0ET2, C0ET1, C365050ESx, C365060ESy> implements InterfaceC379610EuV, C0ET2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<C365050ESx> LLJJIII;
    public final Function0<C365060ESy> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C365040ESw.class, "contentApi", "getContentApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/fade/api/AudioFadePanelContentApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C365040ESw.class, "contextData", "getContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/fade/ui/AudioFadePanelContext;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJIL = 8;
    }

    @Override // X.C0ET2
    public void G4(Function0<Unit> function0) {
    }

    public final InterfaceC362640EJq H4() {
        return (InterfaceC362640EJq) this.LLJJ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final C0ECF K4() {
        return (C0ECF) this.LLJJI.getValue(this, LLJJIJIIJIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        F4(0);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C365050ESx> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C365060ESy> w2() {
        return this.LLJJIJI;
    }

    public final void F4(int i) {
        C0ECF c0ecfK4 = K4();
        InterfaceC360800ECo interfaceC360800ECo = (InterfaceC360800ECo) c0ecfK4.LLJJ.getValue(c0ecfK4, C0ECF.LLJJJIL[4]);
        if (interfaceC360800ECo != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.FULL_SCREEN}, Integer.valueOf(i), null, null, null, 28);
        }
    }

    public C365040ESw(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC362640EJq.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C0ECF.class, null);
        this.LLJJIII = new AwS549S0100000_5(this, 390);
        this.LLJJIJI = new AwS549S0100000_5(this, 391);
    }
}
