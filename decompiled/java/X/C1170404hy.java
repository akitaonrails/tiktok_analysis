package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1170404hy {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170404hy)) {
            return false;
        }
        C1170404hy c1170404hy = (C1170404hy) obj;
        return Intrinsics.LJFF(this.LIZ, c1170404hy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1170404hy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DebugInfo(debugSourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", debugTitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1170404hy() {
        this("", "");
    }

    public C1170404hy(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
