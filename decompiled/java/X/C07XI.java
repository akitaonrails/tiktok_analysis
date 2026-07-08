package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07XI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XI implements C07XH {
    public final C191784101e LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07XI) && Intrinsics.LJFF(this.LIZ, ((C07XI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StopAutoplayMaskModel(button=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XI(C191784101e c191784101e) {
        this.LIZ = c191784101e;
    }
}
