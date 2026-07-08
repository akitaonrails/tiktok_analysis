package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358360lS6 implements InterfaceC1891350zJl {
    public final UpvoteStruct LL;
    public final String LLILLJJLI;
    public long LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public final List<RepostReplyStruct> LLILZLL;
    public final int LLIZ;
    public final List<String> LLIZLLLIL;
    public final long LLJ;
    public final boolean LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358360lS6)) {
            return false;
        }
        C1358360lS6 c1358360lS6 = (C1358360lS6) obj;
        return Intrinsics.LJFF(this.LL, c1358360lS6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1358360lS6.LLILLJJLI) && this.LLILLL == c1358360lS6.LLILLL && this.LLILZ == c1358360lS6.LLILZ && this.LLILZIL == c1358360lS6.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1358360lS6.LLILZLL) && this.LLIZ == c1358360lS6.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1358360lS6.LLIZLLLIL) && this.LLJ == c1358360lS6.LLJ && this.LLJI == c1358360lS6.LLJI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostViewMoreItem(attachedRepost=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", repostId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", totalReplyCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", buttonStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", expandingCount=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", totalCacheItems=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", defaultServerExpandCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", topIds=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1358360lS6) {
            C1358360lS6 c1358360lS6 = (C1358360lS6) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LLILLJJLI, c1358360lS6.LLILLJJLI) && this.LLILLL == c1358360lS6.LLILLL && this.LLILZ == c1358360lS6.LLILZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1358360lS6) && Intrinsics.LJFF(this.LLILLJJLI, ((C1358360lS6) interfaceC1891350zJl).LLILLJJLI)) {
            return true;
        }
        return false;
    }

    public C1358360lS6(UpvoteStruct upvoteStruct, String str, long j, int i, int i2, List<RepostReplyStruct> list, int i3, List<String> list2, long j2, boolean z) {
        this.LL = upvoteStruct;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = list;
        this.LLIZ = i3;
        this.LLIZLLLIL = list2;
        this.LLJ = j2;
        this.LLJI = z;
    }

    public static C1358360lS6 LIZ(C1358360lS6 c1358360lS6, long j, int i, int i2, List list, int i3, List list2, long j2, boolean z, int i4) {
        UpvoteStruct upvoteStruct;
        long j3 = j2;
        List list3 = list2;
        boolean z2 = z;
        int i5 = i3;
        long j4 = j;
        List list4 = list;
        int i6 = i2;
        int i7 = i;
        String str = null;
        if ((i4 & 1) != 0) {
            upvoteStruct = c1358360lS6.LL;
        } else {
            upvoteStruct = null;
        }
        if ((i4 & 2) != 0) {
            str = c1358360lS6.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            j4 = c1358360lS6.LLILLL;
        }
        if ((i4 & 8) != 0) {
            i7 = c1358360lS6.LLILZ;
        }
        if ((i4 & 16) != 0) {
            i6 = c1358360lS6.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            list4 = c1358360lS6.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            i5 = c1358360lS6.LLIZ;
        }
        if ((i4 & 128) != 0) {
            list3 = c1358360lS6.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            j3 = c1358360lS6.LLJ;
        }
        if ((i4 & 512) != 0) {
            z2 = c1358360lS6.LLJI;
        }
        c1358360lS6.getClass();
        return new C1358360lS6(upvoteStruct, str, j4, i7, i6, list4, i5, list3, j3, z2);
    }
}
