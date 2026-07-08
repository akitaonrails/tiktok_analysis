package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Inz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C477490Inz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC477480Iny.values().length];
        try {
            iArr[EnumC477480Iny.INVITE_PANEL_ENTRY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC477480Iny.DIRECT_ACCEPT_ENTRY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
