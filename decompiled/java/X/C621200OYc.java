package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C621200OYc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC621190OYb.values().length];
        try {
            iArr[EnumC621190OYb.BULLETIN_FRONT_STYLE_DARK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC621190OYb.BULLETIN_FRONT_STYLE_LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC621190OYb.BULLETIN_FRONT_STYLE_NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
