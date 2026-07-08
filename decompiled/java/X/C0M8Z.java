package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8Z extends C0M8P {
    public final SocMediaResource LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0M8Z) && Intrinsics.LJFF(this.LIZIZ, ((C0M8Z) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreSelectSingleMediaClicked(resource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M8Z(SocMediaResource socMediaResource) {
        super(true);
        this.LIZIZ = socMediaResource;
    }
}
