package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FU6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FU6 {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Function1<View, Unit> LJ;

    public C0FU6() {
        this(0, 0, null, null, null, 31);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LJ;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public C0FU6(int i, int i2, String str, Integer num, Function1 function1, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        str = (i3 & 4) != 0 ? "" : str;
        num = (i3 & 8) != 0 ? null : num;
        function1 = (i3 & 16) != 0 ? null : function1;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = function1;
    }
}
