package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963530bBH {
    public static final C963530bBH LIZJ = new C963530bBH("exit cohost, off linkmic timeout");
    public static final C963530bBH LIZLLL = new C963530bBH("exit cohost, mixmode_cohost_exit");
    public static final C963530bBH LJ = new C963530bBH("exit cohost, sei no cohost");
    public final String LIZ;
    public final Object LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963530bBH)) {
            return false;
        }
        C963530bBH c963530bBH = (C963530bBH) obj;
        return Intrinsics.LJFF(this.LIZ, c963530bBH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c963530bBH.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicResetSource(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C963530bBH(String str) {
        this.LIZ = str;
    }
}
