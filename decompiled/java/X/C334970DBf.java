package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334970DBf extends AbstractC334960DBe {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C334970DBf) && Intrinsics.LJFF(this.LIZ, ((C334970DBf) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334970DBf(String str) {
        this.LIZ = str;
    }
}
