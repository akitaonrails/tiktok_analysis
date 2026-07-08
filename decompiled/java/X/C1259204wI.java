package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadItemResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259204wI implements InterfaceC1264504x9 {
    public final List<DownloadItemResult> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1259204wI) && Intrinsics.LJFF(this.LIZ, ((C1259204wI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(downloadItems=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1259204wI() {
        this(C13BV.INSTANCE);
    }

    public C1259204wI(List<DownloadItemResult> list) {
        this.LIZ = list;
    }
}
