package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03YY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YY {
    public static C867003a8 LIZ(PaymentMethodsData paymentMethodsData, Boolean bool) {
        BackupPaymentInfo backupPaymentInfo;
        String str;
        EnumC861003Ya next;
        EnumC861103Yb enumC861103Yb;
        boolean zLJFF;
        if (paymentMethodsData != null && (backupPaymentInfo = paymentMethodsData.backupPaymentInfo) != null) {
            String str2 = paymentMethodsData.materialCollectionInfo;
            String str3 = backupPaymentInfo.backupTipsTitle;
            if (str3 != null && (!a0.LJJJIL(str3)) && (str = backupPaymentInfo.backupTipsContent) != null && (!a0.LJJJIL(str))) {
                C861403Ye c861403Ye = EnumC861003Ya.Companion;
                Integer num = backupPaymentInfo.backupTipsType;
                c861403Ye.getClass();
                Iterator<EnumC861003Ya> it2 = EnumC861003Ya.getEntries().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        int value = next.getValue();
                        if (num != null && value == num.intValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                EnumC861003Ya enumC861003Ya = next;
                if (enumC861003Ya == null) {
                    enumC861003Ya = EnumC861003Ya.UNKNOWN;
                }
                if (enumC861003Ya != EnumC861003Ya.UNKNOWN) {
                    int i = C03YZ.LIZ[enumC861003Ya.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new C1954807lC();
                                }
                            } else {
                                enumC861103Yb = EnumC861103Yb.ENABLE_AND_ADD;
                            }
                        } else {
                            enumC861103Yb = EnumC861103Yb.ADD;
                        }
                    } else {
                        enumC861103Yb = EnumC861103Yb.ENABLE;
                    }
                    if (bool != null) {
                        zLJFF = bool.booleanValue();
                    } else {
                        zLJFF = Intrinsics.LJFF(backupPaymentInfo.defaultSelected, Boolean.TRUE);
                    }
                    return new C867003a8(str3, str, enumC861003Ya, zLJFF, enumC861103Yb, backupPaymentInfo.switchRetainPopupInfo, str2);
                }
            }
        }
        return null;
    }
}
