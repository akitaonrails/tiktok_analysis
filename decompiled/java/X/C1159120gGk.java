package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159120gGk extends AbstractC1159090gGh {
    public final AbstractC1155920gBa LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159120gGk)) {
            return false;
        }
        C1159120gGk c1159120gGk = (C1159120gGk) obj;
        return Intrinsics.LJFF(this.LIZ, c1159120gGk.LIZ) && this.LIZIZ == c1159120gGk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1159090gGh
    public final long LIZ() {
        return this.LIZIZ;
    }

    public C1159120gGk(AbstractC1155920gBa abstractC1155920gBa, long j) {
        super(j);
        this.LIZ = abstractC1155920gBa;
        this.LIZIZ = j;
    }
}
