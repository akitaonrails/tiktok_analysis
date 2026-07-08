package X;

import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Ly9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560230Ly9 extends AbstractC2255721DQs<InterfaceC560240LyA> implements InterfaceC560240LyA, InterfaceC379610EuV {
    public static final int LLILZ = 8;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(307));
    public boolean LLILLL;

    public InterfaceC560240LyA W1() {
        return this;
    }

    private final InterfaceC547720Ldy X1() {
        return (InterfaceC547720Ldy) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC560240LyA
    public void OO1() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        InterfaceC547720Ldy interfaceC547720LdyX1 = X1();
        if (interfaceC547720LdyX1 != null) {
            interfaceC547720LdyX1.checkAutoTask(getLifecycle(), "record");
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC547720Ldy interfaceC547720LdyX1 = X1();
        if (interfaceC547720LdyX1 != null) {
            interfaceC547720LdyX1.stopObserveTask("record");
        }
        super.onDestroy();
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

    public C560230Ly9(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
