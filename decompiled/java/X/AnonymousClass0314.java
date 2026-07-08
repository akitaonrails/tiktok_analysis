package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.DeliveryInstructionConfig;

/* JADX INFO: renamed from: X.0314, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0314 {
    public static final DeliveryInstructionConfig LIZ;

    static {
        DeliveryInstructionConfig deliveryInstructionConfig = new DeliveryInstructionConfig(false, false);
        DeliveryInstructionConfig deliveryInstructionConfig2 = (DeliveryInstructionConfig) C0C64.LJIILLIIL().LJJII(DeliveryInstructionConfig.class, deliveryInstructionConfig, "ecom_address_delivery_instruction", true);
        if (deliveryInstructionConfig2 != null) {
            deliveryInstructionConfig = deliveryInstructionConfig2;
        }
        LIZ = deliveryInstructionConfig;
    }
}
