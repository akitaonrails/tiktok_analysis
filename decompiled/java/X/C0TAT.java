package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TAT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C0TAT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC742790TBt.values().length];
        try {
            iArr[EnumC742790TBt.SWIPE_UP_GUIDE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC742790TBt.NOT_INTERESTED_TUTORIAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
