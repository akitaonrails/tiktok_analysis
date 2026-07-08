package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970840bN4 extends AbstractC970850bN5 {
    public final BattleInfoResponse LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C970840bN4) && Intrinsics.LJFF(this.LIZ, ((C970840bN4) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Match(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C970840bN4(BattleInfoResponse battleInfoResponse) {
        this.LIZ = battleInfoResponse;
    }
}
