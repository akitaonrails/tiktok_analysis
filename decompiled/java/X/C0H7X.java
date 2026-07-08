package X;

import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H7X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7X implements C0H81 {
    public final List<SearchKeyFramePoint> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0H7X) && Intrinsics.LJFF(this.LIZ, ((C0H7X) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayKeyframesAtIntentAnchor(frames=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0H7X(List<SearchKeyFramePoint> list) {
        this.LIZ = list;
    }
}
