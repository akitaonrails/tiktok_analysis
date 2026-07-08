package X;

import java.math.BigInteger;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07aH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1887107aH implements Comparable<C1887107aH> {
    public static final C1887107aH LLILZLL;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 184));

    static {
        new C1887107aH(0, 0, 0, "");
        LLILZLL = new C1887107aH(0, 1, 0, "");
        new C1887107aH(1, 0, 0, "");
    }

    public final int hashCode() {
        return ((((527 + this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String toString() {
        String strLIZIZ;
        if (!a0.LJJJIL(this.LLILZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('-');
            sbLIZ.append(this.LLILZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LL);
        sbLIZ2.append('.');
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append('.');
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1887107aH c1887107aH) {
        return ((BigInteger) this.LLILZIL.getValue()).compareTo((BigInteger) c1887107aH.LLILZIL.getValue());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1887107aH)) {
            return false;
        }
        C1887107aH c1887107aH = (C1887107aH) obj;
        if (this.LL != c1887107aH.LL || this.LLILLJJLI != c1887107aH.LLILLJJLI || this.LLILLL != c1887107aH.LLILLL) {
            return false;
        }
        return true;
    }

    public C1887107aH(int i, int i2, int i3, String str) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = str;
    }
}
