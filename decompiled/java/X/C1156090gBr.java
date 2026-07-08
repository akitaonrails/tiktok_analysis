package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156090gBr extends AbstractC1156110gBt {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156090gBr)) {
            return false;
        }
        C1156090gBr c1156090gBr = (C1156090gBr) obj;
        return Intrinsics.LJFF(this.LIZ, c1156090gBr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156090gBr.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cancel(clientRequestId=");
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

    public C1156090gBr(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
