package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisIAPDebugErrorFragment;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisIAPDebugFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1B0L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B0L extends AbstractC2196081AxC {
    public C1B0S LIZIZ;

    @Override // X.AbstractC2196081AxC
    public final boolean LIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isMockDebugEnvEnabled, canIAPPaymentMock:");
        sbLIZ.append(C204575153d.LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        return C204575153d.LIZIZ();
    }

    @Override // X.AbstractC2196081AxC
    public final TuxSheet LIZLLL() {
        int i = C2187451AjH.LIZ;
        final MinisIAPDebugErrorFragment minisIAPDebugErrorFragment = new MinisIAPDebugErrorFragment();
        minisIAPDebugErrorFragment.LLIZLLLIL = new InterfaceC19399710v5() { // from class: X.1B0N
            @Override // X.InterfaceC19399710v5
            public final void f0() {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("transitionErrorSelectSheet, onUserClose, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0S c1b0s = this.LIZ.LIZIZ;
                if (c1b0s != null) {
                    c1b0s.LIZ();
                }
                this.LIZ.LJ(minisIAPDebugErrorFragment);
            }

            @Override // X.InterfaceC19399710v5
            public final void g0() {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("transitionErrorSelectSheet, onUserBack, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                TuxSheet tuxSheet = this.LIZ.LIZ;
                if (tuxSheet != null) {
                    tuxSheet.WR();
                }
            }

            @Override // X.InterfaceC19399710v5
            public final void h0(M10nMockDebugErrorInfo m10nMockDebugErrorInfo) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("transitionErrorSelectSheet, onUserSubmit, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0S c1b0s = this.LIZ.LIZIZ;
                if (c1b0s != null) {
                    c1b0s.LIZIZ(m10nMockDebugErrorInfo);
                }
                this.LIZ.LJ(minisIAPDebugErrorFragment);
            }
        };
        TuxSheet tuxSheet = this.LIZ;
        if (tuxSheet != null) {
            tuxSheet.aS(minisIAPDebugErrorFragment, true, EnumC344640DfC.SLIDE);
        }
        return this.LIZ;
    }

    @Override // X.AbstractC2196081AxC
    public final void LIZJ(Activity activity) {
        TuxSheet tuxSheet;
        FragmentManager supportFragmentManager;
        MinisIAPDebugFragment.LLIZ = new WeakReference<>(this);
        final MinisIAPDebugFragment minisIAPDebugFragment = new MinisIAPDebugFragment();
        minisIAPDebugFragment.LLILZIL = new AnonymousClass1260() { // from class: X.1B0P
            @Override // X.AnonymousClass1260
            public final void LIZ() {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showSheet, onUserConfirmSelectSuccess, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0S c1b0s = this.LIZ.LIZIZ;
                if (c1b0s != null) {
                    c1b0s.LIZJ();
                }
                this.LIZ.LJ(minisIAPDebugFragment);
            }

            @Override // X.AnonymousClass1260
            public final void LIZIZ() {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showSheet, onUserClosePanel, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0S c1b0s = this.LIZ.LIZIZ;
                if (c1b0s != null) {
                    c1b0s.LIZ();
                }
                this.LIZ.LJ(minisIAPDebugFragment);
            }

            @Override // X.AnonymousClass1260
            public final void LIZJ() {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showSheet, onUserConfirmSelectCancel, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0S c1b0s = this.LIZ.LIZIZ;
                if (c1b0s != null) {
                    c1b0s.LIZ();
                }
                this.LIZ.LJ(minisIAPDebugFragment);
            }
        };
        C19EG c19egLIZ = C1507205vC.LIZ(activity);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = minisIAPDebugFragment;
            tuxSheet.LLILLJJLI = new C1D15(this, 2);
            tuxSheet.show(supportFragmentManager, "minis-MinisIAPOnlineMockDebug");
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
        int i = C2187451AjH.LIZ;
    }
}
