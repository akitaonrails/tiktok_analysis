package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;

/* JADX INFO: renamed from: X.0s8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1615440s8k {
    @InterfaceC1501200pAU("/tiktok/v1/paid_content/payment/component")
    AbstractC19484711Kz<PaymentComponentResponse> LIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str, @InterfaceC1501120pAM("business_line") Integer num, @InterfaceC1501120pAM("spu_id") String str2, @InterfaceC1501120pAM("creator_id") String str3, @InterfaceC1501120pAM("enable_web_payment") Boolean bool, @InterfaceC1501120pAM("price_region") String str4, @InterfaceC1501120pAM("enter_from") String str5);
}
