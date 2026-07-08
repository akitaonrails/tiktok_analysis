package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0n4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420680n4c extends AbstractC2255721DQs<InterfaceC1452130ntL> implements InterfaceC1452130ntL, InterfaceC379610EuV {
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1420690n4d LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 946));
    public final h0<Boolean> LLILZLL = new h0<>(null);
    public final C560530Lyd<Pair<Float, Long>> LLIZ = new C560530Lyd<>();
    public final C560530Lyd<C443120HZe<Float, Float, Float>> LLIZLLLIL = new C560530Lyd<>();
    public boolean LLJ = true;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(369));

    public InterfaceC1452130ntL W1() {
        return this;
    }

    public final InterfaceC1420690n4d X1() {
        return null;
    }

    private final C1461380o8G Z1() {
        return (C1461380o8G) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC1452130ntL
    public void JI0() {
        if (this.LLILLJJLI.isAdded(Z1())) {
            return;
        }
        this.LLILLJJLI.add(this.LLILLL, Z1(), "EditGestureScene");
    }

    @Override // X.InterfaceC1452130ntL
    public MutableLiveData<FilterBean> WO1() {
        return (MutableLiveData) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1452130ntL
    public void qB1() {
        if (this.LLILLJJLI.isAdded(Z1())) {
            this.LLILLJJLI.hide(Z1());
        }
    }

    @Override // X.InterfaceC1452130ntL
    public LiveEvent<C443120HZe<Float, Float, Float>> gc0() {
        return this.LLIZLLLIL;
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

    @Override // X.InterfaceC1452130ntL
    public LiveEvent<Pair<Float, Long>> lF0() {
        return this.LLIZ;
    }

    public final int o2() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // X.InterfaceC1452130ntL
    public C385670FAf<Boolean> tt1() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1452130ntL
    public void Nd(boolean z) {
        this.LLILZLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1452130ntL
    public void aB1(boolean z) {
        this.LLJ = z;
    }

    @Override // X.InterfaceC1452130ntL
    public void Vy(float f, long j) {
        if (!this.LLJ) {
            return;
        }
        this.LLIZ.LJIIJ(new Pair<>(Float.valueOf(f), Long.valueOf(j)));
    }

    @Override // X.InterfaceC1452130ntL
    public void ih0(float f, float f2, float f3) {
        if (!this.LLJ) {
            return;
        }
        this.LLIZLLLIL.LJIIJ(new C443120HZe<>(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    public C1420680n4c(C1DRG c1drg, C19A3 c19a3, int i, InterfaceC1420690n4d interfaceC1420690n4d) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
