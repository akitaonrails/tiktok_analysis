package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C915760ZwE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC958840b3i.values().length];
        try {
            iArr[EnumC958840b3i.QUICK_BATTLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
