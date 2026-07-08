package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14aL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20290314aL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2252111DCv.values().length];
        try {
            iArr[EnumC2252111DCv.VIDEO_PLAY_FINISH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
