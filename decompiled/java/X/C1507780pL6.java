package X;

import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507780pL6 {
    public final TemplateData LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1507780pL6)) {
            return false;
        }
        C1507780pL6 c1507780pL6 = (C1507780pL6) obj;
        return Intrinsics.LJFF(this.LIZ, c1507780pL6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1507780pL6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1507780pL6.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreparedData(templateData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", monitorData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reuseKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1507780pL6(TemplateData templateData, Map<String, ? extends Object> map, String str) {
        this.LIZ = templateData;
        this.LIZIZ = map;
        this.LIZJ = str;
    }
}
