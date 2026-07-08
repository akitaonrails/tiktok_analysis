package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4J {
    public final String LIZ;
    public final Locale LIZIZ;
    public final int LIZJ;
    public final C0D4M LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D4J)) {
            return false;
        }
        C0D4J c0d4j = (C0D4J) obj;
        return Intrinsics.LJFF(this.LIZ, c0d4j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d4j.LIZIZ) && this.LIZJ == c0d4j.LIZJ && this.LIZLLL == c0d4j.LIZLLL && this.LJ == c0d4j.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurrencyDisplayRule(symbol=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", locale=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fractionDigits=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", placement=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", separatesSymbolWithSpace=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D4J(String str, Locale locale, int i, C0D4M c0d4m, boolean z) {
        this.LIZ = str;
        this.LIZIZ = locale;
        this.LIZJ = i;
        this.LIZLLL = c0d4m;
        this.LJ = z;
    }
}
