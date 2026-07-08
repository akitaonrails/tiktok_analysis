package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411830mqL extends AbstractC1411840mqM {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1411830mqL) && Intrinsics.LJFF(this.LIZ, ((C1411830mqL) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloudCompileSuccess(vid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1411830mqL(String str) {
        this.LIZ = str;
    }
}
