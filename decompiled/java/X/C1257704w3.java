package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadInput;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04w3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1257704w3 {
    public final List<DownloadInput> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1257704w3)) {
            return false;
        }
        C1257704w3 c1257704w3 = (C1257704w3) obj;
        return Intrinsics.LJFF(this.LIZ, c1257704w3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1257704w3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowPollingOutput(downloadInputList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1257704w3(List<DownloadInput> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
