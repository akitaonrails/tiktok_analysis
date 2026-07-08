package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900660zYm implements InterfaceC0148002o {
    public final int LL;
    public final GroupFilterStruct LLILLJJLI;
    public final NoticeTabModel LLILLL;
    public final AbstractC1623806Xk<List<GroupFilterStruct>> LLILZ;
    public final AbstractC1623806Xk<C1900610zYh> LLILZIL;
    public final EnumC1778800wOE LLILZLL;
    public final MusNotice LLIZ;
    public final C1778880wOM LLIZLLLIL;
    public final C1778870wOL LLJ;
    public final C291001Au<Unit> LLJI;

    public C1900660zYm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900660zYm)) {
            return false;
        }
        C1900660zYm c1900660zYm = (C1900660zYm) obj;
        return this.LL == c1900660zYm.LL && Intrinsics.LJFF(this.LLILLJJLI, c1900660zYm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1900660zYm.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1900660zYm.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1900660zYm.LLILZIL) && this.LLILZLL == c1900660zYm.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1900660zYm.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1900660zYm.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1900660zYm.LLJ) && Intrinsics.LJFF(this.LLJI, c1900660zYm.LLJI);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        GroupFilterStruct groupFilterStruct = this.LLILLJJLI;
        int iHashCode = (i + (groupFilterStruct == null ? 0 : groupFilterStruct.hashCode())) * 31;
        NoticeTabModel noticeTabModel = this.LLILLL;
        int iHashCode2 = (((((((iHashCode + (noticeTabModel == null ? 0 : noticeTabModel.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        MusNotice musNotice = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (musNotice == null ? 0 : musNotice.hashCode())) * 31;
        C1778880wOM c1778880wOM = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (c1778880wOM == null ? 0 : c1778880wOM.hashCode())) * 31;
        C1778870wOL c1778870wOL = this.LLJ;
        int iHashCode5 = (iHashCode4 + (c1778870wOL == null ? 0 : c1778870wOL.hashCode())) * 31;
        C291001Au<Unit> c291001Au = this.LLJI;
        return iHashCode5 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationFragmentV2State(currentIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentGroupFilter=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentTabData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", groupFilterList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", tabModelResult=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", deleteStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", deleteNotice=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", disableInfoWrapper=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", disableStatus=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", updateGroupDotEvent=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1900660zYm(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(0, null, null, c491101vh, c491101vh, EnumC1778800wOE.SUCCESS, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1900660zYm(int i, GroupFilterStruct groupFilterStruct, NoticeTabModel noticeTabModel, AbstractC1623806Xk<? extends List<GroupFilterStruct>> abstractC1623806Xk, AbstractC1623806Xk<C1900610zYh> abstractC1623806Xk2, EnumC1778800wOE enumC1778800wOE, MusNotice musNotice, C1778880wOM c1778880wOM, C1778870wOL c1778870wOL, C291001Au<Unit> c291001Au) {
        this.LL = i;
        this.LLILLJJLI = groupFilterStruct;
        this.LLILLL = noticeTabModel;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = abstractC1623806Xk2;
        this.LLILZLL = enumC1778800wOE;
        this.LLIZ = musNotice;
        this.LLIZLLLIL = c1778880wOM;
        this.LLJ = c1778870wOL;
        this.LLJI = c291001Au;
    }

    public static C1900660zYm LIZ(C1900660zYm c1900660zYm, int i, GroupFilterStruct groupFilterStruct, NoticeTabModel noticeTabModel, C1623606Xi c1623606Xi, AbstractC1623806Xk abstractC1623806Xk, EnumC1778800wOE enumC1778800wOE, MusNotice musNotice, C1778880wOM c1778880wOM, C1778870wOL c1778870wOL, C291001Au c291001Au, int i2) {
        C291001Au c291001Au2 = c291001Au;
        C1778870wOL c1778870wOL2 = c1778870wOL;
        C1778880wOM c1778880wOM2 = c1778880wOM;
        MusNotice musNotice2 = musNotice;
        EnumC1778800wOE enumC1778800wOE2 = enumC1778800wOE;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        AbstractC1623806Xk<List<GroupFilterStruct>> abstractC1623806Xk3 = c1623606Xi;
        NoticeTabModel noticeTabModel2 = noticeTabModel;
        GroupFilterStruct groupFilterStruct2 = groupFilterStruct;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c1900660zYm.LL;
        }
        if ((i2 & 2) != 0) {
            groupFilterStruct2 = c1900660zYm.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            noticeTabModel2 = c1900660zYm.LLILLL;
        }
        if ((i2 & 8) != 0) {
            abstractC1623806Xk3 = c1900660zYm.LLILZ;
        }
        if ((i2 & 16) != 0) {
            abstractC1623806Xk2 = c1900660zYm.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            enumC1778800wOE2 = c1900660zYm.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            musNotice2 = c1900660zYm.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c1778880wOM2 = c1900660zYm.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            c1778870wOL2 = c1900660zYm.LLJ;
        }
        if ((i2 & 512) != 0) {
            c291001Au2 = c1900660zYm.LLJI;
        }
        c1900660zYm.getClass();
        return new C1900660zYm(i3, groupFilterStruct2, noticeTabModel2, abstractC1623806Xk3, abstractC1623806Xk2, enumC1778800wOE2, musNotice2, c1778880wOM2, c1778870wOL2, c291001Au2);
    }
}
