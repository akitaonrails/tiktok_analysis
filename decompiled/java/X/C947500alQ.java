package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0alQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947500alQ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C947500alQ)) {
            return false;
        }
        C947500alQ c947500alQ = (C947500alQ) obj;
        return Intrinsics.LJFF(this.LIZ, c947500alQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c947500alQ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameResource(panelName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C947500alQ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
