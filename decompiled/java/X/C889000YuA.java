package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C889000YuA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC888990Yu9.values().length];
        try {
            iArr[EnumC888990Yu9.KEEP_CHATS_ARCHIVED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC888990Yu9.AUTO_ARCHIVE_INACTIVE_CHATS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC888990Yu9.PIN_TO_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
