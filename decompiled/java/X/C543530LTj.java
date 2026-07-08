package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543530LTj<T> implements InterfaceC543550LTl<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C543530LTj) && Intrinsics.LJFF(this.LIZ, ((C543530LTj) obj).LIZ);
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
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C543530LTj(T t) {
        this.LIZ = t;
    }
}
