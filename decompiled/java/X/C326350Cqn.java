package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326350Cqn<T> implements InterfaceC550540LiW<T> {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326350Cqn)) {
            return false;
        }
        C326350Cqn c326350Cqn = (C326350Cqn) obj;
        return this.LIZ == c326350Cqn.LIZ && Intrinsics.LJFF(this.LIZIZ, c326350Cqn.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C326350Cqn(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
