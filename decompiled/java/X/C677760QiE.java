package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677760QiE<T> extends AbstractC677910QiT<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C677760QiE) && Intrinsics.LJFF(this.LIZ, ((C677760QiE) obj).LIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C677760QiE(C1422405hW c1422405hW) {
        this.LIZ = c1422405hW;
    }
}
