package X;

import kotlin.jvm.internal.AwS604S0100000_25;
import ln3.a;

/* JADX INFO: renamed from: X.0sy9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647310sy9 extends AbstractC2255721DQs<InterfaceC1647320syA> implements InterfaceC379610EuV, InterfaceC1647320syA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final C1647310sy9 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644760su2.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C1658340tFw.class, null);
    public final InterfaceC332260D0u<C1647450syN> LLILZLL = C1BNE.LIZ(new C1647450syN(C1651150t4L.LIZ().LIZ()));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647310sy9.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647310sy9.class, "beautyPanelApiComponent", "getBeautyPanelApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1647310sy9.class, "cameraViewControl", "getCameraViewControl()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/CameraViewControlBridge;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZLLLIL = 8;
    }

    private final a X1() {
        return (a) this.LLILLL.getValue(this, LLIZ[0]);
    }

    private final InterfaceC1644760su2 Z1() {
        return (InterfaceC1644760su2) this.LLILZ.getValue(this, LLIZ[1]);
    }

    public final C1658340tFw o2() {
        return (C1658340tFw) this.LLILZIL.getValue(this, LLIZ[2]);
    }

    @Override // X.InterfaceC1647320syA
    public void dh2() {
        C1647450syN value;
        if (!yo2()) {
            InterfaceC1644760su2 interfaceC1644760su2Z1 = Z1();
            if (interfaceC1644760su2Z1 != null) {
                interfaceC1644760su2Z1.FT1(true ^ interfaceC1644760su2Z1.Xx1());
                return;
            }
            return;
        }
        boolean z = q52().getValue().LIZ;
        a aVarX1 = X1();
        if (aVarX1 != null) {
            aVarX1.KS1(!z, C19317910ht.LIZJ() == 2131849207, true);
        }
        InterfaceC332260D0u<C1647450syN> interfaceC332260D0uQ52 = q52();
        do {
            value = interfaceC332260D0uQ52.getValue();
            value.getClass();
        } while (!interfaceC332260D0uQ52.compareAndSet(value, new C1647450syN(!z)));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!yo2()) {
            C579830Mof.LIZIZ(getDiContainer(), a.class, new AwS604S0100000_25(this, 274));
        }
        if (yo2()) {
            return;
        }
        whenReady(this, InterfaceC1644760su2.class, new AwS604S0100000_25(this, 275));
    }

    @Override // X.InterfaceC1647320syA
    public boolean yo2() {
        return C1651050t4B.LIZ();
    }

    public C1647310sy9 W1() {
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

    @Override // X.InterfaceC1647320syA
    public InterfaceC332260D0u<C1647450syN> q52() {
        return this.LLILZLL;
    }

    public C1647310sy9(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
