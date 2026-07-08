package X;

import com.bytedance.tux.input.TuxTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714540S1c {
    public final List<String> LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Function1<C384050F3z, Unit> LJ;
    public final int LJFF;
    public final Function1<TuxTextView, Unit> LJI;

    public C714540S1c() {
        this(null, null, null, 0, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C714540S1c)) {
            return false;
        }
        C714540S1c c714540S1c = (C714540S1c) obj;
        return Intrinsics.LJFF(this.LIZ, c714540S1c.LIZ) && Intrinsics.LJFF(this.LIZIZ, c714540S1c.LIZIZ) && this.LIZJ == c714540S1c.LIZJ && this.LIZLLL == c714540S1c.LIZLLL && Intrinsics.LJFF(this.LJ, c714540S1c.LJ) && this.LJFF == c714540S1c.LJFF && Intrinsics.LJFF(this.LJI, c714540S1c.LJI);
    }

    public C714540S1c(List list, String str, AFwS232S0000000_4 aFwS232S0000000_4, int i, Function1 function1, int i2) {
        int i3;
        list = (i2 & 1) != 0 ? C13BV.INSTANCE : list;
        str = (i2 & 2) != 0 ? "" : str;
        if ((i2 & 4) != 0) {
            i3 = 11;
        } else {
            i3 = 0;
        }
        int i4 = (i2 & 8) != 0 ? 51 : 0;
        aFwS232S0000000_4 = (i2 & 16) != 0 ? AFwS232S0000000_4.get$arr$(231) : aFwS232S0000000_4;
        i = (i2 & 32) != 0 ? 6 : i;
        function1 = (i2 & 64) != 0 ? null : function1;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = aFwS232S0000000_4;
        this.LJFF = i;
        this.LJI = function1;
    }
}
