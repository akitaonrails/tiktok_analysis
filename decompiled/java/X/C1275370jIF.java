package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.ColorSpace;

/* JADX INFO: renamed from: X.0jIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1275370jIF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ColorSpace.values().length];
        LIZ = iArr;
        try {
            iArr[ColorSpace.BT601_FULL_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[ColorSpace.BT601_LIMITED_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[ColorSpace.BT709_FULL_RANGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[ColorSpace.BT709_LIMITED_RANGE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
