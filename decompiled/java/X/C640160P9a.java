package X;

import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640160P9a {
    public final String LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1230));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C640160P9a)) {
            return false;
        }
        C640160P9a c640160P9a = (C640160P9a) obj;
        return Intrinsics.LJFF(this.LIZ, c640160P9a.LIZ) && this.LIZIZ == c640160P9a.LIZIZ && Intrinsics.LJFF(this.LIZJ, c640160P9a.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c640160P9a.LIZLLL);
    }

    public final int LIZ() {
        return ((Number) this.LJ.getValue()).intValue();
    }

    public C640160P9a(int i, Integer num, Integer num2, String str) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = num2;
    }
}
