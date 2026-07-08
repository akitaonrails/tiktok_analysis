package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C993370bxP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC993360bxO.values().length];
        try {
            iArr[EnumC993360bxO.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
