package X;

import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10AG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10AG extends C10AJ {
    public final CMPreviewInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10AG) && Intrinsics.LJFF(this.LIZ, ((C10AG) obj).LIZ);
    }

    public final int hashCode() {
        CMPreviewInfo cMPreviewInfo = this.LIZ;
        if (cMPreviewInfo == null) {
            return 0;
        }
        return cMPreviewInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveSuccessful(cmPreviewInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10AG(CMPreviewInfo cMPreviewInfo) {
        this.LIZ = cMPreviewInfo;
    }
}
