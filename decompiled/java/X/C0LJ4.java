package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJ4 {
    public final List<C563580M8m> LIZ;
    public final List<SocMediaResource> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LJ4)) {
            return false;
        }
        C0LJ4 c0lj4 = (C0LJ4) obj;
        return Intrinsics.LJFF(this.LIZ, c0lj4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lj4.LIZIZ) && this.LIZJ == c0lj4.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WarmUpFirstScreenResult(mediaBuckets=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allMediaList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFinished=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LJ4(List<C563580M8m> list, List<SocMediaResource> list2, boolean z) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = z;
    }
}
