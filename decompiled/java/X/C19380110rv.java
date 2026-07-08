package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19380110rv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC19380010ru.values().length];
        try {
            iArr[EnumC19380010ru.WATER_MARK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC19380010ru.MUTE_AUDIO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
