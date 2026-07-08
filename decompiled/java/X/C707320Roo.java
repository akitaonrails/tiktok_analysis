package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Roo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C707320Roo {
    public static final /* synthetic */ int[] LIZ;

    static {
        EnumC707330Rop.values();
        int[] iArr = new int[EnumC707300Rom.values().length];
        try {
            iArr[EnumC707300Rom.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC707300Rom.SLIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
