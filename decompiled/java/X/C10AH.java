package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10AH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10AH extends C10AJ {
    public final C10C1 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10AH) && Intrinsics.LJFF(this.LIZ, ((C10AH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoPreviewSaveSuccessful(photoPreviewEditPostInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10AH(C10C1 c10c1) {
        this.LIZ = c10c1;
    }
}
