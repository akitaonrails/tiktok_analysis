package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C237300vr extends AbstractC401801hI {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C237300vr) && Intrinsics.LJFF(this.LIZ, ((C237300vr) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryLoading(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C237300vr(String str) {
        this.LIZ = str;
    }
}
