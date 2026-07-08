package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQD {
    public final NLETemplateModel LIZ;
    public final TemplateConsumeCoreParam LIZIZ;
    public final CreativeInfo LIZJ;
    public final CreativeModel LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FQD)) {
            return false;
        }
        C0FQD c0fqd = (C0FQD) obj;
        return Intrinsics.LJFF(this.LIZ, c0fqd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fqd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0fqd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0fqd.LIZLLL) && Intrinsics.LJFF(this.LJ, c0fqd.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicTemplateIn(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coreParam=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FQD(NLETemplateModel nLETemplateModel, TemplateConsumeCoreParam templateConsumeCoreParam, CreativeInfo creativeInfo, CreativeModel creativeModel, String str) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = templateConsumeCoreParam;
        this.LIZJ = creativeInfo;
        this.LIZLLL = creativeModel;
        this.LJ = str;
    }
}
