package X;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS66S0500000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868730yjH {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Function0<Unit> LIZLLL;
    public final int LIZJ = 14;
    public final Function1<Context, View> LJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868730yjH)) {
            return false;
        }
        C1868730yjH c1868730yjH = (C1868730yjH) obj;
        return Intrinsics.LJFF(this.LIZ, c1868730yjH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868730yjH.LIZIZ) && this.LIZJ == c1868730yjH.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1868730yjH.LIZLLL) && Intrinsics.LJFF(this.LJ, c1868730yjH.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31;
        Function1<Context, View> function1 = this.LJ;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Action(label=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paddingHorizontalDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", customView=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868730yjH(String str, Integer num, AwS66S0500000_2 awS66S0500000_2) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZLLL = awS66S0500000_2;
    }
}
