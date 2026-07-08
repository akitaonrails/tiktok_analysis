package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import lnn.q;

/* JADX INFO: renamed from: X.0sNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624630sNZ extends AbstractC2255721DQs<InterfaceC1624650sNb> implements InterfaceC1624650sNb, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1624650sNb LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577380Mki.class, null);
    public final Map<Integer, InterfaceC2217451BqZ<Unit>> LLILZIL = C2097908Jt.LIZJ(new Pair(1, new C1624640sNa(this)));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1624630sNZ.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1624630sNZ.class, "cameraLayoutApiComponent", "getCameraLayoutApiComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutApiComponent;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final InterfaceC577380Mki X1() {
        return (InterfaceC577380Mki) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1625980sPk(this, null), 2);
    }

    public InterfaceC1624650sNb W1() {
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

    public C1624630sNZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void Z1(boolean z, boolean z2) {
        EnumC577200MkQ enumC577200MkQ;
        InterfaceC577380Mki interfaceC577380MkiX1 = X1();
        if (interfaceC577380MkiX1 != null) {
            if (z2) {
                enumC577200MkQ = EnumC577200MkQ.GREEN_SCREEN_ON;
            } else {
                enumC577200MkQ = EnumC577200MkQ.PROP_ON;
            }
            interfaceC577380MkiX1.JN1(z, enumC577200MkQ);
        }
    }
}
