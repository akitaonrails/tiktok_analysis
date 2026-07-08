package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991660bue extends AbstractC991610buZ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C991660bue) && Intrinsics.LJFF(this.LIZ, ((C991660bue) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToHide(componentType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991660bue(String str) {
        this.LIZ = str;
    }
}
