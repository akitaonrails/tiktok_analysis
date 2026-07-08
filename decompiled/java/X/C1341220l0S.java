package X;

import android.util.Size;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341220l0S extends AbstractC1341280l0Y {
    public final UrlModel LIZ;
    public final Size LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341220l0S)) {
            return false;
        }
        C1341220l0S c1341220l0S = (C1341220l0S) obj;
        return Intrinsics.LJFF(this.LIZ, c1341220l0S.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1341220l0S.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Remote(urlModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1341280l0Y
    public final Size LIZ() {
        return this.LIZIZ;
    }

    public C1341220l0S(UrlModel urlModel, Size size) {
        this.LIZ = urlModel;
        this.LIZIZ = size;
    }
}
