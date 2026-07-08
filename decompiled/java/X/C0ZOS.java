package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZOS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZOS {
    public static final C0ZOS LIZJ = new C0ZOS(false, null);
    public static final C0ZOS LIZLLL = new C0ZOS(true, null);
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZOS)) {
            return false;
        }
        C0ZOS c0zos = (C0ZOS) obj;
        return this.LIZ == c0zos.LIZ && Intrinsics.LJFF(this.LIZIZ, c0zos.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsernameData(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", overrideUsername=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZOS(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
