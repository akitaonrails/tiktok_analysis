package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358440lSE {
    public final UpvoteStruct LIZ;
    public final List<RepostReplyStruct> LIZIZ;
    public final List<RepostReplyStruct> LIZJ;
    public int LIZLLL;
    public final List<String> LJ;
    public long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358440lSE)) {
            return false;
        }
        C1358440lSE c1358440lSE = (C1358440lSE) obj;
        return Intrinsics.LJFF(this.LIZ, c1358440lSE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1358440lSE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1358440lSE.LIZJ) && this.LIZLLL == c1358440lSE.LIZLLL && Intrinsics.LJFF(this.LJ, c1358440lSE.LJ) && this.LJFF == c1358440lSE.LJFF && this.LJI == c1358440lSE.LJI;
    }

    public C1358440lSE(UpvoteStruct upvoteStruct, List<RepostReplyStruct> list, List<RepostReplyStruct> list2, int i, List<String> list3, long j, long j2) {
        this.LIZ = upvoteStruct;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = i;
        this.LJ = list3;
        this.LJFF = j;
        this.LJI = j2;
    }

    public static C1358440lSE LIZ(C1358440lSE c1358440lSE, UpvoteStruct upvoteStruct, List list, List list2, int i, List list3, long j, long j2, int i2) {
        long j3 = j2;
        long j4 = j;
        List list4 = list3;
        int i3 = i;
        List list5 = list2;
        List list6 = list;
        UpvoteStruct upvoteStruct2 = upvoteStruct;
        if ((i2 & 1) != 0) {
            upvoteStruct2 = c1358440lSE.LIZ;
        }
        if ((i2 & 2) != 0) {
            list6 = c1358440lSE.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            list5 = c1358440lSE.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i3 = c1358440lSE.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            list4 = c1358440lSE.LJ;
        }
        if ((i2 & 32) != 0) {
            j4 = c1358440lSE.LJFF;
        }
        if ((i2 & 64) != 0) {
            j3 = c1358440lSE.LJI;
        }
        c1358440lSE.getClass();
        return new C1358440lSE(upvoteStruct2, list6, list5, i3, list4, j4, j3);
    }
}
