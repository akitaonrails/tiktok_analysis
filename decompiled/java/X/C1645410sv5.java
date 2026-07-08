package X;

import kotlin.jvm.internal.AwS569S0100000_25;
import r1k.a;

/* JADX INFO: renamed from: X.0sv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645410sv5 extends AbstractC2255721DQs<InterfaceC1645390sv3> implements InterfaceC379610EuV, InterfaceC1645390sv3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1645390sv3 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1645420sv6.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 397));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645410sv5.class, "dispatcher", "getDispatcher()Lcom/ss/android/ugc/aweme/social/creation/record/launch/component/CenterViewTouchEventDispatcher;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1645410sv5.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final InterfaceC1645420sv6 X1() {
        return (InterfaceC1645420sv6) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    private final a Z1() {
        return (a) this.LLILZIL.getValue();
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        X1().R10(Z1());
        super.onResume();
    }

    public InterfaceC1645390sv3 W1() {
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

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public C1645410sv5(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
