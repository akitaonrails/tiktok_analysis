package X;

import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21302318Yb extends i<InterfaceC21302218Ya, C194452115u, Unit, C194454115w> implements InterfaceC21302218Ya, InterfaceC379610EuV {
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C18YW LLJJ;

    public InterfaceC21302218Ya F4() {
        return this;
    }

    @Override // X.InterfaceC21302218Ya
    public void Hl2(boolean z) {
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return AFwS223S0000000_32.get$arr$(0);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C194454115w> w2() {
        return new AwS576S0100000_32(this, 0);
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        F4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    public C21302318Yb(C19A3 c19a3, C1DRG c1drg, C18YW c18yw) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c18yw;
    }
}
