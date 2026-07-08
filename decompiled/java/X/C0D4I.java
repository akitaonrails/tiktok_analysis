package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4I {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final Locale LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D4I)) {
            return false;
        }
        C0D4I c0d4i = (C0D4I) obj;
        return Intrinsics.LJFF(this.LIZ, c0d4i.LIZ) && this.LIZIZ == c0d4i.LIZIZ && this.LIZJ == c0d4i.LIZJ && this.LIZLLL == c0d4i.LIZLLL && Intrinsics.LJFF(this.LJ, c0d4i.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpCurrencyRule(symbol=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", symbolPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showCurrencySpace=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fractionDigits=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", locale=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D4I(String str, int i, boolean z, int i2, Locale locale) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = locale;
    }
}
