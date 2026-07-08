package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardRules;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C903803g4 {
    public static final C903803g4 LIZ = new C903803g4();
    public static final C903703g3 LIZIZ = new C903703g3();
    public static int LIZJ = 19;

    public static String LIZ() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        return ((IApplicationDependencyService) iECommerceHostService).getApplication().getString(2131832875);
    }

    public static void LIZIZ(PaymentMethodsData paymentMethodsData) {
        CardRules cardRules;
        CardRules next;
        List<BankCardRule> list;
        int iLJJJJLI;
        List<CardRules> list2 = paymentMethodsData.cardRules;
        List<BankCardRule> list3 = null;
        if (list2 != null) {
            Iterator<CardRules> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.id, "pm_pi_atmcard_all")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            cardRules = next;
            if (cardRules != null && (list = cardRules.rules) != null) {
                Iterator<BankCardRule> it3 = list.iterator();
                while (it3.hasNext()) {
                    int[] iArr = it3.next().cardBrandLength;
                    if (iArr != null) {
                        iLJJJJLI = C13LQ.LJJJJLI(iArr);
                    } else {
                        iLJJJJLI = LIZJ;
                    }
                    int i = LIZJ;
                    if (iLJJJJLI < i) {
                        iLJJJJLI = i;
                    }
                    LIZJ = iLJJJJLI;
                }
            }
        } else {
            cardRules = null;
        }
        C903703g3 c903703g3 = LIZIZ;
        if (cardRules != null) {
            list3 = cardRules.rules;
        }
        c903703g3.LIZIZ.clear();
        C904403gA c904403gA = new C904403gA();
        Iterator<String> it4 = C904403gA.LIZ.iterator();
        while (it4.hasNext()) {
            c903703g3.LIZ.put(it4.next(), c904403gA);
        }
        C906103gR c906103gR = new C906103gR();
        Iterator<String> it5 = C906103gR.LIZ.iterator();
        while (it5.hasNext()) {
            c903703g3.LIZ.put(it5.next(), c906103gR);
        }
        C906003gQ c906003gQ = new C906003gQ();
        Iterator<String> it6 = C906003gQ.LIZ.iterator();
        while (it6.hasNext()) {
            c903703g3.LIZ.put(it6.next(), c906003gQ);
        }
        C903903g5 c903903g5 = new C903903g5(c903703g3);
        Iterator<String> it7 = C903903g5.LIZIZ.iterator();
        while (it7.hasNext()) {
            c903703g3.LIZ.put(it7.next(), c903903g5);
        }
        if (list3 != null) {
            for (BankCardRule bankCardRule : list3) {
                c903703g3.LIZIZ.put(bankCardRule.paymentMethodId, bankCardRule);
            }
        }
    }
}
