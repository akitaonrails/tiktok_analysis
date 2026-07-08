package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.push.MultiGuestTopLivePushCardFragment;
import com.ss.android.ugc.aweme.hangout.container.LiveHangoutFragmentV2;

/* JADX INFO: renamed from: X.0Ioh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477930Ioh {
    public final Fragment LIZ;
    public final String LIZIZ = "LiveHangoutFragmentV2";
    public MultiGuestTopLivePushCardFragment LIZJ;
    public boolean LIZLLL;
    public C11JF LJ;
    public InterfaceC420801kM LJFF;

    public final boolean LIZ() {
        return this.LIZ.isAdded() && !this.LIZ.getChildFragmentManager().LJLJJI();
    }

    public final void LIZIZ() {
        C20441214yg.LIZIZ(this.LIZIZ, "clearPushCard");
        MultiGuestTopLivePushCardFragment multiGuestTopLivePushCardFragment = this.LIZJ;
        if (multiGuestTopLivePushCardFragment != null) {
            if (LIZ()) {
                try {
                    multiGuestTopLivePushCardFragment.dismiss();
                    this.LIZLLL = false;
                    this.LIZJ = null;
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF(this.LIZIZ, "dismiss pushCardDialog failed", e);
                    this.LIZLLL = true;
                }
            } else {
                this.LIZLLL = true;
            }
        }
        C11JF c11jf = this.LJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = this.LJ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            this.LJ = null;
        }
        InterfaceC420801kM interfaceC420801kM = this.LJFF;
        if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
            return;
        }
        InterfaceC420801kM interfaceC420801kM2 = this.LJFF;
        if (interfaceC420801kM2 != null) {
            interfaceC420801kM2.dispose();
        }
        this.LJFF = null;
    }

    public C477930Ioh(LiveHangoutFragmentV2 liveHangoutFragmentV2) {
        this.LIZ = liveHangoutFragmentV2;
    }
}
