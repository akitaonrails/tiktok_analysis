package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317510CcX {
    public final boolean LIZ;
    public final EnumC317520CcY LIZIZ;
    public final boolean LIZJ;
    public final Word LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final List<Position> LJII;
    public final List<Position> LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public C317510CcX() {
        this(false, null, false, null, null, null, 0, null, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C317510CcX)) {
            return false;
        }
        C317510CcX c317510CcX = (C317510CcX) obj;
        return this.LIZ == c317510CcX.LIZ && this.LIZIZ == c317510CcX.LIZIZ && this.LIZJ == c317510CcX.LIZJ && Intrinsics.LJFF(this.LIZLLL, c317510CcX.LIZLLL) && Intrinsics.LJFF(this.LJ, c317510CcX.LJ) && Intrinsics.LJFF(this.LJFF, c317510CcX.LJFF) && this.LJI == c317510CcX.LJI && Intrinsics.LJFF(this.LJII, c317510CcX.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c317510CcX.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c317510CcX.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c317510CcX.LJIIJ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Word word = this.LIZLLL;
        int iHashCode = (iZ2 + (word == null ? 0 : word.hashCode())) * 31;
        String str = this.LJ;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        String str2 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIJ;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public static C317510CcX LIZ(C317510CcX c317510CcX, List list) {
        return new C317510CcX(c317510CcX.LIZ, c317510CcX.LIZIZ, c317510CcX.LIZJ, c317510CcX.LIZLLL, c317510CcX.LJ, c317510CcX.LJFF, c317510CcX.LJI, c317510CcX.LJII, list, c317510CcX.LJIIIZ, c317510CcX.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C317510CcX(boolean z, EnumC317520CcY enumC317520CcY, boolean z2, Word word, String str, String str2, int i, List<? extends Position> list, List<? extends Position> list2, String str3, String str4) {
        this.LIZ = z;
        this.LIZIZ = enumC317520CcY;
        this.LIZJ = z2;
        this.LIZLLL = word;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = i;
        this.LJII = list;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
    }

    public C317510CcX(boolean z, EnumC317520CcY enumC317520CcY, boolean z2, Word word, String str, String str2, int i, List list, List list2, String str3, String str4, int i2) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? EnumC317520CcY.ALL : enumC317520CcY, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : word, (i2 & 16) != 0 ? "" : str, (i2 & 32) == 0 ? str2 : "", (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? C13BV.INSTANCE : list, (i2 & 256) != 0 ? C13BV.INSTANCE : list2, (i2 & 512) != 0 ? null : str3, (i2 & 1024) == 0 ? str4 : null);
    }
}
