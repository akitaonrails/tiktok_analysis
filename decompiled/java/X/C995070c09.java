package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0c09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C995070c09 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC995060c08.values().length];
        try {
            iArr[EnumC995060c08.RED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC995060c08.WHITE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
