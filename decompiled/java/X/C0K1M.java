package X;

import com.bytedance.android.pgcsdk.subscribe.model.SOPLBriefInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K1M, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1M {
    public final SOPLBriefInfo LIZ;
    public final int LIZIZ = 90;
    public final int LIZJ = 90;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K1M)) {
            return false;
        }
        C0K1M c0k1m = (C0K1M) obj;
        return Intrinsics.LJFF(this.LIZ, c0k1m.LIZ) && this.LIZIZ == c0k1m.LIZIZ && this.LIZJ == c0k1m.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyPlaylistCover(playlistBriefInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", widthDP=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", heightDP=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K1M(SOPLBriefInfo sOPLBriefInfo) {
        this.LIZ = sOPLBriefInfo;
    }
}
