package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;

/* JADX INFO: renamed from: X.03WM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WM {
    public static final String LIZ(DeliveryInstructionInfo deliveryInstructionInfo) {
        String str;
        if (deliveryInstructionInfo != null && (str = deliveryInstructionInfo.instruction) != null && str.length() != 0) {
            return "edit";
        }
        return "add";
    }
}
