package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EM {
    public final String LIZ;
    public final C00EL LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EM)) {
            return false;
        }
        C00EM c00em = (C00EM) obj;
        return Intrinsics.LJFF(this.LIZ, c00em.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00em.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppListPayload(entrance=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", appInstallQueryConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00EM(C00EL c00el, String str) {
        this.LIZ = str;
        this.LIZIZ = c00el;
    }
}
