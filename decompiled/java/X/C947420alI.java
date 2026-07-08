package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0alI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947420alI {
    public final EnumC947450alL LIZ;
    public final long LIZIZ;
    public final EnumC947440alK LIZJ;
    public final Long LIZLLL;
    public final C947500alQ LJ;
    public final C947500alQ LJFF;
    public final Long LJI;
    public final String LJII;
    public final Map<String, C947590alZ> LJIIIIZZ;
    public final Map<String, String> LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C947420alI)) {
            return false;
        }
        C947420alI c947420alI = (C947420alI) obj;
        return this.LIZ == c947420alI.LIZ && this.LIZIZ == c947420alI.LIZIZ && this.LIZJ == c947420alI.LIZJ && Intrinsics.LJFF(this.LIZLLL, c947420alI.LIZLLL) && Intrinsics.LJFF(this.LJ, c947420alI.LJ) && Intrinsics.LJFF(this.LJFF, c947420alI.LJFF) && Intrinsics.LJFF(this.LJI, c947420alI.LJI) && Intrinsics.LJFF(this.LJII, c947420alI.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c947420alI.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c947420alI.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31;
        Long l = this.LIZLLL;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        C947500alQ c947500alQ = this.LJ;
        int iHashCode3 = (iHashCode2 + (c947500alQ == null ? 0 : c947500alQ.hashCode())) * 31;
        C947500alQ c947500alQ2 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (c947500alQ2 == null ? 0 : c947500alQ2.hashCode())) * 31;
        Long l2 = this.LJI;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.LJII;
        return ((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameSnapshot(gameType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gameSessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", gamePhase=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startPlayMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", requiredGameResource=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", optionalGameResource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", gameOptionId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", songName=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", players=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C947420alI(EnumC947450alL enumC947450alL, long j, EnumC947440alK enumC947440alK, Long l, C947500alQ c947500alQ, C947500alQ c947500alQ2, Long l2, String str, Map<String, C947590alZ> map, Map<String, String> map2) {
        this.LIZ = enumC947450alL;
        this.LIZIZ = j;
        this.LIZJ = enumC947440alK;
        this.LIZLLL = l;
        this.LJ = c947500alQ;
        this.LJFF = c947500alQ2;
        this.LJI = l2;
        this.LJII = str;
        this.LJIIIIZZ = map;
        this.LJIIIZ = map2;
    }

    public static C947420alI LIZ(C947420alI c947420alI, EnumC947440alK enumC947440alK, Long l, C947500alQ c947500alQ, C947500alQ c947500alQ2, Long l2, String str, Map map, Map map2, int i) {
        EnumC947450alL enumC947450alL;
        long j;
        Map map3 = map2;
        Map map4 = map;
        String str2 = str;
        Long l3 = l2;
        C947500alQ c947500alQ3 = c947500alQ2;
        C947500alQ c947500alQ4 = c947500alQ;
        Long l4 = l;
        EnumC947440alK enumC947440alK2 = enumC947440alK;
        if ((i & 1) != 0) {
            enumC947450alL = c947420alI.LIZ;
        } else {
            enumC947450alL = null;
        }
        if ((i & 2) != 0) {
            j = c947420alI.LIZIZ;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            enumC947440alK2 = c947420alI.LIZJ;
        }
        if ((i & 8) != 0) {
            l4 = c947420alI.LIZLLL;
        }
        if ((i & 16) != 0) {
            c947500alQ4 = c947420alI.LJ;
        }
        if ((i & 32) != 0) {
            c947500alQ3 = c947420alI.LJFF;
        }
        if ((i & 64) != 0) {
            l3 = c947420alI.LJI;
        }
        if ((i & 128) != 0) {
            str2 = c947420alI.LJII;
        }
        if ((i & 256) != 0) {
            map4 = c947420alI.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            map3 = c947420alI.LJIIIZ;
        }
        c947420alI.getClass();
        return new C947420alI(enumC947450alL, j, enumC947440alK2, l4, c947500alQ4, c947500alQ3, l3, str2, map4, map3);
    }
}
