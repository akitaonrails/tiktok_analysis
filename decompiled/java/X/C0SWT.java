package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SWT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SWT extends C720930SPr {
    public final Comment LLILLJJLI;
    public final boolean LLILLL;
    public final C0SQ1 LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SWT)) {
            return false;
        }
        C0SWT c0swt = (C0SWT) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c0swt.LLILLJJLI) && this.LLILLL == c0swt.LLILLL && Intrinsics.LJFF(this.LLILZ, c0swt.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LLILLJJLI.hashCode() * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C0SQ1 c0sq1 = this.LLILZ;
        return iHashCode + (c0sq1 == null ? 0 : c0sq1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReactionBubbleCommentItem(comment=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", forceInsert=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mobEventParam=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C720930SPr, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0SWT) {
            if (Intrinsics.LJFF(((C0SWT) interfaceC1891350zJl).LLILLJJLI.getText(), this.LLILLJJLI.getText()) && Intrinsics.LJFF(interfaceC1891350zJl, this)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.C720930SPr, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0SWT(Comment comment, boolean z, C0SQ1 c0sq1) {
        super(1);
        this.LLILLJJLI = comment;
        this.LLILLL = z;
        this.LLILZ = c0sq1;
    }
}
