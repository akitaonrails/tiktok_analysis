package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I8M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8M implements C0I8P {
    public final String LIZ;
    public final UrlModel LIZIZ = null;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I8M)) {
            return false;
        }
        C0I8M c0i8m = (C0I8M) obj;
        return Intrinsics.LJFF(this.LIZ, c0i8m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0i8m.LIZIZ) && this.LIZJ == c0i8m.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        UrlModel urlModel = this.LIZIZ;
        return ((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomVoice(durationText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", audioUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I8M(String str) {
        this.LIZ = str;
    }
}
