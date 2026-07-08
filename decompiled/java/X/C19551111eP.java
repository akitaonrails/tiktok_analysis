package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11eP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19551111eP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC19551211eQ.values().length];
        try {
            iArr[EnumC19551211eQ.VOICE_CONVERSION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
