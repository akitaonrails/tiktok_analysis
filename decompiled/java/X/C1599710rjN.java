package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599710rjN {
    public final UrlModel LIZ;
    public final C0FRS LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1599710rjN)) {
            return false;
        }
        C1599710rjN c1599710rjN = (C1599710rjN) obj;
        return Intrinsics.LJFF(this.LIZ, c1599710rjN.LIZ) && this.LIZIZ == c1599710rjN.LIZIZ;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LIZ;
        return ((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Slot(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ring=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1599710rjN(UrlModel urlModel, C0FRS c0frs) {
        this.LIZ = urlModel;
        this.LIZIZ = c0frs;
    }
}
