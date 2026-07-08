package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06G3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C06G3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C06G4.values().length];
        try {
            iArr[C06G4.USER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C06G4.CONVERSATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
