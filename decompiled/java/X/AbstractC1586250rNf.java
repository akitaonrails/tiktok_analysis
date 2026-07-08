package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.main.MainFragment;

/* JADX INFO: renamed from: X.0rNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1586250rNf implements InterfaceC1570900qyu, C0T2Y {
    public InterfaceC1617760sCU LL;
    public C0T2X LLILLJJLI;
    public final String LLILLL = EnumC1584350rKb.SEARCH.getTag();
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1586260rNg());

    @Override // X.InterfaceC1570900qyu
    public void LIZ() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void S1(boolean z) {
    }

    @Override // X.InterfaceC1570900qyu
    public void T1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public void a2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean b2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean c2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public void d2(Integer num) {
    }

    @Override // X.InterfaceC1570900qyu
    public void e2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void g2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onCreate() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1570900qyu
    public void onPause() {
    }

    @Override // X.InterfaceC1570900qyu
    public void onResume() {
    }

    public final InterfaceC1617760sCU LIZJ() {
        InterfaceC1617760sCU interfaceC1617760sCU = this.LL;
        if (interfaceC1617760sCU != null) {
            return interfaceC1617760sCU;
        }
        return null;
    }

    public final void LIZLLL() {
        C19EG activity;
        if (this.LLILLJJLI == null && (activity = LIZJ().getActivity()) != null && this.LLILLJJLI == null) {
            this.LLILLJJLI = C740740T3w.LIZJ(activity, activity, this);
        }
    }

    public final void LJ() {
        C19EG activity;
        if (this.LLILLJJLI == null || (activity = LIZJ().getActivity()) == null) {
            return;
        }
        C740740T3w.LJIIIZ(activity, this.LLILLJJLI);
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean enabled() {
        if (this.LL == null) {
            return !C10EU.LJIIIIZZ();
        }
        String strF3 = LIZJ().f3();
        if (C052X.LIZIZ() && !C0CN5.LJI()) {
            strF3 = "homepage_hot";
        }
        return (TextUtils.equals(strF3, "homepage_hot") || TextUtils.equals(strF3, "homepage_follow") || TextUtils.equals(strF3, "homepage_popular") || TextUtils.equals(strF3, "homepage_friends") || TextUtils.equals(strF3, "homepage_nearby") || TextUtils.equals(strF3, "homepage_explore") || C1591530rWB.LIZIZ.N7(strF3) || TextUtils.equals(strF3, "homepage_playmode_new") || TextUtils.equals(strF3, "homepage_playmode_top") || TextUtils.equals(strF3, "homepage_playmode_moodboost") || C1586050rNL.LIZIZ.LIZLLL(strF3) || TextUtils.equals(strF3, "homepage_series")) && !C10EU.LJIIIIZZ();
    }

    @Override // X.InterfaceC1570900qyu
    public final String getTag() {
        return this.LLILLL;
    }

    public final boolean LIZIZ(View view) {
        C19EG activity = LIZJ().getActivity();
        if (activity == null || C0SHX.LIZ(activity, null).LJI() || C0SHX.LIZ(activity, null).LIZLLL()) {
            return false;
        }
        IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
        if (iFamilyPairingServiceLJIIL == null || !iFamilyPairingServiceLJIIL.LJIIIZ()) {
            return true;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131834392);
        c1389890mGx.LJIIJJI();
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LL = interfaceC1617760sCU;
    }

    @Override // X.InterfaceC1570900qyu
    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LL = interfaceC1617760sCU;
    }
}
