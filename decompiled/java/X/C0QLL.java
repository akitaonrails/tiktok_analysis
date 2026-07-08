package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.EnterMiddlePageMethod;

/* JADX INFO: renamed from: X.0QLL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C0QLL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnterMiddlePageMethod.values().length];
        try {
            iArr[EnterMiddlePageMethod.SYSTEM_BACK_METHOD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnterMiddlePageMethod.PRESS_LEFT_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
