package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviteMockApiRequestFailSetting;

/* JADX INFO: renamed from: X.0bYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977760bYE {
    public static C501470JlZ LIZ(boolean z) {
        LiveMatchInviteMockApiRequestFailSetting liveMatchInviteMockApiRequestFailSetting = LiveMatchInviteMockApiRequestFailSetting.INSTANCE;
        if (!liveMatchInviteMockApiRequestFailSetting.isEnabled()) {
            return null;
        }
        if (z && !liveMatchInviteMockApiRequestFailSetting.shouldMockResend()) {
            return null;
        }
        int iErrorCode = liveMatchInviteMockApiRequestFailSetting.errorCode();
        C501470JlZ c501470JlZ = new C501470JlZ(iErrorCode);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Mocked invite failure (errorCode=");
        sbLIZ.append(iErrorCode);
        sbLIZ.append(", isResend=");
        sbLIZ.append(z);
        sbLIZ.append(')');
        c501470JlZ.setErrorMsg(C2188811AlT.LIZIZ(sbLIZ));
        c501470JlZ.setPrompt("Mocked invite failure");
        return c501470JlZ;
    }
}
