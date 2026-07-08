package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.AIGCInputItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1173904iX {
    public final List<AIGCInputItem> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1173904iX) && Intrinsics.LJFF(this.LIZ, ((C1173904iX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowUploadInput(fileList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1173904iX(List<AIGCInputItem> list) {
        this.LIZ = list;
    }
}
