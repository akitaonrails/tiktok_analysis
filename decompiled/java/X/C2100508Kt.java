package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2100508Kt {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2100508Kt)) {
            return false;
        }
        C2100508Kt c2100508Kt = (C2100508Kt) obj;
        return this.LIZ == c2100508Kt.LIZ && Intrinsics.LJFF(this.LIZIZ, c2100508Kt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2100508Kt.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlowMessageInfo(durationMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", handlerInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stackTrace=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2100508Kt(long j, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
