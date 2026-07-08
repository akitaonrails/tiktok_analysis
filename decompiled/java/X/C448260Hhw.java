package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448260Hhw implements InterfaceC0148002o {
    public final Comment LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;

    public C448260Hhw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448260Hhw)) {
            return false;
        }
        C448260Hhw c448260Hhw = (C448260Hhw) obj;
        return Intrinsics.LJFF(this.LL, c448260Hhw.LL) && this.LLILLJJLI == c448260Hhw.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c448260Hhw.LLILLL) && this.LLILZ == c448260Hhw.LLILZ;
    }

    public final int hashCode() {
        Comment comment = this.LL;
        int iHashCode = (((comment == null ? 0 : comment.hashCode()) * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchDetailCommentState(comment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", outCid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", startShowTime=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C448260Hhw(int i) {
        this(null, 0, null, 0L);
    }

    public C448260Hhw(Comment comment, int i, String str, long j) {
        this.LL = comment;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = j;
    }

    public static C448260Hhw LIZ(C448260Hhw c448260Hhw, Comment comment, int i, String str, long j, int i2) {
        long j2 = j;
        String str2 = str;
        int i3 = i;
        Comment comment2 = comment;
        if ((i2 & 1) != 0) {
            comment2 = c448260Hhw.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c448260Hhw.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str2 = c448260Hhw.LLILLL;
        }
        if ((i2 & 8) != 0) {
            j2 = c448260Hhw.LLILZ;
        }
        c448260Hhw.getClass();
        return new C448260Hhw(comment2, i3, str2, j2);
    }
}
