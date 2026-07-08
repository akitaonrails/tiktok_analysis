package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767430U8n {
    public final LiveEffect LIZ;
    public final C0U45 LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C767430U8n)) {
            return false;
        }
        C767430U8n c767430U8n = (C767430U8n) obj;
        return Intrinsics.LJFF(this.LIZ, c767430U8n.LIZ) && Intrinsics.LJFF(this.LIZIZ, c767430U8n.LIZIZ) && this.LIZJ == c767430U8n.LIZJ && this.LIZLLL == c767430U8n.LIZLLL && this.LJ == c767430U8n.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0U45 c0u45 = this.LIZIZ;
        return ((((((iHashCode + (c0u45 == null ? 0 : c0u45.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadTask(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAddFirst=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isCancelDownloading=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isUseTTDownloader=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C767430U8n(LiveEffect liveEffect, C0U45 c0u45, boolean z, boolean z2, boolean z3) {
        this.LIZ = liveEffect;
        this.LIZIZ = c0u45;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
