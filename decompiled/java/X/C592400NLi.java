package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C592400NLi {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC592410NLj.values().length];
        try {
            iArr[EnumC592410NLj.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC592410NLj.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
