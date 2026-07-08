package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00v8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C232800v8 implements InterfaceC0148002o {
    public final C291001Au<List<Aweme>> LL;
    public final C291001Au<Aweme> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232800v8)) {
            return false;
        }
        C232800v8 c232800v8 = (C232800v8) obj;
        return Intrinsics.LJFF(this.LL, c232800v8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c232800v8.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeInnerSyncState(LandscapeInnerSyncEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", landscapeCurAweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C232800v8(C291001Au<? extends List<Aweme>> c291001Au, C291001Au<? extends Aweme> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
