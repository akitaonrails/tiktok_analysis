package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C980480bcc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC980470bcb.values().length];
        try {
            iArr[EnumC980470bcb.ANCHOR_PRE_MATCH_SETTING_PANEL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC980470bcb.ANCHOR_AI_COMMENTARY_CAPSULE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC980470bcb.ANCHOR_DURING_MATCH_SETTING_PANEL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC980470bcb.AUDIENCE_BATTLE_NOTICE_FROM_ANCHOR.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC980470bcb.AI_COMMENTARY_ICON.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC980470bcb.AUDIENCE_SHARE_SETTING_SWITCH.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
