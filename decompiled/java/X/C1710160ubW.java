package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CashierBasicInfoData;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CustomizedInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.GroupInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710160ubW {
    public final String LIZ;
    public final List<GroupInfo> LIZIZ;
    public final List<PaymentOption> LIZJ;
    public final List<CBIPaymentMethod> LIZLLL;
    public final List<CBIPaymentMethod> LJ;
    public final CashierBasicInfoData LJFF;
    public final CustomizedInfo LJI;
    public final String LJII;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r5.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r4, java.util.List r5) {
        /*
            java.util.Iterator r3 = r5.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r0
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r4.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4
            if (r2 != 0) goto L20
        L1d:
            r5.add(r4)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1710160ubW.LIZJ(com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo LIZLLL(com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod r9, boolean r10) {
        /*
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethodDetail r2 = r9.LIZ()
            r3 = 0
            if (r10 != 0) goto L42
            if (r2 == 0) goto L47
            java.lang.String r1 = r2.model
        Lb:
            java.lang.String r0 = "pay_on_token"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L1f
            if (r2 == 0) goto L45
            java.lang.String r1 = r2.model
        L17:
            java.lang.String r0 = "tokenize_and_pay"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L42
        L1f:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethodDetail r0 = r9.paymentMethodDetail
            if (r0 == 0) goto L42
            com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow r10 = r0.bindFlow
            if (r10 == 0) goto L42
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo r3 = new com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo
            java.lang.String r4 = r10.midPageSchema
            r1 = 1
            if (r4 == 0) goto L43
            boolean r0 = X.C1533950q1J.LJ(r4)
            if (r0 != r1) goto L43
            r0 = 1
        L35:
            r1 = r1 ^ r0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r6 = 0
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType> r7 = r10.supportedCommuteTypes
            r8 = r6
            r9 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L42:
            return r3
        L43:
            r0 = 0
            goto L35
        L45:
            r1 = r3
            goto L17
        L47:
            r1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1710160ubW.LIZLLL(com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod, boolean):com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POBindInfo");
    }

    public final PaymentOption LIZIZ(String str, Function0<PaymentOption> function0) {
        PaymentOption next;
        Iterator<PaymentOption> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentOption paymentOption = next;
        if (paymentOption == null) {
            PaymentOption paymentOptionInvoke = function0.invoke();
            if (paymentOptionInvoke == null) {
                return null;
            }
            LIZJ(paymentOptionInvoke, this.LIZJ);
            return paymentOptionInvoke;
        }
        return paymentOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SortItem r24, X.EnumC1709680uak r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption, kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1710160ubW.LIZ(com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SortItem, X.0uak, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public C1710160ubW(String str, List<GroupInfo> list, List<PaymentOption> list2, List<CBIPaymentMethod> list3, List<CBIPaymentMethod> list4, CashierBasicInfoData cashierBasicInfoData, CustomizedInfo customizedInfo, String str2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = list4;
        this.LJFF = cashierBasicInfoData;
        this.LJI = customizedInfo;
        this.LJII = str2;
    }
}
