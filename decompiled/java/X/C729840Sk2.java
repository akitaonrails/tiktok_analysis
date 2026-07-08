package X;

import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729840Sk2 implements InterfaceC613710O5h {
    public final UserStoriesResponse LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C729840Sk2) && Intrinsics.LJFF(this.LIZ, ((C729840Sk2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStoryData(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C729840Sk2(UserStoriesResponse userStoriesResponse) {
        this.LIZ = userStoriesResponse;
    }
}
