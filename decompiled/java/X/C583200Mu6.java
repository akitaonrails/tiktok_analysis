package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Mu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C583200Mu6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC584500MwC.values().length];
        try {
            iArr[EnumC584500MwC.EXHAUSTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
