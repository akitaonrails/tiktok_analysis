package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0sSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627850sSl {
    public final C05YD<InterfaceC1627870sSn> LIZ;
    public final C05YD<C05NR<Unit>> LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final C375830EoP<Pair<Integer, Boolean>> LIZLLL;
    public final C05YD<Boolean> LJ;
    public final C05YD<Boolean> LJFF;

    public static C1627850sSl LIZ(C1627850sSl c1627850sSl, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        C05YD<InterfaceC1627870sSn> c05yd;
        C05YD<C05NR<Unit>> c05yd2;
        C05YD<Boolean> c05yd3;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        C05YD<Boolean> c05yd4 = null;
        if ((i & 1) != 0) {
            c05yd = c1627850sSl.LIZ;
        } else {
            c05yd = null;
        }
        if ((i & 2) != 0) {
            c05yd2 = c1627850sSl.LIZIZ;
        } else {
            c05yd2 = null;
        }
        if ((i & 4) != 0) {
            c375830EoP4 = c1627850sSl.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP3 = c1627850sSl.LIZLLL;
        }
        if ((i & 16) != 0) {
            c05yd3 = c1627850sSl.LJ;
        } else {
            c05yd3 = null;
        }
        if ((i & 32) != 0) {
            c05yd4 = c1627850sSl.LJFF;
        }
        c1627850sSl.getClass();
        return new C1627850sSl(c05yd, c05yd2, c375830EoP4, c375830EoP3, c05yd3, c05yd4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1627850sSl(C05YD<? extends InterfaceC1627870sSn> c05yd, C05YD<? extends C05NR<Unit>> c05yd2, C375830EoP<Boolean> c375830EoP, C375830EoP<Pair<Integer, Boolean>> c375830EoP2, C05YD<Boolean> c05yd3, C05YD<Boolean> c05yd4) {
        this.LIZ = c05yd;
        this.LIZIZ = c05yd2;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = c05yd3;
        this.LJFF = c05yd4;
    }
}
