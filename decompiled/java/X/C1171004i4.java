package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.UploadedFileItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04i4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1171004i4 {
    public final List<UploadedFileItem> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1171004i4) && Intrinsics.LJFF(this.LIZ, ((C1171004i4) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowUploadOutput(uploadedItems=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1171004i4(List<UploadedFileItem> list) {
        this.LIZ = list;
    }
}
