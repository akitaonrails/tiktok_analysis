package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0g9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1154610g9T {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1154600g9S.values().length];
        try {
            iArr[EnumC1154600g9S.AVATAR_AND_NICKNAME_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
