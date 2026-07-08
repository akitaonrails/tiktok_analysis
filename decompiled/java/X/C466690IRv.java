package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C466690IRv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC768840UDy.values().length];
        try {
            iArr[EnumC768840UDy.MULTI_GUEST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
