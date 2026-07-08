package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.GroupSectionInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236480iHW implements InterfaceC636340Oxc<C1236480iHW, InterfaceC1214250hhf> {
    public final C627660Ojc<InterfaceC1214250hhf> LL;
    public final AbstractC1623806Xk<Integer> LLILLJJLI;
    public final EnumC1007380cK0 LLILLL;
    public final String LLILZ;
    public final GroupSectionInfo LLILZIL;

    public C1236480iHW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1236480iHW)) {
            return false;
        }
        C1236480iHW c1236480iHW = (C1236480iHW) obj;
        return Intrinsics.LJFF(this.LL, c1236480iHW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1236480iHW.LLILLJJLI) && this.LLILLL == c1236480iHW.LLILLL && Intrinsics.LJFF(this.LLILZ, c1236480iHW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1236480iHW.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        GroupSectionInfo groupSectionInfo = this.LLILZIL;
        return iHashCode + (groupSectionInfo == null ? 0 : groupSectionInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolGroupsListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", numberOfSchoolGroups=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", groupFetchScene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", schoolId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sectionInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1214250hhf> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1214250hhf> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1236480iHW(int i) {
        this(new C627660Ojc(null, null, null, null, 15), C491101vh.LIZ, EnumC1007380cK0.ACTIVE, "", null);
    }

    public C1236480iHW(C627660Ojc<InterfaceC1214250hhf> c627660Ojc, AbstractC1623806Xk<Integer> abstractC1623806Xk, EnumC1007380cK0 enumC1007380cK0, String str, GroupSectionInfo groupSectionInfo) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = enumC1007380cK0;
        this.LLILZ = str;
        this.LLILZIL = groupSectionInfo;
    }

    public static C1236480iHW LIZ(C1236480iHW c1236480iHW, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, EnumC1007380cK0 enumC1007380cK0, String str, GroupSectionInfo groupSectionInfo, int i) {
        GroupSectionInfo groupSectionInfo2 = groupSectionInfo;
        String str2 = str;
        EnumC1007380cK0 enumC1007380cK02 = enumC1007380cK0;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1236480iHW.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1236480iHW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC1007380cK02 = c1236480iHW.LLILLL;
        }
        if ((i & 8) != 0) {
            str2 = c1236480iHW.LLILZ;
        }
        if ((i & 16) != 0) {
            groupSectionInfo2 = c1236480iHW.LLILZIL;
        }
        c1236480iHW.getClass();
        return new C1236480iHW(c627660Ojc2, abstractC1623806Xk2, enumC1007380cK02, str2, groupSectionInfo2);
    }
}
