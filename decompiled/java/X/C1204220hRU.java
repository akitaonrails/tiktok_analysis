package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204220hRU<T> extends AbstractC1204360hRi<T> {
    public final EnumC1204270hRZ LIZ;
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1204220hRU)) {
            return false;
        }
        C1204220hRU c1204220hRU = (C1204220hRU) obj;
        return this.LIZ == c1204220hRU.LIZ && Intrinsics.LJFF(this.LIZIZ, c1204220hRU.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        T t = this.LIZIZ;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1204360hRi
    public final T LIZ() {
        return this.LIZIZ;
    }

    public C1204220hRU(EnumC1204270hRZ enumC1204270hRZ, T t) {
        this.LIZ = enumC1204270hRZ;
        this.LIZIZ = t;
    }
}
