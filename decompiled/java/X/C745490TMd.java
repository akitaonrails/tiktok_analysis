package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745490TMd extends AbstractC751690TeB {
    public final Aweme LL;

    @Override // X.AbstractC751690TeB
    public final String LIZ() {
        return "Top Bar Info";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C745490TMd) && Intrinsics.LJFF(this.LL, ((C745490TMd) obj).LL);
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
        sbLIZ.append("CommentTopBarInfoData(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C745490TMd(Aweme aweme) {
        this.LL = aweme;
    }
}
