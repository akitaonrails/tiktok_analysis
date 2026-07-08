package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2182808gs extends AnonymousClass0943 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2182808gs)) {
            return false;
        }
        C2182808gs c2182808gs = (C2182808gs) obj;
        return Intrinsics.LJFF(this.LIZ, c2182808gs.LIZ) && this.LIZIZ == c2182808gs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2182808gs(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
