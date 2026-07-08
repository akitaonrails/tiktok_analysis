package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0btq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991160btq extends AbstractC991170btr {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991160btq)) {
            return false;
        }
        C991160btq c991160btq = (C991160btq) obj;
        return Intrinsics.LJFF(this.LIZ, c991160btq.LIZ) && this.LIZIZ == c991160btq.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expanded(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showEditHint=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991160btq(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
