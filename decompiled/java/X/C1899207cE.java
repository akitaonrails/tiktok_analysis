package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899207cE {
    public final C1899107cD LIZ;
    public final BulletinUploadAuthKeyResponse LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1899207cE)) {
            return false;
        }
        C1899207cE c1899207cE = (C1899207cE) obj;
        return Intrinsics.LJFF(this.LIZ, c1899207cE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1899207cE.LIZIZ) && this.LIZJ == c1899207cE.LIZJ && this.LIZLLL == c1899207cE.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entry(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lifetimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", anchorElapsed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1899207cE(C1899107cD c1899107cD, BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse, long j, long j2) {
        this.LIZ = c1899107cD;
        this.LIZIZ = bulletinUploadAuthKeyResponse;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
