package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481470IuP extends AbstractC481570IuZ {
    public final RandomMatchResult LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C481470IuP) && Intrinsics.LJFF(this.LIZ, ((C481470IuP) obj).LIZ);
    }

    public final int hashCode() {
        RandomMatchResult randomMatchResult = this.LIZ;
        if (randomMatchResult == null) {
            return 0;
        }
        return randomMatchResult.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetRandomMatchStateSucceed(randomMatchResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481470IuP(RandomMatchResult randomMatchResult) {
        this.LIZ = randomMatchResult;
    }
}
