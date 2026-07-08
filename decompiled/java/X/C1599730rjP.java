package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599730rjP extends AbstractC1599750rjR {
    public final UrlModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1599730rjP) && Intrinsics.LJFF(this.LIZ, ((C1599730rjP) obj).LIZ);
    }

    public final int hashCode() {
        UrlModel urlModel = this.LIZ;
        if (urlModel == null) {
            return 0;
        }
        return urlModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShootEntry(myAvatar=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1599730rjP(UrlModel urlModel) {
        this.LIZ = urlModel;
    }
}
