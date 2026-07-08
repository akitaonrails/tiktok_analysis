package X;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DZY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZY implements C0M1L {
    public final List<C0M1L> LIZ;
    public final LifecycleOwner LIZIZ;
    public View LIZJ;
    public C1DZU LJIIIZ;
    public C1DZV LJIIJ;
    public C1DZW LJIIJJI;
    public C1DZT LJIIL;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 5));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 0));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS579S0100000_35(this, 1));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 2));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS579S0100000_35(this, 3));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 4));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(1));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(0));

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public final void LIZIZ() {
        C1DZT c1dzt;
        C1DZU c1dzu;
        C1DZV c1dzv;
        C1DZW c1dzw = this.LJIIJJI;
        if ((c1dzw == null || !c1dzw.LIZLLL()) && (((c1dzt = this.LJIIL) == null || !c1dzt.LIZLLL()) && (((c1dzu = this.LJIIIZ) == null || !c1dzu.LIZLLL()) && ((c1dzv = this.LJIIJ) == null || !c1dzv.LIZLLL())))) {
            View view = (View) this.LIZLLL.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        View view2 = (View) this.LIZLLL.getValue();
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
    }

    public C1DZY(LifecycleOwner lifecycleOwner, List list) {
        this.LIZ = list;
        this.LIZIZ = lifecycleOwner;
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        if (view == null) {
            return;
        }
        this.LIZJ = view;
        View view2 = (View) this.LIZLLL.getValue();
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        if (((Boolean) this.LJIILJJIL.getValue()).booleanValue()) {
            C1DZU c1dzu = new C1DZU(this.LIZIZ);
            View view3 = (View) this.LJI.getValue();
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            c1dzu.LIZ((View) this.LJI.getValue(), draftBoxPageViewModel, null);
            this.LIZ.add(c1dzu);
            this.LJIIIZ = c1dzu;
            C1DZV c1dzv = new C1DZV(this.LIZIZ);
            View view4 = (View) this.LJFF.getValue();
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            c1dzv.LIZ((View) this.LJFF.getValue(), draftBoxPageViewModel, null);
            this.LIZ.add(c1dzv);
            this.LJIIJ = c1dzv;
        } else if (((Boolean) this.LJIILIIL.getValue()).booleanValue()) {
            C1DZW c1dzw = new C1DZW(this.LIZIZ);
            View view5 = (View) this.LJII.getValue();
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            c1dzw.LIZ((View) this.LJII.getValue(), draftBoxPageViewModel, null);
            this.LIZ.add(c1dzw);
            this.LJIIJJI = c1dzw;
            C1DZT c1dzt = new C1DZT(this.LIZIZ);
            View view6 = (View) this.LJIIIIZZ.getValue();
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(8, view6);
            }
            c1dzt.LIZ((View) this.LJIIIIZZ.getValue(), draftBoxPageViewModel, null);
            this.LIZ.add(c1dzt);
            this.LJIIL = c1dzt;
        }
        AVDraftMigrateService aVDraftMigrateService = (AVDraftMigrateService) PluggableExtentionKt.pluggableSpi$default(AVDraftMigrateService.class, false, false, false, 14, null);
        if (aVDraftMigrateService != null) {
            aVDraftMigrateService.observeMigrateFlowStatus(this.LIZIZ, new AwS614S0100000_35(this, 0));
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0M2P(draftBoxPageViewModel, this, null), 2);
    }
}
