package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156130gBv extends AbstractC1156110gBt {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156130gBv)) {
            return false;
        }
        C1156130gBv c1156130gBv = (C1156130gBv) obj;
        return Intrinsics.LJFF(this.LIZ, c1156130gBv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156130gBv.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RingTimeout(clientRequestId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clientSessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1156110gBt
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C1156130gBv(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
