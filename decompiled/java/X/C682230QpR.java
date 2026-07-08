package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C682230QpR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC682220QpQ.values().length];
        try {
            iArr[EnumC682220QpQ.APPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
