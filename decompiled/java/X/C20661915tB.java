package X;

import Y.ACListenerS165S0100000_31;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.15tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20647615qs("playlist_creation_onboarding_profile_bottom_banner_popup_task")
public final class C20661915tB extends AbstractC20660815t0 {
    public final C20515215Pi LL;
    public final C20662015tC LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("playlist_bottom_banner_show", c0lab.LIZ);
        C20515215Pi c20515215Pi = this.LL;
        c20515215Pi.LIZ.LJ = c688120Qyw.LIZ.getString(2131840531);
        c20515215Pi.LIZ.LJFF = c688120Qyw.LIZ.getString(2131840529);
        String string = c688120Qyw.LIZ.getString(2131840530);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJI = string;
        c1057450dcl.LJIIJ = 0;
        c1057450dcl.LJIILIIL = new ACListenerS165S0100000_31(this, 158);
        c20515215Pi.LIZ.LJIILJJIL = new AwS397S0200000_31(this, c20656615sK, 92);
        c20515215Pi.LIZLLL();
        C20662015tC c20662015tC = this.LLILLJJLI;
        c20662015tC.LIZ.LIZJ("auto_dismiss_time_v1", c20662015tC.LIZ.getInt("auto_dismiss_time_v1", 0) + 1);
    }

    public C20661915tB(C0TGX c0tgx, C20515215Pi c20515215Pi, C20662015tC c20662015tC) {
        super(c0tgx);
        this.LL = c20515215Pi;
        this.LLILLJJLI = c20662015tC;
    }
}
