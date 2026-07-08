package X;

import Y.AComparatorS43S0000000_24;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.BankDetail;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBICheckBox;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethodDetail;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.GroupInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PaymentMethodTips;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SortItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ubV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710150ubV extends C09AY implements Function0<PaymentOption> {
    public final /* synthetic */ CBIPaymentMethod LL;
    public final /* synthetic */ BankDetail LLILLJJLI;
    public final /* synthetic */ GroupInfo LLILLL;
    public final /* synthetic */ SortItem LLILZ;
    public final /* synthetic */ Element LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ ArrayList<PIPOPaymentMethod> LLIZLLLIL;
    public final /* synthetic */ C1710160ubW LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1710150ubV(CBIPaymentMethod cBIPaymentMethod, BankDetail bankDetail, GroupInfo groupInfo, SortItem sortItem, Element element, String str, String str2, Element element2, ArrayList<PIPOPaymentMethod> arrayList, C1710160ubW c1710160ubW) {
        super(0);
        this.LL = cBIPaymentMethod;
        this.LLILLJJLI = bankDetail;
        this.LLILLL = groupInfo;
        this.LLILZ = sortItem;
        this.LLILZIL = element;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = arrayList;
        this.LLJ = c1710160ubW;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PaymentOption invoke() {
        String strLJJLIIIJ;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ;
        CBICheckBox cBICheckBox;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ2 = this.LL.LIZ();
        Boolean bool = (cBIPaymentMethodDetailLIZ2 == null || (cBICheckBox = cBIPaymentMethodDetailLIZ2.checkbox) == null) ? null : cBICheckBox.isSelect;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ3 = this.LL.LIZ();
        String str = cBIPaymentMethodDetailLIZ3 != null ? cBIPaymentMethodDetailLIZ3.paymentMethodId : null;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ4 = this.LL.LIZ();
        String str2 = cBIPaymentMethodDetailLIZ4 != null ? cBIPaymentMethodDetailLIZ4.model : null;
        BankDetail bankDetail = this.LLILLJJLI;
        Boolean bool2 = bankDetail.isDefault;
        String str3 = this.LLILLL.paymentMethodGroupType;
        String str4 = bankDetail.bankName;
        String str5 = bankDetail.iconUrl;
        String str6 = bankDetail.darkModeIconUrl;
        Boolean bool3 = this.LLILZ.isPi;
        Boolean bool4 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool3, bool4);
        boolean z = Intrinsics.LJFF(this.LLILLJJLI.isAvailable, bool4) && (cBIPaymentMethodDetailLIZ = this.LL.LIZ()) != null && Intrinsics.LJFF(cBIPaymentMethodDetailLIZ.isAvailable, bool4);
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ5 = this.LL.LIZ();
        String str7 = cBIPaymentMethodDetailLIZ5 != null ? cBIPaymentMethodDetailLIZ5.showInfoSchema : null;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ6 = this.LL.LIZ();
        String str8 = cBIPaymentMethodDetailLIZ6 != null ? cBIPaymentMethodDetailLIZ6.paymentAmount : null;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ7 = this.LL.LIZ();
        String str9 = cBIPaymentMethodDetailLIZ7 != null ? cBIPaymentMethodDetailLIZ7.paymentAmountDisplayText : null;
        BankDetail bankDetail2 = this.LLILLJJLI;
        bankDetail2.getClass();
        try {
            List<PaymentMethodTips> list = bankDetail2.paymentMethodTips;
            if (list == null || list.isEmpty()) {
                strLJJLIIIJ = bankDetail2.unavailableRawMsg;
            } else {
                List<PaymentMethodTips> list2 = bankDetail2.paymentMethodTips;
                ArrayList arrayList = new ArrayList();
                Iterator<PaymentMethodTips> it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str10 = it2.next().tips;
                    if (str10 != null && (!a0.LJJJIL(str10))) {
                        arrayList.add(str10);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "\n", null, null, 0, null, null, 62);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                throw new C2197108jB();
            }
            strLJJLIIIJ = bankDetail2.unavailableRawMsg;
        }
        EnumC1709680uak enumC1709680uak = EnumC1709680uak.BANK_TRANSFER;
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS43S0000000_24(14), this.LL.elements);
        CBIPaymentMethod cBIPaymentMethod = this.LL;
        List<Element> list3 = cBIPaymentMethod.neededElements;
        CBIPaymentMethodDetail cBIPaymentMethodDetail = cBIPaymentMethod.paymentMethodDetail;
        CBIFlow cBIFlow = cBIPaymentMethodDetail != null ? cBIPaymentMethodDetail.paymentFlow : null;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ8 = cBIPaymentMethod.LIZ();
        String str11 = cBIPaymentMethodDetailLIZ8 != null ? cBIPaymentMethodDetailLIZ8.rawPaymentMethod : null;
        Boolean bool5 = this.LL.pciSensitive;
        Element element = this.LLILZIL;
        PIPOPaymentMethod pIPOPaymentMethod = new PIPOPaymentMethod(this.LLILZLL, this.LLIZ, str, str2, "pm_pi_bt_banktransfer_c_d", str3, str4, str5, str6, null, null, cBIFlow, null, zLJFF, bool5, z, Boolean.FALSE, str7, null, listLJLLLL, list3, C1697810uHb.LJIILJJIL(new POPayElement(element.id, element.paramName, this.LLILLJJLI.bankCode, element.needEncrypted)), this.LLILLJJLI.bankCode, str8, str9, strLJJLIIIJ, bool, bool2, str11, null, enumC1709680uak, null, this.LL, null, null, null, null, null, null);
        if (pIPOPaymentMethod.LIZIZ()) {
            ArrayList<PIPOPaymentMethod> arrayList2 = this.LLIZLLLIL;
            C1710160ubW c1710160ubW = this.LLJ;
            arrayList2.add(pIPOPaymentMethod);
            return pIPOPaymentMethod.LJFF(c1710160ubW.LIZ, c1710160ubW.LIZJ);
        }
        BankDetail bankDetail3 = this.LLILLJJLI;
        C1708710uZB.LIZ("Cashier").LIZ(4, "bank_transfer give up bank code :" + bankDetail3.bankCode);
        return null;
    }
}
