package X;

import android.view.SurfaceView;

/* JADX INFO: renamed from: X.0FCK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FCK extends AbstractC2255721DQs<InterfaceC522940Kf6> implements InterfaceC379610EuV, InterfaceC522940Kf6 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public boolean LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
    public final InterfaceC522940Kf6 LLILZ = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FCK.class, "reuseSurfaceApiComponent", "getReuseSurfaceApiComponent()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC522940Kf6
    public void LC() {
        this.LLILLJJLI = true;
    }

    private final InterfaceC1452360nti X1() {
        return (InterfaceC1452360nti) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        SurfaceView surfaceViewLJIJJLI;
        super.onStart();
        if (this.LLILLJJLI) {
            InterfaceC1452360nti interfaceC1452360ntiX1 = X1();
            if (interfaceC1452360ntiX1 != null && (surfaceViewLJIJJLI = interfaceC1452360ntiX1.LJIJJLI()) != null) {
                C786410Ut5.LLIIII(surfaceViewLJIJJLI, 8);
            }
            this.LLILLJJLI = false;
        }
    }

    public InterfaceC522940Kf6 W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0FCK(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
