package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadItemResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04j8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1177604j8 {
    public final List<DownloadItemResult> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1177604j8) && Intrinsics.LJFF(this.LIZ, ((C1177604j8) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VOfflineProcessingPostProcessingOutput(videoResultList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1177604j8(List<DownloadItemResult> list) {
        this.LIZ = list;
    }
}
