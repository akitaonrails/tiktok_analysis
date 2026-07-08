package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2150208bc implements InterfaceC2150408be {
    public final BulletinUploadAuthKeyResponse LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2150208bc)) {
            return false;
        }
        C2150208bc c2150208bc = (C2150208bc) obj;
        return Intrinsics.LJFF(this.LIZ, c2150208bc.LIZ) && this.LIZIZ == c2150208bc.LIZIZ && this.LIZJ == c2150208bc.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", attempt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2150208bc(BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse, int i, boolean z) {
        this.LIZ = bulletinUploadAuthKeyResponse;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
