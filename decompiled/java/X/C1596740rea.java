package X;

import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596740rea implements AnonymousClass0060 {
    public final Long LIZ;
    public final InsertStory LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final Long LJ;
    public final Long LJFF;
    public final String LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    public C1596740rea() {
        this(null, null, 0, null, null, null, null, 0, 0, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1596740rea)) {
            return false;
        }
        C1596740rea c1596740rea = (C1596740rea) obj;
        return Intrinsics.LJFF(this.LIZ, c1596740rea.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1596740rea.LIZIZ) && this.LIZJ == c1596740rea.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1596740rea.LIZLLL) && Intrinsics.LJFF(this.LJ, c1596740rea.LJ) && Intrinsics.LJFF(this.LJFF, c1596740rea.LJFF) && Intrinsics.LJFF(this.LJI, c1596740rea.LJI) && this.LJII == c1596740rea.LJII && this.LJIIIIZZ == c1596740rea.LJIIIIZZ;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        InsertStory insertStory = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (insertStory == null ? 0 : insertStory.hashCode())) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.LJI;
        return ((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StorySkylightFetchParams(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", insertStory=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needStoryNotes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pullType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", storyTopCountLimit=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", userStoryPackageCountLimit=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", passthroughPageToken=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mufCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", followingCount=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1596740rea(Long l, InsertStory insertStory, int i, Integer num, Long l2, Long l3, String str, int i2, int i3, int i4) {
        l = (i4 & 1) != 0 ? null : l;
        insertStory = (i4 & 2) != 0 ? null : insertStory;
        i = (i4 & 4) != 0 ? 0 : i;
        num = (i4 & 8) != 0 ? null : num;
        l2 = (i4 & 16) != 0 ? null : l2;
        l3 = (i4 & 32) != 0 ? null : l3;
        str = (i4 & 64) != 0 ? null : str;
        i2 = (i4 & 128) != 0 ? 0 : i2;
        i3 = (i4 & 256) != 0 ? 0 : i3;
        this.LIZ = l;
        this.LIZIZ = insertStory;
        this.LIZJ = i;
        this.LIZLLL = num;
        this.LJ = l2;
        this.LJFF = l3;
        this.LJI = str;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
    }
}
