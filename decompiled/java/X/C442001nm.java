package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C442001nm {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C442001nm)) {
            return false;
        }
        C442001nm c442001nm = (C442001nm) obj;
        return Intrinsics.LJFF(this.LIZ, c442001nm.LIZ) && this.LIZIZ == c442001nm.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditGroupToastInfo(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showOnNextResumedPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C442001nm(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
