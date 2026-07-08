package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.17qK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C21153817qK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC21157617qw.values().length];
        try {
            iArr[EnumC21157617qw.START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC21157617qw.END.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
