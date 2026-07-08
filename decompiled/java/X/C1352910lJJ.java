package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lJJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352910lJJ implements InterfaceC636340Oxc<C1352910lJJ, CommentItem> {
    public final C627660Ojc<CommentItem> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final CommentItem LLILLL;
    public final C291001Au<Long> LLILZ;
    public final C291001Au<BaseResponse> LLILZIL;
    public final C1352270lIH LLILZLL;
    public final boolean LLIZ;

    public C1352910lJJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1352910lJJ)) {
            return false;
        }
        C1352910lJJ c1352910lJJ = (C1352910lJJ) obj;
        return Intrinsics.LJFF(this.LL, c1352910lJJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1352910lJJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1352910lJJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1352910lJJ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1352910lJJ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1352910lJJ.LLILZLL) && this.LLIZ == c1352910lJJ.LLIZ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        CommentItem commentItem = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (commentItem == null ? 0 : commentItem.hashCode())) * 31;
        C291001Au<Long> c291001Au2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<BaseResponse> c291001Au3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C1352270lIH c1352270lIH = this.LLILZLL;
        return ((iHashCode5 + (c1352270lIH != null ? c1352270lIH.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentListVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", openKeyboard=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", deleteComment=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", commentCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", commentError=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", replyCommentState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", commentPanelVisible=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<CommentItem> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<CommentItem> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1352910lJJ(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, null, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1352910lJJ(C627660Ojc<CommentItem> c627660Ojc, C291001Au<Unit> c291001Au, CommentItem commentItem, C291001Au<Long> c291001Au2, C291001Au<? extends BaseResponse> c291001Au3, C1352270lIH c1352270lIH, boolean z) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = commentItem;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = c1352270lIH;
        this.LLIZ = z;
    }

    public static C1352910lJJ LIZ(C1352910lJJ c1352910lJJ, C627660Ojc c627660Ojc, CommentItem commentItem, C291001Au c291001Au, C291001Au c291001Au2, boolean z, int i) {
        C291001Au<Unit> c291001Au3;
        boolean z2 = z;
        C291001Au c291001Au4 = c291001Au2;
        C291001Au c291001Au5 = c291001Au;
        CommentItem commentItem2 = commentItem;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1352910lJJ.LL;
        }
        C1352270lIH c1352270lIH = null;
        if ((i & 2) != 0) {
            c291001Au3 = c1352910lJJ.LLILLJJLI;
        } else {
            c291001Au3 = null;
        }
        if ((i & 4) != 0) {
            commentItem2 = c1352910lJJ.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c1352910lJJ.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au4 = c1352910lJJ.LLILZIL;
        }
        if ((i & 32) != 0) {
            c1352270lIH = c1352910lJJ.LLILZLL;
        }
        if ((i & 64) != 0) {
            z2 = c1352910lJJ.LLIZ;
        }
        c1352910lJJ.getClass();
        return new C1352910lJJ(c627660Ojc2, c291001Au3, commentItem2, c291001Au5, c291001Au4, c1352270lIH, z2);
    }
}
