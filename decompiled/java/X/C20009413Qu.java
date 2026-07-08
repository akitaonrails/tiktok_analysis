package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13Qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20009413Qu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20009313Qt.values().length];
        try {
            iArr[EnumC20009313Qt.Ascii.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
