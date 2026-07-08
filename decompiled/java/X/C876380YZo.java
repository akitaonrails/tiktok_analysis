package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C876380YZo {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC876540Ya4.values().length];
        try {
            iArr[EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC876540Ya4.MESSAGE_REQUEST_AGGREGATED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
