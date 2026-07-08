package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344400l5a implements InterfaceC1891350zJl {
    public final Comment LL;
    public final CommentContextSource LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC586200Myw LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1344400l5a)) {
            return false;
        }
        C1344400l5a c1344400l5a = (C1344400l5a) obj;
        return Intrinsics.LJFF(this.LL, c1344400l5a.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1344400l5a.LLILLJJLI) && this.LLILLL == c1344400l5a.LLILLL && this.LLILZ == c1344400l5a.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        CommentContextSource commentContextSource = this.LLILLJJLI;
        return ((((iHashCode + (commentContextSource == null ? 0 : commentContextSource.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentTranslationCTABannerItem(comment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contextSource=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMarginBottom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C1344400l5a(Comment comment, CommentContextSource commentContextSource, boolean z) {
        this(comment, commentContextSource, z, EnumC586200Myw.DEFAULT);
    }

    public C1344400l5a(Comment comment, CommentContextSource commentContextSource, boolean z, EnumC586200Myw enumC586200Myw) {
        this.LL = comment;
        this.LLILLJJLI = commentContextSource;
        this.LLILLL = z;
        this.LLILZ = enumC586200Myw;
    }
}
