package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.069L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C069L {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1596306Mv.values().length];
        try {
            iArr[EnumC1596306Mv.CHAT_UNAVAILABLE_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1596306Mv.CHAT_UNAVAILABLE_DM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
