package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19367510pt {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC19367410ps.values().length];
        try {
            iArr[EnumC19367410ps.TAG.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC19367410ps.BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
