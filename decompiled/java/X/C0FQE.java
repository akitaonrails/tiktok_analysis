package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQE {
    public final NLETemplateModel LIZ;
    public final TemplateConsumeCoreParam LIZIZ;
    public final CreativeInfo LIZJ;
    public final CreativeModel LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FQE)) {
            return false;
        }
        C0FQE c0fqe = (C0FQE) obj;
        return Intrinsics.LJFF(this.LIZ, c0fqe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fqe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0fqe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0fqe.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MattingTemplateIn(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coreParam=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FQE(NLETemplateModel nLETemplateModel, TemplateConsumeCoreParam templateConsumeCoreParam, CreativeInfo creativeInfo, CreativeModel creativeModel) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = templateConsumeCoreParam;
        this.LIZJ = creativeInfo;
        this.LIZLLL = creativeModel;
    }
}
