package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1136780fgi {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1136790fgj.values().length];
        try {
            iArr[EnumC1136790fgj.ONE_HOST_MEDIUM_V3.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1136790fgj.MULTI_HOST_SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
