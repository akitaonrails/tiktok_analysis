package X;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454850HsZ {
    public final C454900Hse LIZ;
    public final C0252006o LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, String> LJFF;
    public final Bundle LJI;

    public C454850HsZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454850HsZ)) {
            return false;
        }
        C454850HsZ c454850HsZ = (C454850HsZ) obj;
        return Intrinsics.LJFF(this.LIZ, c454850HsZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c454850HsZ.LIZIZ) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LIZJ, c454850HsZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c454850HsZ.LIZLLL) && Intrinsics.LJFF(this.LJ, c454850HsZ.LJ) && Intrinsics.LJFF(this.LJFF, c454850HsZ.LJFF) && Intrinsics.LJFF(this.LJI, c454850HsZ.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0252006o c0252006o = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (c0252006o == null ? 0 : c0252006o.hashCode())) * 31 * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.LJFF;
        return ((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedStickerClickMessage(stickerRef=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", initialPreview=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initialFavoriteState=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", eventTrackingMap=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454850HsZ(C454900Hse c454900Hse, C0252006o c0252006o, String str, String str2, String str3, Bundle bundle, int i) {
        c0252006o = (i & 2) != 0 ? null : c0252006o;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        bundle = (i & 128) != 0 ? new Bundle() : bundle;
        this.LIZ = c454900Hse;
        this.LIZIZ = c0252006o;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = null;
        this.LJI = bundle;
    }
}
