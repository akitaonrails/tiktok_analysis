package X;

import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ku4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532220Ku4 {
    public final NLETemplateModel LIZ;
    public final List<C531370Ksh> LIZIZ;
    public final TemplateConsumeCoreParam LIZJ;
    public final CreativeModel LIZLLL;
    public final String LJ;
    public final Intent LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C532220Ku4)) {
            return false;
        }
        C532220Ku4 c532220Ku4 = (C532220Ku4) obj;
        return Intrinsics.LJFF(this.LIZ, c532220Ku4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c532220Ku4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c532220Ku4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c532220Ku4.LIZLLL) && Intrinsics.LJFF(this.LJ, c532220Ku4.LJ) && Intrinsics.LJFF(this.LJFF, c532220Ku4.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Intent intent = this.LJFF;
        return iHashCode2 + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FinalizeTemplateIn(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", musicResps=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coreParam=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startIntent=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C532220Ku4(NLETemplateModel nLETemplateModel, List<C531370Ksh> list, TemplateConsumeCoreParam templateConsumeCoreParam, CreativeModel creativeModel, String str, Intent intent) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = list;
        this.LIZJ = templateConsumeCoreParam;
        this.LIZLLL = creativeModel;
        this.LJ = str;
        this.LJFF = intent;
    }
}
