package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.11xH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19668111xH {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Integer> LIZIZ;
    public final C375830EoP<Pair<Integer, Integer>> LIZJ;

    public C19668111xH() {
        this(0);
    }

    public /* synthetic */ C19668111xH(int i) {
        this(new C375830EoP(Boolean.TRUE), new C375830EoP(0), new C375830EoP(new Pair(0, 0)));
    }

    public C19668111xH(C375830EoP<Boolean> c375830EoP, C375830EoP<Integer> c375830EoP2, C375830EoP<Pair<Integer, Integer>> c375830EoP3) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
    }

    public static C19668111xH LIZ(C19668111xH c19668111xH, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c19668111xH.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c19668111xH.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP3 = c19668111xH.LIZJ;
        }
        c19668111xH.getClass();
        return new C19668111xH(c375830EoP, c375830EoP2, c375830EoP3);
    }
}
