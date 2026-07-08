package X;

import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798060VSi {
    public final FriendsFeedResponse LIZ;
    public final boolean LIZIZ;

    public C798060VSi() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C798060VSi)) {
            return false;
        }
        C798060VSi c798060VSi = (C798060VSi) obj;
        return Intrinsics.LJFF(this.LIZ, c798060VSi.LIZ) && this.LIZIZ == c798060VSi.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsFeedResponseWrapper(resp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C798060VSi(FriendsFeedResponse friendsFeedResponse, boolean z) {
        this.LIZ = friendsFeedResponse;
        this.LIZIZ = z;
    }
}
