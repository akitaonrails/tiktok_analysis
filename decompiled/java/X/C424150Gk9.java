package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C424150Gk9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC429050Gs3.values().length];
        try {
            iArr[EnumC429050Gs3.Large.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
