package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTS implements InterfaceC1891350zJl {
    public final Comment LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final UrlModel LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;
    public int LLJI;
    public final String LLJIJIL;
    public final EnumC620990OXh LLJILJIL;
    public final boolean LLJILJILJ;

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        UrlModel urlModel = this.LLILZIL;
        int iHashCode2 = (((((((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        String str = this.LLJ;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJI) * 31;
        String str2 = this.LLJIJIL;
        return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLJILJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJILJ);
    }

    public final String toString() {
        return "BulletinCommentSheetItem(comment=" + this.LL + ", bbId=" + this.LLILLJJLI + ", bbItemId=" + this.LLILLL + ", isIdentityCreator=" + this.LLILZ + ", creatorAvatar=" + this.LLILZIL + ", enableComment=" + this.LLILZLL + ", isChannelOpen=" + this.LLIZ + ", enableAction=" + this.LLIZLLLIL + ", contentType=" + this.LLJ + ", position=" + this.LLJI + ", enterFrom=" + this.LLJIJIL + ", publishState=" + this.LLJILJIL + ", alwaysShow=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0OTS) {
            C0OTS c0ots = (C0OTS) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c0ots.LL.getCid(), this.LL.getCid()) && Intrinsics.LJFF(c0ots.LL.getUser(), this.LL.getUser()) && c0ots.LL.getLabelType() == this.LL.getLabelType() && Intrinsics.LJFF(c0ots.LL.getLabelText(), this.LL.getLabelText()) && Intrinsics.LJFF(c0ots.LL.getText(), this.LL.getText()) && c0ots.LL.getCreateTime() == this.LL.getCreateTime() && c0ots.LL.isUserDigged() == this.LL.isUserDigged() && c0ots.LL.getDiggCount() == this.LL.getDiggCount()) {
                Comment comment = c0ots.LL;
                if (comment.isAuthorDigged == this.LL.isAuthorDigged && c0ots.LLJILJIL == this.LLJILJIL && Intrinsics.LJFF(comment.getReplyToNickName(), this.LL.getReplyToNickName()) && Intrinsics.LJFF(c0ots.LL.getReplyToReplyCommentId(), this.LL.getReplyToReplyCommentId())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0OTS) {
            if (C703302op.LIZ(this.LL.getFakeId())) {
                C0OTS c0ots = (C0OTS) interfaceC1891350zJl;
                if (C703302op.LIZ(c0ots.LL.getFakeId())) {
                    return Intrinsics.LJFF(c0ots.LL.getFakeId(), this.LL.getFakeId());
                }
            }
            return Intrinsics.LJFF(((C0OTS) interfaceC1891350zJl).LL.getCid(), this.LL.getCid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0OTS) {
            return areContentsTheSame((InterfaceC1891350zJl) obj);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (interfaceC1891350zJl instanceof C0OTS) {
            C0OTS c0ots = (C0OTS) interfaceC1891350zJl;
            boolean z5 = !Intrinsics.LJFF(c0ots.LL.getUser(), this.LL.getUser());
            if (c0ots.LL.getLabelType() == this.LL.getLabelType() && Intrinsics.LJFF(c0ots.LL.getLabelText(), this.LL.getLabelText()) && Intrinsics.LJFF(c0ots.LL.getReplyToNickName(), this.LL.getReplyToNickName()) && Intrinsics.LJFF(c0ots.LL.getReplyToReplyCommentId(), this.LL.getReplyToReplyCommentId())) {
                z = false;
            } else {
                z = true;
            }
            boolean z6 = !Intrinsics.LJFF(c0ots.LL.getText(), this.LL.getText());
            if (c0ots.LL.getCreateTime() != this.LL.getCreateTime()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c0ots.LL.isUserDigged() == this.LL.isUserDigged() && c0ots.LL.getDiggCount() == this.LL.getDiggCount() && c0ots.LL.isAuthorDigged == this.LL.isAuthorDigged) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (c0ots.LLJILJIL != this.LLJILJIL) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new C0OY1(z5, z, z6, z2, z3, z4);
        }
        return null;
    }

    public C0OTS(Comment comment, long j, long j2, boolean z, UrlModel urlModel, boolean z2, boolean z3, boolean z4, String str, int i, String str2, EnumC620990OXh enumC620990OXh, boolean z5) {
        this.LL = comment;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = z;
        this.LLILZIL = urlModel;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
        this.LLJ = str;
        this.LLJI = i;
        this.LLJIJIL = str2;
        this.LLJILJIL = enumC620990OXh;
        this.LLJILJILJ = z5;
    }
}
