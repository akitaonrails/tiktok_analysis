package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS0S0610000_1;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: renamed from: X.03RV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RV {
    public static AnonymousClass0957<BillInfoResponse> LIZIZ;
    public static final C03RV LIZ = new C03RV();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(518));
    public static final C03QP LIZLLL = new C03R4() { // from class: X.03QP
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
        @Override // X.C03R4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LIZ(X.C03WX r33, X.C03R6 r34, X.InterfaceC1748810vbr r35, java.lang.Integer r36, X.C03RX r37, X.C03RW r38, java.lang.String r39, java.lang.Integer r40, X.EnumC840403Qc r41, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r42) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C03QP.LIZ(X.03WX, X.03R6, X.0vbr, java.lang.Integer, X.03RX, X.03RW, java.lang.String, java.lang.Integer, X.03Qc, X.05Vn):java.lang.Object");
        }
    };
    public static final C03QO LJ = new C03R4() { // from class: X.03QO
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0211  */
        @Override // X.C03R4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LIZ(final X.C03WX r78, X.C03R6 r79, final X.InterfaceC1748810vbr r80, final java.lang.Integer r81, final X.C03RX r82, final X.C03RW r83, java.lang.String r84, java.lang.Integer r85, final X.EnumC840403Qc r86, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r87) {
            /*
                Method dump skipped, instruction units count: 547
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C03QO.LIZ(X.03WX, X.03R6, X.0vbr, java.lang.Integer, X.03RX, X.03RW, java.lang.String, java.lang.Integer, X.03Qc, X.05Vn):java.lang.Object");
        }
    };

    public static void LIZ(InterfaceC1748810vbr interfaceC1748810vbr, C03RS c03rs, boolean z, C03RT c03rt, Integer num, Boolean bool) {
        C03RX c03rx = c03rs.LJ;
        C03RW c03rw = c03rs.LJFF;
        AwS0S0610000_1 awS0S0610000_1 = new AwS0S0610000_1(c03rs, c03rt, z, num, bool, c03rx, c03rw, 1);
        if (interfaceC1748810vbr != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C048D(), awS0S0610000_1);
        } else {
            if (c03rw == null && c03rx == null) {
                return;
            }
            C048D c048d = new C048D();
            c048d.LJIIIIZZ(awS0S0610000_1);
            c048d.LIZJ(false);
        }
    }

    public static void LIZJ(Function0 function0, InterfaceC497601wk interfaceC497601wk, boolean z, C03RW c03rw, String str, Integer num) {
        int iIntValue;
        C03R4 c03r4;
        boolean zLIZIZ = C953203o2.LIZIZ();
        boolean zLIZ = C03XD.LIZ();
        if ((!zLIZIZ && !zLIZ) || !C03U5.LIZJ()) {
            return;
        }
        C03R6 c03r6 = (C03R6) function0.invoke();
        if (zLIZIZ && c03r6 != null) {
            C03WX c03wxLIZ = C857103Wn.LIZ((String) LIZJ.getValue());
            if (z) {
                Integer num2 = C03RU.LIZIZ().singleSkuDelayTime;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 3;
                }
            } else {
                Integer num3 = C953203o2.LIZLLL().multiSkuDelayTime;
                if (num3 == null && (num3 = C03RU.LIZIZ().multiSkuDelayTime) == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = num3.intValue();
                }
            }
            long j = 1000 * ((long) iIntValue);
            if (num != null) {
                if (num.intValue() != 2 && num.intValue() != 3) {
                    if (num.intValue() == 1) {
                        c03r4 = LJ;
                    }
                } else {
                    c03r4 = LIZLLL;
                }
                if (c03r4 != null) {
                    C03R4.LIZIZ(c03r4, c03r6, interfaceC497601wk, c03wxLIZ, j, null, null, c03rw, str, 0, 96);
                }
            }
        }
        if (zLIZ) {
            C035Q.LIZ(new AwS86S1200000_1(str, c03rw, c03r6, 37));
        }
    }
}
