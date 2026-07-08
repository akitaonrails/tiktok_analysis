package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.UiRefreshEventType;

/* JADX INFO: renamed from: X.0iIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1237380iIy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[UiRefreshEventType.values().length];
        try {
            iArr[UiRefreshEventType.SHOW_LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[UiRefreshEventType.HIDE_LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[UiRefreshEventType.REFRESH_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
