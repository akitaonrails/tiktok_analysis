package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901020zZM extends AbstractC1900570zYd {
    public final List<MusNotice> LJIIIIZZ;
    public final Map<Integer, NoticeItems> LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;
    public final List<MusNotice> LJIILIIL;
    public final List<MusNotice> LJIILJJIL;
    public final LogPbBean LJIILL;
    public final long LJIILLIIL;
    public final boolean LJIIZILJ;
    public final C1901270zZl LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final List<Integer> LJIL;
    public final C1901270zZl LJJ;
    public final List<MusNotice> LJJI;

    public C1901020zZM() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1901020zZM)) {
            return false;
        }
        C1901020zZM c1901020zZM = (C1901020zZM) obj;
        return Intrinsics.LJFF(this.LJIIIIZZ, c1901020zZM.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1901020zZM.LJIIIZ) && this.LJIIJ == c1901020zZM.LJIIJ && this.LJIIJJI == c1901020zZM.LJIIJJI && this.LJIIL == c1901020zZM.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1901020zZM.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1901020zZM.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1901020zZM.LJIILL) && this.LJIILLIIL == c1901020zZM.LJIILLIIL && this.LJIIZILJ == c1901020zZM.LJIIZILJ && Intrinsics.LJFF(this.LJIJ, c1901020zZM.LJIJ) && this.LJIJI == c1901020zZM.LJIJI && this.LJIJJ == c1901020zZM.LJIJJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LJIIIIZZ.hashCode() * 31) + this.LJIIIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31;
        LogPbBean logPbBean = this.LJIILL;
        return ((((((((((iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31) + C786410Ut5.Y2(this.LJIILLIIL)) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31) + this.LJIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + C786410Ut5.Z2(this.LJIJJ);
    }

    public final String toString() {
        return "ProcessInfo(newData=" + this.LJIIIIZZ + ", extraDataMap=" + this.LJIIIZ + ", hasMore=" + this.LJIIJ + ", shouldCollapse=" + this.LJIIJJI + ", total=" + this.LJIIL + ", toMergeData=" + this.LJIILIIL + ", extraLiveData=" + this.LJIILJJIL + ", logPb=" + this.LJIILL + ", lastReadTime=" + this.LJIILLIIL + ", isRefresh=" + this.LJIIZILJ + ", nextTimeRange=" + this.LJIJ + ", hasNewExtra=" + this.LJIJI + ", isRefactor=" + this.LJIJJ + ')';
    }

    @Override // X.AbstractC1900570zYd
    public final boolean LIZ() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC1900570zYd
    public final List<MusNotice> LIZIZ() {
        return this.LJIILIIL;
    }

    @Override // X.AbstractC1900570zYd
    public final boolean LIZJ() {
        return this.LJIJJLI;
    }

    public final boolean LIZLLL(MusNotice musNotice) {
        int i;
        if (this.LIZLLL.contains(musNotice.nid) || (((i = musNotice.type) == 1 || i == 2) && this.LJ.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }

    public final void LJ(MusNotice musNotice, List<MusNotice> list, int i) {
        long jMax;
        int i2 = 3;
        if (!musNotice.hasRead) {
            if (musNotice.noticeListType == 2) {
                musNotice.priority = 3;
            } else {
                musNotice.priority = 1;
            }
            musNotice.timeLineType = 0;
        } else {
            long j = musNotice.createTime * 1000;
            Locale locale = C1356610lPH.LIZ;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = Calendar.getInstance().getTimeInMillis() - calendar.getTimeInMillis();
            if (timeInMillis <= 86400000) {
                i2 = 1;
            } else if (timeInMillis <= 172800000) {
                i2 = 2;
            } else if (timeInMillis > 604800000) {
                if (timeInMillis <= 2592000000L) {
                    i2 = 4;
                } else {
                    i2 = 5;
                }
            }
            musNotice.timeLineType = i2;
        }
        musNotice.lastReadTime = this.LJIILLIIL;
        if (musNotice.logPbBean == null) {
            musNotice.logPbBean = this.LJIILL;
        }
        ListProtector.add(list, i, musNotice);
        this.LIZLLL.add(musNotice.nid);
        this.LJ.add(Integer.valueOf(musNotice.type));
        if (!((ArrayList) this.LJIL).contains(Integer.valueOf(musNotice.timeLineType))) {
            ((ArrayList) this.LJIL).add(Integer.valueOf(musNotice.timeLineType));
        }
        C1901270zZl c1901270zZl = this.LJJ;
        long jMin = musNotice.createTime;
        if (jMin > 0) {
            long j2 = c1901270zZl.LIZ;
            if (j2 <= 0) {
                jMax = jMin;
            } else {
                jMax = Math.max(j2, jMin);
            }
            c1901270zZl.LIZ = jMax;
            long j3 = c1901270zZl.LIZIZ;
            if (j3 > 0) {
                jMin = Math.min(j3, jMin);
            }
            c1901270zZl.LIZIZ = jMin;
            return;
        }
        c1901270zZl.getClass();
    }

    public C1901020zZM(List list, Map map, boolean z, int i, List list2, C13BV c13bv, LogPbBean logPbBean, long j, boolean z2, C1901270zZl c1901270zZl) {
        super(list, map);
        this.LJIIIIZZ = list;
        this.LJIIIZ = map;
        this.LJIIJ = z;
        this.LJIIJJI = false;
        this.LJIIL = i;
        this.LJIILIIL = list2;
        this.LJIILJJIL = c13bv;
        this.LJIILL = logPbBean;
        this.LJIILLIIL = j;
        this.LJIIZILJ = z2;
        this.LJIJ = c1901270zZl;
        this.LJIJI = false;
        this.LJIJJ = true;
        this.LJIJJLI = true;
        this.LJIL = new ArrayList();
        this.LJJ = new C1901270zZl();
        this.LJJI = new ArrayList();
    }
}
