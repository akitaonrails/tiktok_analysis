package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672110QXx implements Serializable {
    public String adCampaignId;
    public String adCreativeId;
    public String adDeepLinkType;
    public String adPreviousPage;
    public String adUrl;

    public C672110QXx() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C672110QXx)) {
            return false;
        }
        C672110QXx c672110QXx = (C672110QXx) obj;
        return Intrinsics.LJFF(this.adUrl, c672110QXx.adUrl) && Intrinsics.LJFF(this.adDeepLinkType, c672110QXx.adDeepLinkType) && Intrinsics.LJFF(this.adCreativeId, c672110QXx.adCreativeId) && Intrinsics.LJFF(this.adCampaignId, c672110QXx.adCampaignId) && Intrinsics.LJFF(this.adPreviousPage, c672110QXx.adPreviousPage);
    }

    public int hashCode() {
        String str = this.adUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adDeepLinkType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adCreativeId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adCampaignId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.adPreviousPage;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeepLinkAdFromMallModel(adUrl=");
        sbLIZ.append(this.adUrl);
        sbLIZ.append(", adDeepLinkType=");
        sbLIZ.append(this.adDeepLinkType);
        sbLIZ.append(", adCreativeId=");
        sbLIZ.append(this.adCreativeId);
        sbLIZ.append(", adCampaignId=");
        sbLIZ.append(this.adCampaignId);
        sbLIZ.append(", adPreviousPage=");
        sbLIZ.append(this.adPreviousPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAdCampaignId(String str) {
        this.adCampaignId = str;
    }

    public final void setAdCreativeId(String str) {
        this.adCreativeId = str;
    }

    public final void setAdDeepLinkType(String str) {
        this.adDeepLinkType = str;
    }

    public final void setAdPreviousPage(String str) {
        this.adPreviousPage = str;
    }

    public final void setAdUrl(String str) {
        this.adUrl = str;
    }

    public C672110QXx(String str, String str2, String str3, String str4, String str5) {
        this.adUrl = str;
        this.adDeepLinkType = str2;
        this.adCreativeId = str3;
        this.adCampaignId = str4;
        this.adPreviousPage = str5;
    }
}
