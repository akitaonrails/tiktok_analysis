package X;

import com.ss.android.ugc.aweme.comment.model.PollInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342030l1l implements InterfaceC0148002o {
    public final Map<String, PollInfo> LL;
    public final C291001Au<C1075920e6Y> LLILLJJLI;
    public final C291001Au<C1075920e6Y> LLILLL;
    public final C291001Au<C1075920e6Y> LLILZ;
    public final C291001Au<C1075920e6Y> LLILZIL;
    public final C291001Au<C1075920e6Y> LLILZLL;
    public final C291001Au<C1075920e6Y> LLIZ;
    public final C291001Au<C1075920e6Y> LLIZLLLIL;
    public final C291001Au<C1075920e6Y> LLJ;

    public C1342030l1l() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1342030l1l)) {
            return false;
        }
        C1342030l1l c1342030l1l = (C1342030l1l) obj;
        return Intrinsics.LJFF(this.LL, c1342030l1l.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1342030l1l.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1342030l1l.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1342030l1l.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1342030l1l.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1342030l1l.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1342030l1l.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1342030l1l.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1342030l1l.LLJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<C1075920e6Y> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C1075920e6Y> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C1075920e6Y> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<C1075920e6Y> c291001Au4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C1075920e6Y> c291001Au5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<C1075920e6Y> c291001Au6 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<C1075920e6Y> c291001Au7 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<C1075920e6Y> c291001Au8 = this.LLJ;
        return iHashCode8 + (c291001Au8 != null ? c291001Au8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPollState(visiblePollsByAwemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pollPublishStartEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pollPublishSuccessEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pollPublishFailEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pollDeleteStartEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pollDeleteSuccessEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", pollDeleteFailEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", pollOptionChangeEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", pollServerSyncRemoveEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1342030l1l(int i) {
        this(C2097608Jq.LJ(), null, null, null, null, null, null, null, null);
    }

    public C1342030l1l(Map<String, PollInfo> map, C291001Au<C1075920e6Y> c291001Au, C291001Au<C1075920e6Y> c291001Au2, C291001Au<C1075920e6Y> c291001Au3, C291001Au<C1075920e6Y> c291001Au4, C291001Au<C1075920e6Y> c291001Au5, C291001Au<C1075920e6Y> c291001Au6, C291001Au<C1075920e6Y> c291001Au7, C291001Au<C1075920e6Y> c291001Au8) {
        this.LL = map;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = c291001Au6;
        this.LLIZLLLIL = c291001Au7;
        this.LLJ = c291001Au8;
    }

    public static C1342030l1l LIZ(C1342030l1l c1342030l1l, Map map, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, int i) {
        C291001Au c291001Au9 = c291001Au8;
        C291001Au c291001Au10 = c291001Au7;
        C291001Au c291001Au11 = c291001Au6;
        C291001Au c291001Au12 = c291001Au5;
        C291001Au c291001Au13 = c291001Au4;
        C291001Au c291001Au14 = c291001Au3;
        C291001Au c291001Au15 = c291001Au2;
        C291001Au c291001Au16 = c291001Au;
        Map map2 = map;
        if ((i & 1) != 0) {
            map2 = c1342030l1l.LL;
        }
        if ((i & 2) != 0) {
            c291001Au16 = c1342030l1l.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au15 = c1342030l1l.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au14 = c1342030l1l.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au13 = c1342030l1l.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au12 = c1342030l1l.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au11 = c1342030l1l.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au10 = c1342030l1l.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au9 = c1342030l1l.LLJ;
        }
        c1342030l1l.getClass();
        return new C1342030l1l(map2, c291001Au16, c291001Au15, c291001Au14, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au9);
    }
}
