package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.003O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C003O implements InterfaceC0148002o {
    public final String LL;

    public C003O() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C003O) && Intrinsics.LJFF(this.LL, ((C003O) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditFilterToolState(placeHolder=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C003O(String str) {
        this.LL = str;
    }
}
