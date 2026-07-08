package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C518860KWm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC774050UXz.values().length];
        try {
            iArr[EnumC774050UXz.SOLO_CREATOR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
