package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RWI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWI implements InterfaceC0148002o {
    public final C291001Au<Aweme> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C0RWI() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RWI)) {
            return false;
        }
        C0RWI c0rwi = (C0RWI) obj;
        return Intrinsics.LJFF(this.LL, c0rwi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0rwi.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Aweme> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialVideoTagState(bindTagEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showPublicFeedAnim=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0RWI(C291001Au<? extends Aweme> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }

    public static C0RWI LIZ(C0RWI c0rwi, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c0rwi.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c0rwi.LLILLJJLI;
        }
        c0rwi.getClass();
        return new C0RWI(c291001Au, c291001Au2);
    }
}
