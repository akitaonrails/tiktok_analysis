package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908807dm {
    public static final /* synthetic */ int LIZJ = 0;
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public C1908807dm() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1908807dm)) {
            return false;
        }
        C1908807dm c1908807dm = (C1908807dm) obj;
        return Intrinsics.LJFF(this.LIZ, c1908807dm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1908807dm.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StringArrayFilter(anyOf=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", noneOf=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1908807dm(List list, int i) {
        C13BV c13bv;
        list = (i & 1) != 0 ? C13BV.INSTANCE : list;
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this.LIZ = list;
        this.LIZIZ = c13bv;
    }
}
