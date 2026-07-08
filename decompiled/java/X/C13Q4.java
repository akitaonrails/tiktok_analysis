package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.FetchModelType;

/* JADX INFO: renamed from: X.13Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C13Q4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[FetchModelType.values().length];
        try {
            iArr[FetchModelType.ORIGIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[FetchModelType.ZIP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
