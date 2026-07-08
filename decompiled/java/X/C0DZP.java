package X;

import com.ss.android.ugc.aweme.social.thought.api.model.FriendsThoughtFeedResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DZP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZP implements C0DZV {
    public final FriendsThoughtFeedResponse LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DZP) && Intrinsics.LJFF(this.LIZ, ((C0DZP) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DZP(FriendsThoughtFeedResponse friendsThoughtFeedResponse) {
        this.LIZ = friendsThoughtFeedResponse;
    }
}
