package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C504601xs {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        LIZ = iArr;
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
