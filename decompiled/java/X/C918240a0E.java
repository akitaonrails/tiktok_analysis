package X;

import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import tikcast.linkmic.common.ErrorInfo;
import tikcast.linkmic.controller.InviteResultInfo;

/* JADX INFO: renamed from: X.0a0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918240a0E {
    public static final C918350a0P LIZ(C918350a0P c918350a0P) {
        AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(228);
        C918360a0Q c918360a0Q = c918350a0P.LIZJ;
        return C918350a0P.LIZ(c918350a0P, null, C918360a0Q.LIZ(c918360a0Q, new AwS381S0200000_15(c918360a0Q.LIZJ, aFwS250S0000000_15, 157)), null, 11);
    }

    public static final Long LIZIZ(C918230a0D c918230a0D) {
        List<InviteResultInfo> list;
        InviteResultInfo inviteResultInfo;
        ErrorInfo errorInfo;
        InviteResponse inviteResponse = c918230a0D.LJI;
        if (inviteResponse != null && (list = inviteResponse.inviteResultList) != null && (inviteResultInfo = (InviteResultInfo) C13LP.LJJJLL(list)) != null && (errorInfo = inviteResultInfo.errInfo) != null) {
            return Long.valueOf(errorInfo.errCode);
        }
        return null;
    }

    public static final String LIZJ(C918230a0D c918230a0D) {
        List<InviteResultInfo> list;
        InviteResultInfo inviteResultInfo;
        ErrorInfo errorInfo;
        InviteResponse inviteResponse = c918230a0D.LJI;
        if (inviteResponse != null && (list = inviteResponse.inviteResultList) != null && (inviteResultInfo = (InviteResultInfo) C13LP.LJJJLL(list)) != null && (errorInfo = inviteResultInfo.errInfo) != null) {
            return errorInfo.toast;
        }
        return null;
    }

    public static final boolean LIZLLL(C918230a0D c918230a0D) {
        List<InviteResultInfo> list;
        InviteResultInfo inviteResultInfo;
        ErrorInfo errorInfo;
        Long lValueOf;
        if (!c918230a0D.LIZJ) {
            return false;
        }
        InviteResponse inviteResponse = c918230a0D.LJI;
        if (inviteResponse != null && (list = inviteResponse.inviteResultList) != null && (inviteResultInfo = (InviteResultInfo) C13LP.LJJJLL(list)) != null && (errorInfo = inviteResultInfo.errInfo) != null && (lValueOf = Long.valueOf(errorInfo.errCode)) != null && lValueOf.longValue() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(InviteResultInfo inviteResultInfo) {
        Long lValueOf;
        ErrorInfo errorInfo = inviteResultInfo.errInfo;
        if (errorInfo != null) {
            lValueOf = Long.valueOf(errorInfo.errCode);
        } else {
            lValueOf = null;
        }
        if (lValueOf == null || lValueOf.longValue() == 0) {
            return true;
        }
        return false;
    }
}
