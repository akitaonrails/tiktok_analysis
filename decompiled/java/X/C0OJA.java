package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OJA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C0OJA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC617480OJu.values().length];
        try {
            iArr[EnumC617480OJu.BULLETIN_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
