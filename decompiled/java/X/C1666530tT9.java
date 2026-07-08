package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666530tT9 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final Function0<Unit> LJ;
    public final String LJFF;

    public C1666530tT9() {
        this(0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1666530tT9)) {
            return false;
        }
        C1666530tT9 c1666530tT9 = (C1666530tT9) obj;
        return this.LIZ == c1666530tT9.LIZ && this.LIZIZ == c1666530tT9.LIZIZ && this.LIZJ == c1666530tT9.LIZJ && this.LIZLLL == c1666530tT9.LIZLLL && Intrinsics.LJFF(this.LJ, c1666530tT9.LJ) && Intrinsics.LJFF(this.LJFF, c1666530tT9.LJFF);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1666530tT9(int i, int i2) {
        boolean z;
        boolean z2;
        AFwS214S0000000_25 aFwS214S0000000_25;
        int i3 = i;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        i3 = (i2 & 2) != 0 ? 0 : i3;
        if ((i2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = (i2 & 8) != 0 ? R.drawable.bx6 : 0;
        if ((i2 & 16) != 0) {
            aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(392);
        } else {
            aFwS214S0000000_25 = null;
        }
        this(i3, i4, null, aFwS214S0000000_25, z, z2);
    }

    public static C1666530tT9 LIZ(C1666530tT9 c1666530tT9, int i, boolean z, int i2) {
        boolean z2;
        Function0<Unit> function0;
        boolean z3 = z;
        int i3 = i;
        int i4 = 0;
        if ((i2 & 1) != 0) {
            z2 = c1666530tT9.LIZ;
        } else {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            i3 = c1666530tT9.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z3 = c1666530tT9.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i4 = c1666530tT9.LIZLLL;
        }
        String str = null;
        if ((i2 & 16) != 0) {
            function0 = c1666530tT9.LJ;
        } else {
            function0 = null;
        }
        if ((i2 & 32) != 0) {
            str = c1666530tT9.LJFF;
        }
        c1666530tT9.getClass();
        return new C1666530tT9(i3, i4, str, function0, z2, z3);
    }

    public C1666530tT9(int i, int i2, String str, Function0 function0, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
        this.LIZLLL = i2;
        this.LJ = function0;
        this.LJFF = str;
    }
}
