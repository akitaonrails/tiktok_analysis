package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901600zaI implements InterfaceC1891350zJl {
    public final int LL;
    public final List<Integer> LLILLJJLI;
    public final String LLILLL;
    public final List<NoticeSortModel> LLILZ;
    public final List<NoticeFilterModel> LLILZIL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1901600zaI)) {
            return false;
        }
        C1901600zaI c1901600zaI = (C1901600zaI) obj;
        return this.LL == c1901600zaI.LL && Intrinsics.LJFF(this.LLILLJJLI, c1901600zaI.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1901600zaI.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1901600zaI.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1901600zaI.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        List<NoticeSortModel> list = this.LLILZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<NoticeFilterModel> list2 = this.LLILZIL;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorSortAndFilterItem(sortType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterTypes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", trackName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sortSettings=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", filterSettings=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public C1901600zaI(int i, List<Integer> list, String str, List<NoticeSortModel> list2, List<NoticeFilterModel> list3) {
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = list2;
        this.LLILZIL = list3;
    }
}
