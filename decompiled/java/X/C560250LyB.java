package X;

import com.bytedance.als.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560250LyB extends AbstractC2255721DQs<InterfaceC1642740sqm> implements InterfaceC1642740sqm {
    public final C1DRG LL;
    public final h0<Boolean> LLILLJJLI = new h0<>(Boolean.FALSE);

    public InterfaceC1642740sqm W1() {
        return this;
    }

    @Override // X.InterfaceC1642740sqm
    public void O9() {
        this.LLILLJJLI.LJII(Boolean.TRUE);
    }

    public h0<Boolean> X1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1642740sqm
    public /* bridge */ /* synthetic */ C385670FAf aa1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC1642740sqm, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C560250LyB(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1642740sqm
    public <T extends C05YF> void Sd(Class<T> cls, Function1<? super T, Unit> function1) {
        whenReady(this, cls, function1);
    }
}
