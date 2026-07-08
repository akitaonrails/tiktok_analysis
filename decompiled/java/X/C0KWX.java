package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KWX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0KWX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1102640ene.values().length];
        try {
            iArr[EnumC1102640ene.MULTI_GUEST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
