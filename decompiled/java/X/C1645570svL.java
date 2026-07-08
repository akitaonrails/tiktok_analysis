package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.Observer;

/* JADX INFO: renamed from: X.0svL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645570svL extends AbstractC2255721DQs<InterfaceC1645400sv4> implements InterfaceC1645400sv4, InterfaceC379610EuV {
    public static final C1645580svM LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1645400sv4 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public Integer LLILZ;
    public boolean LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0svM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645570svL.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0svM
        };
        LLIZLLLIL = 8;
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILLL.getValue(this, LLIZ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getCameraApiComponent().Tz1().observe(this, new Observer() { // from class: X.0svK
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updated zoom ratio to ");
                sbLIZ.append(obj);
                C201955140j.LIZLLL(c201967140v, "CameraZoomComponent", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        getCameraApiComponent().Or0().LIZ(this, new AObjectS246S0100000_25(this, 659));
        getCameraApiComponent().Q30().LIZ(this, new AObjectS246S0100000_25(this, 660));
    }

    public InterfaceC1645400sv4 W1() {
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

    public C1645570svL(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
