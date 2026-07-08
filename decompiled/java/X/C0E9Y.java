package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0E9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C0E9Y {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0E9W.values().length];
        try {
            iArr[C0E9W.AI_EXTEND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
