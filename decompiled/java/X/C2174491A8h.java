package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1A8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2174491A8h {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC2174471A8f.values().length];
        try {
            iArr[EnumC2174471A8f.ACCESSIBILITY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2174471A8f.ANALYTICS_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2174471A8f.ADS_SETTINGS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC2174471A8f.AUDIENCE_CONTROL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC2174471A8f.BACKGROUND_AUDIO.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC2174471A8f.COMMERCIAL_CONTENT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC2174471A8f.CONTENT_PREFERENCE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC2174471A8f.DISPLAY.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC2174471A8f.FAMILY_PAIRING.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC2174471A8f.JOIN_AMPLIFY.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC2174471A8f.LANGUAGE.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[EnumC2174471A8f.LIVE_SETTINGS.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr[EnumC2174471A8f.MUSIC_SETTINGS.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr[EnumC2174471A8f.NOTIFICATION_SETTINGS.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr[EnumC2174471A8f.PLAYBACK_SETTINGS.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr[EnumC2174471A8f.SCREEN_TIME.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr[EnumC2174471A8f.SHORTCUT.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr[EnumC2174471A8f.FAVORITE_SETTINGS.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr[EnumC2174471A8f.SWITCH_INBOX_MODE.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr[EnumC2174471A8f.CONTACTS_AND_LOCATION.ordinal()] = 20;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr[EnumC2174471A8f.SECTION_HEADER.ordinal()] = 21;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        LIZ = iArr;
        int[] iArr2 = new int[Lifecycle.Event.values().length];
        try {
            iArr2[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        LIZIZ = iArr2;
    }
}
