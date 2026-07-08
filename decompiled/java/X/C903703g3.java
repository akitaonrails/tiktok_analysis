package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.03g3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C903703g3 {
    public final ConcurrentHashMap<String, InterfaceC905003gG> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, BankCardRule> LIZIZ = new ConcurrentHashMap<>();

    public final BankCardRule LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        ConcurrentHashMap<String, BankCardRule> concurrentHashMap = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, BankCardRule>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            BankCardRule value = it2.next().getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            BankCardRule bankCardRule = (BankCardRule) next;
            String str2 = bankCardRule.cardBrandRegex;
            if (str2 != null && str2.length() != 0 && Pattern.matches(bankCardRule.cardBrandRegex, str)) {
                obj = next;
                break;
            }
        }
        return (BankCardRule) obj;
    }

    public final PaymentMethod LIZIZ(String str) {
        String str2;
        BankCardRule bankCardRuleLIZ = LIZ(str);
        if (bankCardRuleLIZ != null && (str2 = bankCardRuleLIZ.paymentMethodId) != null) {
            return C03S8.LIZIZ.get(str2);
        }
        return null;
    }

    public final C904003g6 LIZJ(String str, String... strArr) {
        C904003g6 c904003g6 = new C904003g6(0);
        InterfaceC905003gG interfaceC905003gG = this.LIZ.get(str);
        if (interfaceC905003gG != null) {
            return interfaceC905003gG.LIZ((String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return c904003g6;
    }

    public final String LIZLLL(String str, List<PaymentElement> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PaymentElement> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().paramValue);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String strLIZ = LIZJ(str, (String[]) Arrays.copyOf(strArr, strArr.length)).LIZ();
        if (strLIZ.length() == 0) {
            return null;
        }
        return strLIZ;
    }
}
