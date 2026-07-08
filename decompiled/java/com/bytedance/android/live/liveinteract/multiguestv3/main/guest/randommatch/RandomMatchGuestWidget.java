package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch;

import X.AbstractC948890anf;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C20441214yg;
import X.C467770IVz;
import X.C946803n0;
import X.C947520alS;
import X.C948450amx;
import X.C948850anb;
import X.C948870and;
import X.InterfaceC1097170eep;
import Y.AObserverS219S0100000_15;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchLinkedIMEvent;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class RandomMatchGuestWidget extends LiveWidget {
    public static final /* synthetic */ int LLILZ = 0;
    public RandomMatchGuestViewModel LL;
    public RandomMatchFragment LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Fragment fragmentLIZ;
        MutableLiveData<C948850anb> mutableLiveData;
        super.onCreate();
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        RandomMatchGuestViewModel randomMatchGuestViewModel = ((interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) && (fragmentLIZ = C946803n0.LIZ(getView())) == null) ? null : (RandomMatchGuestViewModel) ViewModelProviders.of(fragmentLIZ, new C948870and(this.dataChannel)).get(RandomMatchGuestViewModel.class);
        this.LL = randomMatchGuestViewModel;
        if (randomMatchGuestViewModel != null && (mutableLiveData = randomMatchGuestViewModel.LLILLJJLI) != null) {
            mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 14));
        }
        C947520alS.LIZ = this.LL;
        this.dataChannel.BQ2(this, RandomMatchLinkedIMEvent.class, new AwS594S0100000_15(this, 328));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        RandomMatchFragment randomMatchFragment = this.LLILLJJLI;
        if (randomMatchFragment != null) {
            randomMatchFragment.close(1);
        }
        this.LLILLJJLI = null;
        C948450amx.LIZIZ.LJI("RANDOM_MATCH_GUEST_WIDGET");
        C947520alS.LIZ = null;
    }

    public final void x1(int i, AbstractC948890anf abstractC948890anf, Function0<Unit> function0, Function0<Unit> function02) {
        Fragment fragmentLIZ;
        FragmentManager fragmentManager;
        if (this.LLILLL && this.LLILLJJLI != null) {
            return;
        }
        RandomMatchGuestViewModel randomMatchGuestViewModel = this.LL;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) {
            fragmentLIZ = C946803n0.LIZ(getView());
        }
        if (fragmentLIZ != null) {
            fragmentManager = fragmentLIZ.getFragmentManager();
        } else {
            fragmentManager = null;
        }
        if (randomMatchGuestViewModel != null && fragmentManager != null) {
            RandomMatchFragment randomMatchFragment = new RandomMatchFragment(this.dataChannel, i, randomMatchGuestViewModel, function0, function02, abstractC948890anf);
            try {
                if (C19322110iZ.LJFF(fragmentManager, randomMatchFragment, "RandomMatchFragment", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class))) > 0) {
                    this.LLILLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJFF("RandomMatchGuestWidget", "showRandomMatchFragment openSheet failed", th);
            }
            this.LLILLJJLI = randomMatchFragment;
            randomMatchFragment.LLLFFI = new AwS559S0100000_15(this, 269);
        }
    }
}
