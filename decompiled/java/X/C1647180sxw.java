package X;

import Y.AObjectS246S0100000_25;

/* JADX INFO: renamed from: X.0sxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647180sxw extends AbstractC2255721DQs<InterfaceC1646900sxU> implements InterfaceC379610EuV, InterfaceC1646900sxU {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648760t0U.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1652190t61.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647180sxw.class, "cameraViewControlBridge", "getCameraViewControlBridge()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/CameraViewControlBridgeApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647180sxw.class, "recordPermissionUIApi", "getRecordPermissionUIApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZIL = 8;
    }

    public InterfaceC1646900sxU W1() {
        return this;
    }

    private final InterfaceC1652190t61 Z1() {
        return (InterfaceC1652190t61) this.LLILLL.getValue(this, LLILZ[1]);
    }

    public final InterfaceC1648760t0U X1() {
        return (InterfaceC1648760t0U) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().iQ(Z1());
        Z1().L00().LIZ(this, new AObjectS246S0100000_25(this, 277));
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

    public C1647180sxw(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
