package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0sSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627590sSL {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Pair<InterfaceC1623190sLF, Boolean>> LIZIZ;

    public C1627590sSL() {
        this(null, null);
    }

    public C1627590sSL(C375830EoP<Boolean> c375830EoP, C375830EoP<Pair<InterfaceC1623190sLF, Boolean>> c375830EoP2) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
    }

    public static C1627590sSL LIZ(C1627590sSL c1627590sSL, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c1627590sSL.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c1627590sSL.LIZIZ;
        }
        c1627590sSL.getClass();
        return new C1627590sSL(c375830EoP, c375830EoP2);
    }
}
