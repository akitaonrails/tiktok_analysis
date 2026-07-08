package X;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347410lAR {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final EnumC1341750l1J LIZJ;

    public C1347410lAR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347410lAR)) {
            return false;
        }
        C1347410lAR c1347410lAR = (C1347410lAR) obj;
        return Intrinsics.LJFF(this.LIZ, c1347410lAR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1347410lAR.LIZIZ) && this.LIZJ == c1347410lAR.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPollCreateDraft(question=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", options=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationOption=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        String str = this.LIZ;
        if (str != null && !a0.LJJJIL(str)) {
            List<String> list = this.LIZIZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                int i = 0;
                for (String str2 : list) {
                    if (str2 != null && !a0.LJJJIL(str2) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
                if (i >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ C1347410lAR(int i) {
        this("", C1697810uHb.LJIIJJI("", ""), EnumC1341750l1J.SEVEN_DAYS);
    }

    public C1347410lAR(String str, List<String> list, EnumC1341750l1J enumC1341750l1J) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = enumC1341750l1J;
    }

    public static C1347410lAR LIZIZ(C1347410lAR c1347410lAR, String str, List list, EnumC1341750l1J enumC1341750l1J, int i) {
        if ((i & 1) != 0) {
            str = c1347410lAR.LIZ;
        }
        if ((i & 2) != 0) {
            list = c1347410lAR.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC1341750l1J = c1347410lAR.LIZJ;
        }
        c1347410lAR.getClass();
        return new C1347410lAR(str, list, enumC1341750l1J);
    }
}
