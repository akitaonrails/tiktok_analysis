package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;

/* JADX INFO: renamed from: X.03g0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C903403g0 {
    public static final /* synthetic */ C903403g0 LIZ = new C903403g0();

    public static C862703Yr LIZIZ(final ElementDTO elementDTO, final PaymentMethod paymentMethod) {
        Integer num = elementDTO.styleType;
        int iOrdinal = EnumC903503g1.Normal.ordinal();
        if (num == null || num.intValue() != iOrdinal) {
            int iOrdinal2 = EnumC903503g1.Email.ordinal();
            if (num == null || num.intValue() != iOrdinal2) {
                int iOrdinal3 = EnumC903503g1.CardNumber.ordinal();
                if (num != null && num.intValue() == iOrdinal3) {
                    return new C866903a7(elementDTO, paymentMethod, null, null);
                }
                int iOrdinal4 = EnumC903503g1.Date.ordinal();
                if (num != null && num.intValue() == iOrdinal4) {
                    return new C869503aX(elementDTO, paymentMethod, null);
                }
                int iOrdinal5 = EnumC903503g1.CPF.ordinal();
                if (num != null && num.intValue() == iOrdinal5) {
                    return new C869603aY(elementDTO, paymentMethod, null);
                }
                int iOrdinal6 = EnumC903503g1.Phone.ordinal();
                if (num != null && num.intValue() == iOrdinal6) {
                    return new C904703gD(elementDTO, paymentMethod);
                }
                int iOrdinal7 = EnumC903503g1.Address.ordinal();
                if (num == null || num.intValue() != iOrdinal7) {
                    int iOrdinal8 = EnumC903503g1.BA_CITY.ordinal();
                    if (num == null || num.intValue() != iOrdinal8) {
                        int iOrdinal9 = EnumC903503g1.BA_COUNTY.ordinal();
                        if (num == null || num.intValue() != iOrdinal9) {
                            int iOrdinal10 = EnumC903503g1.BA_COUNTRY.ordinal();
                            if (num == null || num.intValue() != iOrdinal10) {
                                return null;
                            }
                            return new C862703Yr(elementDTO, paymentMethod) { // from class: X.03gE
                            };
                        }
                    }
                }
                return new C03Z0(elementDTO, paymentMethod, null);
            }
        }
        return new C869603aY(elementDTO, paymentMethod, null);
    }

    public static InterfaceC884803d0 LIZ(Context context, ElementDTO elementDTO, PaymentMethod paymentMethod) {
        Integer num = elementDTO.styleType;
        int iOrdinal = EnumC903503g1.Normal.ordinal();
        if (num == null || num.intValue() != iOrdinal) {
            int iOrdinal2 = EnumC903503g1.CPF.ordinal();
            if (num == null || num.intValue() != iOrdinal2) {
                int iOrdinal3 = EnumC903503g1.Email.ordinal();
                if (num == null || num.intValue() != iOrdinal3) {
                    int iOrdinal4 = EnumC903503g1.CardNumber.ordinal();
                    List<PaymentMethod> list = null;
                    if (num != null && num.intValue() == iOrdinal4) {
                        C941003m4 c941003m4 = new C941003m4(context);
                        if (paymentMethod != null) {
                            list = paymentMethod.subPaymentMethods;
                        }
                        c941003m4.setPaymentList(list);
                        return c941003m4;
                    }
                    int iOrdinal5 = EnumC903503g1.Date.ordinal();
                    if (num != null && num.intValue() == iOrdinal5) {
                        return new C941203m6(context);
                    }
                    int iOrdinal6 = EnumC903503g1.Region.ordinal();
                    if (num != null && num.intValue() == iOrdinal6) {
                        return new C942403mI(context);
                    }
                    int iOrdinal7 = EnumC903503g1.Phone.ordinal();
                    if (num != null && num.intValue() == iOrdinal7) {
                        return new C942303mH(context);
                    }
                    int iOrdinal8 = EnumC903503g1.Address.ordinal();
                    if (num == null || num.intValue() != iOrdinal8) {
                        return null;
                    }
                    return new C942503mJ(context);
                }
            }
        }
        return new C941803mC(context);
    }
}
