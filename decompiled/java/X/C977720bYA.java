package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;

/* JADX INFO: renamed from: X.0bYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977720bYA {
    public final MultiInviteResponse LIZ;
    public final Throwable LIZIZ;
    public final EnumC976510bWD LIZJ;
    public final Throwable LIZLLL;

    public C977720bYA() {
        this(null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TeamMatchInviteState(inviteResponse=");
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

    public C977720bYA(MultiInviteResponse multiInviteResponse, Throwable th, EnumC976510bWD enumC976510bWD, Throwable th2) {
        this.LIZ = multiInviteResponse;
        this.LIZIZ = th;
        this.LIZJ = enumC976510bWD;
        this.LIZLLL = th2;
    }

    public static C977720bYA LIZ(C977720bYA c977720bYA, MultiInviteResponse multiInviteResponse, Throwable th, EnumC976510bWD enumC976510bWD, Throwable th2, int i) {
        if ((i & 1) != 0) {
            multiInviteResponse = c977720bYA.LIZ;
        }
        if ((i & 2) != 0) {
            th = c977720bYA.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC976510bWD = c977720bYA.LIZJ;
        }
        if ((i & 8) != 0) {
            th2 = c977720bYA.LIZLLL;
        }
        return new C977720bYA(multiInviteResponse, th, enumC976510bWD, th2);
    }
}
