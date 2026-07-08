package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279304zX {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279304zX)) {
            return false;
        }
        C1279304zX c1279304zX = (C1279304zX) obj;
        return Intrinsics.LJFF(this.LIZ, c1279304zX.LIZ) && this.LIZIZ == c1279304zX.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationId(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shortId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1279304zX(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
