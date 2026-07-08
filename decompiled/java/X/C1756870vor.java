package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.SeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.GroupManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.ItemModuleManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.ItemViewModelManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpBodyListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.TrackParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.CardRegisterProvider;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpInflaterOptExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.SeaPdpMediaControlService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.PdpTriggerService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.action.ISeaPdpActionManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.action.SeaPdpActionManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna.ISeaPdpPageService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.myna.SeaPdpMynaService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756870vor implements InterfaceC713360RyY, InterfaceC737790Swr {
    public final SeaPdpFragment LL;
    public final Lifecycle LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(553));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1642));
    public final PdpContext LLILZIL;
    public final PdpViewModelDelegate LLILZLL;
    public final CardRegisterProvider LLIZ;
    public final ItemViewModelManager LLIZLLLIL;
    public final ItemModuleManager LLJ;
    public final GroupManager LLJI;
    public final CommonParamsContext LLJIJIL;
    public final TrackParamsContext LLJILJIL;
    public final PageStateContext LLJILJILJ;
    public final SeaGodaManagerV2 LLJILLL;
    public final SeaPdpMediaControlService LLJJ;
    public final SeaPdpMynaService LLJJI;
    public final SeaPdpCommunicationService LLJJIII;
    public final SeaPdpActionManager LLJJIJI;
    public final SeaPdpBodyListHelper LLJJIJIIJIL;
    public final PdpTriggerService LLJJIJIL;

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJFF(this.LL, null);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SeaPdpFragmentScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLJJIII, ISeaPdpCommunicationService.class);
        c0qsjLIZIZ.unbindAbility(this.LLJIJIL, CommonParamsContext.class);
        c0qsjLIZIZ.unbindAbility(this.LLJI, GroupManager.class);
        c0qsjLIZIZ.unbindAbility(this.LLJ, ItemModuleManager.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZLLLIL, ItemViewModelManager.class);
        c0qsjLIZIZ.unbindAbility(this.LLJILJILJ, PageStateContext.class);
        c0qsjLIZIZ.unbindAbility(this.LLILZIL, PdpContext.class);
        c0qsjLIZIZ.unbindAbility(this.LLILZLL, PdpViewModelDelegate.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJIJIIJIL, SeaPdpBodyListHelper.class);
        c0qsjLIZIZ.unbindAbility(this.LLJILJIL, TrackParamsContext.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZ, CardRegisterProvider.class);
        c0qsjLIZIZ.unbindAbility(this.LLJILLL, SeaGodaManagerV2.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJ, ISeaPdpMediaControlService.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJIJIL, IPdpTriggerService.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJIJI, ISeaPdpActionManager.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJI, ISeaPdpPageService.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SeaPdpFragmentScope.class});
        c0qsjLIZIZ.bindAbility(this.LLJJIII, ISeaPdpCommunicationService.class);
        c0qsjLIZIZ.bindAbility(this.LLJIJIL, CommonParamsContext.class);
        c0qsjLIZIZ.bindAbility(this.LLJI, GroupManager.class);
        c0qsjLIZIZ.bindAbility(this.LLJ, ItemModuleManager.class);
        c0qsjLIZIZ.bindAbility(this.LLIZLLLIL, ItemViewModelManager.class);
        c0qsjLIZIZ.bindAbility(this.LLJILJILJ, PageStateContext.class);
        c0qsjLIZIZ.bindAbility(this.LLILZIL, PdpContext.class);
        c0qsjLIZIZ.bindAbility(this.LLILZLL, PdpViewModelDelegate.class);
        c0qsjLIZIZ.bindAbility(this.LLJJIJIIJIL, SeaPdpBodyListHelper.class);
        c0qsjLIZIZ.bindAbility(this.LLJILJIL, TrackParamsContext.class);
        c0qsjLIZIZ.bindAbility(this.LLIZ, CardRegisterProvider.class);
        c0qsjLIZIZ.bindAbility(this.LLJILLL, SeaGodaManagerV2.class);
        c0qsjLIZIZ.bindAbility(this.LLJJ, ISeaPdpMediaControlService.class);
        c0qsjLIZIZ.bindAbility(this.LLJJIJIL, IPdpTriggerService.class);
        c0qsjLIZIZ.bindAbility(this.LLJJIJI, ISeaPdpActionManager.class);
        c0qsjLIZIZ.bindAbility(this.LLJJI, ISeaPdpPageService.class);
    }

    public C1756870vor(SeaPdpFragment seaPdpFragment, Lifecycle lifecycle, SeaPdpBodyWidget seaPdpBodyWidget) {
        LifecycleOwner lifecycleOwnerLIZ;
        this.LL = seaPdpFragment;
        this.LLILLJJLI = lifecycle;
        seaPdpFragment.getContext();
        if (EcSeaPdpInflaterOptExperiment.LJFF) {
            lifecycleOwnerLIZ = seaPdpFragment;
        } else {
            Context context = seaPdpFragment.getContext();
            if (context != null) {
                lifecycleOwnerLIZ = C843803Rk.LIZ(context);
            } else {
                lifecycleOwnerLIZ = null;
            }
        }
        this.LLILZIL = new PdpContext(lifecycleOwnerLIZ);
        this.LLILZLL = new PdpViewModelDelegate();
        this.LLIZ = new CardRegisterProvider(k0());
        this.LLIZLLLIL = new ItemViewModelManager();
        this.LLJ = new ItemModuleManager();
        this.LLJI = new GroupManager();
        CommonParamsContext commonParamsContext = new CommonParamsContext();
        this.LLJIJIL = commonParamsContext;
        TrackParamsContext trackParamsContext = new TrackParamsContext();
        this.LLJILJIL = trackParamsContext;
        PageStateContext pageStateContext = new PageStateContext();
        this.LLJILJILJ = pageStateContext;
        this.LLJILLL = new SeaGodaManagerV2(k0());
        k0();
        this.LLJJ = new SeaPdpMediaControlService();
        SeaPdpMynaService seaPdpMynaService = new SeaPdpMynaService(seaPdpFragment.getContext(), k0());
        this.LLJJI = seaPdpMynaService;
        SeaPdpCommunicationService seaPdpCommunicationService = new SeaPdpCommunicationService(k0(), new WeakReference(seaPdpFragment.getContext()), new C599190Nen(), trackParamsContext, pageStateContext, commonParamsContext, seaPdpMynaService, lifecycle);
        this.LLJJIII = seaPdpCommunicationService;
        this.LLJJIJI = new SeaPdpActionManager(k0(), seaPdpFragment, lifecycle, seaPdpCommunicationService, pageStateContext);
        this.LLJJIJIIJIL = new SeaPdpBodyListHelper(seaPdpBodyWidget);
        this.LLJJIJIL = new PdpTriggerService(new C1275304yt(true), lifecycle);
    }
}
