package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358700lSe implements InterfaceC0148002o {
    public final AbstractC1623806Xk<BaseResponse> LL;
    public final CommentRethinkPopup LLILLJJLI;
    public final C291001Au<C735200Ssg> LLILLL;
    public final UpvoteStruct LLILZ;
    public final UpvoteStruct LLILZIL;
    public final Integer LLILZLL;

    public C1358700lSe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358700lSe)) {
            return false;
        }
        C1358700lSe c1358700lSe = (C1358700lSe) obj;
        return Intrinsics.LJFF(this.LL, c1358700lSe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1358700lSe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1358700lSe.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1358700lSe.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1358700lSe.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1358700lSe.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        CommentRethinkPopup commentRethinkPopup = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (commentRethinkPopup == null ? 0 : commentRethinkPopup.hashCode())) * 31;
        C291001Au<C735200Ssg> c291001Au = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        UpvoteStruct upvoteStruct = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (upvoteStruct == null ? 0 : upvoteStruct.hashCode())) * 31;
        UpvoteStruct upvoteStruct2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (upvoteStruct2 == null ? 0 : upvoteStruct2.hashCode())) * 31;
        Integer num = this.LLILZLL;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvotePublishState(request=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rethinkPopup=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", publishEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", targetUpvote=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", targetCarrierUpvote=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", upvotePublishPosition=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1358700lSe(int i) {
        this(C491101vh.LIZ, null, null, null, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1358700lSe(AbstractC1623806Xk<? extends BaseResponse> abstractC1623806Xk, CommentRethinkPopup commentRethinkPopup, C291001Au<C735200Ssg> c291001Au, UpvoteStruct upvoteStruct, UpvoteStruct upvoteStruct2, Integer num) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = commentRethinkPopup;
        this.LLILLL = c291001Au;
        this.LLILZ = upvoteStruct;
        this.LLILZIL = upvoteStruct2;
        this.LLILZLL = num;
    }

    public static C1358700lSe LIZ(C1358700lSe c1358700lSe, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, UpvoteStruct upvoteStruct, UpvoteStruct upvoteStruct2, Integer num, int i) {
        CommentRethinkPopup commentRethinkPopup;
        Integer num2 = num;
        UpvoteStruct upvoteStruct3 = upvoteStruct2;
        UpvoteStruct upvoteStruct4 = upvoteStruct;
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1358700lSe.LL;
        }
        if ((i & 2) != 0) {
            commentRethinkPopup = c1358700lSe.LLILLJJLI;
        } else {
            commentRethinkPopup = null;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1358700lSe.LLILLL;
        }
        if ((i & 8) != 0) {
            upvoteStruct4 = c1358700lSe.LLILZ;
        }
        if ((i & 16) != 0) {
            upvoteStruct3 = c1358700lSe.LLILZIL;
        }
        if ((i & 32) != 0) {
            num2 = c1358700lSe.LLILZLL;
        }
        c1358700lSe.getClass();
        return new C1358700lSe(abstractC1623806Xk2, commentRethinkPopup, c291001Au2, upvoteStruct4, upvoteStruct3, num2);
    }
}
