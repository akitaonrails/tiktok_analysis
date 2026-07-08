package X;

import com.ss.android.ugc.aweme.comment.poll.repository.CreatePollRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lA0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347140lA0 {
    public final String LIZ;
    public final CreatePollRequest LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347140lA0)) {
            return false;
        }
        C1347140lA0 c1347140lA0 = (C1347140lA0) obj;
        return Intrinsics.LJFF(this.LIZ, c1347140lA0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1347140lA0.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingPublishRequest(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", request=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1347140lA0(String str, CreatePollRequest createPollRequest) {
        this.LIZ = str;
        this.LIZIZ = createPollRequest;
    }
}
