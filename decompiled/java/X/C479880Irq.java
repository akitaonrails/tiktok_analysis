package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Irq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C479880Irq {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC479890Irr.values().length];
        try {
            iArr[EnumC479890Irr.BROADCAST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
