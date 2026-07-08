package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677640tl4 {
    public final C1677480tko<C1682900ttY, C1677270tkT> LIZ;
    public long LIZIZ;

    public C1677640tl4() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1677640tl4)) {
            return false;
        }
        C1677640tl4 c1677640tl4 = (C1677640tl4) obj;
        return Intrinsics.LJFF(this.LIZ, c1677640tl4.LIZ) && C1682900ttY.LIZIZ(this.LIZIZ, c1677640tl4.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimData(anim=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startSize=");
        sbLIZ.append((Object) C1682900ttY.LIZLLL(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public C1677640tl4(C1677480tko c1677480tko, long j) {
        this.LIZ = c1677480tko;
        this.LIZIZ = j;
    }
}
