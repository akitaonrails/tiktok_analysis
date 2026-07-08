package X;

import Y.AObserverS236S0100000_34;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1BqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217231BqD extends AbstractC2255721DQs<InterfaceC1454760nxa> implements InterfaceC379610EuV, InterfaceC1454760nxa {
    public static final int LLIZLLLIL = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(278));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(487));
    public final C01GW LLILZLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS578S0100000_34((InterfaceC379610EuV) this, 177));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 176));

    public InterfaceC1454760nxa W1() {
        return this;
    }

    private final String X1() {
        return (String) this.LLILZIL.getValue();
    }

    private final InterfaceC1460000o62 Z1() {
        return (InterfaceC1460000o62) this.LLILZLL.getValue();
    }

    private final Keva o2() {
        return (Keva) this.LLILZ.getValue();
    }

    private final C0ES8 w2() {
        return (C0ES8) this.LLIZ.getValue();
    }

    private final void G2() {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS613S0100000_34(this, 143));
        } else {
            Z1().x8().observe(this, new AObserverS236S0100000_34(this, 29));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (o2().getBoolean(X1(), false)) {
            return;
        }
        o2().storeBoolean(X1(), true);
        this.LLILLJJLI.add(this.LLILLL, w2(), "PhotoSwapTnsScene");
        G2();
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

    public final void H2(boolean z) {
        if (z) {
            this.LLILLJJLI.show(w2());
        } else {
            this.LLILLJJLI.hide(w2());
        }
    }

    public C2217231BqD(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
