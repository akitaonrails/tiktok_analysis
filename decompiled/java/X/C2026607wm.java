package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2026607wm {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2026607wm)) {
            return false;
        }
        C2026607wm c2026607wm = (C2026607wm) obj;
        return Intrinsics.LJFF(this.LIZ, c2026607wm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2026607wm.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushCounterKey(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2026607wm(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
