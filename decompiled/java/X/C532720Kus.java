package X;

import com.bytedance.als.h0;

/* JADX INFO: renamed from: X.0Kus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532720Kus extends AbstractC2255721DQs<InterfaceC527980KnE> implements InterfaceC527980KnE {
    public static final int LLILZLL = 8;
    public final h0<InterfaceC526620Kl2> LL;
    public final C385670FAf<InterfaceC526620Kl2> LLILLJJLI;
    public final h0<InterfaceC540250LGt> LLILLL;
    public final C385670FAf<InterfaceC540250LGt> LLILZ;
    public final InterfaceC527980KnE LLILZIL;

    public C532720Kus() {
        h0<InterfaceC526620Kl2> h0Var = new h0<>(null);
        this.LL = h0Var;
        this.LLILLJJLI = h0Var;
        h0<InterfaceC540250LGt> h0Var2 = new h0<>(null);
        this.LLILLL = h0Var2;
        this.LLILZ = h0Var2;
        this.LLILZIL = this;
    }

    @Override // X.InterfaceC527980KnE
    public C385670FAf<InterfaceC540250LGt> Fu2() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC527980KnE
    public C385670FAf<InterfaceC526620Kl2> Ut2() {
        return this.LLILLJJLI;
    }

    public InterfaceC527980KnE W1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC527980KnE
    public void Fv0(InterfaceC526620Kl2 interfaceC526620Kl2) {
        this.LL.LJII(interfaceC526620Kl2);
    }

    @Override // X.InterfaceC527980KnE
    public void hB0(InterfaceC540250LGt interfaceC540250LGt) {
        this.LLILLL.LJII(interfaceC540250LGt);
    }
}
