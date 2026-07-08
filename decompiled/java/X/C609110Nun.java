package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Nun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C609110Nun {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC609120Nuo.values().length];
        try {
            iArr[EnumC609120Nuo.UPVOTE_GUIDE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
