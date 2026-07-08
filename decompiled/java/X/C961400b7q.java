package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961400b7q extends C955670ayb {
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C961400b7q) && Intrinsics.LJFF(this.LJ, ((C961400b7q) obj).LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoHostInviteListTitleItem(title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961400b7q(String str) {
        this.LJ = str;
    }
}
