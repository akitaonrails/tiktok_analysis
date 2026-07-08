package X;

import Y.AObserverS227S0100000_25;
import androidx.lifecycle.LiveData;
import lnn.q;

/* JADX INFO: renamed from: X.0sNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624660sNc extends AbstractC2255721DQs<InterfaceC1624680sNe> implements InterfaceC1624680sNe, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1624680sNe LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577380Mki.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1624660sNc.class, "cameraLayoutApiComponent", "getCameraLayoutApiComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1624660sNc.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZLL = 8;
    }

    private final InterfaceC577380Mki X1() {
        return (InterfaceC577380Mki) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    public final InterfaceC1624670sNd Z1() {
        return getStickerApiComponent().C0().LJJLJLI();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<AbstractC579260Mnk> liveDataR6;
        super.onCreate();
        InterfaceC577380Mki interfaceC577380MkiX1 = X1();
        if (interfaceC577380MkiX1 == null || (liveDataR6 = interfaceC577380MkiX1.r6()) == null) {
            return;
        }
        liveDataR6.observe(this, new AObserverS227S0100000_25(this, 74));
    }

    public InterfaceC1624680sNe W1() {
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

    public C1624660sNc(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
