package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146120fvm implements InterfaceC111300bX {
    public final Room LL;
    public final DataChannel LLILLJJLI;
    public final String LLILLL;
    public final C1146150fvp LLILZ;
    public final C1133630fbd LLILZIL;
    public final long LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146120fvm)) {
            return false;
        }
        C1146120fvm c1146120fvm = (C1146120fvm) obj;
        return Intrinsics.LJFF(this.LL, c1146120fvm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1146120fvm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1146120fvm.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1146120fvm.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1146120fvm.LLILZIL) && this.LLILZLL == c1146120fvm.LLILZLL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C1146150fvp c1146150fvp = this.LLILZ;
        return ((((iHashCode + (c1146150fvp == null ? 0 : c1146150fvp.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftAnchorPanelHierarchyData(room=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", locateGiftInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", eventTracker=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1146120fvm(Room room, DataChannel dataChannel, String str, C1146150fvp c1146150fvp, C1133630fbd c1133630fbd, long j) {
        this.LL = room;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = str;
        this.LLILZ = c1146150fvp;
        this.LLILZIL = c1133630fbd;
        this.LLILZLL = j;
    }
}
