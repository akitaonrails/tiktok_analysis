package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1179650gnr {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1179610gnn.values().length];
        try {
            iArr[EnumC1179610gnn.TYPE_DYNAMIC_MAP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1179610gnn.TYPE_STATIC_MAP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
