package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YT implements C07YV {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07YT) && Intrinsics.LJFF(this.LIZ, ((C07YT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisibleText(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YT(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
