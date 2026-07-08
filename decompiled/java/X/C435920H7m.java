package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0H7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C435920H7m {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC436120H8g.values().length];
        try {
            iArr[EnumC436120H8g.RECIPE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
