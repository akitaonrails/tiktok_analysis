package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00v7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C232700v7 implements InterfaceC0148002o {
    public final C291001Au<Aweme> LL;
    public final C291001Au<Video> LLILLJJLI;

    public C232700v7() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232700v7)) {
            return false;
        }
        C232700v7 c232700v7 = (C232700v7) obj;
        return Intrinsics.LJFF(this.LL, c232700v7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c232700v7.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Aweme> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Video> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeExitResetState(landscapeExitCurAweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", resetVideo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C232700v7(Object obj) {
        this.LL = null;
        this.LLILLJJLI = null;
    }
}
