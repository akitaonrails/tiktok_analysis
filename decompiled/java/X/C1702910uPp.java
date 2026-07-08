package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702910uPp implements C1A2Y, InterfaceC586170Myt {
    public final Keva LL;
    public String LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public C1702900uPo LLILZ;
    public final C01GW LLILZIL;

    @Override // X.C1A2Y
    public final long LIZ() {
        if (!this.LLILZ.LIZ) {
            LJII();
        }
        return this.LLILZ.LIZLLL;
    }

    @Override // X.C1A2Y
    public final int LIZIZ() {
        if (!this.LLILZ.LIZ) {
            LJII();
        }
        return this.LLILZ.LIZIZ;
    }

    @Override // X.C1A2Y
    public final void LIZJ() {
        this.LLILZ = C1702900uPo.LIZ(this.LLILZ, 0, 0, ((INetwork) this.LLILZIL.getValue()).LIZIZ(), 4);
        LJIIIIZZ();
    }

    @Override // X.C1A2Y
    public final int LIZLLL() {
        if (!this.LLILZ.LIZ) {
            LJII();
        }
        return this.LLILZ.LIZJ;
    }

    @Override // X.C1A2Y
    public final void LJI() {
        this.LLILZ = C1702900uPo.LIZ(this.LLILZ, 0, 0, ((INetwork) this.LLILZIL.getValue()).LIZIZ(), 2);
        LJIIIIZZ();
    }

    public final void LJII() {
        C1702900uPo c1702900uPo = this.LLILZ;
        Keva keva = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("daily_display_count_");
        sbLIZ.append(this.LLILLJJLI);
        int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva keva2 = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("global_display_count_");
        sbLIZ2.append(this.LLILLJJLI);
        int i2 = keva2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0);
        Keva keva3 = this.LL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("last_update_time_");
        sbLIZ3.append(this.LLILLJJLI);
        long j = keva3.getLong(C2188811AlT.LIZIZ(sbLIZ3), -1L);
        c1702900uPo.getClass();
        this.LLILZ = new C1702900uPo(true, i2, i, j);
    }

    public final void LJIIIIZZ() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1702890uPn(this, null), 3);
    }

    public C1702910uPp(EnumC1154930g9z enumC1154930g9z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muf_quick_dm_box_keva_");
        sbLIZ.append(enumC1154930g9z.name());
        this.LL = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = C461720I8s.LIZIZ();
        this.LLILZ = new C1702900uPo();
        this.LLILZIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(552));
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
    }

    @Override // X.C1A2Y
    public final void LJ(boolean z) {
        int i = 0;
        if (!z) {
            C1702900uPo c1702900uPo = this.LLILZ;
            if (!c1702900uPo.LIZ) {
                Keva keva = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("daily_display_count_");
                sbLIZ.append(this.LLILLJJLI);
                i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            } else {
                i = c1702900uPo.LIZJ;
            }
        }
        this.LLILZ = C1702900uPo.LIZ(this.LLILZ, 0, i + 1, ((INetwork) this.LLILZIL.getValue()).LIZIZ(), 2);
        LJIIIIZZ();
    }

    @Override // X.C1A2Y
    public final void LJFF(boolean z) {
        int i = 0;
        if (!z) {
            C1702900uPo c1702900uPo = this.LLILZ;
            if (!c1702900uPo.LIZ) {
                Keva keva = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("global_display_count_");
                sbLIZ.append(this.LLILLJJLI);
                i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            } else {
                i = c1702900uPo.LIZIZ;
            }
        }
        this.LLILZ = C1702900uPo.LIZ(this.LLILZ, i + 1, 0, ((INetwork) this.LLILZIL.getValue()).LIZIZ(), 4);
        LJIIIIZZ();
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String uid;
        if (!z) {
            return;
        }
        if (i != 2 && i != 3) {
            return;
        }
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        this.LLILLJJLI = uid;
        this.LLILZ = new C1702900uPo();
    }
}
