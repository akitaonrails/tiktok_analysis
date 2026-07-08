package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Cne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2241121Cne {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2241111Cnd.values().length];
        try {
            iArr[EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_INVITE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_ACCEPT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
