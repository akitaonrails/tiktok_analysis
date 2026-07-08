package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MN4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MN4 extends C0MMK {
    public final Comment LLILLL;
    public final Bitmap LLILZ;
    public final C0MNH LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;

    public C0MN4() {
        this(null, null, C0MNH.POST, "", false, true, false);
    }

    public final C0MN4 copy(Comment comment, Bitmap bitmap, C0MNH c0mnh, String str, boolean z, boolean z2, boolean z3) {
        return new C0MN4(comment, bitmap, c0mnh, str, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MN4)) {
            return false;
        }
        C0MN4 c0mn4 = (C0MN4) obj;
        return Intrinsics.LJFF(this.LLILLL, c0mn4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0mn4.LLILZ) && this.LLILZIL == c0mn4.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0mn4.LLILZLL) && this.LLIZ == c0mn4.LLIZ && this.LLIZLLLIL == c0mn4.LLIZLLLIL && this.LLJ == c0mn4.LLJ;
    }

    public int hashCode() {
        Comment comment = this.LLILLL;
        int iHashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        Bitmap bitmap = this.LLILZ;
        int iHashCode2 = (((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        String str = this.LLILZLL;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentForwardConfig(commentInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", coverBitmap=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", forwardTo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", commentPostMethod=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", postTextMode=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", autoSaveDraft=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", enableSmallVideoCard=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getAutoSaveDraft() {
        return this.LLIZLLLIL;
    }

    public final Comment getCommentInfo() {
        return this.LLILLL;
    }

    public final String getCommentPostMethod() {
        return this.LLILZLL;
    }

    public final Bitmap getCoverBitmap() {
        return this.LLILZ;
    }

    public final boolean getEnableSmallVideoCard() {
        return this.LLJ;
    }

    public final C0MNH getForwardTo() {
        return this.LLILZIL;
    }

    public final boolean getPostTextMode() {
        return this.LLIZ;
    }

    public C0MN4(Comment comment, Bitmap bitmap, C0MNH c0mnh, String str, boolean z, boolean z2, boolean z3) {
        super(null, null, null);
        this.LLILLL = comment;
        this.LLILZ = bitmap;
        this.LLILZIL = c0mnh;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
    }
}
