package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1172304iH extends AbstractC1172504iJ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1172304iH) && Intrinsics.LJFF(this.LIZ, ((C1172304iH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AfterDelete(draftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1172304iH(String str) {
        this.LIZ = str;
    }
}
