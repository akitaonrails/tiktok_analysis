package X;

import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549810LhL extends i<InterfaceC548530LfH, C559560Lx4, C559530Lx1, C07T9> implements InterfaceC548530LfH, InterfaceC379610EuV {
    public C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C549780LhI LLJJ;

    public InterfaceC548530LfH F4() {
        return this;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C559530Lx1> o2() {
        return new AwS552S0100000_8(this, 1055);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07T9> w2() {
        return AFwS194S0000000_8.get$arr$(508);
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

    @Override // X.InterfaceC548530LfH
    public void j3(int i) {
        i3(new AwS23S0001000_8(i, 14));
    }

    @Override // X.InterfaceC548530LfH
    public void oG0(Pair<Long, String> pair) {
        i3(new AwS587S0100000_8(pair, (Pair<Long, String>) 712));
    }

    public C549810LhL(C19A3 c19a3, C1DRG c1drg, C549780LhI c549780LhI) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c549780LhI;
    }
}
