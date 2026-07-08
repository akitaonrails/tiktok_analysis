package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.063G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C063G implements C063K {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C063G) && Intrinsics.LJFF(this.LIZ, ((C063G) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeSettingsNavBarTitle(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C063G(String str) {
        this.LIZ = str;
    }
}
