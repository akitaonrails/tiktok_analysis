package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;

/* JADX INFO: renamed from: X.0Lim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C550700Lim {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GenerateStatus.values().length];
        try {
            iArr[GenerateStatus.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[GenerateStatus.GENERATING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[GenerateStatus.NOT_START.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
