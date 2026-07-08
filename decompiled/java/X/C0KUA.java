package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KUA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KUA extends AbstractC1837070xuD {
    public final C0KUB LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0KUA) && Intrinsics.LJFF(this.LIZ, ((C0KUA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(info=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KUA(C0KUB c0kub) {
        this.LIZ = c0kub;
    }
}
