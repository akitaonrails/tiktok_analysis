package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900930zZD implements InterfaceC1891350zJl {
    public final NoticeTabModel LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900930zZD)) {
            return false;
        }
        C1900930zZD c1900930zZD = (C1900930zZD) obj;
        return Intrinsics.LJFF(this.LL, c1900930zZD.LL) && this.LLILLJJLI == c1900930zZD.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorNoticeTabItem(tabDataModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1900930zZD) || this.LL.tabId != ((C1900930zZD) interfaceC1891350zJl).LL.tabId) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C1900930zZD)) {
            return null;
        }
        C1900930zZD c1900930zZD = (C1900930zZD) interfaceC1891350zJl;
        boolean z2 = true;
        if (this.LLILLJJLI != c1900930zZD.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        if (this.LL.unReadCount == c1900930zZD.LL.unReadCount) {
            z2 = false;
        }
        return new C1900940zZE(z, z2);
    }

    public C1900930zZD(NoticeTabModel noticeTabModel, boolean z) {
        this.LL = noticeTabModel;
        this.LLILLJJLI = z;
    }
}
