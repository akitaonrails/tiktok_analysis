package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0tw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class C1684490tw7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1684470tw5.values().length];
        try {
            iArr[EnumC1684470tw5.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1684470tw5.DONE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
