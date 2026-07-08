package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Jd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C496250Jd9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC496240Jd8.values().length];
        try {
            iArr[EnumC496240Jd8.PRIVILEGE_ENTRANCE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC496240Jd8.GIFT_GALLERY_ENTRANCE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
