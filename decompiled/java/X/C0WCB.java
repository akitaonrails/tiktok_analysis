package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0WCB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WCB {
    public final C814570VxP LIZ;
    public final byte[] LIZIZ;

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EncodedPayload{encoding=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bytes=[...]}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WCB)) {
            return false;
        }
        C0WCB c0wcb = (C0WCB) obj;
        if (!this.LIZ.equals(c0wcb.LIZ)) {
            return false;
        }
        return Arrays.equals(this.LIZIZ, c0wcb.LIZIZ);
    }

    public C0WCB(C814570VxP c814570VxP, byte[] bArr) {
        if (c814570VxP != null) {
            if (bArr != null) {
                this.LIZ = c814570VxP;
                this.LIZIZ = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }
}
