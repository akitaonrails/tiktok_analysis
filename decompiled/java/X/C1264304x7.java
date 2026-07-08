package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04x7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264304x7 {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264304x7)) {
            return false;
        }
        C1264304x7 c1264304x7 = (C1264304x7) obj;
        return this.LIZ == c1264304x7.LIZ && Intrinsics.LJFF(this.LIZIZ, c1264304x7.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstTimeReceived(entityId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entityKeyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264304x7(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
