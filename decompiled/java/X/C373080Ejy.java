package X;

import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS93S0110000_5;

/* JADX INFO: renamed from: X.0Ejy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373080Ejy extends AbstractC2255721DQs<InterfaceC373270EkH> implements InterfaceC373270EkH, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373210EkB.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373130Ek3.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374530EmJ.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373200EkA.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C360050E9r.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(193));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373080Ejy.class, "videoAdjustPanelApi", "getVideoAdjustPanelApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/adjust/VideoAdjustPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373080Ejy.class, "canvasScaleApi", "getCanvasScaleApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/CanvasScaleApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373080Ejy.class, "bottomApi", "getBottomApi()Lcom/ss/android/ugc/gamora/editorpro/components/confirm/BottomApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373080Ejy.class, "panelNavApi", "getPanelNavApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/PanelNavApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C373080Ejy.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/model/PanelContext;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJ = 8;
    }

    public InterfaceC373270EkH W1() {
        return this;
    }

    private final InterfaceC372990Ejp G2() {
        return (InterfaceC372990Ejp) this.LLIZ.getValue();
    }

    private final InterfaceC374530EmJ X1() {
        return (InterfaceC374530EmJ) this.LLILZ.getValue(this, LLIZLLLIL[2]);
    }

    private final InterfaceC373130Ek3 Z1() {
        return (InterfaceC373130Ek3) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    private final C360050E9r o2() {
        return (C360050E9r) this.LLILZLL.getValue(this, LLIZLLLIL[4]);
    }

    public final InterfaceC373210EkB H2() {
        return (InterfaceC373210EkB) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    public final InterfaceC373200EkA w2() {
        return (InterfaceC373200EkA) this.LLILZIL.getValue(this, LLIZLLLIL[3]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C360050E9r c360050E9rO2 = o2();
        if (c360050E9rO2 != null) {
            T2(c360050E9rO2);
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

    public C373080Ejy(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void T2(C360050E9r c360050E9r) {
        InterfaceC373130Ek3 interfaceC373130Ek3Z1 = Z1();
        if (interfaceC373130Ek3Z1 != null) {
            interfaceC373130Ek3Z1.bind();
        }
        InterfaceC373200EkA interfaceC373200EkAW2 = w2();
        if (interfaceC373200EkAW2 != null) {
            interfaceC373200EkAW2.lt1();
        }
        InterfaceC372990Ejp interfaceC372990EjpG2 = G2();
        if (interfaceC372990EjpG2 != null) {
            interfaceC372990EjpG2.setVisibility(4);
        }
        C0E60 c0e60 = c360050E9r.LLILZ;
        if (c0e60 != null) {
            c0e60.LIZ();
        }
        InterfaceC373130Ek3 interfaceC373130Ek3Z12 = Z1();
        if (interfaceC373130Ek3Z12 != null) {
            interfaceC373130Ek3Z12.pV0(AFwS234S0000000_5.get$arr$(306));
        }
        InterfaceC374530EmJ interfaceC374530EmJX1 = X1();
        if (interfaceC374530EmJX1 != null) {
            interfaceC374530EmJX1.setTitle(C20642515q3.LJI(2131833429));
        }
        InterfaceC374530EmJ interfaceC374530EmJX12 = X1();
        if (interfaceC374530EmJX12 != null) {
            interfaceC374530EmJX12.u11(new InterfaceC374650EmV() { // from class: X.0Ek5
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
        if (C373230EkD.LIZ(w2())) {
            return;
        }
        InterfaceC373200EkA interfaceC373200EkAW2 = w2();
        if (interfaceC373200EkAW2 != null) {
            interfaceC373200EkAW2.sr0();
        }
        InterfaceC373130Ek3 interfaceC373130Ek3Z1 = Z1();
        if (interfaceC373130Ek3Z1 != null) {
            interfaceC373130Ek3Z1.ml2(new AwS93S0110000_5(z, this, 8));
        }
    }
}
