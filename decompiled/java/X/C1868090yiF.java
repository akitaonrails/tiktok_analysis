package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868090yiF extends AbstractC1868100yiG {
    public final Aweme LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868090yiF) && Intrinsics.LJFF(this.LIZ, ((C1868090yiF) obj).LIZ);
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
        sbLIZ.append("EditModel(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868090yiF(Aweme aweme) {
        this.LIZ = aweme;
    }
}
