package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0InB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C476990InB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC476920In4.values().length];
        try {
            iArr[EnumC476920In4.ENTER_ROOM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC476920In4.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC476920In4.DRAW.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC476920In4.BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
