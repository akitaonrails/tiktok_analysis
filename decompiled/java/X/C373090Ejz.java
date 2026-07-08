package X;

import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS93S0110000_5;

/* JADX INFO: renamed from: X.0Ejz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373090Ejz extends AbstractC2255721DQs<InterfaceC373280EkI> implements InterfaceC373280EkI, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC373280EkI LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373240EkE.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373130Ek3.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374530EmJ.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373200EkA.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0E3Q.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373090Ejz.class, "soundAdjustPanelComponent", "getSoundAdjustPanelComponent()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/adjust/api/SoundAdjustPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C373090Ejz.class, "canvasScaleApiComponent", "getCanvasScaleApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/CanvasScaleApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C373090Ejz.class, "bottomApiComponent", "getBottomApiComponent()Lcom/ss/android/ugc/gamora/editorpro/components/confirm/BottomApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C373090Ejz.class, "panelNavApi", "getPanelNavApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/api/PanelNavApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C373090Ejz.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/adjust/ui/SoundAdjustPanelContext;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJ = 8;
    }

    private final InterfaceC374530EmJ X1() {
        return (InterfaceC374530EmJ) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    private final InterfaceC373130Ek3 Z1() {
        return (InterfaceC373130Ek3) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final C0E3Q o2() {
        return (C0E3Q) this.LLIZ.getValue(this, LLIZLLLIL[4]);
    }

    public final InterfaceC373240EkE G2() {
        return (InterfaceC373240EkE) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    public final InterfaceC373200EkA w2() {
        return (InterfaceC373200EkA) this.LLILZLL.getValue(this, LLIZLLLIL[3]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0E3Q c0e3qO2 = o2();
        if (c0e3qO2 != null) {
            H2(c0e3qO2);
        }
    }

    public InterfaceC373280EkI W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C373090Ejz(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void H2(C0E3Q c0e3q) {
        InterfaceC373130Ek3 interfaceC373130Ek3Z1 = Z1();
        if (interfaceC373130Ek3Z1 != null) {
            interfaceC373130Ek3Z1.bind();
        }
        InterfaceC373200EkA interfaceC373200EkAW2 = w2();
        if (interfaceC373200EkAW2 != null) {
            interfaceC373200EkAW2.lt1();
        }
        InterfaceC373130Ek3 interfaceC373130Ek3Z12 = Z1();
        if (interfaceC373130Ek3Z12 != null) {
            interfaceC373130Ek3Z12.pV0(AFwS234S0000000_5.get$arr$(168));
        }
        InterfaceC374530EmJ interfaceC374530EmJX1 = X1();
        if (interfaceC374530EmJX1 != null) {
            interfaceC374530EmJX1.setTitle(C20642515q3.LJI(2131833429));
        }
        InterfaceC374530EmJ interfaceC374530EmJX12 = X1();
        if (interfaceC374530EmJX12 != null) {
            interfaceC374530EmJX12.u11(new InterfaceC374650EmV() { // from class: X.0Ek4
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
            interfaceC373130Ek3Z1.ml2(new AwS93S0110000_5(z, this, 4));
        }
    }
}
