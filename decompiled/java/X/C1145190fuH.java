package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145190fuH implements InterfaceC111300bX {
    public final DataChannel LL;
    public final String LLILLJJLI;
    public final Long LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145190fuH)) {
            return false;
        }
        C1145190fuH c1145190fuH = (C1145190fuH) obj;
        return Intrinsics.LJFF(this.LL, c1145190fuH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1145190fuH.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1145190fuH.LLILLL) && this.LLILZ == c1145190fuH.LLILZ;
    }

    public final int hashCode() {
        DataChannel dataChannel = this.LL;
        int iHashCode = (dataChannel == null ? 0 : dataChannel.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LLILLL;
        return ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserSelectionHierarchyData(dataChannel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", anchorGiftId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", openGiftPanelAfterClose=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1145190fuH(DataChannel dataChannel, String str, Long l, boolean z) {
        this.LL = dataChannel;
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = z;
    }
}
