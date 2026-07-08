package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745480TMc extends AbstractC751690TeB {
    public final Aweme LL;

    @Override // X.AbstractC751690TeB
    public final String LIZ() {
        return "Low End Info";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C745480TMc) && Intrinsics.LJFF(this.LL, ((C745480TMc) obj).LL);
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
        sbLIZ.append("CommentLowEndInfoData(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C745480TMc(Aweme aweme) {
        this.LL = aweme;
    }
}
