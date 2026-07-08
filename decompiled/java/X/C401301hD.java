package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C401301hD<T> extends AbstractC401801hI<T> {
    public final C0U74<T> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C401301hD) && Intrinsics.LJFF(this.LIZ, ((C401301hD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavoriteEffectList(effectPanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C401301hD(C0U74<T> c0u74) {
        this.LIZ = c0u74;
    }
}
