package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0wo8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794860wo8 {
    public static String LIZ(Purchase purchase) {
        if (purchase == null) {
            return "";
        }
        purchase.LIZJ();
        if (((ArrayList) purchase.LIZJ()).size() == 0) {
            return "";
        }
        return (String) ListProtector.get(purchase.LIZJ(), 0);
    }
}
