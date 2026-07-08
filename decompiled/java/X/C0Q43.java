package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q43, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q43 implements InterfaceC663910Q2j {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q43)) {
            return false;
        }
        C0Q43 c0q43 = (C0Q43) obj;
        return this.LIZ == c0q43.LIZ && Intrinsics.LJFF(this.LIZIZ, c0q43.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0q43.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAutoPlayAction(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoGroupId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q43(long j, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
