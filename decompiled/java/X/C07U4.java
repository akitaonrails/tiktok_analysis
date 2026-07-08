package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07U4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07U4 extends C07U5 {
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final C00II LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07U4)) {
            return false;
        }
        C07U4 c07u4 = (C07U4) obj;
        return Intrinsics.LJFF(this.LIZIZ, c07u4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07u4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c07u4.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioPlayerConfig(urlList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loopMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07U4(final C00II c00ii, final String str, final List list) {
        new Object(str, list, c00ii) { // from class: X.07U5
            public final List<String> LIZ;

            {
                this.LIZ = list;
            }
        };
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = c00ii;
    }
}
