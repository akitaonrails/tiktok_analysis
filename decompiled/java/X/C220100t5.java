package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00t5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C220100t5 implements InterfaceC220300t7 {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Asset(assetName=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        String str = this.LIZ;
        if (!(obj instanceof C220100t5) || !Intrinsics.LJFF(str, ((C220100t5) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
