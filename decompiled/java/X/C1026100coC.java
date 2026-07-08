package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpFlag;

/* JADX INFO: renamed from: X.0coC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1026100coC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AutoPullUpFlag.values().length];
        try {
            iArr[AutoPullUpFlag.ENABLE_LIVE_ROOM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AutoPullUpFlag.ENABLE_MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AutoPullUpFlag.ENABLE_LANDING_PAGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AutoPullUpFlag.ENABLE_MIDDLE_PAGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[AutoPullUpFlag.ENABLE_IN_APP_OPEN_URL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
