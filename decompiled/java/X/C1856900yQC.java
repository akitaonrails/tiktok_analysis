package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856900yQC implements Serializable {
    public static final int $stable = 0;
    public final String fileHash;
    public final String messageId;
    public final String shareDescStr;
    public final String shareId;
    public final String sharePageUrl;
    public final String shareTitleStr;
    public final String thumbUrl;
    public final String videoUrl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856900yQC)) {
            return false;
        }
        C1856900yQC c1856900yQC = (C1856900yQC) obj;
        return Intrinsics.LJFF(this.shareId, c1856900yQC.shareId) && Intrinsics.LJFF(this.videoUrl, c1856900yQC.videoUrl) && Intrinsics.LJFF(this.thumbUrl, c1856900yQC.thumbUrl) && Intrinsics.LJFF(this.fileHash, c1856900yQC.fileHash) && Intrinsics.LJFF(this.messageId, c1856900yQC.messageId) && Intrinsics.LJFF(this.sharePageUrl, c1856900yQC.sharePageUrl) && Intrinsics.LJFF(this.shareTitleStr, c1856900yQC.shareTitleStr) && Intrinsics.LJFF(this.shareDescStr, c1856900yQC.shareDescStr);
    }

    public int hashCode() {
        int iHashCode = ((this.shareId.hashCode() * 31) + this.videoUrl.hashCode()) * 31;
        String str = this.thumbUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileHash;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.messageId.hashCode()) * 31) + this.sharePageUrl.hashCode()) * 31;
        String str3 = this.shareTitleStr;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shareDescStr;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoVideoShareInfo(shareId=");
        sbLIZ.append(this.shareId);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(this.videoUrl);
        sbLIZ.append(", thumbUrl=");
        sbLIZ.append(this.thumbUrl);
        sbLIZ.append(", fileHash=");
        sbLIZ.append(this.fileHash);
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

    public C1856900yQC(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.shareId = str;
        this.videoUrl = str2;
        this.thumbUrl = str3;
        this.fileHash = str4;
        this.messageId = str5;
        this.sharePageUrl = str6;
        this.shareTitleStr = str7;
        this.shareDescStr = str8;
    }
}
