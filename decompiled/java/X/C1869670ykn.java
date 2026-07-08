package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869670ykn implements InterfaceC111300bX {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final NoticeTabModel LLILLL;
    public final GroupFilterStruct LLILZ;
    public final Integer LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869670ykn)) {
            return false;
        }
        C1869670ykn c1869670ykn = (C1869670ykn) obj;
        return this.LL == c1869670ykn.LL && this.LLILLJJLI == c1869670ykn.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1869670ykn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1869670ykn.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1869670ykn.LLILZIL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        NoticeTabModel noticeTabModel = this.LLILLL;
        int iHashCode = (iZ2 + (noticeTabModel == null ? 0 : noticeTabModel.hashCode())) * 31;
        GroupFilterStruct groupFilterStruct = this.LLILZ;
        int iHashCode2 = (iHashCode + (groupFilterStruct == null ? 0 : groupFilterStruct.hashCode())) * 31;
        Integer num = this.LLILZIL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationResultWidgetModel(isCreator=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAllTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", groupFilter=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", collapsedListType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869670ykn(boolean z, boolean z2, NoticeTabModel noticeTabModel, GroupFilterStruct groupFilterStruct, Integer num) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = noticeTabModel;
        this.LLILZ = groupFilterStruct;
        this.LLILZIL = num;
    }
}
