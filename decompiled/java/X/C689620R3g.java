package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689620R3g extends AbstractC689640R3i {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C689620R3g) && Intrinsics.LJFF(this.LIZ, ((C689620R3g) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Keyframe(raw=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C689620R3g(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
