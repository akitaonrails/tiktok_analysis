package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Y3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Y3 implements InterfaceC426790GoP {
    public final CharSequence LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07Y3) && Intrinsics.LJFF(this.LIZ, ((C07Y3) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(badgeText=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07Y3(CharSequence charSequence) {
        this.LIZ = charSequence;
    }
}
