package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNA implements InterfaceC898720ZNm {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZNA)) {
            return false;
        }
        C0ZNA c0zna = (C0ZNA) obj;
        return Intrinsics.LJFF(this.LIZ, c0zna.LIZ) && this.LIZIZ == c0zna.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceMessageReceiverExpired(senderName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", senderUid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZNA(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
