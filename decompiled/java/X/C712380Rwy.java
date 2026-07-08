package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712380Rwy implements InterfaceC0148002o {
    public final C291001Au<Aweme> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C712380Rwy)) {
            return false;
        }
        C712380Rwy c712380Rwy = (C712380Rwy) obj;
        return Intrinsics.LJFF(this.LL, c712380Rwy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c712380Rwy.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeProfileListSelectState(selectedAweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFirstShow=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C712380Rwy(C291001Au<? extends Aweme> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
