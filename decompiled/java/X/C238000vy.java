package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C238000vy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LiveMode.values().length];
        try {
            iArr[LiveMode.SCREEN_RECORD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
