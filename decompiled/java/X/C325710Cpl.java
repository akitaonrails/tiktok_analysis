package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325710Cpl extends AbstractC325730Cpn {
    public final Aweme LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C325710Cpl) && Intrinsics.LJFF(this.LIZ, ((C325710Cpl) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCover(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C325710Cpl(Aweme aweme) {
        this.LIZ = aweme;
    }
}
