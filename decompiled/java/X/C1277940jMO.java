package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1277940jMO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1277950jMP.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC1277950jMP.Success.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
