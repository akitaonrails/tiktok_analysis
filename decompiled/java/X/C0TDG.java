package X;

import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TDG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TDG {
    public final C11PQ<C0TCU> LIZ = C11PQ.LJLLLLLL(C0TCU.StateIdle);
    public final C11PQ<C0TDU> LIZIZ = C11PQ.LJLLLLLL(C0TDU.LeftTop);
    public final C11PQ<Boolean> LIZJ = C11PQ.LJLLLLLL(Boolean.FALSE);
    public final C11PQ<Boolean> LIZLLL = new C11PQ<>();
    public final C11PQ<Boolean> LJ = new C11PQ<>();
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(349));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(348));
    public final float LJII = 1.7777778f;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LIZLLL();

    public final boolean LIZJ() {
        return this.LIZ.LJLZ() == C0TCU.StateConnected;
    }
}
