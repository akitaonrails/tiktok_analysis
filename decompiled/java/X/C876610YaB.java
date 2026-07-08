package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876610YaB {
    public final Map<EnumC871430YGn, C07WK> LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C869590Y9l LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C876610YaB)) {
            return false;
        }
        C876610YaB c876610YaB = (C876610YaB) obj;
        return Intrinsics.LJFF(this.LIZ, c876610YaB.LIZ) && this.LIZIZ == c876610YaB.LIZIZ && this.LIZJ == c876610YaB.LIZJ && Intrinsics.LJFF(this.LIZLLL, c876610YaB.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        C869590Y9l c869590Y9l = this.LIZLLL;
        return iHashCode + (c869590Y9l == null ? 0 : c869590Y9l.hashCode());
    }

    public C876610YaB() {
        this(new LinkedHashMap(), -1L, -1L, null);
    }

    public final int LIZ() {
        C07WK c07wk = this.LIZ.get(EnumC871430YGn.ALL_RISKY);
        if (c07wk != null) {
            return c07wk.LIZ;
        }
        return 0;
    }

    public final int LIZIZ() {
        C07WK c07wk = this.LIZ.get(EnumC871430YGn.STRANGER_NOT_RISKY);
        if (c07wk != null) {
            return c07wk.LIZ;
        }
        return 0;
    }

    public final int LIZJ() {
        C07WK c07wk = this.LIZ.get(EnumC871430YGn.STRANGER_NOT_RISKY);
        if (c07wk != null) {
            return c07wk.LIZJ.size();
        }
        return 0;
    }

    public final String toString() {
        List<Long> list;
        List<Long> list2;
        List<Long> list3;
        StringBuilder sb = new StringBuilder("MessageRequestData(\nstrangerNotRiskyTotalCount = ");
        sb.append(LIZIZ());
        sb.append(", strangerNotRiskyUnreadCount = ");
        C07WK c07wk = this.LIZ.get(EnumC871430YGn.STRANGER_NOT_RISKY);
        Integer numValueOf = null;
        sb.append((c07wk == null || (list3 = c07wk.LIZIZ) == null) ? null : Integer.valueOf(list3.size()));
        sb.append(", strangerNotRiskyUnreadCountExcludeMuteOrBlock = ");
        sb.append(LIZJ());
        sb.append("\nallStrangerTotalCount = ");
        Map<EnumC871430YGn, C07WK> map = this.LIZ;
        EnumC871430YGn enumC871430YGn = EnumC871430YGn.ALL_STRANGER;
        C07WK c07wk2 = map.get(enumC871430YGn);
        sb.append(c07wk2 != null ? c07wk2.LIZ : 0);
        sb.append(", allStrangerUnreadCount = ");
        C07WK c07wk3 = this.LIZ.get(enumC871430YGn);
        sb.append((c07wk3 == null || (list2 = c07wk3.LIZIZ) == null) ? 0 : list2.size());
        sb.append(", allStrangerUnreadCountExcludeMuteOrBlock = ");
        C07WK c07wk4 = this.LIZ.get(enumC871430YGn);
        sb.append(c07wk4 != null ? c07wk4.LIZJ.size() : 0);
        sb.append("\nallRiskyTotalCount = ");
        sb.append(LIZ());
        sb.append(", allRiskyUnreadCount = ");
        Map<EnumC871430YGn, C07WK> map2 = this.LIZ;
        EnumC871430YGn enumC871430YGn2 = EnumC871430YGn.ALL_RISKY;
        C07WK c07wk5 = map2.get(enumC871430YGn2);
        if (c07wk5 != null && (list = c07wk5.LIZIZ) != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sb.append(numValueOf);
        sb.append(", allRiskyUnreadCountExcludeMuteOrBlock = ");
        C07WK c07wk6 = this.LIZ.get(enumC871430YGn2);
        sb.append(c07wk6 != null ? c07wk6.LIZJ.size() : 0);
        sb.append("\nlastUpdateTime = ");
        sb.append(this.LIZIZ);
        sb.append(", lastUpdateTimeExcludeMuteOrBlock = ");
        sb.append(this.LIZJ);
        sb.append("\nlastShowMsg = ");
        sb.append(this.LIZLLL);
        sb.append('\n');
        return sb.toString();
    }

    public final List<Long> LIZLLL(EnumC871430YGn enumC871430YGn) {
        List<Long> list;
        C07WK c07wk = this.LIZ.get(enumC871430YGn);
        if (c07wk == null || (list = c07wk.LIZJ) == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public C876610YaB(Map<EnumC871430YGn, C07WK> map, long j, long j2, C869590Y9l c869590Y9l) {
        this.LIZ = map;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = c869590Y9l;
    }
}
