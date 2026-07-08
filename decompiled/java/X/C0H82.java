package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H82, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H82 implements C0H81 {
    public final UrlModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0H82) && Intrinsics.LJFF(this.LIZ, ((C0H82) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayAtCover(urlModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0H82(UrlModel urlModel) {
        this.LIZ = urlModel;
    }
}
