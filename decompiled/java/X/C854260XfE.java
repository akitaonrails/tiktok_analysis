package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;

/* JADX INFO: renamed from: X.0XfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C854260XfE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VerificationMethodType.values().length];
        try {
            iArr[VerificationMethodType.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
