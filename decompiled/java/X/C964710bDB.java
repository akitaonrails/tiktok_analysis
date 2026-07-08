package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bDB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C964710bDB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC964700bDA.values().length];
        try {
            iArr[EnumC964700bDA.INVITE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
