package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549830LhN extends i<InterfaceC549900LhU, C0MRY, C549910LhV, C07U8> implements InterfaceC549900LhU, InterfaceC379610EuV {
    public C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C549800LhK LLJJ;

    public InterfaceC549900LhU F4() {
        return this;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C549910LhV> o2() {
        return new AwS552S0100000_8(this, 1077);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07U8> w2() {
        return AFwS194S0000000_8.get$arr$(576);
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

    public C549830LhN(C19A3 c19a3, C1DRG c1drg, C549800LhK c549800LhK) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c549800LhK;
    }
}
