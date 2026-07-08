package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00v1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C232100v1 implements InterfaceC0148002o {
    public final C291001Au<Aweme> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C232100v1) && Intrinsics.LJFF(this.LL, ((C232100v1) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeReplaceState(landscapeNewAweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C232100v1(C291001Au<? extends Aweme> c291001Au) {
        this.LL = c291001Au;
    }
}
