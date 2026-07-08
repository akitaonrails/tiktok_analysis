package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0g8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1154210g8p {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1154200g8o.values().length];
        try {
            iArr[EnumC1154200g8o.Unlimited.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
