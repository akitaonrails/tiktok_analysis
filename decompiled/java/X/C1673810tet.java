package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0tet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class C1673810tet {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1673820teu.values().length];
        try {
            iArr[EnumC1673820teu.TO_FOLLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
