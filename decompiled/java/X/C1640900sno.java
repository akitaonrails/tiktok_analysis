package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0sno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class C1640900sno {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1641460soi.values().length];
        try {
            iArr[EnumC1641460soi.STICKER_LOAD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1641460soi.STICKER_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
