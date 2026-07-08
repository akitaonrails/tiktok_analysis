package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1902107ch {
    public final String LIZ;
    public final Set<String> LIZIZ;
    public final Set<String> LIZJ;
    public final Map<String, AbstractC553110Lmf<?>> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1902107ch)) {
            return false;
        }
        C1902107ch c1902107ch = (C1902107ch) obj;
        return Intrinsics.LJFF(this.LIZ, c1902107ch.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1902107ch.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1902107ch.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1902107ch.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkflowNodeIOInfo(nodeName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inputArtifacts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", outputArtifacts=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", registry=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1902107ch(String str, Map map, Set set, Set set2) {
        this.LIZ = str;
        this.LIZIZ = set;
        this.LIZJ = set2;
        this.LIZLLL = map;
    }
}
