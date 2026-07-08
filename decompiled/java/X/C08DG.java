package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08DG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C08DG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        LIZ = iArr;
        try {
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
