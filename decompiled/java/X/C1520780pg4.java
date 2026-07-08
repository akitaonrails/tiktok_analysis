package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0pg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520780pg4 implements Comparable<C1520780pg4> {
    public final String LL;
    public final Regex LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1520780pg4)) {
            return false;
        }
        C1520780pg4 c1520780pg4 = (C1520780pg4) obj;
        return Intrinsics.LJFF(this.LL, c1520780pg4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1520780pg4.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(": [");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1520780pg4 c1520780pg4) {
        return c1520780pg4.LLILLJJLI.getPattern().length() - this.LLILLJJLI.getPattern().length();
    }

    public C1520780pg4(String str, Regex regex) {
        this.LL = str;
        this.LLILLJJLI = regex;
    }
}
