package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868050yiB extends AbstractC1868060yiC {
    public final Aweme LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868050yiB) && Intrinsics.LJFF(this.LIZ, ((C1868050yiB) obj).LIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemePost(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868050yiB(Aweme aweme) {
        this.LIZ = aweme;
    }
}
