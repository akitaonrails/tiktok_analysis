package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531710KtF {
    public final TemplateConsumeCoreParam LIZ;
    public final Activity LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531710KtF)) {
            return false;
        }
        C531710KtF c531710KtF = (C531710KtF) obj;
        return Intrinsics.LJFF(this.LIZ, c531710KtF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c531710KtF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c531710KtF.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c531710KtF.LIZLLL) && Intrinsics.LJFF(this.LJ, c531710KtF.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        String str2 = this.LJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckI2vQuotaIn(coreParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nleSummary=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531710KtF(TemplateConsumeCoreParam templateConsumeCoreParam, Activity activity, String str, String str2, String str3) {
        this.LIZ = templateConsumeCoreParam;
        this.LIZIZ = activity;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
