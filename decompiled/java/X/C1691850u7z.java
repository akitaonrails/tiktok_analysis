package X;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0u7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691850u7z implements InterfaceC20035313aJ {
    public final long LL;
    public final InterfaceC1691820u7w LLILLJJLI;
    public final long LLILLL;
    public C1691830u7x LLILZ;
    public InterfaceC1691900u84 LLILZIL;
    public final InterfaceC1685750ty9 LLILZLL;

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        if (this.LLILZIL != null) {
            this.LLILLJJLI.unsubscribe();
            this.LLILZIL = null;
        }
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
        if (this.LLILZIL != null) {
            this.LLILLJJLI.unsubscribe();
            this.LLILZIL = null;
        }
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
        InterfaceC1691820u7w interfaceC1691820u7w = this.LLILLJJLI;
        new AwS569S0100000_25(this, 1);
        new AwS569S0100000_25(this, 2);
        this.LLILZIL = interfaceC1691820u7w.subscribe();
    }

    public C1691850u7z(final long j, final InterfaceC1691820u7w interfaceC1691820u7w, long j2) {
        C1691830u7x c1691830u7x = C1691830u7x.LIZJ;
        this.LL = j;
        this.LLILLJJLI = interfaceC1691820u7w;
        this.LLILLL = j2;
        this.LLILZ = c1691830u7x;
        final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 0);
        C05ZY c05zy = new C05ZY() { // from class: X.0u80
            public long LIZ = 0;
            public long LIZIZ = 0;

            @Override // X.C05ZY
            public final void LIZ() {
            }

            @Override // X.C05ZY
            public final void LIZJ() {
            }

            @Override // X.C05ZY
            public final void onCancel() {
                if (C1691810u7v.LIZ(interfaceC1691820u7w, j)) {
                    interfaceC1691820u7w.LIZ();
                }
            }

            @Override // X.C05ZY
            public final void onStop() {
                if (C1691810u7v.LIZ(interfaceC1691820u7w, j)) {
                    interfaceC1691820u7w.LIZ();
                }
            }

            @Override // X.C05ZY
            public final void LIZIZ(long j3) {
                InterfaceC1692950u9l interfaceC1692950u9lInvoke = awS569S0100000_25.invoke();
                if (interfaceC1692950u9lInvoke != null) {
                    InterfaceC1691820u7w interfaceC1691820u7w2 = interfaceC1691820u7w;
                    long j4 = j;
                    if (!interfaceC1692950u9lInvoke.LIZLLL() || !C1691810u7v.LIZ(interfaceC1691820u7w2, j4)) {
                        return;
                    }
                    long jLJI = C1378605aS.LJI(this.LIZIZ, j3);
                    this.LIZIZ = jLJI;
                    long jLJI2 = C1378605aS.LJI(this.LIZ, jLJI);
                    InterfaceC1692520u94.LIZ.getClass();
                    if (interfaceC1691820u7w2.LIZJ()) {
                        this.LIZ = jLJI2;
                        this.LIZIZ = 0L;
                    }
                }
            }

            @Override // X.C05ZY
            public final void LIZLLL(long j3) {
                InterfaceC1692950u9l interfaceC1692950u9lInvoke = awS569S0100000_25.invoke();
                if (interfaceC1692950u9lInvoke != null) {
                    InterfaceC1691820u7w interfaceC1691820u7w2 = interfaceC1691820u7w;
                    if (!interfaceC1692950u9lInvoke.LIZLLL()) {
                        return;
                    }
                    InterfaceC1692520u94.LIZ.getClass();
                    interfaceC1691820u7w2.LJFF();
                    this.LIZ = j3;
                }
                if (!C1691810u7v.LIZ(interfaceC1691820u7w, j)) {
                    return;
                }
                this.LIZIZ = 0L;
            }
        };
        InterfaceC1380005ag interfaceC1380005ag = new InterfaceC1380005ag() { // from class: X.0u81
            @Override // X.InterfaceC1380005ag
            public final void LIZIZ() {
                interfaceC1691820u7w.LIZ();
            }

            @Override // X.InterfaceC1380005ag
            public final boolean LIZ(long j3, InterfaceC1692520u94 interfaceC1692520u94) {
                InterfaceC1692950u9l interfaceC1692950u9lInvoke = awS569S0100000_25.invoke();
                if (interfaceC1692950u9lInvoke == null) {
                    return false;
                }
                InterfaceC1691820u7w interfaceC1691820u7w2 = interfaceC1691820u7w;
                long j4 = j;
                if (!interfaceC1692950u9lInvoke.LIZLLL()) {
                    return false;
                }
                interfaceC1691820u7w2.LJFF();
                return C1691810u7v.LIZ(interfaceC1691820u7w2, j4);
            }

            @Override // X.InterfaceC1380005ag
            public final boolean LIZJ(long j3, InterfaceC1692520u94 interfaceC1692520u94) {
                InterfaceC1692950u9l interfaceC1692950u9lInvoke = awS569S0100000_25.invoke();
                if (interfaceC1692950u9lInvoke != null) {
                    InterfaceC1691820u7w interfaceC1691820u7w2 = interfaceC1691820u7w;
                    long j4 = j;
                    if (!interfaceC1692950u9lInvoke.LIZLLL() || !C1691810u7v.LIZ(interfaceC1691820u7w2, j4)) {
                        return false;
                    }
                    interfaceC1691820u7w2.LIZJ();
                    return true;
                }
                return true;
            }
        };
        this.LLILZLL = C1679720toQ.LIZIZ(InterfaceC1685750ty9.LIZ, interfaceC1380005ag, c05zy, new C1379405aa(interfaceC1380005ag, c05zy)).LIZ(new PointerHoverIconModifierElement(C1692800u9W.LIZ, false));
    }
}
