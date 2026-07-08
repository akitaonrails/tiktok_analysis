package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460290I3f implements InterfaceC460300I3g {
    public final String LIZIZ;
    public final List<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460290I3f)) {
            return false;
        }
        C460290I3f c460290I3f = (C460290I3f) obj;
        return Intrinsics.LJFF(this.LIZIZ, c460290I3f.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c460290I3f.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrFormat(strToFormat=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", args=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C460290I3f(String str, List<String> list) {
        this.LIZIZ = str;
        this.LIZJ = list;
    }
}
