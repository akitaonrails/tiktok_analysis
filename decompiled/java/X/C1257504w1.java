package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadInput;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04w1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1257504w1 {
    public final List<DownloadInput> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1257504w1) && Intrinsics.LJFF(this.LIZ, ((C1257504w1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowDownloadInput(downloadInputList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1257504w1(List<DownloadInput> list) {
        this.LIZ = list;
    }
}
