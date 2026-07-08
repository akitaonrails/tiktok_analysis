package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502060JmW implements InterfaceC0148002o {
    public final String LL;
    public final SpaceTopicCategory LLILLJJLI;
    public final SpaceTopicContent LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;

    public C502060JmW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C502060JmW)) {
            return false;
        }
        C502060JmW c502060JmW = (C502060JmW) obj;
        return Intrinsics.LJFF(this.LL, c502060JmW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c502060JmW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c502060JmW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c502060JmW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c502060JmW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c502060JmW.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        SpaceTopicContent spaceTopicContent = this.LLILLL;
        int iHashCode2 = (iHashCode + (spaceTopicContent == null ? 0 : spaceTopicContent.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZLL;
        return iHashCode4 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", vmCurrentTopicCategory=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", vmCurrentTopic=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showCustomEdit=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hidePostPanel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", checkPollReqState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C502060JmW(int i) {
        this("", new SpaceTopicCategory(), null, null, null, null);
    }

    public C502060JmW(String str, SpaceTopicCategory spaceTopicCategory, SpaceTopicContent spaceTopicContent, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = spaceTopicCategory;
        this.LLILLL = spaceTopicContent;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = c291001Au3;
    }

    public static C502060JmW LIZ(C502060JmW c502060JmW, SpaceTopicCategory spaceTopicCategory, SpaceTopicContent spaceTopicContent, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        String str;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        SpaceTopicContent spaceTopicContent2 = spaceTopicContent;
        SpaceTopicCategory spaceTopicCategory2 = spaceTopicCategory;
        if ((i & 1) != 0) {
            str = c502060JmW.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            spaceTopicCategory2 = c502060JmW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            spaceTopicContent2 = c502060JmW.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c502060JmW.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au5 = c502060JmW.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au4 = c502060JmW.LLILZLL;
        }
        c502060JmW.getClass();
        return new C502060JmW(str, spaceTopicCategory2, spaceTopicContent2, c291001Au6, c291001Au5, c291001Au4);
    }
}
