package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C291301Ax implements InterfaceC111300bX {
    public String LL;
    public final DataChannel LLILLJJLI;
    public boolean LLILLL;

    public C291301Ax() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C291301Ax)) {
            return false;
        }
        C291301Ax c291301Ax = (C291301Ax) obj;
        return Intrinsics.LJFF(this.LL, c291301Ax.LL) && Intrinsics.LJFF(this.LLILLJJLI, c291301Ax.LLILLJJLI) && this.LLILLL == c291301Ax.LLILLL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        DataChannel dataChannel = this.LLILLJJLI;
        return ((iHashCode + (dataChannel == null ? 0 : dataChannel.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardSaveData(showEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAiSummaryEdit=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C291301Ax(String str, DataChannel dataChannel, int i) {
        str = (i & 1) != 0 ? "live_take_page" : str;
        dataChannel = (i & 2) != 0 ? null : dataChannel;
        this.LL = str;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = false;
    }
}
