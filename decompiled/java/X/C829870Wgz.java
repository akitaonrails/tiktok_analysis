package X;

import com.tiktok.ttm.ttmparam.ITTMParamData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829870Wgz extends ITTMParamData {
    public final Integer LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final Boolean LJFF;

    public C829870Wgz() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C829870Wgz)) {
            return false;
        }
        C829870Wgz c829870Wgz = (C829870Wgz) obj;
        return Intrinsics.LJFF(this.LIZIZ, c829870Wgz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c829870Wgz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c829870Wgz.LIZLLL) && Intrinsics.LJFF(this.LJ, c829870Wgz.LJ) && Intrinsics.LJFF(this.LJFF, c829870Wgz.LJFF);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    public final int hashCode() {
        Integer num = this.LIZIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.LIZJ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.LJFF;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserPortraitModel(dmActiveness=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lightInteractionSendRecently=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", actionBarClickRecently=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preshownStickerClickRecently=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterInboxRecently=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        Boolean bool;
        Integer num;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        if (str == null) {
            return -1L;
        }
        switch (str.hashCode()) {
            case -696382509:
                if (!str.equals("actionBarClickRecently") || (bool4 = this.LIZLLL) == null) {
                    return -1L;
                }
                return C169O.LIZJ(bool4.booleanValue());
            case -365486591:
                if (!str.equals("preshownStickerClickRecently") || (bool3 = this.LJ) == null) {
                    return -1L;
                }
                return C169O.LIZJ(bool3.booleanValue());
            case 97243606:
                if (!str.equals("enterInboxRecently") || (bool2 = this.LJFF) == null) {
                    return -1L;
                }
                return C169O.LIZJ(bool2.booleanValue());
            case 1467393990:
                if (!str.equals("dmActiveness") || (num = this.LIZIZ) == null) {
                    return -1L;
                }
                return num.intValue();
            case 2099394060:
                if (!str.equals("lightInteractionSendRecently") || (bool = this.LIZJ) == null) {
                    return -1L;
                }
                return C169O.LIZJ(bool.booleanValue());
            default:
                return -1L;
        }
    }

    public C829870Wgz(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num) {
        this.LIZIZ = num;
        this.LIZJ = bool;
        this.LIZLLL = bool2;
        this.LJ = bool3;
        this.LJFF = bool4;
    }
}
