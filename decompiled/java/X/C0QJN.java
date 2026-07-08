package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QJN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QJN implements Serializable {
    public String enterGroupId;
    public String isEcomSearch;
    public String originIsMallTab;
    public String productPanelType;
    public String srcAnchorProductId;
    public final String srcMaterialId;

    public C0QJN() {
        this("", null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QJN)) {
            return false;
        }
        C0QJN c0qjn = (C0QJN) obj;
        return Intrinsics.LJFF(this.srcMaterialId, c0qjn.srcMaterialId) && Intrinsics.LJFF(this.srcAnchorProductId, c0qjn.srcAnchorProductId) && Intrinsics.LJFF(this.productPanelType, c0qjn.productPanelType) && Intrinsics.LJFF(this.isEcomSearch, c0qjn.isEcomSearch) && Intrinsics.LJFF(this.enterGroupId, c0qjn.enterGroupId) && Intrinsics.LJFF(this.originIsMallTab, c0qjn.originIsMallTab);
    }

    public int hashCode() {
        int iHashCode = this.srcMaterialId.hashCode() * 31;
        String str = this.srcAnchorProductId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productPanelType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isEcomSearch;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterGroupId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originIsMallTab;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleSearchEcommerceModel(srcMaterialId=");
        sbLIZ.append(this.srcMaterialId);
        sbLIZ.append(", srcAnchorProductId=");
        sbLIZ.append(this.srcAnchorProductId);
        sbLIZ.append(", productPanelType=");
        sbLIZ.append(this.productPanelType);
        sbLIZ.append(", isEcomSearch=");
        sbLIZ.append(this.isEcomSearch);
        sbLIZ.append(", enterGroupId=");
        sbLIZ.append(this.enterGroupId);
        sbLIZ.append(", originIsMallTab=");
        sbLIZ.append(this.originIsMallTab);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String isEcomSearch() {
        return this.isEcomSearch;
    }

    public final void setEcomSearch(String str) {
        this.isEcomSearch = str;
    }

    public final void setEnterGroupId(String str) {
        this.enterGroupId = str;
    }

    public final void setOriginIsMallTab(String str) {
        this.originIsMallTab = str;
    }

    public final void setProductPanelType(String str) {
        this.productPanelType = str;
    }

    public final void setSrcAnchorProductId(String str) {
        this.srcAnchorProductId = str;
    }

    public C0QJN(String str, String str2, String str3, String str4, String str5, String str6) {
        this.srcMaterialId = str;
        this.srcAnchorProductId = str2;
        this.productPanelType = str3;
        this.isEcomSearch = str4;
        this.enterGroupId = str5;
        this.originIsMallTab = str6;
    }
}
