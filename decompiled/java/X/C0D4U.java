package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4U, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4U {
    public final String LIZ;
    public final Locale LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D4U)) {
            return false;
        }
        C0D4U c0d4u = (C0D4U) obj;
        return Intrinsics.LJFF(this.LIZ, c0d4u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d4u.LIZIZ) && this.LIZJ == c0d4u.LIZJ && this.LIZLLL == c0d4u.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurrencyDisplayRule(symbol=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", locale=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", symbolPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showCurrencySpace=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D4U(String str, Locale locale, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = locale;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
