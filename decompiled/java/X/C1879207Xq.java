package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1879207Xq extends AbstractC1879407Xs {
    public final List<Long> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1879207Xq) && Intrinsics.LJFF(this.LIZ, ((C1879207Xq) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiPoint(values=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1879207Xq() {
        this(C13BV.INSTANCE);
    }

    @Override // X.AbstractC1879407Xs
    public final long LIZ() {
        return (long) C13LP.LJJJI(this.LIZ);
    }

    @Override // X.AbstractC1879407Xs
    public final long LIZIZ() {
        return ((Number) C13LP.LJJJJZI(this.LIZ)).longValue();
    }

    @Override // X.AbstractC1879407Xs
    public final int LIZJ() {
        return this.LIZ.size();
    }

    public C1879207Xq(List<Long> list) {
        this.LIZ = list;
    }
}
