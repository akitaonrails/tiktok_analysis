package X;

import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SOPBriefInfo;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K1K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1K {
    public final SOVBriefInfo LIZ;
    public final SOPBriefInfo LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final PGCGetSubPrivilegeDetailResponse.Data LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K1K)) {
            return false;
        }
        C0K1K c0k1k = (C0K1K) obj;
        return Intrinsics.LJFF(this.LIZ, c0k1k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k1k.LIZIZ) && this.LIZJ == c0k1k.LIZJ && this.LIZLLL == c0k1k.LIZLLL && Intrinsics.LJFF(this.LJ, c0k1k.LJ);
    }

    public final int hashCode() {
        SOVBriefInfo sOVBriefInfo = this.LIZ;
        int iHashCode = (sOVBriefInfo == null ? 0 : sOVBriefInfo.hashCode()) * 31;
        SOPBriefInfo sOPBriefInfo = this.LIZIZ;
        return ((((((iHashCode + (sOPBriefInfo != null ? sOPBriefInfo.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyVideoCover(sovBriefInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subOnlyPostsBriefInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", widthDP=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", heightDP=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", subPrivilegeDetailResponse=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K1K(SOVBriefInfo sOVBriefInfo, SOPBriefInfo sOPBriefInfo, int i, int i2, PGCGetSubPrivilegeDetailResponse.Data data) {
        this.LIZ = sOVBriefInfo;
        this.LIZIZ = sOPBriefInfo;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = data;
    }
}
