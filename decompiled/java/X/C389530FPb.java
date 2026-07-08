package X;

import android.content.Intent;
import com.bytedance.als.LiveEvent;

/* JADX INFO: renamed from: X.0FPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389530FPb extends AbstractC2255721DQs<InterfaceC389540FPc> implements InterfaceC389540FPc, InterfaceC484050IyZ, InterfaceC379610EuV {
    public final C1DRG LL;
    public final InterfaceC389540FPc LLILLJJLI = this;
    public final C560530Lyd<C443120HZe<Integer, Integer, Intent>> LLILLL = new C560530Lyd<>();

    @Override // X.InterfaceC389540FPc
    public /* bridge */ /* synthetic */ LiveEvent LLZIL() {
        return this.LLILLL;
    }

    public InterfaceC389540FPc W1() {
        return this.LLILLJJLI;
    }

    public C560530Lyd<C443120HZe<Integer, Integer, Intent>> X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C389530FPb(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC484050IyZ
    public boolean onActivityResult(int i, int i2, Intent intent) {
        this.LLILLL.LJIIJ(new C443120HZe<>(Integer.valueOf(i), Integer.valueOf(i2), intent));
        return false;
    }
}
