package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0540, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class AnonymousClass0540 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC12928054c.values().length];
        try {
            iArr[EnumC12928054c.UID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
