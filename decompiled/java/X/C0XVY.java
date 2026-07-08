package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.model.Block3pLogoutDetailDTO;

/* JADX INFO: renamed from: X.0XVY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C0XVY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Block3pLogoutDetailDTO.PiiType.values().length];
        try {
            iArr[Block3pLogoutDetailDTO.PiiType.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[Block3pLogoutDetailDTO.PiiType.MOBILE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[Block3pLogoutDetailDTO.PiiType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
