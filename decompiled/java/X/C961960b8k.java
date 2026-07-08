package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0b8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C961960b8k {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC961950b8j.values().length];
        try {
            iArr[EnumC961950b8j.INVITE_LIST_SCROLL_UP_STATE_COMPRESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC961950b8j.INVITE_LIST_SCROLL_DOWN_STATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
