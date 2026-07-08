package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bMX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970510bMX extends AbstractC970550bMb {
    public final CompetitionInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C970510bMX) && Intrinsics.LJFF(this.LIZ, ((C970510bMX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fallback(info=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C970510bMX(CompetitionInfo competitionInfo) {
        this.LIZ = competitionInfo;
    }
}
