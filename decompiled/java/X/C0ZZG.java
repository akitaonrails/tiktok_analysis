package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZG implements C0ZZL {
    public final UrlModel LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZG)) {
            return false;
        }
        C0ZZG c0zzg = (C0ZZG) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzg.LIZ) && this.LIZIZ == c0zzg.LIZIZ && this.LIZJ == c0zzg.LIZJ;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LIZ;
        return ((((urlModel == null ? 0 : urlModel.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WithMediaUIState(thumbnail=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", marginBottom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZZG(int i, UrlModel urlModel, boolean z) {
        this.LIZ = urlModel;
        this.LIZIZ = z;
        this.LIZJ = i;
    }
}
