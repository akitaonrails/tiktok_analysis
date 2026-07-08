package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0rxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608510rxZ extends C1610740s1A {
    @Override // X.C1610740s1A, X.InterfaceC1608890ryB
    public final void LJIIIZ() {
        LIZJ(0);
        LIZ();
    }

    @Override // X.C1610740s1A
    public final boolean LJIIJJI(User user) {
        User user2;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "disable_search_live_tag", true) == 1 || !C1260740iue.LIZ()) {
            return false;
        }
        if (user == null) {
            return this.LIZIZ;
        }
        if (C1017070cZd.LLJIJIL(this.LJIIJJI)) {
            return true;
        }
        if (!user.isLive()) {
            return false;
        }
        if ((user.isSecret() && !C10EU.LJIIL(user) && ((user2 = this.LJIIL) == null || !user2.getUid().equals(user.getUid()))) || !C1492170ovv.LIZ() || user.isBlock()) {
            return false;
        }
        return true;
    }

    public C1608510rxZ(C1610670s13 c1610670s13, C1610670s13 c1610670s132, C1610770s1D c1610770s1D) {
        super(true, (View) c1610670s13, (View) c1610670s132, c1610770s1D);
    }

    public C1608510rxZ(EnumC1610470s0j enumC1610470s0j, C1610670s13 c1610670s13, C1610670s13 c1610670s132, C1610770s1D c1610770s1D) {
        super(enumC1610470s0j, c1610670s13, c1610670s132, c1610770s1D);
    }
}
