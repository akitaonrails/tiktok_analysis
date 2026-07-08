package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.advideo.InvitationStatus;

/* JADX INFO: renamed from: X.0N5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C588180N5c {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InvitationStatus.values().length];
        try {
            iArr[InvitationStatus.INVITATION_STATUS_ACCEPT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[InvitationStatus.INVITATION_STATUS_DENY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[InvitationStatus.INVITATION_STATUS_PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
