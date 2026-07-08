package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561870M1x extends C0M24 {
    public final C0M29 LIZ;
    public final List<C0M0P> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C561870M1x)) {
            return false;
        }
        C561870M1x c561870M1x = (C561870M1x) obj;
        return Intrinsics.LJFF(this.LIZ, c561870M1x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c561870M1x.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Intro(stats=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coverDrafts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C561870M1x(C0M29 c0m29, List<C0M0P> list) {
        this.LIZ = c0m29;
        this.LIZIZ = list;
    }
}
