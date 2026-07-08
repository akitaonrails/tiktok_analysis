package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8S extends C0M8P {
    public final SocMediaResource LIZIZ;
    public final C1683130ttv LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M8S)) {
            return false;
        }
        C0M8S c0m8s = (C0M8S) obj;
        return Intrinsics.LJFF(this.LIZIZ, c0m8s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0m8s.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        C1683130ttv c1683130ttv = this.LIZJ;
        return iHashCode + (c1683130ttv == null ? 0 : c1683130ttv.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleMediaClicked(resource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickBounds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M8S(SocMediaResource socMediaResource, C1683130ttv c1683130ttv) {
        super(false);
        this.LIZIZ = socMediaResource;
        this.LIZJ = c1683130ttv;
    }
}
