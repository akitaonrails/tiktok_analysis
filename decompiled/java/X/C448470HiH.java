package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C448470HiH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC448480HiI.values().length];
        try {
            iArr[EnumC448480HiI.REMOVE_MY_PHOTOS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC448480HiI.DELETE_FOR_EVERYONE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
