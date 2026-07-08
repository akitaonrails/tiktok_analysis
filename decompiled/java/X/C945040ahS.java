package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ahS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C945040ahS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC944990ahN.values().length];
        try {
            iArr[EnumC944990ahN.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC944990ahN.UNAVAILABLE_GROUP_OPT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC944990ahN.UNAVAILABLE_GROUP_DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
