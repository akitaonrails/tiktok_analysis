package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669630tY9 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1669630tY9)) {
            return false;
        }
        C1669630tY9 c1669630tY9 = (C1669630tY9) obj;
        return this.LIZ == c1669630tY9.LIZ && this.LIZIZ == c1669630tY9.LIZIZ && this.LIZJ == c1669630tY9.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1669630tY9.LIZLLL);
    }

    public C1669630tY9(String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = str;
    }
}
