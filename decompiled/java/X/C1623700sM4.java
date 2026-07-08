package X;

import Y.AObjectS246S0100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623700sM4 extends AbstractC2255721DQs<InterfaceC1659790tIH> implements InterfaceC379610EuV, InterfaceC1659790tIH {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1659790tIH LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC332260D0u<Boolean> LLILZ;
    public final C05YD<Boolean> LLILZIL;
    public final C01GW LLILZLL;
    public volatile boolean LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1623700sM4.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = 8;
    }

    @Override // X.InterfaceC1659790tIH
    public void Cw2() {
        this.LLIZ = true;
        X1().setValue(Boolean.valueOf(true ^ X1().getValue().booleanValue()));
        getCameraApiComponent().Cd(false, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_TOOL_BAR_DEFAULT, null), "shoot_icon");
    }

    public final InterfaceC332260D0u<Boolean> X1() {
        return (InterfaceC332260D0u) this.LLILZLL.getValue();
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.InterfaceC1659790tIH
    public C05YD<Boolean> UP() {
        return C09IC.LIZIZ(X1());
    }

    @Override // X.InterfaceC1659790tIH
    public boolean Lf1() {
        return this.LLIZ;
    }

    public InterfaceC1659790tIH W1() {
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

    @Override // X.InterfaceC1659790tIH
    public C05YD<Boolean> wU0() {
        return this.LLILZIL;
    }

    public C1623700sM4(C1DRG c1drg) {
        this.LL = c1drg;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 398));
        getCameraApiComponent().Q30().LIZ(this, new AObjectS246S0100000_25(this, 276));
    }

    @Override // X.InterfaceC1659790tIH
    public void u20(boolean z) {
        this.LLILZ.setValue(Boolean.valueOf(z));
    }
}
