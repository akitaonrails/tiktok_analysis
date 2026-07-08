package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IPI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IPI {
    public final Drawable LIZ;
    public final String LIZIZ;
    public final CharSequence LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Function0<Unit> LJFF;
    public final boolean LJI;
    public final Function0<Unit> LJII;

    public C0IPI() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IPI)) {
            return false;
        }
        C0IPI c0ipi = (C0IPI) obj;
        return Intrinsics.LJFF(this.LIZ, c0ipi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ipi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ipi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ipi.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ipi.LJ) && Intrinsics.LJFF(this.LJFF, c0ipi.LJFF) && this.LJI == c0ipi.LJI && Intrinsics.LJFF(this.LJII, c0ipi.LJII);
    }

    public final int hashCode() {
        Drawable drawable = this.LIZ;
        int iHashCode = (((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0<Unit> function0 = this.LJFF;
        int iHashCode4 = (((iHashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        Function0<Unit> function02 = this.LJII;
        return iHashCode4 + (function02 != null ? function02.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusInfoItem(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(", stableModeActionText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stableModeActionButtonText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stableModeActionClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isClickable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IPI(Drawable drawable, String str, CharSequence charSequence, String str2, String str3, AwS551S0100000_7 awS551S0100000_7, int i) {
        charSequence = (i & 4) != 0 ? "" : charSequence;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        awS551S0100000_7 = (i & 32) != 0 ? null : awS551S0100000_7;
        this.LIZ = drawable;
        this.LIZIZ = str;
        this.LIZJ = charSequence;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = awS551S0100000_7;
        this.LJI = false;
        this.LJII = null;
    }
}
