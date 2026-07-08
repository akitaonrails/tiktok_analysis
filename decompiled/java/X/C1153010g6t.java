package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153010g6t {
    public final int LIZ;
    public final C1155180gAO LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153010g6t)) {
            return false;
        }
        C1153010g6t c1153010g6t = (C1153010g6t) obj;
        return this.LIZ == c1153010g6t.LIZ && Intrinsics.LJFF(this.LIZIZ, c1153010g6t.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C1155180gAO c1155180gAO = this.LIZIZ;
        return i + (c1155180gAO == null ? 0 : c1155180gAO.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFeedProductRenderSpec(renderCardType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lynxBinding=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153010g6t(int i, C1155180gAO c1155180gAO) {
        this.LIZ = i;
        this.LIZIZ = c1155180gAO;
    }
}
