package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789080UxO extends AbstractC789090UxP {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C789080UxO) && Intrinsics.LJFF(this.LIZ, ((C789080UxO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Number(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789080UxO(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
