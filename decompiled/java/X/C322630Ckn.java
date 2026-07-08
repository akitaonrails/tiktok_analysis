package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ckn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C322630Ckn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC322640Cko.values().length];
        try {
            iArr[EnumC322640Cko.LOCATE_TOP_PARTIAL_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC322640Cko.LOCATE_TOP_COMPLETE_MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC322640Cko.LOCATE_BOTTOM_MESSAGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC322640Cko.LOCATE_BOTTOM_SUG.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC322640Cko.LOCATE_CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC322640Cko.NORMAL.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC322640Cko.LOCATE_TOP_MESSAGE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC322640Cko.LOCATE_TOP_NOT_VISIBLE_MESSAGE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZ = iArr;
    }
}
