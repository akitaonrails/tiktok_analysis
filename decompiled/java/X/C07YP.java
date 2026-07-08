package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YP implements C07YR {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07YP) && Intrinsics.LJFF(this.LIZ, ((C07YP) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiggStatusChangeEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YP(String str) {
        this.LIZ = str;
    }
}
