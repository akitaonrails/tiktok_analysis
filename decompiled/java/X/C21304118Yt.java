package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21304118Yt extends i<InterfaceC21302218Ya, C21304318Yv, C1275004yq, C21304218Yu> implements InterfaceC21302218Ya, InterfaceC379610EuV {
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C18YW LLJJ;

    public InterfaceC21302218Ya F4() {
        return this;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1275004yq> o2() {
        return new AwS576S0100000_32(this, 892);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21304218Yu> w2() {
        return new AwS576S0100000_32(this, 893);
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

    @Override // X.InterfaceC21302218Ya
    public void Hl2(boolean z) {
        i3(new AwS44S0010000_32(z, 32));
    }

    public C21304118Yt(C19A3 c19a3, C1DRG c1drg, C18YW c18yw) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c18yw;
    }
}
