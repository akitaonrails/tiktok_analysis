package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.EventName;

/* JADX INFO: renamed from: X.14SA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C14SA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EventName.values().length];
        try {
            iArr[EventName.ON_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EventName.ON_EXPOSURE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
