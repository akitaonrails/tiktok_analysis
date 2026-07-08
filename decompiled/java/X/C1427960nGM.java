package X;

import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427960nGM extends AbstractC1427970nGN {
    public final PhotoTemplateAsset LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1427960nGM)) {
            return false;
        }
        C1427960nGM c1427960nGM = (C1427960nGM) obj;
        return Intrinsics.LJFF(this.LIZ, c1427960nGM.LIZ) && this.LIZIZ == c1427960nGM.LIZIZ;
    }

    public final int hashCode() {
        PhotoTemplateAsset photoTemplateAsset = this.LIZ;
        return ((photoTemplateAsset == null ? 0 : photoTemplateAsset.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectedItem(photoTemplateAsset=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needLocate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1427960nGM(PhotoTemplateAsset photoTemplateAsset, boolean z) {
        this.LIZ = photoTemplateAsset;
        this.LIZIZ = z;
    }
}
