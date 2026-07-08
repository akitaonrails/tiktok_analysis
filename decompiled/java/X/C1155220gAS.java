package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155220gAS implements InterfaceC111300bX {
    public final boolean LL;
    public final DataChannel LLILLJJLI;

    public C1155220gAS() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155220gAS)) {
            return false;
        }
        C1155220gAS c1155220gAS = (C1155220gAS) obj;
        return this.LL == c1155220gAS.LL && Intrinsics.LJFF(this.LLILLJJLI, c1155220gAS.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        DataChannel dataChannel = this.LLILLJJLI;
        return iZ2 + (dataChannel == null ? 0 : dataChannel.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleLayoutHierarchyData(isAnchor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155220gAS(DataChannel dataChannel, boolean z) {
        this.LL = z;
        this.LLILLJJLI = dataChannel;
    }
}
