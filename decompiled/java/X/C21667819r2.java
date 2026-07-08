package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21667819r2 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Map<EnumC377110EqT, Boolean> LJ;
    public final C377060EqO LJFF;

    public C21667819r2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21667819r2)) {
            return false;
        }
        C21667819r2 c21667819r2 = (C21667819r2) obj;
        return this.LIZ == c21667819r2.LIZ && Intrinsics.LJFF(this.LIZIZ, c21667819r2.LIZIZ) && this.LIZJ == c21667819r2.LIZJ && this.LIZLLL == c21667819r2.LIZLLL && Intrinsics.LJFF(this.LJ, c21667819r2.LJ) && Intrinsics.LJFF(this.LJFF, c21667819r2.LJFF);
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        C377060EqO c377060EqO = this.LJFF;
        return iZ2 + (c377060EqO == null ? 0 : c377060EqO.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConfirmBottomStates(enableTouchEvent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", confirmBtnEnable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resetBtnEnable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", btnVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21667819r2(int i) {
        EnumC377110EqT enumC377110EqT = EnumC377110EqT.RESET;
        Boolean bool = Boolean.TRUE;
        this(true, "UnKnown", true, true, C2097608Jq.LJIIIIZZ(new Pair(enumC377110EqT, bool), new Pair(EnumC377110EqT.CONFIRM, bool)), null);
    }

    public C21667819r2(boolean z, String str, boolean z2, boolean z3, Map<EnumC377110EqT, Boolean> map, C377060EqO c377060EqO) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = map;
        this.LJFF = c377060EqO;
    }

    public static C21667819r2 LIZ(C21667819r2 c21667819r2, boolean z, String str, boolean z2, boolean z3, Map map, C377060EqO c377060EqO, int i) {
        C377060EqO c377060EqO2 = c377060EqO;
        Map map2 = map;
        boolean z4 = z3;
        boolean z5 = z2;
        String str2 = str;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = c21667819r2.LIZ;
        }
        if ((i & 2) != 0) {
            str2 = c21667819r2.LIZIZ;
        }
        if ((i & 4) != 0) {
            z5 = c21667819r2.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c21667819r2.LIZLLL;
        }
        if ((i & 16) != 0) {
            map2 = c21667819r2.LJ;
        }
        if ((i & 32) != 0) {
            c377060EqO2 = c21667819r2.LJFF;
        }
        c21667819r2.getClass();
        return new C21667819r2(z6, str2, z5, z4, map2, c377060EqO2);
    }
}
