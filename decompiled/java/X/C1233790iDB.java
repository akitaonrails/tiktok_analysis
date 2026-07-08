package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iDB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233790iDB {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC1233840iDG LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1233790iDB() {
        boolean z = false;
        this(z, z, null, 0 == true ? 1 : 0, z, z, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1233790iDB)) {
            return false;
        }
        C1233790iDB c1233790iDB = (C1233790iDB) obj;
        return this.LIZ == c1233790iDB.LIZ && this.LIZIZ == c1233790iDB.LIZIZ && this.LIZJ == c1233790iDB.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1233790iDB.LIZLLL) && this.LJ == c1233790iDB.LJ && this.LJFF == c1233790iDB.LJFF;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public C1233790iDB(boolean z, boolean z2, EnumC1233840iDG enumC1233840iDG, String str, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = enumC1233840iDG;
        this.LIZLLL = str;
        this.LJ = z3;
        this.LJFF = z4;
    }

    public /* synthetic */ C1233790iDB(boolean z, boolean z2, EnumC1233840iDG enumC1233840iDG, String str, boolean z3, boolean z4, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? EnumC1233840iDG.SMS : enumC1233840iDG, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public static C1233790iDB LIZ(C1233790iDB c1233790iDB, boolean z, boolean z2, String str, boolean z3, boolean z4, int i) {
        EnumC1233840iDG enumC1233840iDG;
        boolean z5 = z4;
        boolean z6 = z3;
        String str2 = str;
        boolean z7 = z2;
        boolean z8 = z;
        if ((i & 1) != 0) {
            z8 = c1233790iDB.LIZ;
        }
        if ((i & 2) != 0) {
            z7 = c1233790iDB.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC1233840iDG = c1233790iDB.LIZJ;
        } else {
            enumC1233840iDG = null;
        }
        if ((i & 8) != 0) {
            str2 = c1233790iDB.LIZLLL;
        }
        if ((i & 16) != 0) {
            z6 = c1233790iDB.LJ;
        }
        if ((i & 32) != 0) {
            z5 = c1233790iDB.LJFF;
        }
        return new C1233790iDB(z8, z7, enumC1233840iDG, str2, z6, z5);
    }
}
