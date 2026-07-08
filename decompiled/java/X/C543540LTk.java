package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543540LTk implements InterfaceC543550LTl {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C543540LTk)) {
            return false;
        }
        C543540LTk c543540LTk = (C543540LTk) obj;
        return this.LIZ == c543540LTk.LIZ && Intrinsics.LJFF(this.LIZIZ, c543540LTk.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C543540LTk(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
