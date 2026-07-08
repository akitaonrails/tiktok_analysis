package X;

import Y.AObjectS244S0100000_18;
import Y.AObjectS246S0100000_25;
import com.bytedance.als.LiveEvent;
import kotlin.Unit;
import lnn.q;

/* JADX INFO: renamed from: X.0saI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632520saI extends AbstractC2255721DQs<InterfaceC1632530saJ> implements InterfaceC379610EuV, InterfaceC1632530saJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final C1632520saI LLILZ = this;
    public final InterfaceC332260D0u<C1632540saK> LLILZIL = C1BNE.LIZ(new C1632540saK(0));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1632520saI.class, "cameraComponent", "getCameraComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1632520saI.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final InterfaceC1650230t2r X1() {
        return (InterfaceC1650230t2r) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventIq0;
        super.onCreate();
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent == null || (liveEventIq0 = stickerApiComponent.Iq0()) == null) {
            return;
        }
        liveEventIq0.LIZ(this, new AObjectS244S0100000_18(this, 10));
    }

    public C1632520saI W1() {
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

    @Override // X.InterfaceC1632530saJ
    public InterfaceC346201Wa<C1632540saK> getState() {
        return this.LLILZIL;
    }

    public C1632520saI(C1DRG c1drg) {
        this.LL = c1drg;
        X1().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 241));
    }

    @Override // X.InterfaceC1632530saJ
    public void onVisibilityChanged(boolean z) {
        X1().Zl0(new C1663770tOh(z, false, false));
    }
}
