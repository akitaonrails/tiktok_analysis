package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Olb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C628890Olb {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC628900Olc.values().length];
        try {
            iArr[EnumC628900Olc.DATE_TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
