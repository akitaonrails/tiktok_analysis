package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1ATy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2180121ATy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2180071ATt.values().length];
        try {
            iArr[EnumC2180071ATt.LIVE_PHOTO_INIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
