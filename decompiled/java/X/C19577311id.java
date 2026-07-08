package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;

/* JADX INFO: renamed from: X.11id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19577311id {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CreativeLoadingDialogBuilder.CancelType.values().length];
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.GONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_15S.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
