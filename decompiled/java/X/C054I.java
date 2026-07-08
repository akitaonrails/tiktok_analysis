package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.054I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C054I {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC12934054i.values().length];
        try {
            iArr[EnumC12934054i.SAME_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC12934054i.DO_FRAME.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
