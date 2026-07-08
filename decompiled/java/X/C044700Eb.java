package X;

import com.bytedance.android.livesdk.replay.proto.Caption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C044700Eb {
    public final long LIZ;
    public final List<Caption> LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C044700Eb)) {
            return false;
        }
        C044700Eb c044700Eb = (C044700Eb) obj;
        return this.LIZ == c044700Eb.LIZ && Intrinsics.LJFF(this.LIZIZ, c044700Eb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c044700Eb.LIZJ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        List<Caption> list = this.LIZIZ;
        int iHashCode = (iY2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.LIZJ;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionsStatus(fragmentId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", captions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C044700Eb(long j, List<Caption> list, Integer num) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = num;
    }
}
