package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0cYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1016510cYj {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1016500cYi.values().length];
        try {
            iArr[EnumC1016500cYi.VIDEO_URL_LIST_EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1016500cYi.VIDEO_ID_IS_EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1016500cYi.DOWNLOAD_SERVICE_CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
