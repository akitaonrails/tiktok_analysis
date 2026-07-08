package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T0O, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0O {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public final int hashCode() {
        String str = this.LIZ;
        return ((str != null ? str.hashCode() : 0) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RxTaskInfo{name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T0O() {
    }

    public C0T0O(C739320SzK c739320SzK) {
        this.LIZ = c739320SzK.LIZ;
        this.LIZIZ = c739320SzK.LIZIZ;
        this.LIZJ = c739320SzK.LIZJ;
        this.LIZLLL = c739320SzK.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(C0T0O.class, obj.getClass())) {
            return false;
        }
        C0T0O c0t0o = (C0T0O) obj;
        if (this.LIZJ != c0t0o.LIZJ) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZ, c0t0o.LIZ);
    }
}
