package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1710906mx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1710806mw.values().length];
        try {
            iArr[EnumC1710806mw.SCHEMA.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
