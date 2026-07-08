package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisSubscriptionDebugErrorFragment;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisSubscriptionDebugFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1B0J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B0J extends AbstractC2196081AxC {
    public C1B0H LIZIZ;

    @Override // X.AbstractC2196081AxC
    public final boolean LIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isMockDebugEnvEnabled, canSubscriptionMock:");
        sbLIZ.append(C204575153d.LIZLLL());
        C2188811AlT.LIZIZ(sbLIZ);
        return C204575153d.LIZLLL();
    }

    @Override // X.AbstractC2196081AxC
    public final TuxSheet LIZLLL() {
        final MinisSubscriptionDebugErrorFragment minisSubscriptionDebugErrorFragment = new MinisSubscriptionDebugErrorFragment();
        minisSubscriptionDebugErrorFragment.LLIZLLLIL = new InterfaceC19399710v5() { // from class: X.1B0Q
            @Override // X.InterfaceC19399710v5
            public final void f0() {
                C1B0H c1b0h = this.LIZ.LIZIZ;
                if (c1b0h != null) {
                    c1b0h.LIZ();
                }
                this.LIZ.LJ(minisSubscriptionDebugErrorFragment);
            }

            @Override // X.InterfaceC19399710v5
            public final void g0() {
                TuxSheet tuxSheet = this.LIZ.LIZ;
                if (tuxSheet != null) {
                    tuxSheet.WR();
                }
            }

            @Override // X.InterfaceC19399710v5
            public final void h0(M10nMockDebugErrorInfo m10nMockDebugErrorInfo) {
                C1B0H c1b0h = this.LIZ.LIZIZ;
                if (c1b0h != null) {
                    c1b0h.LIZIZ(m10nMockDebugErrorInfo);
                }
                this.LIZ.LJ(minisSubscriptionDebugErrorFragment);
            }
        };
        TuxSheet tuxSheet = this.LIZ;
        if (tuxSheet != null) {
            tuxSheet.aS(minisSubscriptionDebugErrorFragment, true, EnumC344640DfC.SLIDE);
        }
        return this.LIZ;
    }

    @Override // X.AbstractC2196081AxC
    public final void LIZJ(Activity activity) {
        TuxSheet tuxSheet;
        FragmentManager supportFragmentManager;
        MinisSubscriptionDebugFragment.LLIZ = new WeakReference<>(this);
        final MinisSubscriptionDebugFragment minisSubscriptionDebugFragment = new MinisSubscriptionDebugFragment();
        minisSubscriptionDebugFragment.LLILZIL = new AnonymousClass1260() { // from class: X.1B0I
            @Override // X.AnonymousClass1260
            public final void LIZ() {
                C1B0H c1b0h = this.LIZ.LIZIZ;
                if (c1b0h != null) {
                    c1b0h.LIZJ();
                }
                this.LIZ.LJ(minisSubscriptionDebugFragment);
            }

            @Override // X.AnonymousClass1260
            public final void LIZIZ() {
                C1B0H c1b0h = this.LIZ.LIZIZ;
                if (c1b0h != null) {
                    c1b0h.LIZ();
                }
                this.LIZ.LJ(minisSubscriptionDebugFragment);
            }

            @Override // X.AnonymousClass1260
            public final void LIZJ() {
                C1B0H c1b0h = this.LIZ.LIZIZ;
                if (c1b0h != null) {
                    c1b0h.LIZ();
                }
                this.LIZ.LJ(minisSubscriptionDebugFragment);
            }
        };
        C19EG c19egLIZ = C1507205vC.LIZ(activity);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = minisSubscriptionDebugFragment;
            tuxSheet.LLILLJJLI = new C1D15(this, 3);
            tuxSheet.show(supportFragmentManager, "minis-MinisSubscriptionOnlineMockDebug");
        } else {
            tuxSheet = null;
        }
        this.LIZ = tuxSheet;
    }

    public final void LJ(Fragment fragment) {
        if (fragment != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragment, new C343950De5());
        }
        this.LIZ = null;
    }
}
