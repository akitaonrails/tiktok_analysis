package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574620r4u extends AbstractC1617510sC5 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1574620r4u) && Intrinsics.LJFF(this.LIZ, ((C1574620r4u) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheMiss(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1617510sC5
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C1574620r4u(String str) {
        this.LIZ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("miss_cache_");
        sbLIZ.append(str);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
