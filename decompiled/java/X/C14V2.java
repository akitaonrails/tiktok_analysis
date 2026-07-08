package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14V2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C14V2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20274814Uw.values().length];
        try {
            iArr[EnumC20274814Uw.PICK_VIDEO_FROM_ALBUM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC20274814Uw.TAKE_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC20274814Uw.TAKE_PHOTO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC20274814Uw.PICK_PHOTO_FROM_ALBUM.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
