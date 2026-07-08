package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889307ad {
    public final Integer LIZ;
    public final String LIZIZ;

    public C1889307ad() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889307ad)) {
            return false;
        }
        C1889307ad c1889307ad = (C1889307ad) obj;
        return Intrinsics.LJFF(this.LIZ, c1889307ad.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1889307ad.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerErrorEnvelope(serverCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", serverMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1889307ad(int i) {
        this(null, "");
    }

    public C1889307ad(Integer num, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
    }
}
