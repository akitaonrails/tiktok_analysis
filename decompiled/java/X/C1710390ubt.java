package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CheckRule;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0ubt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710390ubt {
    public final C1709570uaZ LIZ;
    public final EnumC995340c0a LIZIZ;
    public final List<C1710400ubu> LIZJ = new ArrayList();
    public final List<AbstractC1709700uam> LIZLLL = new ArrayList();

    public C1710390ubt(C1709570uaZ c1709570uaZ, EnumC995340c0a enumC995340c0a) {
        this.LIZ = c1709570uaZ;
        this.LIZIZ = enumC995340c0a;
    }

    public final Integer LIZ(EnumC1710490uc3 enumC1710490uc3, PaymentOption paymentOption) {
        List<CheckRule> list;
        Object next;
        CheckRule checkRule;
        String str;
        boolean z;
        Integer numValueOf = null;
        if (paymentOption != null) {
            try {
                Element elementLJII = paymentOption.LJII(enumC1710490uc3, this.LIZIZ);
                if (elementLJII != null && (list = elementLJII.backendRuleList) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<CheckRule> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C1710400ubu(enumC1710490uc3, it2.next(), null, null));
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (((C1710400ubu) next).LIZLLL != EnumC1710410ubv.MAX_LEN) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1710400ubu c1710400ubu = (C1710400ubu) next;
                    if (c1710400ubu != null && (checkRule = c1710400ubu.LIZIZ) != null && (str = checkRule.value) != null) {
                        numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
                        return numValueOf;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return numValueOf;
    }

    public final void LIZIZ(AbstractC1709700uam abstractC1709700uam, boolean z) {
        if (z) {
            C19719612Di.LJJIIJ(this.LIZLLL, new AwS605S0100000_26(abstractC1709700uam, 492), true);
        }
        ((ArrayList) this.LIZLLL).add(abstractC1709700uam);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x030a A[Catch: all -> 0x0325, TryCatch #2 {all -> 0x0325, blocks: (B:152:0x02e4, B:153:0x02ef, B:155:0x02f5, B:158:0x030a, B:161:0x0312, B:164:0x031d, B:166:0x0321), top: B:192:0x02e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x034c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1710830ucb LIZJ(X.EnumC1710490uc3 r13, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r14, java.lang.String r15, X.EnumC1710440uby r16, java.util.List<? extends X.EnumC1710410ubv> r17) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1710390ubt.LIZJ(X.0uc3, com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, java.lang.String, X.0uby, java.util.List):X.0ucb");
    }
}
