package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1166404hK {
    public final String LIZ;

    public C1166404hK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1166404hK) && Intrinsics.LJFF(this.LIZ, ((C1166404hK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuTitleContext(websiteName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1166404hK(int i) {
        this("");
    }

    public C1166404hK(String str) {
        this.LIZ = str;
    }
}
