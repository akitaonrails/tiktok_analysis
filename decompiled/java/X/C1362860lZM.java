package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelWidget;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0lZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362860lZM extends C1362920lZS {
    public final InterfaceC1362900lZQ LIZ;
    public SharePanelWidget LIZIZ;

    @Override // X.C1362920lZS, X.InterfaceC1364550lc5
    public final void LIZIZ() {
        SharePanelWidget sharePanelWidget = this.LIZIZ;
        if (sharePanelWidget != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelWidget.LLILZIL;
            if (sharePanelViewModel == null) {
                sharePanelViewModel = null;
            }
            sharePanelViewModel.LJIILL().clear();
            C1364640lcE c1364640lcE = sharePanelWidget.LLJJIII;
            if (c1364640lcE != null) {
                C1364660lcG c1364660lcGLJFF = c1364640lcE.LJFF();
                ((Set) c1364660lcGLJFF.LIZ.getValue()).clear();
                c1364660lcGLJFF.LIZ().clear();
                c1364660lcGLJFF.LIZIZ().clear();
                c1364640lcE.LJI(false);
            }
            C1363390laD c1363390laD = sharePanelWidget.LLIZ;
            (c1363390laD != null ? c1363390laD : null).refresh();
        }
    }

    @Override // X.C1362920lZS, X.InterfaceC1364550lc5
    public final void LIZJ() {
        SharePanelWidget sharePanelWidget = this.LIZIZ;
        if (sharePanelWidget != null) {
            sharePanelWidget.LJIIIIZZ();
        }
    }

    @Override // X.C1362920lZS, X.InterfaceC1364550lc5
    public final List<IMContact> LIZLLL() {
        SharePanelWidget sharePanelWidget = this.LIZIZ;
        if (sharePanelWidget == null) {
            return null;
        }
        SharePanelViewModel sharePanelViewModel = sharePanelWidget.LLILZIL;
        return new ArrayList((sharePanelViewModel != null ? sharePanelViewModel : null).LJIILL());
    }

    @Override // X.C1362920lZS, X.InterfaceC1364550lc5
    public final View LJ() {
        View view;
        SharePanelWidget sharePanelWidget = this.LIZIZ;
        if (sharePanelWidget == null || (view = sharePanelWidget.LLIZLLLIL) == null) {
            return null;
        }
        return view;
    }

    @Override // X.C1362920lZS, X.InterfaceC1364550lc5
    public final void LJFF() {
        SharePanelWidget sharePanelWidget = this.LIZIZ;
        if (sharePanelWidget != null) {
            sharePanelWidget.LJI();
        }
    }

    @Override // X.C1362920lZS, X.InterfaceC1364550lc5
    public final void LIZ(boolean z) {
        SharePanelWidget sharePanelWidget = this.LIZIZ;
        if (sharePanelWidget != null) {
            if (!z) {
                View view = sharePanelWidget.LLIZLLLIL;
                if (view == null) {
                    view = null;
                }
                C786410Ut5.LJLLLLLL(0, view);
                C786410Ut5.LJZ(0, sharePanelWidget.LLILLJJLI.LJ);
                return;
            }
            C786410Ut5.LJZ(8, sharePanelWidget.LLILLJJLI.LJ);
        }
    }

    public C1362860lZM(C1362880lZO c1362880lZO, C1364530lc3 c1364530lc3) {
        this.LIZ = c1364530lc3;
    }
}
