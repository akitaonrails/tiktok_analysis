package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.013B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C013B {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LiveMode.values().length];
        try {
            iArr[LiveMode.THIRD_PARTY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[LiveMode.SCREEN_RECORD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
