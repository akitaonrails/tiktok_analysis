package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386400FDa {
    public final CaptionTemplateData LIZ;
    public final List<String> LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final EnumC1641420soe LJ;
    public final boolean LJFF;
    public final transient Effect LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionTemplateItemData(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconUrlList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDownloaded=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", downloadProgress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", downloadState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isDownloadFailed=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C386400FDa.class, cls)) {
            return false;
        }
        C386400FDa c386400FDa = (C386400FDa) obj;
        if (Intrinsics.LJFF(this.LIZ, c386400FDa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c386400FDa.LIZIZ) && this.LIZJ == c386400FDa.LIZJ && this.LIZLLL == c386400FDa.LIZLLL && this.LJ == c386400FDa.LJ && this.LJFF == c386400FDa.LJFF) {
            return true;
        }
        return false;
    }

    public static C386400FDa LIZ(C386400FDa c386400FDa, int i, EnumC1641420soe enumC1641420soe, int i2) {
        CaptionTemplateData captionTemplateData;
        List<String> list;
        boolean z;
        boolean z2;
        EnumC1641420soe enumC1641420soe2 = enumC1641420soe;
        int i3 = i;
        Effect effect = null;
        if ((i2 & 1) != 0) {
            captionTemplateData = c386400FDa.LIZ;
        } else {
            captionTemplateData = null;
        }
        if ((i2 & 2) != 0) {
            list = c386400FDa.LIZIZ;
        } else {
            list = null;
        }
        if ((i2 & 4) != 0) {
            z = c386400FDa.LIZJ;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i3 = c386400FDa.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            enumC1641420soe2 = c386400FDa.LJ;
        }
        if ((i2 & 32) != 0) {
            z2 = c386400FDa.LJFF;
        } else {
            z2 = false;
        }
        if ((i2 & 64) != 0) {
            effect = c386400FDa.LJI;
        }
        return new C386400FDa(captionTemplateData, list, z, i3, enumC1641420soe2, z2, effect);
    }

    public C386400FDa(CaptionTemplateData captionTemplateData, List<String> list, boolean z, int i, EnumC1641420soe enumC1641420soe, boolean z2, Effect effect) {
        this.LIZ = captionTemplateData;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = enumC1641420soe;
        this.LJFF = z2;
        this.LJI = effect;
    }
}
