package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZXS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXS {
    public final C0ZXT LIZ;
    public final C0ZXR LIZIZ;
    public final C0ZXL LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXS)) {
            return false;
        }
        C0ZXS c0zxs = (C0ZXS) obj;
        return Intrinsics.LJFF(this.LIZ, c0zxs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zxs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zxs.LIZJ) && this.LIZLLL == c0zxs.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageBubbleUIConfig(padding=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", constraints=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasTail=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0ZXS LIZ(C0ZXS c0zxs, C0ZXL c0zxl) {
        C0ZXT c0zxt = c0zxs.LIZ;
        C0ZXR c0zxr = c0zxs.LIZIZ;
        boolean z = c0zxs.LIZLLL;
        c0zxs.getClass();
        return new C0ZXS(c0zxt, c0zxr, c0zxl, z);
    }

    public C0ZXS(C0ZXT c0zxt, C0ZXR c0zxr, C0ZXL c0zxl, boolean z) {
        this.LIZ = c0zxt;
        this.LIZIZ = c0zxr;
        this.LIZJ = c0zxl;
        this.LIZLLL = z;
    }
}
