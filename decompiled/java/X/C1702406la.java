package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06la, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1702406la extends AbstractC1702506lb {
    public final C0Y8T LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1702406la)) {
            return false;
        }
        C1702406la c1702406la = (C1702406la) obj;
        return Intrinsics.LJFF(this.LIZ, c1702406la.LIZ) && this.LIZIZ == c1702406la.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnUpdateConversationEvent(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1702406la(int i, C0Y8T c0y8t) {
        this.LIZ = c0y8t;
        this.LIZIZ = i;
    }
}
