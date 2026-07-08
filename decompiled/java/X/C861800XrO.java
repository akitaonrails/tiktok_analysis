package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861800XrO extends AbstractC861810XrP {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C861800XrO) && Intrinsics.LJFF(this.LIZ, ((C861800XrO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(value=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C861800XrO(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
