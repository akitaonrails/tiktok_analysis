package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672880QaM {
    public final EnumC669620QOi LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C672880QaM)) {
            return false;
        }
        C672880QaM c672880QaM = (C672880QaM) obj;
        return this.LIZ == c672880QaM.LIZ && Intrinsics.LJFF(this.LIZIZ, c672880QaM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c672880QaM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c672880QaM.LIZLLL) && Intrinsics.LJFF(this.LJ, c672880QaM.LJ) && Intrinsics.LJFF(this.LJFF, c672880QaM.LJFF) && Intrinsics.LJFF(this.LJI, c672880QaM.LJI) && this.LJII == c672880QaM.LJII;
    }

    public C672880QaM(EnumC669620QOi enumC669620QOi, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.LIZ = enumC669620QOi;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = j;
    }
}
