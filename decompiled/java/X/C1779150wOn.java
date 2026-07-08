package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1779150wOn<T> extends AbstractC1779240wOw<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1779150wOn) && Intrinsics.LJFF(this.LIZ, ((C1779150wOn) obj).LIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded(loadedItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1779150wOn(T t) {
        this.LIZ = t;
    }
}
