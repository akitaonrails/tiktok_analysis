package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;

/* JADX INFO: renamed from: X.0UHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C769870UHx implements C0UHX {
    public final /* synthetic */ GuestMediaManageFragment LIZ;

    @Override // X.C0UHX
    public final void LIZ() {
        C19P4 c19p4 = this.LIZ.LLJJL;
        if (c19p4 != null) {
            C786410Ut5.LLLILZLLLI(c19p4, 8);
        }
    }

    @Override // X.C0UHX
    public final void LIZIZ() {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        GuestMediaManageFragment guestMediaManageFragment = this.LIZ;
        if (guestMediaManageFragment.LLJJL != null && (multiGuestEffectSwitchFragment = guestMediaManageFragment.LLJZ) != null) {
            C769640UHa c769640UHa = C0UHZ.LJIIJ;
            int i = multiGuestEffectSwitchFragment.LLJJJ;
            c769640UHa.getClass();
            if (i == 1) {
                C786410Ut5.LLLILZLLLI(this.LIZ.LLJJL, 0);
                return;
            }
        }
        C19P4 c19p4 = this.LIZ.LLJJL;
        if (c19p4 != null) {
            C786410Ut5.LLLILZLLLI(c19p4, 8);
        }
    }

    @Override // X.C0UHX
    public final C19P4 LIZJ() {
        return this.LIZ.LLJJL;
    }

    @Override // X.C0UHX
    public final void LIZLLL() {
        C19P4 c19p4 = this.LIZ.LLJJL;
        if (c19p4 != null) {
            C786410Ut5.LLLILZLLLI(c19p4, 8);
        }
    }

    public C769870UHx(GuestMediaManageFragment guestMediaManageFragment) {
        this.LIZ = guestMediaManageFragment;
    }
}
