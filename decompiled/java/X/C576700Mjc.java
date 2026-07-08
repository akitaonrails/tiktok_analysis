package X;

import Y.AfS144S0200000_8;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Mjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576700Mjc implements C12UU {
    public final C19560811fy LL;
    public boolean LLILLJJLI;

    @Override // X.C12UU
    public final void LIZ(int i) {
    }

    @Override // X.C12UU
    public final void LIZIZ() {
    }

    @Override // X.C12UU
    public final void LIZLLL(String str) {
    }

    public C576700Mjc(C19560811fy c19560811fy) {
        this.LL = c19560811fy;
    }

    @Override // X.C12UU
    public final void LIZJ(final int i, String str, int i2, C0L3L c0l3l) {
        this.LL.LIZ().LJJIL(new InterfaceC19483011Ki() { // from class: X.0COG
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((Integer) ((Pair) obj).getFirst()).equals(Integer.valueOf(i));
            }
        }).LJJLJLI(new AfS144S0200000_8(this, c0l3l, 1));
    }
}
