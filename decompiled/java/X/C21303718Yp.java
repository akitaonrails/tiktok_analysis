package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21303718Yp extends i<C18YC, C21303918Yr, C1274904yp, C21303818Yq> implements C18YC, InterfaceC379610EuV {
    public C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C18YX LLJJ;

    public C18YC F4() {
        return this;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1274904yp> o2() {
        return new AwS576S0100000_32(this, 853);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21303818Yq> w2() {
        return new AwS576S0100000_32(this, 854);
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

    @Override // X.C18YC
    public void es2(boolean z) {
        i3(new AwS44S0010000_32(z, 31));
    }

    public C21303718Yp(C19A3 c19a3, C1DRG c1drg, C18YX c18yx) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c18yx;
    }
}
