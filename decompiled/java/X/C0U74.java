package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U74, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U74<T> {
    public final String LIZ;
    public final List<T> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<T> LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0U74)) {
            return false;
        }
        C0U74 c0u74 = (C0U74) obj;
        return Intrinsics.LJFF(this.LIZ, c0u74.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0u74.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0u74.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0u74.LIZLLL) && Intrinsics.LJFF(this.LJ, c0u74.LJ) && Intrinsics.LJFF(this.LJFF, c0u74.LJFF) && Intrinsics.LJFF(this.LJI, c0u74.LJI) && Intrinsics.LJFF(this.LJII, c0u74.LJII);
    }

    public C0U74(String str, String str2, String str3, String str4, String str5, List list, List list2, int i) {
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? "" : str4;
        str5 = (i & 32) != 0 ? "" : str5;
        list2 = (i & 64) != 0 ? C13BV.INSTANCE : list2;
        String str6 = (i & 128) == 0 ? null : "";
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = list2;
        this.LJII = str6;
    }
}
