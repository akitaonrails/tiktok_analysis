package X;

import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O46, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O46 implements InterfaceC0148002o {
    public final AbstractC1623806Xk<BookDetail> LL;
    public final boolean LLILLJJLI;

    public C0O46() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O46)) {
            return false;
        }
        C0O46 c0o46 = (C0O46) obj;
        return Intrinsics.LJFF(this.LL, c0o46.LL) && this.LLILLJJLI == c0o46.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BookDetailState(bookDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFavorite=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0O46(int i) {
        this(C491101vh.LIZ, false);
    }

    public C0O46(AbstractC1623806Xk<BookDetail> abstractC1623806Xk, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = z;
    }

    public static C0O46 LIZ(C0O46 c0o46, AbstractC1623806Xk abstractC1623806Xk, boolean z, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c0o46.LL;
        }
        if ((i & 2) != 0) {
            z = c0o46.LLILLJJLI;
        }
        c0o46.getClass();
        return new C0O46(abstractC1623806Xk, z);
    }
}
