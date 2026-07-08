package X;

import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427930nGJ extends AbstractC1427970nGN {
    public final PhotoTemplateAsset LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1427930nGJ)) {
            return false;
        }
        C1427930nGJ c1427930nGJ = (C1427930nGJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1427930nGJ.LIZ) && this.LIZIZ == c1427930nGJ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickItem(photoTemplateAsset=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1427930nGJ(PhotoTemplateAsset photoTemplateAsset, int i) {
        this.LIZ = photoTemplateAsset;
        this.LIZIZ = i;
    }
}
