package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158240gFK implements InterfaceC0148002o {
    public final Aweme LL;

    public C1158240gFK() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158240gFK) && Intrinsics.LJFF(this.LL, ((C1158240gFK) obj).LL);
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCollectBottomBarState(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158240gFK(Aweme aweme) {
        this.LL = aweme;
    }
}
