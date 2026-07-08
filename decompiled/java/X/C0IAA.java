package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAA extends C0IAH {
    public final Object LIZ;

    public C0IAA() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0IAA) && Intrinsics.LJFF(this.LIZ, ((C0IAA) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenericException(exception=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IAA(Object obj) {
        this.LIZ = obj;
    }
}
