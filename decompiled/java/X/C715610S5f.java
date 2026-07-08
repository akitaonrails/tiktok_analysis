package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0S5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C715610S5f {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC207101162h.values();
        try {
            EnumC207101162h.DESCRIPTION.ordinal();
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            EnumC207101162h.PHOTO_TITLE.ordinal();
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        int[] iArr = new int[EnumC715590S5d.values().length];
        try {
            iArr[EnumC715590S5d.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC715590S5d.COMBINE_ENTRANCE_STICKER_TRANSLATION_TOGGLE.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC715590S5d.DO_NOT_TRANSLATE_CHANGED.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC715590S5d.LAND_ON_ITEM.ordinal()] = 5;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC715590S5d.TOGGLE_CAPTION.ordinal()] = 6;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC715590S5d.TARGET_LANGUAGE_CHANGED.ordinal()] = 7;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC715590S5d.COMMENT_ALL_TOGGLE.ordinal()] = 8;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC715590S5d.BIZ_COMP_ALL_TOGGLE.ordinal()] = 9;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr[EnumC715590S5d.COMMERCE_LYNX_COMPONENT_JSB.ordinal()] = 10;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        LIZ = iArr;
    }
}
