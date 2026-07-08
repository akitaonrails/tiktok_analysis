package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Z7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C894680Z7y {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC894670Z7x.values().length];
        try {
            iArr[EnumC894670Z7x.PREDICT_ENTER_CHAT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC894670Z7x.PREDICT_ENTER_INBOX.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC894670Z7x.PREDICT_AWEME_VIDEO_PRELOAD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
