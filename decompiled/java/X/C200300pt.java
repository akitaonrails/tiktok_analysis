package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C200300pt {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LiveMode.values().length];
        try {
            iArr[LiveMode.SCREEN_RECORD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[LiveMode.THIRD_PARTY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[LiveMode.LIVE_STUDIO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
