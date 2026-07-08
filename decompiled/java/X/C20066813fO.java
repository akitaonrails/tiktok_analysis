package X;

import java.util.List;

/* JADX INFO: renamed from: X.13fO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20066813fO {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final float LJ;
    public final long LJFF;
    public final long LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final List<C1395905dF> LJIIJ;
    public final long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public C20066813fO LJIILJJIL;

    public C20066813fO() {
        throw null;
    }

    public final void LIZ() {
        C20066813fO c20066813fO = this.LJIILJJIL;
        if (c20066813fO != null) {
            c20066813fO.LIZ();
        } else {
            this.LJIIL = true;
            this.LJIILIIL = true;
        }
    }

    public final boolean LIZIZ() {
        C20066813fO c20066813fO = this.LJIILJJIL;
        return c20066813fO != null ? c20066813fO.LIZIZ() : this.LJIIL || this.LJIILIIL;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        long j = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PointerId(value=");
        sbLIZ.append(j);
        sbLIZ.append(')');
        sb.append((Object) C2188811AlT.LIZIZ(sbLIZ));
        sb.append(", uptimeMillis=");
        sb.append(this.LIZIZ);
        sb.append(", position=");
        sb.append((Object) C1378605aS.LJIIIIZZ(this.LIZJ));
        sb.append(", pressed=");
        sb.append(this.LIZLLL);
        sb.append(", pressure=");
        sb.append(this.LJ);
        sb.append(", previousUptimeMillis=");
        sb.append(this.LJFF);
        sb.append(", previousPosition=");
        sb.append((Object) C1378605aS.LJIIIIZZ(this.LJI));
        sb.append(", previousPressed=");
        sb.append(this.LJII);
        sb.append(", isConsumed=");
        sb.append(LIZIZ());
        sb.append(", type=");
        int i = this.LJIIIIZZ;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.LJIIJ;
        if (obj == null) {
            obj = C13BV.INSTANCE;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C1378605aS.LJIIIIZZ(this.LJIIIZ));
        sb.append(')');
        return sb.toString();
    }

    public C20066813fO(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = z;
        this.LJ = f;
        this.LJFF = j4;
        this.LJI = j5;
        this.LJII = z2;
        this.LJIIIIZZ = i;
        this.LJIIIZ = j6;
        this.LJIIJJI = 0L;
        this.LJIIL = z3;
        this.LJIILIIL = z3;
    }

    public C20066813fO(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.LJIIJ = list;
        this.LJIIJJI = j7;
    }
}
