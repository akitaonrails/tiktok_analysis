package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991940bv6 extends AbstractC991960bv8 {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C991940bv6) && Intrinsics.LJFF(this.LIZ, ((C991940bv6) obj).LIZ);
    }

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsrText(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991940bv6(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
