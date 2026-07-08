package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZI {
    public final UrlModel LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZI)) {
            return false;
        }
        C0ZZI c0zzi = (C0ZZI) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zzi.LIZIZ);
    }

    public final int hashCode() {
        UrlModel urlModel = this.LIZ;
        return ((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareCommentTitleUIState(avatar=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", authorName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZZI(UrlModel urlModel, String str) {
        this.LIZ = urlModel;
        this.LIZIZ = str;
    }
}
