package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856890yQB implements Serializable {
    public static final int $stable = 0;
    public final String imageUrl;
    public final boolean isAIGC;
    public final String messageId;
    public final String shareDescStr;
    public final String shareId;
    public final String sharePageUrl;
    public final String shareTitleStr;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856890yQB)) {
            return false;
        }
        C1856890yQB c1856890yQB = (C1856890yQB) obj;
        return Intrinsics.LJFF(this.shareId, c1856890yQB.shareId) && Intrinsics.LJFF(this.imageUrl, c1856890yQB.imageUrl) && this.isAIGC == c1856890yQB.isAIGC && Intrinsics.LJFF(this.messageId, c1856890yQB.messageId) && Intrinsics.LJFF(this.sharePageUrl, c1856890yQB.sharePageUrl) && Intrinsics.LJFF(this.shareTitleStr, c1856890yQB.shareTitleStr) && Intrinsics.LJFF(this.shareDescStr, c1856890yQB.shareDescStr);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.shareId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + C786410Ut5.Z2(this.isAIGC)) * 31) + this.messageId.hashCode()) * 31) + this.sharePageUrl.hashCode()) * 31;
        String str = this.shareTitleStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shareDescStr;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageShareInfo(shareId=");
        sbLIZ.append(this.shareId);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", isAIGC=");
        sbLIZ.append(this.isAIGC);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.messageId);
        sbLIZ.append(", sharePageUrl=");
        sbLIZ.append(this.sharePageUrl);
        sbLIZ.append(", shareTitleStr=");
        sbLIZ.append(this.shareTitleStr);
        sbLIZ.append(", shareDescStr=");
        sbLIZ.append(this.shareDescStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isAIGC() {
        return this.isAIGC;
    }

    public C1856890yQB(String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        this.shareId = str;
        this.imageUrl = str2;
        this.isAIGC = z;
        this.messageId = str3;
        this.sharePageUrl = str4;
        this.shareTitleStr = str5;
        this.shareDescStr = str6;
    }
}
