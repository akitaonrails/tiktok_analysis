package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionArea;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CashierBasicInfoData;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CustomizedInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.GroupInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RecInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SectionInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SortItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS89S1300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710180ubY {
    public static EnumC994640bzS LIZJ(List list, RawTextAndIcon rawTextAndIcon) {
        String str;
        PIPOPaymentMethod pIPOPaymentMethod;
        ArrayList<PIPOPaymentMethod> arrayList;
        if (rawTextAndIcon != null) {
            str = rawTextAndIcon.showMoreMethodsTitle;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            return EnumC994640bzS.NORMAL;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<PaymentOption> list2 = ((PIPOPaymentOptionArea) it2.next()).paymentOptions;
                if (!list2.isEmpty()) {
                    if (list2.size() == 1 && (pIPOPaymentMethod = ((PaymentOption) ListProtector.get(list2, 0)).legacyPM) != null) {
                        if (Intrinsics.LJFF(pIPOPaymentMethod.isDefault, Boolean.TRUE)) {
                            continue;
                        } else if (pIPOPaymentMethod != null && (arrayList = pIPOPaymentMethod.subPaymentMethods) != null && !arrayList.isEmpty()) {
                            Iterator<PIPOPaymentMethod> it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (Intrinsics.LJFF(it3.next().isDefault, Boolean.TRUE)) {
                                    break;
                                }
                            }
                        }
                    }
                    return EnumC994640bzS.NORMAL;
                }
            }
        }
        return EnumC994640bzS.EXPRESS;
    }

    public static PIPOPaymentOptionSource LIZ(RecInfo recInfo, List list, List list2, List list3, CashierBasicInfoData cashierBasicInfoData, String str, CustomizedInfo customizedInfo, String str2) {
        String str3 = str;
        if (recInfo == null) {
            return null;
        }
        List listLIZIZ = LIZIZ(str3, recInfo.recSectionList, list2, list3, list, cashierBasicInfoData, customizedInfo, str2);
        List listLIZIZ2 = LIZIZ(str3, recInfo.allSectionList, list2, list3, list, cashierBasicInfoData, customizedInfo, str2);
        if (str3 == null) {
            str3 = "";
        }
        return new PIPOPaymentOptionSource(str3, list, null, null, listLIZIZ, listLIZIZ2, 12, null);
    }

    public static List LIZIZ(String str, List list, List list2, List list3, List list4, CashierBasicInfoData cashierBasicInfoData, CustomizedInfo customizedInfo, String str2) {
        EnumC1709680uak enumC1709680uak;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SectionInfo sectionInfo = (SectionInfo) it2.next();
                List<GroupInfo> list5 = sectionInfo.groupList;
                C1710160ubW c1710160ubW = new C1710160ubW(str, list5, list4, list2, list3, cashierBasicInfoData, customizedInfo, str2);
                String str3 = sectionInfo.code;
                String str4 = sectionInfo.title;
                String str5 = sectionInfo.displayAmount;
                String str6 = null;
                ArrayList arrayList2 = new ArrayList();
                if (list5 != null) {
                    for (GroupInfo groupInfo : list5) {
                        if (C123100dR.LIZ(groupInfo.paymentMethodGroupCode)) {
                            if (Intrinsics.LJFF(groupInfo.paymentMethodGroupType, "display_in_single_pm")) {
                                AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(arrayList2, (ArrayList<PaymentOption>) 374);
                                String strLIZ = C1709660uai.LIZ(groupInfo.paymentMethodGroupCode, groupInfo.paymentMethodGroupType, str6, str6, str6, str6, str6);
                                PaymentOption paymentOptionLIZIZ = c1710160ubW.LIZIZ(strLIZ, new AwS141S1200000_26(c1710160ubW, groupInfo, strLIZ, 3));
                                if (paymentOptionLIZIZ != null) {
                                    awS605S0100000_26.invoke(paymentOptionLIZIZ);
                                }
                            } else if (Intrinsics.LJFF(groupInfo.paymentMethodGroupCode, "pm_pi_bt_banktransfer_c_d")) {
                                AwS605S0100000_26 awS605S0100000_262 = new AwS605S0100000_26(arrayList2, (ArrayList<PaymentOption>) 375);
                                String strLIZ2 = C1709660uai.LIZ("pm_pi_bt_banktransfer_c_d", groupInfo.paymentMethodGroupType, str6, str6, str6, str6, str6);
                                PaymentOption paymentOptionLIZIZ2 = c1710160ubW.LIZIZ(strLIZ2, new AwS141S1200000_26(c1710160ubW, groupInfo, strLIZ2, 2));
                                if (paymentOptionLIZIZ2 != null) {
                                    awS605S0100000_262.invoke(paymentOptionLIZIZ2);
                                }
                            } else {
                                if (Intrinsics.LJFF(groupInfo.paymentMethodGroupCode, "pm_pi_ccdc_all")) {
                                    enumC1709680uak = EnumC1709680uak.CCDC_TEMPLATE;
                                } else {
                                    enumC1709680uak = EnumC1709680uak.NORMAL_SUB;
                                }
                                String strLIZ3 = C1709660uai.LIZ(groupInfo.paymentMethodGroupCode, groupInfo.paymentMethodGroupType, str6, str6, str6, str6, str6);
                                PaymentOption paymentOptionLIZIZ3 = c1710160ubW.LIZIZ(strLIZ3, new AwS89S1300000_26(groupInfo, c1710160ubW, strLIZ3, enumC1709680uak, 0));
                                if (paymentOptionLIZIZ3 != null) {
                                    arrayList2.add(paymentOptionLIZIZ3);
                                }
                            }
                        } else {
                            List<SortItem> list6 = groupInfo.sortList;
                            if (list6 != null) {
                                Iterator<SortItem> it3 = list6.iterator();
                                while (it3.hasNext()) {
                                    c1710160ubW = c1710160ubW;
                                    str6 = str6;
                                    c1710160ubW.LIZ(it3.next(), EnumC1709680uak.NORMAL, str6, str6, str6, new AwS605S0100000_26(arrayList2, (ArrayList<PaymentOption>) 377));
                                }
                            }
                        }
                    }
                }
                arrayList.add(new PIPOPaymentOptionArea(str3, str4, str5, str6, arrayList2));
            }
        }
        return arrayList;
    }
}
