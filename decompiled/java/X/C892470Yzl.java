package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Yzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C892470Yzl {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC461080I6g.values().length];
        try {
            iArr[EnumC461080I6g.RECENT_ACTIVITY_POST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC461080I6g.RECENT_ACTIVITY_REPOST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
