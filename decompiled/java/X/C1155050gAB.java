package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.notify.LiveNotifyWidget;

/* JADX INFO: renamed from: X.0gAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1155050gAB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LiveNotifyWidget.values().length];
        try {
            iArr[LiveNotifyWidget.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[LiveNotifyWidget.MID_TOUCH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
