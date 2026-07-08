package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FDZ {
    public final String LIZ;
    public final boolean LIZIZ;
    public final CustomCaptionTemplateData LIZJ;
    public final C386400FDa LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FDZ)) {
            return false;
        }
        C0FDZ c0fdz = (C0FDZ) obj;
        return Intrinsics.LJFF(this.LIZ, c0fdz.LIZ) && this.LIZIZ == c0fdz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0fdz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0fdz.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        CustomCaptionTemplateData customCaptionTemplateData = this.LIZJ;
        int iHashCode2 = (iHashCode + (customCaptionTemplateData == null ? 0 : customCaptionTemplateData.hashCode())) * 31;
        C386400FDa c386400FDa = this.LIZLLL;
        return iHashCode2 + (c386400FDa != null ? c386400FDa.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionTemplateItem(itemId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customTemplateItemData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateItemData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FDZ(String str, boolean z, CustomCaptionTemplateData customCaptionTemplateData, C386400FDa c386400FDa) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = customCaptionTemplateData;
        this.LIZLLL = c386400FDa;
    }

    public /* synthetic */ C0FDZ(String str, boolean z, CustomCaptionTemplateData customCaptionTemplateData, C386400FDa c386400FDa, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : customCaptionTemplateData, (i & 8) != 0 ? null : c386400FDa);
    }

    public static C0FDZ LIZ(C0FDZ c0fdz, boolean z, CustomCaptionTemplateData customCaptionTemplateData, C386400FDa c386400FDa, int i) {
        String str;
        if ((i & 1) != 0) {
            str = c0fdz.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            z = c0fdz.LIZIZ;
        }
        if ((i & 4) != 0) {
            customCaptionTemplateData = c0fdz.LIZJ;
        }
        if ((i & 8) != 0) {
            c386400FDa = c0fdz.LIZLLL;
        }
        c0fdz.getClass();
        return new C0FDZ(str, z, customCaptionTemplateData, c386400FDa);
    }
}
