package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11hU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19570211hU {
    public final ComposerBeauty LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposerBeautyDownload(beauty=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", unzipPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public C19570211hU(ComposerBeauty composerBeauty) {
        String unzipPath = composerBeauty.getEffect().getUnzipPath();
        this.LIZ = composerBeauty;
        this.LIZIZ = unzipPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19570211hU) {
            return Intrinsics.LJFF(((C19570211hU) obj).LIZIZ, this.LIZIZ);
        }
        return false;
    }
}
