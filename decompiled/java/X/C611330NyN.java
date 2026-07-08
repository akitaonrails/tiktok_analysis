package X;

import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611330NyN {
    public final String LIZ;
    public final UserStory LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C611330NyN)) {
            return false;
        }
        C611330NyN c611330NyN = (C611330NyN) obj;
        return Intrinsics.LJFF(this.LIZ, c611330NyN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c611330NyN.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        UserStory userStory = this.LIZIZ;
        return iHashCode + (userStory == null ? 0 : userStory.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStoryUpdateOp(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userStory=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C611330NyN(UserStory userStory, String str) {
        this.LIZ = str;
        this.LIZIZ = userStory;
    }
}
