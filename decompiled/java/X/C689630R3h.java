package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689630R3h extends AbstractC689640R3i {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C689630R3h) && Intrinsics.LJFF(this.LIZ, ((C689630R3h) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Product(displayText=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C689630R3h(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
