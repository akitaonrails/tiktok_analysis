package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563720M9a extends C0M8P {
    public final long LIZIZ;
    public final SocMediaResource LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C563720M9a)) {
            return false;
        }
        C563720M9a c563720M9a = (C563720M9a) obj;
        return C1378605aS.LIZJ(this.LIZIZ, c563720M9a.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c563720M9a.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleMediaLongPressed(offset=");
        sbLIZ.append((Object) C1378605aS.LJIIIIZZ(this.LIZIZ));
        sbLIZ.append(", resource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public C563720M9a(long j, SocMediaResource socMediaResource) {
        super(false);
        this.LIZIZ = j;
        this.LIZJ = socMediaResource;
    }
}
