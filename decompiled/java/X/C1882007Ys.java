package X;

import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882007Ys extends AbstractC1882107Yt {
    public final M10nMockDebugErrorInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1882007Ys) && Intrinsics.LJFF(this.LIZ, ((C1882007Ys) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Content(itemInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1882007Ys(M10nMockDebugErrorInfo m10nMockDebugErrorInfo) {
        this.LIZ = m10nMockDebugErrorInfo;
    }
}
