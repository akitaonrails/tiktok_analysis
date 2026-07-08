package X;

import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O43, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O43 implements InterfaceC0148002o {
    public final AbstractC1623806Xk<MovieDetail> LL;
    public final boolean LLILLJJLI;

    public C0O43() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O43)) {
            return false;
        }
        C0O43 c0o43 = (C0O43) obj;
        return Intrinsics.LJFF(this.LL, c0o43.LL) && this.LLILLJJLI == c0o43.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovieDetailState(movieDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFavorite=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0O43(int i) {
        this(C491101vh.LIZ, false);
    }

    public C0O43(AbstractC1623806Xk<MovieDetail> abstractC1623806Xk, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = z;
    }

    public static C0O43 LIZ(C0O43 c0o43, AbstractC1623806Xk abstractC1623806Xk, boolean z, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c0o43.LL;
        }
        if ((i & 2) != 0) {
            z = c0o43.LLILLJJLI;
        }
        c0o43.getClass();
        return new C0O43(abstractC1623806Xk, z);
    }
}
