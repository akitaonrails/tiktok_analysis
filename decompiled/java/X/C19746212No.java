package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19746212No {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC823140WQu.values().length];
        try {
            iArr[EnumC823140WQu.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC823140WQu.VERY_LOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC19746112Nn.values().length];
        try {
            iArr2[EnumC19746112Nn.SPRING.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC19746112Nn.POP.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC19746112Nn.BEZIER.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZIZ = iArr2;
    }
}
