package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y8F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8F {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y8F)) {
            return false;
        }
        C0Y8F c0y8f = (C0Y8F) obj;
        return Intrinsics.LJFF(this.LIZ, c0y8f.LIZ) && this.LIZIZ == c0y8f.LIZIZ && this.LIZJ == c0y8f.LIZJ && this.LIZLLL == c0y8f.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetPreviewMessageInput(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", limit=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inboxType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y8F(String str, long j, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
