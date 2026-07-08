package X;

import Y.AObserverS236S0100000_34;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1BqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217221BqC extends AbstractC2255721DQs<InterfaceC1454750nxZ> implements InterfaceC379610EuV, InterfaceC1454750nxZ {
    public static final int LLIZ = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS566S0100000_22(this, 1059));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 175));

    public InterfaceC1454750nxZ W1() {
        return this;
    }

    private final InterfaceC1460000o62 X1() {
        return (InterfaceC1460000o62) this.LLILZIL.getValue();
    }

    private final C0ESA Z1() {
        return (C0ESA) this.LLILZLL.getValue();
    }

    private final void o2() {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS613S0100000_34(this, 142));
        } else {
            X1().x8().observe(this, new AObserverS236S0100000_34(this, 27));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.add(this.LLILLL, Z1(), "PhotoSwapTitleScene");
        o2();
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

    public final void w2(boolean z) {
        if (z) {
            this.LLILLJJLI.show(Z1());
        } else {
            this.LLILLJJLI.hide(Z1());
        }
    }

    public C2217221BqC(C1DRG c1drg, C19A3 c19a3, int i, String str) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = str;
    }
}
