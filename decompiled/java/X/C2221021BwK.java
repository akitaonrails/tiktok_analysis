package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221021BwK {
    public final String LIZ;
    public final List<C2221071BwP> LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2221021BwK)) {
            return false;
        }
        C2221021BwK c2221021BwK = (C2221021BwK) obj;
        return Intrinsics.LJFF(this.LIZ, c2221021BwK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2221021BwK.LIZIZ) && this.LIZJ == c2221021BwK.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2221021BwK.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ParsedZipEntryArgs(filePath=" + this.LIZ + ", entries=" + this.LIZIZ + ", readAll=" + this.LIZJ + ", allEncoding=" + this.LIZLLL + ")";
    }

    public C2221021BwK(String str, List<C2221071BwP> list, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = str2;
    }
}
