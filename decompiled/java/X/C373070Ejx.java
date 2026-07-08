package X;

import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;

/* JADX INFO: renamed from: X.0Ejx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373070Ejx extends AbstractC2255721DQs<InterfaceC373260EkG> implements InterfaceC373260EkG, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373190Ek9.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373130Ek3.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374530EmJ.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373200EkA.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359070E5x.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0E64.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373070Ejx.class, "smartTrimPanelComponent", "getSmartTrimPanelComponent()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/trim/SmartTrimPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373070Ejx.class, "canvasScaleApiComponent", "getCanvasScaleApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/CanvasScaleApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373070Ejx.class, "bottomApiComponent", "getBottomApiComponent()Lcom/ss/android/ugc/gamora/editorpro/components/confirm/BottomApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373070Ejx.class, "panelNavApi", "getPanelNavApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/PanelNavApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C373070Ejx.class, "loadingApi", "getLoadingApi()Lcom/ss/android/ugc/gamora/editorpro/components/loading/CircleLoadingApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C373070Ejx.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/trim/SmartTrimPanelContext;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJ = 8;
    }

    public InterfaceC373260EkG W1() {
        return this;
    }

    private final InterfaceC374530EmJ X1() {
        return (InterfaceC374530EmJ) this.LLILZ.getValue(this, LLIZLLLIL[2]);
    }

    private final InterfaceC373130Ek3 Z1() {
        return (InterfaceC373130Ek3) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    private final InterfaceC359070E5x o2() {
        return (InterfaceC359070E5x) this.LLILZLL.getValue(this, LLIZLLLIL[4]);
    }

    private final C0E64 w2() {
        return (C0E64) this.LLIZ.getValue(this, LLIZLLLIL[5]);
    }

    public final InterfaceC373200EkA G2() {
        return (InterfaceC373200EkA) this.LLILZIL.getValue(this, LLIZLLLIL[3]);
    }

    public final InterfaceC373190Ek9 H2() {
        return (InterfaceC373190Ek9) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0E64 c0e64W2 = w2();
        if (c0e64W2 != null) {
            T2(c0e64W2);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C373070Ejx(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void T2(C0E64 c0e64) {
        InterfaceC373130Ek3 interfaceC373130Ek3Z1 = Z1();
        if (interfaceC373130Ek3Z1 != null) {
            interfaceC373130Ek3Z1.bind();
        }
        InterfaceC373200EkA interfaceC373200EkAG2 = G2();
        if (interfaceC373200EkAG2 != null) {
            interfaceC373200EkAG2.lt1();
        }
        c0e64.LLILZ.LIZ();
        InterfaceC359070E5x interfaceC359070E5xO2 = o2();
        if (interfaceC359070E5xO2 != null) {
            interfaceC359070E5xO2.setTitle(C20642515q3.LJI(2131848552));
        }
        InterfaceC359070E5x interfaceC359070E5xO22 = o2();
        if (interfaceC359070E5xO22 != null) {
            interfaceC359070E5xO22.show();
        }
        InterfaceC374530EmJ interfaceC374530EmJX1 = X1();
        if (interfaceC374530EmJX1 != null) {
            interfaceC374530EmJX1.setTitle(C20642515q3.LJI(2131848555));
        }
        InterfaceC373130Ek3 interfaceC373130Ek3Z12 = Z1();
        if (interfaceC373130Ek3Z12 != null) {
            interfaceC373130Ek3Z12.pV0(new AwS584S0100000_5(this, 660));
        }
        InterfaceC374530EmJ interfaceC374530EmJX12 = X1();
        if (interfaceC374530EmJX12 != null) {
            interfaceC374530EmJX12.u11(new InterfaceC374650EmV() { // from class: X.0Ek6
                @Override // X.InterfaceC374650EmV
                public final void LIZ() {
                    this.LIZ.exit(true);
                }

                @Override // X.InterfaceC374650EmV
                public final void onCancel() {
                    this.LIZ.exit(false);
                }
            });
        }
    }

    @Override // X.InterfaceC374710Emb
    public void exit(boolean z) {
        if (C373230EkD.LIZ(G2())) {
            return;
        }
        InterfaceC373200EkA interfaceC373200EkAG2 = G2();
        if (interfaceC373200EkAG2 != null) {
            interfaceC373200EkAG2.sr0();
        }
        InterfaceC373130Ek3 interfaceC373130Ek3Z1 = Z1();
        if (interfaceC373130Ek3Z1 != null) {
            interfaceC373130Ek3Z1.ml2(new AwS93S0110000_5(z, this, 10));
        }
    }
}
