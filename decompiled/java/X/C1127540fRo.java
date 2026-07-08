package X;

import Y.AObserverS127S0300000_17;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveFirstRechargeLynxBanner;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.widget.NextLiveData;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127540fRo implements InterfaceC1127800fSE {
    public final LifecycleOwner LL;
    public final GiftPanelLeafViewModel LLILLJJLI;
    public final EnumC1127500fRk LLILLL = EnumC1127500fRk.FIRST_RECHARGE_GIFT;
    public final C01GW LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view, C1124680fNC c1124680fNC) {
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final C0T8B LJ() {
        return (C1124540fMy) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
        LifecycleOwner lifecycleOwner;
        NextLiveData<C1124350fMf> nextLiveData;
        if (!this.LLILZIL || (lifecycleOwner = this.LL) == null) {
            return;
        }
        GiftPanelLeafViewModel giftPanelLeafViewModel = this.LLILLJJLI;
        if (giftPanelLeafViewModel != null && (nextLiveData = giftPanelLeafViewModel.LLJJJJ) != null) {
            nextLiveData.removeObservers(lifecycleOwner);
        }
        this.LLILZIL = false;
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        Gift gift;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
        Object obj = null;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
            InterfaceC1133710fbl.LIZ.getClass();
            if (((C1133940fc8) C1120710fGn.LIZ()).LJI() == gift.id) {
                if (LiveFirstRechargeLynxBanner.INSTANCE.enabled()) {
                    InterfaceC1133710fbl.LIZ.getClass();
                    if (!((C1133940fc8) C1120710fGn.LIZ()).LIZIZ()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public C1127540fRo(View view, LifecycleOwner lifecycleOwner, GiftPanelLeafViewModel giftPanelLeafViewModel) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = giftPanelLeafViewModel;
        this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 540));
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        NextLiveData<C1124350fMf> nextLiveData;
        InterfaceC1133710fbl.LIZ.getClass();
        C1128710fTh c1128710fTh = null;
        if (((C1133940fc8) C1120710fGn.LIZ()).LIZIZ() || ((C1133940fc8) C1120710fGn.LIZ()).LJI() != c1124680fNC.LJFF) {
            return null;
        }
        ((C1124540fMy) this.LLILZ.getValue()).LIZJ();
        AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
        if (abstractC1100450ek7 instanceof C1128710fTh) {
            c1128710fTh = (C1128710fTh) abstractC1100450ek7;
        }
        if (c1128710fTh != null && c1128710fTh.LLLLLLIL) {
            ((C1124540fMy) this.LLILZ.getValue()).LIZ(c1124680fNC.LJFF, "show");
        }
        if (!this.LLILZIL && this.LL != null) {
            this.LLILZIL = true;
            GiftPanelLeafViewModel giftPanelLeafViewModel = this.LLILLJJLI;
            if (giftPanelLeafViewModel != null && (nextLiveData = giftPanelLeafViewModel.LLJJJJ) != null) {
                nextLiveData.observe(this.LL, new AObserverS127S0300000_17(this, interfaceC1124700fNE, c1124680fNC, 0));
            }
        }
        return (View) this.LLILZ.getValue();
    }
}
