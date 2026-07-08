package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06qX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1733106qX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
