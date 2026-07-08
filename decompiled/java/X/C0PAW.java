package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PAW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PAW implements C0PWT {
    public final Integer LL;

    public C0PAW() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PAW) && Intrinsics.LJFF(this.LL, ((C0PAW) obj).LL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchActivityHashCodeAction(searchActivityHashCode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0PAW.class), AFwS293S0000000_10.get$arr$(161));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PAW(Integer num) {
        this.LL = num;
    }
}
