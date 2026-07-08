package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Myd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C586010Myd {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC586000Myc.values().length];
        try {
            iArr[EnumC586000Myc.OPEN_BOARDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
