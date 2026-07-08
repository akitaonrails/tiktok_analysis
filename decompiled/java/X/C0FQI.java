package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQI {
    public final NLETemplateModel LIZ;
    public final TemplateConsumeCoreParam LIZIZ;
    public final CreativeInfo LIZJ;
    public final CreativeModel LIZLLL;
    public final String LJ;
    public final Map<String, NLEVideoEffect> LJFF;
    public final C357450Dzr LJI;
    public final C0FQS LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FQI)) {
            return false;
        }
        C0FQI c0fqi = (C0FQI) obj;
        return Intrinsics.LJFF(this.LIZ, c0fqi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fqi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0fqi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0fqi.LIZLLL) && Intrinsics.LJFF(this.LJ, c0fqi.LJ) && Intrinsics.LJFF(this.LJFF, c0fqi.LJFF) && Intrinsics.LJFF(this.LJI, c0fqi.LJI) && Intrinsics.LJFF(this.LJII, c0fqi.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, NLEVideoEffect> map = this.LJFF;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        C357450Dzr c357450Dzr = this.LJI;
        int iHashCode4 = (iHashCode3 + (c357450Dzr == null ? 0 : c357450Dzr.hashCode())) * 31;
        C0FQS c0fqs = this.LJII;
        return iHashCode4 + (c0fqs != null ? c0fqs.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreezeTemplateIn(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coreParam=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", freezeSlotI2VStashMap=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", magicTask=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", consumeContext=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FQI(NLETemplateModel nLETemplateModel, TemplateConsumeCoreParam templateConsumeCoreParam, CreativeInfo creativeInfo, CreativeModel creativeModel, String str, Map<String, NLEVideoEffect> map, C357450Dzr c357450Dzr, C0FQS c0fqs) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = templateConsumeCoreParam;
        this.LIZJ = creativeInfo;
        this.LIZLLL = creativeModel;
        this.LJ = str;
        this.LJFF = map;
        this.LJI = c357450Dzr;
        this.LJII = c0fqs;
    }
}
