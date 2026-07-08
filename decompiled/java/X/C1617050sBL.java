package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.ss.android.ugc.aweme.experiment.PaidContentAnchorInAppSetting;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0sBL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617050sBL {
    public static final Map<String, IapProductDetail> LIZ = new LinkedHashMap();
    public static final Set<String> LIZIZ = C13LP.LLIIJI(PaidContentAnchorInAppSetting.LIZ().iAPIDs);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(588));

    public static String LIZIZ(long j) {
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(j / 1000000.0f)}, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0224 A[PHI: r0 r15
      0x0224: PHI (r0v41 java.lang.String) = (r0v22 java.lang.String), (r0v44 java.lang.String) binds: [B:93:0x01b9, B:90:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r15v5 java.lang.String) = (r15v3 java.lang.String), (r15v6 java.lang.String) binds: [B:93:0x01b9, B:90:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9 A[PHI: r15
      0x01a9: PHI (r15v6 java.lang.String) = (r15v1 java.lang.String), (r15v7 java.lang.String) binds: [B:86:0x01a7, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5 A[PHI: r15
      0x01b5: PHI (r15v3 java.lang.String) = (r15v1 java.lang.String), (r15v6 java.lang.String), (r15v6 java.lang.String) binds: [B:86:0x01a7, B:88:0x01ab, B:90:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.lifecycle.LiveData LIZ(android.content.Context r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1617050sBL.LIZ(android.content.Context, java.util.List):androidx.lifecycle.LiveData");
    }

    public static String LIZJ(Long l, Long l2, String str) {
        if (l != null && l2 != null && str != null) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setMinimumFractionDigits(0);
            currencyInstance.setMaximumFractionDigits(2);
            currencyInstance.setCurrency(Currency.getInstance(str));
            return currencyInstance.format(Float.valueOf((l.longValue() - l2.longValue()) / 1000000.0f));
        }
        return null;
    }
}
