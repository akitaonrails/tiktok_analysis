package X;

import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;

/* JADX INFO: renamed from: X.0bYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977770bYF {
    public final BattleInviteResult.ResponseData LIZ;
    public final MultiInviteResponse LIZIZ;
    public final Throwable LIZJ;
    public final EnumC976510bWD LIZLLL;
    public final Throwable LJ;

    public C977770bYF() {
        this(0);
    }

    public /* synthetic */ C977770bYF(int i) {
        this(null, null, null, null, null);
    }

    public C977770bYF(BattleInviteResult.ResponseData responseData, MultiInviteResponse multiInviteResponse, Throwable th, EnumC976510bWD enumC976510bWD, Throwable th2) {
        this.LIZ = responseData;
        this.LIZIZ = multiInviteResponse;
        this.LIZJ = th;
        this.LIZLLL = enumC976510bWD;
        this.LJ = th2;
    }

    public static C977770bYF LIZ(C977770bYF c977770bYF, BattleInviteResult.ResponseData responseData, MultiInviteResponse multiInviteResponse, Throwable th, EnumC976510bWD enumC976510bWD, Throwable th2, int i) {
        Throwable th3 = th2;
        EnumC976510bWD enumC976510bWD2 = enumC976510bWD;
        Throwable th4 = th;
        MultiInviteResponse multiInviteResponse2 = multiInviteResponse;
        BattleInviteResult.ResponseData responseData2 = responseData;
        if ((i & 1) != 0) {
            responseData2 = c977770bYF.LIZ;
        }
        if ((i & 2) != 0) {
            multiInviteResponse2 = c977770bYF.LIZIZ;
        }
        if ((i & 4) != 0) {
            th4 = c977770bYF.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC976510bWD2 = c977770bYF.LIZLLL;
        }
        if ((i & 16) != 0) {
            th3 = c977770bYF.LJ;
        }
        return new C977770bYF(responseData2, multiInviteResponse2, th4, enumC976510bWD2, th3);
    }
}
