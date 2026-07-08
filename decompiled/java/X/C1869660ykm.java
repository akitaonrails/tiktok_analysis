package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869660ykm implements InterfaceC111300bX {
    public final Integer LL;
    public final NoticeTabModel LLILLJJLI;
    public final long LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869660ykm)) {
            return false;
        }
        C1869660ykm c1869660ykm = (C1869660ykm) obj;
        return Intrinsics.LJFF(this.LL, c1869660ykm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1869660ykm.LLILLJJLI) && this.LLILLL == c1869660ykm.LLILLL;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        NoticeTabModel noticeTabModel = this.LLILLJJLI;
        return ((iHashCode + (noticeTabModel != null ? noticeTabModel.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerResultWidgetModel(scenario=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tabModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", readTimeForFirstEnter=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869660ykm() {
        this(null, null, 0L);
    }

    public C1869660ykm(Integer num, NoticeTabModel noticeTabModel, long j) {
        this.LL = num;
        this.LLILLJJLI = noticeTabModel;
        this.LLILLL = j;
    }
}
