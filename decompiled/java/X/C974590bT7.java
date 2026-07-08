package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bT7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C974590bT7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC975850bV9.values();
        try {
            EnumC975850bV9.CANCEL_AFTER_INVITE.ordinal();
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            EnumC975850bV9.INVITE_REQUEST_FAILED.ordinal();
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            EnumC975850bV9.INVITE_BUTTON_CLICK.ordinal();
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            EnumC975850bV9.MODE_GUIDE_BUTTON_CLICK.ordinal();
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            EnumC975850bV9.GUIDE_CAPSULE_CLICK.ordinal();
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        int[] iArr = new int[EnumC964170bCJ.values().length];
        try {
            iArr[EnumC964170bCJ.MATCH_START.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC964170bCJ.PUNISH_START.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
        EnumC973640bRa.values();
        try {
            EnumC973640bRa.PK_ICON.ordinal();
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            EnumC973640bRa.MULTI_PK_GUIDE.ordinal();
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            EnumC973640bRa.PK_GUIDE.ordinal();
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            EnumC973640bRa.PK_REMATCH.ordinal();
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
    }
}
