package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C883560YlO {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC883570YlP.values().length];
        try {
            iArr[EnumC883570YlP.ENTER_SHARE_PANEL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC883570YlP.ENTER_SESSION_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC883570YlP.ENTER_CHAT_ROOM.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC883570YlP.ON_RECEIVE_SHARER_INFO.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC883570YlP.GROUP_CHAT_RELATED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC883570YlP.LAUNCH_FROM_OUT_PUSH.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
        int[] iArr2 = new int[C0XE1.values().length];
        try {
            iArr2[C0XE1.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[C0XE1.CONNECT_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[C0XE1.CONNECT_CLOSED.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        LIZIZ = iArr2;
    }
}
