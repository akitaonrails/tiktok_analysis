package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.150W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C150W {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C150X.values().length];
        try {
            iArr[C150X.LIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C150X.STORY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
