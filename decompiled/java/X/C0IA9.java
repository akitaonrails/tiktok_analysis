package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IA9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IA9<T> extends C0IAH<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0IA9) && Intrinsics.LJFF(this.LIZ, ((C0IA9) obj).LIZ);
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

    public C0IA9(T t) {
        this.LIZ = t;
    }
}
