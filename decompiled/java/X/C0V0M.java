package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0M extends C0V0O {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0V0M) && Intrinsics.LJFF(this.LIZ, ((C0V0M) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Highlight(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V0M(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
