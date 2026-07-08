package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ad.feed.experiment.VSAProductIdRecordSetting;
import com.ss.android.ugc.aweme.ad.feed.model.OleDeliveryInfo;
import com.ss.android.ugc.aweme.ad.feed.model.Product;
import com.ss.android.ugc.aweme.ad.feed.model.ProductIntent;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019570cdf {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS204S0000000_16.get$arr$(371));
    public OleDeliveryInfo LIZIZ;
    public String LIZJ;

    public final void LIZ(String str, String str2) {
        if (!((VSAProductIdRecordSetting.VSAProductIdRecordParam) VSAProductIdRecordSetting.LIZIZ.getValue()).enable || str == null || str2 == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C406401i2(this, str, str2, null), 3);
    }

    public final void LIZIZ(String str, String str2) {
        C2354409Kk<ProductIntent> c2354409Kk;
        C2354409Kk<ProductIntent> c2354409Kk2;
        ProductIntent productIntent = new ProductIntent(new Product(str), str2, Long.valueOf(System.currentTimeMillis()));
        if (this.LIZIZ == null) {
            this.LIZIZ = new OleDeliveryInfo(new C2354409Kk());
        }
        OleDeliveryInfo oleDeliveryInfo = this.LIZIZ;
        if (oleDeliveryInfo != null && (c2354409Kk2 = oleDeliveryInfo.productIntents) != null) {
            c2354409Kk2.setMaxSize(((VSAProductIdRecordSetting.VSAProductIdRecordParam) VSAProductIdRecordSetting.LIZIZ.getValue()).maxCount);
        }
        OleDeliveryInfo oleDeliveryInfo2 = this.LIZIZ;
        if (oleDeliveryInfo2 != null && (c2354409Kk = oleDeliveryInfo2.productIntents) != null) {
            c2354409Kk.add(productIntent);
        }
        OleDeliveryInfo oleDeliveryInfo3 = this.LIZIZ;
        if (oleDeliveryInfo3 != null) {
            C1227904rF.LIZ.getClass();
            this.LIZJ = C1227904rF.LJI(oleDeliveryInfo3);
            ((Keva) this.LIZ.getValue()).storeString("ole_delivery_info", this.LIZJ);
        }
    }
}
