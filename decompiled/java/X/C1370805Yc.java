package X;

import java.util.List;

/* JADX INFO: renamed from: X.05Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370805Yc implements C05YW {
    public final long LIZIZ;
    public final long LIZJ;

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        C13DV c13dv = new C13DV(2);
        if (this.LIZIZ > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopTimeout=");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("ms");
            c13dv.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZJ < Long.MAX_VALUE) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("replayExpiration=");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append("ms");
            c13dv.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        List listLIZ = C1697820uHc.LIZ(c13dv);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SharingStarted.WhileSubscribed(");
        sbLIZ3.append(C13LP.LJJLIIIJ(listLIZ, null, null, null, 0, null, null, 63));
        sbLIZ3.append(')');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // X.C05YW
    public final InterfaceC346201Wa<C05YY> LIZ(C05YD<Integer> c05yd) {
        return C09IC.LJIILL(new C1768706wH(new C1370705Yb(null), C09IC.LJJIZ(c05yd, new C1370605Ya(this, null)), 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1370805Yc) {
            C1370805Yc c1370805Yc = (C1370805Yc) obj;
            if (this.LIZIZ == c1370805Yc.LIZIZ && this.LIZJ == c1370805Yc.LIZJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1370805Yc(long j, long j2) {
        boolean z;
        this.LIZIZ = j;
        this.LIZJ = j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 >= 0) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replayExpiration(");
            sbLIZ.append(j2);
            sbLIZ.append(" ms) cannot be negative");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stopTimeout(");
        sbLIZ2.append(j);
        sbLIZ2.append(" ms) cannot be negative");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }
}
