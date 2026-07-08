package X;

import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ohd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626430Ohd implements InterfaceC0148002o {
    public final float LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<TopicReview> LLILZLL;

    public C626430Ohd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C626430Ohd)) {
            return false;
        }
        C626430Ohd c626430Ohd = (C626430Ohd) obj;
        return Float.compare(this.LL, c626430Ohd.LL) == 0 && this.LLILLJJLI == c626430Ohd.LLILLJJLI && this.LLILLL == c626430Ohd.LLILLL && this.LLILZ == c626430Ohd.LLILZ && this.LLILZIL == c626430Ohd.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c626430Ohd.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicReviewState(topicRating=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reviewCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reviewCountThreshold=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isHeaderRatingShown=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasReviewed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", published=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode();
    }

    public /* synthetic */ C626430Ohd(int i) {
        this(0.0f, 0L, 5L, false, false, new C291001Au(null));
    }

    public C626430Ohd(float f, long j, long j2, boolean z, boolean z2, C291001Au<TopicReview> c291001Au) {
        this.LL = f;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = c291001Au;
    }

    public static C626430Ohd LIZ(C626430Ohd c626430Ohd, float f, long j, long j2, boolean z, boolean z2, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        long j3 = j2;
        boolean z3 = z2;
        long j4 = j;
        boolean z4 = z;
        float f2 = f;
        if ((i & 1) != 0) {
            f2 = c626430Ohd.LL;
        }
        if ((i & 2) != 0) {
            j4 = c626430Ohd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            j3 = c626430Ohd.LLILLL;
        }
        if ((i & 8) != 0) {
            z4 = c626430Ohd.LLILZ;
        }
        if ((i & 16) != 0) {
            z3 = c626430Ohd.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au2 = c626430Ohd.LLILZLL;
        }
        c626430Ohd.getClass();
        return new C626430Ohd(f2, j4, j3, z4, z3, c291001Au2);
    }
}
