package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900810zZ1 extends AbstractC1900570zYd {
    public final List<MusNotice> LJIIIIZZ;
    public final Map<Integer, NoticeItems> LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;
    public final List<MusNotice> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    @Override // X.AbstractC1900570zYd
    public final boolean LIZJ() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900810zZ1)) {
            return false;
        }
        C1900810zZ1 c1900810zZ1 = (C1900810zZ1) obj;
        return Intrinsics.LJFF(this.LJIIIIZZ, c1900810zZ1.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1900810zZ1.LJIIIZ) && this.LJIIJ == c1900810zZ1.LJIIJ && this.LJIIJJI == c1900810zZ1.LJIIJJI && this.LJIIL == c1900810zZ1.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1900810zZ1.LJIILIIL) && this.LJIILJJIL == c1900810zZ1.LJIILJJIL && this.LJIILL == c1900810zZ1.LJIILL;
    }

    public final int hashCode() {
        return (((((((((((((this.LJIIIIZZ.hashCode() * 31) + this.LJIIIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL) * 31) + this.LJIILIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessDataInfo(newData=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", extraDataMap=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", shouldCollapse=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", total=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", toMergeData=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", sortByTime=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", isRefactor=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1900570zYd
    public final boolean LIZ() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC1900570zYd
    public final List<MusNotice> LIZIZ() {
        return this.LJIILIIL;
    }

    public final boolean LIZLLL(MusNotice musNotice) {
        int i;
        if (this.LIZLLL.contains(musNotice.nid) || (((i = musNotice.type) == 1 || i == 2) && this.LJ.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }

    public final void LJ(MusNotice musNotice, int i) {
        if (!musNotice.hasRead) {
            musNotice.priority = 1;
        }
        if (i < 0) {
            ((ArrayList) this.LJFF).add(musNotice);
        } else {
            ListProtector.add(this.LJFF, i, musNotice);
        }
        this.LIZLLL.add(musNotice.nid);
        this.LJ.add(Integer.valueOf(musNotice.type));
    }

    public C1900810zZ1(List list, Map map, boolean z, int i, List list2, boolean z2) {
        super(list, map);
        this.LJIIIIZZ = list;
        this.LJIIIZ = map;
        this.LJIIJ = z;
        this.LJIIJJI = false;
        this.LJIIL = i;
        this.LJIILIIL = list2;
        this.LJIILJJIL = z2;
        this.LJIILL = true;
    }
}
