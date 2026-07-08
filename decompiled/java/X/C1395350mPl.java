package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395350mPl {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1395350mPl)) {
            return false;
        }
        C1395350mPl c1395350mPl = (C1395350mPl) obj;
        return Intrinsics.LJFF(this.LIZ, c1395350mPl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1395350mPl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1395350mPl.LIZJ);
    }

    public C1395350mPl() {
        this("", "", "");
    }

    public C1395350mPl(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
