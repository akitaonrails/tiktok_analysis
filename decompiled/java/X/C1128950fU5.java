package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftPanelDomainRefactorSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fU5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128950fU5 {
    public final C1128710fTh LIZ;
    public final Function0<Fragment> LIZIZ;
    public GiftPanelCoordinatorViewModel LIZJ;
    public AnonymousClass0956 LIZLLL;
    public AnonymousClass0956 LJ;
    public boolean LJFF;
    public final C1129160fUQ LJI = new C1129160fUQ(new C1128880fTy(this), new AwS561S0100000_17(this, 465), new AwS631S0100000_17(this, 34));

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJ = null;
    }

    public final boolean LIZIZ(C1129080fUI c1129080fUI) {
        LifecycleCoroutineScope lifecycleScope;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Entry] init - roomId=");
        sbLIZ.append(c1129080fUI.LIZ);
        C20441214yg.LJIIIZ("GiftMVI.Delegate", C2188811AlT.LIZIZ(sbLIZ));
        C1129160fUQ c1129160fUQ = this.LJI;
        c1129160fUQ.LIZLLL = -1L;
        c1129160fUQ.LJ = false;
        Fragment fragmentInvoke = this.LIZIZ.invoke();
        if (fragmentInvoke == null) {
            C20441214yg.LJIIL("GiftMVI.Delegate", "[Entry] init aborted - fragment unavailable");
            return false;
        }
        if (!fragmentInvoke.isAdded()) {
            C20441214yg.LJIIL("GiftMVI.Delegate", "[Entry] init aborted - fragment not added");
            return false;
        }
        GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel = this.LIZJ;
        if (giftPanelCoordinatorViewModel == null) {
            try {
                ViewModel viewModel = new ViewModelProvider(fragmentInvoke, new ViewModelProvider.Factory() { // from class: X.0fWL
                    public final InterfaceC1130090fVv LIZ = new C1133270fb3(new C1133290fb5(), new C1130360fWM());

                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                    }

                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                    }

                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public final <T extends ViewModel> T create(Class<T> cls) {
                        if (Intrinsics.LJFF(cls, GiftPanelCoordinatorViewModel.class)) {
                            return new GiftPanelCoordinatorViewModel(this.LIZ);
                        }
                        "Factory only supports GiftPanelCoordinatorViewModel".toString();
                        throw new IllegalArgumentException("Factory only supports GiftPanelCoordinatorViewModel");
                    }
                }).get((Class<ViewModel>) GiftPanelCoordinatorViewModel.class);
                this.LIZJ = (GiftPanelCoordinatorViewModel) viewModel;
                giftPanelCoordinatorViewModel = (GiftPanelCoordinatorViewModel) viewModel;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("GiftMVI.Delegate", "[Entry] resolveCoordinator failed", e);
            }
            if (giftPanelCoordinatorViewModel == null) {
                C20441214yg.LJIIL("GiftMVI.Delegate", "[Entry] init aborted - coordinator unavailable");
                return false;
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LifecycleOwner value = fragmentInvoke.getViewLifecycleOwnerLiveData().getValue();
        if (value == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(value)) == null) {
            C20441214yg.LJIIL("GiftMVI.Delegate", "[Entry] viewLifecycleOwner unavailable, fallback to fragment lifecycle");
            lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentInvoke);
        }
        this.LIZLLL = C23250099c.LIZLLL(lifecycleScope, this.LIZ.LLZZ, null, new C1129170fUR(giftPanelCoordinatorViewModel, this, null), 2);
        LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[Coordinator] requestOpenPanel - roomId=");
        sbLIZ2.append(c1129080fUI.LIZ);
        C20441214yg.LJIIIZ("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ2));
        giftPanelCoordinatorViewModel.LLILZIL = new C1125130fNv(c1129080fUI);
        long jIncrementAndGet = giftPanelCoordinatorViewModel.LLIZLLLIL.incrementAndGet();
        giftPanelCoordinatorViewModel.LLJ = jIncrementAndGet;
        AnonymousClass0956 anonymousClass09562 = giftPanelCoordinatorViewModel.LLILZLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09563 = giftPanelCoordinatorViewModel.LLIZ;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        giftPanelCoordinatorViewModel.LLILZLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(giftPanelCoordinatorViewModel), giftPanelCoordinatorViewModel.LLJI, null, new C1129110fUL(giftPanelCoordinatorViewModel, c1129080fUI, jIncrementAndGet, null), 2);
        return true;
    }

    public final void LIZJ(String str) {
        if (!this.LJFF) {
            return;
        }
        this.LJFF = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Snapshot] invalidated - reason=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("GiftMVI.Delegate", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1128950fU5(C1128710fTh c1128710fTh, AwS561S0100000_17 awS561S0100000_17) {
        this.LIZ = c1128710fTh;
        this.LIZIZ = awS561S0100000_17;
    }

    public final boolean LJ(C1129280fUc c1129280fUc, Function1<? super C1886107a7, Unit> function1) {
        GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel = this.LIZJ;
        if (giftPanelCoordinatorViewModel == null) {
            return false;
        }
        LIZ();
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJLIIIJ = this.LIZ.LJJLIIIJ();
        C1128710fTh c1128710fTh = this.LIZ;
        this.LJ = C23250099c.LIZLLL(lifecycleCoroutineScopeLJJLIIIJ, c1128710fTh.LLJILJILJ.plus(c1128710fTh.LLZZ), null, new C1129100fUK(giftPanelCoordinatorViewModel, c1129280fUc, function1, null), 2);
        return true;
    }

    public final void LIZLLL(int i, long j, List list) {
        if (!GiftPanelDomainRefactorSettings.isEnabled()) {
            return;
        }
        LIZ();
        GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel = this.LIZJ;
        if (giftPanelCoordinatorViewModel != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Coordinator] requestApplyExternalGiftPages - pages=");
            sbLIZ.append(list.size());
            C20441214yg.LJIIIZ("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ));
            long jIncrementAndGet = giftPanelCoordinatorViewModel.LLIZLLLIL.incrementAndGet();
            giftPanelCoordinatorViewModel.LLJ = jIncrementAndGet;
            AnonymousClass0956 anonymousClass0956 = giftPanelCoordinatorViewModel.LLILZLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            giftPanelCoordinatorViewModel.LLILZLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(giftPanelCoordinatorViewModel), giftPanelCoordinatorViewModel.LLJI, null, new C1129120fUM(giftPanelCoordinatorViewModel, list, i, j, jIncrementAndGet, null), 2);
        }
    }
}
