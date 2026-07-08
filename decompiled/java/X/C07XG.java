package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07XG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XG implements C07XH {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07XG) && Intrinsics.LJFF(this.LIZ, ((C07XG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DateLocationModel(title=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XG(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
