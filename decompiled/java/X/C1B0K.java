package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisIAADebugErrorFragment;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisIAADebugFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1B0K, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B0K extends AbstractC2196081AxC {
    public C1B0R LIZIZ;

    @Override // X.AbstractC2196081AxC
    public final boolean LIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isMockDebugEnvEnabled, canIAAMock:");
        sbLIZ.append(C204575153d.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        return C204575153d.LIZ();
    }

    @Override // X.AbstractC2196081AxC
    public final TuxSheet LIZLLL() {
        int i = C2187451AjH.LIZ;
        final MinisIAADebugErrorFragment minisIAADebugErrorFragment = new MinisIAADebugErrorFragment();
        minisIAADebugErrorFragment.LLIZLLLIL = new InterfaceC19399710v5() { // from class: X.1B0M
            @Override // X.InterfaceC19399710v5
            public final void f0() {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("transitionErrorSelectSheet, onUserClose, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0R c1b0r = this.LIZ.LIZIZ;
                if (c1b0r != null) {
                    c1b0r.LIZ();
                }
                this.LIZ.LJ(minisIAADebugErrorFragment);
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
                C1B0R c1b0r = this.LIZ.LIZIZ;
                if (c1b0r != null) {
                    c1b0r.LIZIZ(m10nMockDebugErrorInfo);
                }
                this.LIZ.LJ(minisIAADebugErrorFragment);
            }
        };
        TuxSheet tuxSheet = this.LIZ;
        if (tuxSheet != null) {
            tuxSheet.aS(minisIAADebugErrorFragment, true, EnumC344640DfC.SLIDE);
        }
        return this.LIZ;
    }

    @Override // X.AbstractC2196081AxC
    public final void LIZJ(Activity activity) {
        TuxSheet tuxSheet;
        FragmentManager supportFragmentManager;
        MinisIAADebugFragment.LLIZ = new WeakReference<>(this);
        final MinisIAADebugFragment minisIAADebugFragment = new MinisIAADebugFragment();
        minisIAADebugFragment.LLILZIL = new AnonymousClass1260() { // from class: X.1B0O
            @Override // X.AnonymousClass1260
            public final void LIZ() {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showSheet, onUserConfirmSelectSuccess, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0R c1b0r = this.LIZ.LIZIZ;
                if (c1b0r != null) {
                    c1b0r.LIZJ();
                }
                this.LIZ.LJ(minisIAADebugFragment);
            }

            @Override // X.AnonymousClass1260
            public final void LIZIZ() {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showSheet, onUserClosePanel, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0R c1b0r = this.LIZ.LIZIZ;
                if (c1b0r != null) {
                    c1b0r.LIZ();
                }
                this.LIZ.LJ(minisIAADebugFragment);
            }

            @Override // X.AnonymousClass1260
            public final void LIZJ() {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showSheet, onUserConfirmSelectCancel, selectResultCallback:");
                sbLIZ.append(this.LIZ.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1B0R c1b0r = this.LIZ.LIZIZ;
                if (c1b0r != null) {
                    c1b0r.LIZ();
                }
                this.LIZ.LJ(minisIAADebugFragment);
            }
        };
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = minisIAADebugFragment;
            tuxSheet.LLILLJJLI = new C1D15(this, 1);
            tuxSheet.show(supportFragmentManager, "minis-MinisIAAOnlineMockDebug");
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
