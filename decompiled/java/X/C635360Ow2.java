package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ow2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635360Ow2 implements InterfaceC1891350zJl {
    public final GroupUnsubscribeSetting LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C635360Ow2)) {
            return false;
        }
        C635360Ow2 c635360Ow2 = (C635360Ow2) obj;
        return Intrinsics.LJFF(this.LL, c635360Ow2.LL) && this.LLILLJJLI == c635360Ow2.LLILLJJLI && this.LLILLL == c635360Ow2.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        GroupUnsubscribeSetting groupUnsubscribeSetting = this.LL;
        return ((((groupUnsubscribeSetting == null ? 0 : groupUnsubscribeSetting.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupUnsubscribeSettingItem(groupUnsubscribeSetting=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFirst=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isLast=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C635360Ow2(GroupUnsubscribeSetting groupUnsubscribeSetting, boolean z, boolean z2) {
        this.LL = groupUnsubscribeSetting;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
