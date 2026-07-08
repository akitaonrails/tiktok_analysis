package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ixI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1262380ixI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1262370ixH.values().length];
        try {
            iArr[EnumC1262370ixH.FFP_ENTRANCE_INBOX_FIRST_PAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1262370ixH.FFP_ENTRANCE_FOLLOWING_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1262370ixH.FFP_ENTRANCE_FRIEND_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
