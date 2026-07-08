package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388210mEF implements Serializable {
    public static final int $stable = 0;
    public final int messageCount;
    public final String shareDescStr;
    public final String shareId;
    public final String sharePageUrl;
    public final String shareTitleStr;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1388210mEF)) {
            return false;
        }
        C1388210mEF c1388210mEF = (C1388210mEF) obj;
        return Intrinsics.LJFF(this.shareId, c1388210mEF.shareId) && this.messageCount == c1388210mEF.messageCount && Intrinsics.LJFF(this.sharePageUrl, c1388210mEF.sharePageUrl) && Intrinsics.LJFF(this.shareTitleStr, c1388210mEF.shareTitleStr) && Intrinsics.LJFF(this.shareDescStr, c1388210mEF.shareDescStr);
    }

    public int hashCode() {
        int iHashCode = ((((this.shareId.hashCode() * 31) + this.messageCount) * 31) + this.sharePageUrl.hashCode()) * 31;
        String str = this.shareTitleStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shareDescStr;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoLongImageShareInfo(shareId=");
        sbLIZ.append(this.shareId);
        sbLIZ.append(", messageCount=");
        sbLIZ.append(this.messageCount);
        sbLIZ.append(", sharePageUrl=");
        sbLIZ.append(this.sharePageUrl);
        sbLIZ.append(", shareTitleStr=");
        sbLIZ.append(this.shareTitleStr);
        sbLIZ.append(", shareDescStr=");
        sbLIZ.append(this.shareDescStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1388210mEF(String str, int i, String str2, String str3, String str4) {
        this.shareId = str;
        this.messageCount = i;
        this.sharePageUrl = str2;
        this.shareTitleStr = str3;
        this.shareDescStr = str4;
    }
}
