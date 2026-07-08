package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334410D9b implements Serializable {
    public final String currentPriceText;
    public final String discountText;
    public final String estDeliveryText;
    public final String imageUrl;
    public final String orderTitle;
    public final String originalPriceText;
    public final int quantity;
    public final String shippingInfoText;
    public final String storeName;
    public final String title;
    public final String variantText;

    public final C334410D9b copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10) {
        return new C334410D9b(str, str2, str3, str4, str5, str6, str7, str8, i, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334410D9b)) {
            return false;
        }
        C334410D9b c334410D9b = (C334410D9b) obj;
        return Intrinsics.LJFF(this.storeName, c334410D9b.storeName) && Intrinsics.LJFF(this.orderTitle, c334410D9b.orderTitle) && Intrinsics.LJFF(this.imageUrl, c334410D9b.imageUrl) && Intrinsics.LJFF(this.title, c334410D9b.title) && Intrinsics.LJFF(this.variantText, c334410D9b.variantText) && Intrinsics.LJFF(this.currentPriceText, c334410D9b.currentPriceText) && Intrinsics.LJFF(this.originalPriceText, c334410D9b.originalPriceText) && Intrinsics.LJFF(this.discountText, c334410D9b.discountText) && this.quantity == c334410D9b.quantity && Intrinsics.LJFF(this.shippingInfoText, c334410D9b.shippingInfoText) && Intrinsics.LJFF(this.estDeliveryText, c334410D9b.estDeliveryText);
    }

    public int hashCode() {
        int iHashCode = this.storeName.hashCode() * 31;
        String str = this.orderTitle;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.variantText.hashCode()) * 31;
        String str2 = this.currentPriceText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalPriceText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discountText;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.quantity) * 31;
        String str5 = this.shippingInfoText;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.estDeliveryText;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "CheckoutProductViewState(storeName=" + this.storeName + ", orderTitle=" + this.orderTitle + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", variantText=" + this.variantText + ", currentPriceText=" + this.currentPriceText + ", originalPriceText=" + this.originalPriceText + ", discountText=" + this.discountText + ", quantity=" + this.quantity + ", shippingInfoText=" + this.shippingInfoText + ", estDeliveryText=" + this.estDeliveryText + ')';
    }

    public C334410D9b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10) {
        this.storeName = str;
        this.orderTitle = str2;
        this.imageUrl = str3;
        this.title = str4;
        this.variantText = str5;
        this.currentPriceText = str6;
        this.originalPriceText = str7;
        this.discountText = str8;
        this.quantity = i;
        this.shippingInfoText = str9;
        this.estDeliveryText = str10;
    }
}
