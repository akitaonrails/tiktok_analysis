package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1225140hzE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1225150hzF.values().length];
        try {
            iArr[EnumC1225150hzF.ADD_TO_STORY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1225150hzF.ADD_TO_POST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1225150hzF.ADD_TO_PROFILE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
