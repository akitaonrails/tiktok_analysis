package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0i3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1227720i3O {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1227730i3P.values().length];
        try {
            iArr[EnumC1227730i3P.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
