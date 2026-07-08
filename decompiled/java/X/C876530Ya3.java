package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ya3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C876530Ya3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC876540Ya4.values().length];
        try {
            iArr[EnumC876540Ya4.MIX_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC876540Ya4.REVIEW_MSG_RECEIVED_IN_BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
