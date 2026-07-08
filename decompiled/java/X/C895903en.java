package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentSecurityConfig;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03en, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C895903en {
    public static final EcPaymentSecurityConfig LIZ = new EcPaymentSecurityConfig(0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    public static final C01GW LIZIZ;
    public static final int LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(3));
        LIZIZ = c01gwLIZIZ;
        Integer num = ((EcPaymentSecurityConfig) c01gwLIZIZ.getValue()).ccdcSaveCardPopCount;
        LIZJ = num != null ? num.intValue() : 0;
    }

    public static boolean LIZ() {
        return Intrinsics.LJFF(((EcPaymentSecurityConfig) LIZIZ.getValue()).useTooltip, Boolean.TRUE);
    }
}
