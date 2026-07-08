package X;

import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596970rex implements AnonymousClass0060 {
    public final Long LIZ;
    public final InsertStory LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final List<Integer> LJ;
    public final Integer LJFF;
    public final Map<String, String> LJI;
    public final Map<String, Long> LJII;
    public final boolean LJIIIIZZ;
    public final Integer LJIIIZ;
    public final Integer LJIIJ;

    public C1596970rex() {
        this(null, null, 0, null, null, null, null, null, false, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1596970rex)) {
            return false;
        }
        C1596970rex c1596970rex = (C1596970rex) obj;
        return Intrinsics.LJFF(this.LIZ, c1596970rex.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1596970rex.LIZIZ) && this.LIZJ == c1596970rex.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1596970rex.LIZLLL) && Intrinsics.LJFF(this.LJ, c1596970rex.LJ) && Intrinsics.LJFF(this.LJFF, c1596970rex.LJFF) && Intrinsics.LJFF(this.LJI, c1596970rex.LJI) && Intrinsics.LJFF(this.LJII, c1596970rex.LJII) && this.LJIIIIZZ == c1596970rex.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1596970rex.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1596970rex.LJIIJ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        InsertStory insertStory = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (insertStory == null ? 0 : insertStory.hashCode())) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.LJ;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, String> map = this.LJI;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Long> map2 = this.LJII;
        int iHashCode7 = (((iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Integer num3 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJIIJ;
        return iHashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "MixRankSkylightFetchParams(count=" + this.LIZ + ", insertStory=" + this.LIZIZ + ", needStoryNotes=" + this.LIZJ + ", pullType=" + this.LIZLLL + ", bizGroups=" + this.LJ + ", fetchType=" + this.LJFF + ", extraLiveBizParams=" + this.LJI + ", bizTopLimitMap=" + this.LJII + ", isInImmersiveFeed=" + this.LJIIIIZZ + ", mufCount=" + this.LJIIIZ + ", followingCount=" + this.LJIIJ + ')';
    }

    public C1596970rex(Long l, InsertStory insertStory, int i, Integer num, List list, Integer num2, Map map, Map map2, boolean z, Integer num3, Integer num4, int i2) {
        l = (i2 & 1) != 0 ? null : l;
        insertStory = (i2 & 2) != 0 ? null : insertStory;
        i = (i2 & 4) != 0 ? 0 : i;
        num = (i2 & 8) != 0 ? null : num;
        list = (i2 & 16) != 0 ? null : list;
        num2 = (i2 & 32) != 0 ? null : num2;
        map = (i2 & 64) != 0 ? null : map;
        map2 = (i2 & 128) != 0 ? null : map2;
        z = (i2 & 256) != 0 ? false : z;
        num3 = (i2 & 512) != 0 ? null : num3;
        num4 = (i2 & 1024) != 0 ? null : num4;
        this.LIZ = l;
        this.LIZIZ = insertStory;
        this.LIZJ = i;
        this.LIZLLL = num;
        this.LJ = list;
        this.LJFF = num2;
        this.LJI = map;
        this.LJII = map2;
        this.LJIIIIZZ = z;
        this.LJIIIZ = num3;
        this.LJIIJ = num4;
    }
}
