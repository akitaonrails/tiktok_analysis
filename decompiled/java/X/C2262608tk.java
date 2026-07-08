package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2262608tk {
    public final String LIZ;
    public final long LIZIZ;
    public final Boolean LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;
    public String LJFF;
    public final boolean LJI;

    public C2262608tk() {
        throw null;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2262608tk) {
            return Intrinsics.LJFF(this.LIZ, ((C2262608tk) obj).LIZ);
        }
        return false;
    }

    public C2262608tk(String str, long j, Boolean bool, List list, String str2, String str3, boolean z, int i) {
        bool = (i & 4) != 0 ? null : bool;
        list = (i & 8) != 0 ? null : list;
        str2 = (i & 16) != 0 ? "" : str2;
        str3 = (i & 32) != 0 ? "" : str3;
        z = (i & 64) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = bool;
        this.LIZLLL = list;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = z;
    }
}
