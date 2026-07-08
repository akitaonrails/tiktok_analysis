package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQ8 {
    public final NLETemplateModel LIZ;
    public final TemplateConsumeCoreParam LIZIZ;
    public final List<C0E4S> LIZJ;
    public final CreativeModel LIZLLL;
    public final CreativeInfo LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FQ8)) {
            return false;
        }
        C0FQ8 c0fq8 = (C0FQ8) obj;
        return Intrinsics.LJFF(this.LIZ, c0fq8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fq8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0fq8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0fq8.LIZLLL) && Intrinsics.LJFF(this.LJ, c0fq8.LJ) && Intrinsics.LJFF(this.LJFF, c0fq8.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssembleTemplateIn(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coreParam=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", segments=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FQ8(NLETemplateModel nLETemplateModel, TemplateConsumeCoreParam templateConsumeCoreParam, List<C0E4S> list, CreativeModel creativeModel, CreativeInfo creativeInfo, String str) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = templateConsumeCoreParam;
        this.LIZJ = list;
        this.LIZLLL = creativeModel;
        this.LJ = creativeInfo;
        this.LJFF = str;
    }
}
