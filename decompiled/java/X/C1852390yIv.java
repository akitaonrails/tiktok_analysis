package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852390yIv {
    public final AbstractC316870CbV<C1852490yJ5> LIZ;
    public final List<CreativeTemplate> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1852390yIv)) {
            return false;
        }
        C1852390yIv c1852390yIv = (C1852390yIv) obj;
        return Intrinsics.LJFF(this.LIZ, c1852390yIv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1852390yIv.LIZIZ) && this.LIZJ == c1852390yIv.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabTemplateLoadResult(pageValue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mobTemplates=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mobRankStart=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1852390yIv(AbstractC316870CbV<C1852490yJ5> abstractC316870CbV, List<CreativeTemplate> list, int i) {
        this.LIZ = abstractC316870CbV;
        this.LIZIZ = list;
        this.LIZJ = i;
    }
}
