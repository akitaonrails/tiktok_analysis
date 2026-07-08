package X;

import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427910nGH extends AbstractC1427970nGN {
    public final PhotoTemplateAsset LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1427910nGH) && Intrinsics.LJFF(this.LIZ, ((C1427910nGH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemShow(photoTemplateAsset=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1427910nGH(PhotoTemplateAsset photoTemplateAsset) {
        this.LIZ = photoTemplateAsset;
    }
}
