package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UserStatus;

/* JADX INFO: renamed from: X.02uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C736802uE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[UserStatus.values().length];
        try {
            iArr[UserStatus.FROZEN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
