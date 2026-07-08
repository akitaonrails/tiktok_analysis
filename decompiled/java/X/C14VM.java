package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14VM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C14VM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C14VL.values().length];
        try {
            iArr[C14VL.TAKE_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
