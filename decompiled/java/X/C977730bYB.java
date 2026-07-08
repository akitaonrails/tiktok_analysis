package X;

import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;

/* JADX INFO: renamed from: X.0bYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977730bYB {
    public final BattleInviteResult.ResponseData LIZ;
    public final Throwable LIZIZ;
    public final EnumC976510bWD LIZJ;
    public final Throwable LIZLLL;

    public C977730bYB() {
        this(null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TwoMatchInviteState(inviteResponse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onInviteFailed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onCancelSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onCancelFailed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C977730bYB(BattleInviteResult.ResponseData responseData, Throwable th, EnumC976510bWD enumC976510bWD, Throwable th2) {
        this.LIZ = responseData;
        this.LIZIZ = th;
        this.LIZJ = enumC976510bWD;
        this.LIZLLL = th2;
    }

    public static C977730bYB LIZ(C977730bYB c977730bYB, BattleInviteResult.ResponseData responseData, Throwable th, EnumC976510bWD enumC976510bWD, Throwable th2, int i) {
        if ((i & 1) != 0) {
            responseData = c977730bYB.LIZ;
        }
        if ((i & 2) != 0) {
            th = c977730bYB.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC976510bWD = c977730bYB.LIZJ;
        }
        if ((i & 8) != 0) {
            th2 = c977730bYB.LIZLLL;
        }
        return new C977730bYB(responseData, th, enumC976510bWD, th2);
    }
}
