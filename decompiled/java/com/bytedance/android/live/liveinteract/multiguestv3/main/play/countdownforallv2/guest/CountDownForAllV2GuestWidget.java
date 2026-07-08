package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest;

import X.C01FV;
import X.C01HE;
import X.C01HG;
import X.C303401Fo;
import X.C310501Ih;
import X.C311401Iq;
import X.C319501Lt;
import X.C5183020f;
import X.C766270U4b;
import X.C924240a9u;
import X.InterfaceC1097170eep;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: loaded from: classes.dex */
public final class CountDownForAllV2GuestWidget extends BaseCountDownForAllV2Widget<CountDownForAllV2GuestViewModel> {
    public final C303401Fo LLIZ;
    public final C311401Iq LLIZLLLIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget
    public final String A1() {
        return "CountDownForAllV2GuestWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget, com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.AbstractCountDownForAllWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget
    public final void B1() {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            return;
        }
        final DataChannel dataChannel = this.dataChannel;
        ViewModelProvider.Factory factory = new ViewModelProvider.Factory(dataChannel) { // from class: X.01O3
            public final DataChannel LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = dataChannel;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(CountDownForAllV2GuestViewModel.class)) {
                    return new CountDownForAllV2GuestViewModel(this.LIZ);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
        };
        if (!fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getView() == null) {
            return;
        }
        this.LL = (VM) ViewModelProviders.of(fragment, factory).get(CountDownForAllV2GuestViewModel.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        HashSet<C01HG> hashSet;
        CountdownForAllContent countdownForAllContentWQ2;
        CountdownForAllConfig countdownForAllConfig;
        VM vm = this.LL;
        Long lValueOf = (vm == 0 || (countdownForAllContentWQ2 = vm.wQ2()) == null || (countdownForAllConfig = countdownForAllContentWQ2.playConfig) == null) ? null : Long.valueOf(countdownForAllConfig.targetScore);
        VM vm2 = this.LL;
        Long lValueOf2 = vm2 != 0 ? Long.valueOf(vm2.AQ2(Long.valueOf(UserService.getInstance().user().getCurrentUserId()))) : null;
        if (C310501Ih.LIZLLL != 0) {
            C319501Lt.LIZ();
        }
        if (C310501Ih.LIZJ != 0) {
            C319501Lt.LIZLLL(lValueOf, lValueOf2);
        }
        super.onDestroy();
        this.LLIZ.LIZIZ();
        C311401Iq c311401Iq = this.LLIZLLLIL;
        c311401Iq.getClass();
        Object value = c311401Iq.LIZIZ.getValue();
        if (C924240a9u.LIZ().codeTechSwitchForAndroid != 0 && (hashSet = C01HE.LIZJ) != null) {
            hashSet.remove(value);
        }
        c311401Iq.LIZ = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        HashSet<C01HG> hashSet;
        super.onCreate();
        this.LLIZ.LIZ(new C5183020f(this, 37));
        C311401Iq c311401Iq = this.LLIZLLLIL;
        c311401Iq.LIZ = new C5183020f(this, 38);
        Object value = c311401Iq.LIZIZ.getValue();
        if (C924240a9u.LIZ().codeTechSwitchForAndroid == 0 || (hashSet = C01HE.LIZJ) == null) {
            return;
        }
        hashSet.add((C01HG) value);
    }

    public CountDownForAllV2GuestWidget(ViewGroup viewGroup) {
        super(viewGroup);
        this.LLIZ = new C303401Fo(C01FV.GUEST);
        this.LLIZLLLIL = new C311401Iq();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget
    public final void C1(int i, int i2) {
        Long lValueOf;
        CountdownForAllContent countdownForAllContentWQ2;
        CountdownForAllConfig countdownForAllConfig;
        if (i2 != 2) {
            if (i2 == 3 && !C01HE.LIZJ() && i == 2) {
                this.LLILZLL.LIZ(C924240a9u.LIZ().endAnimation);
            }
        } else {
            VM vm = this.LL;
            if (vm != 0 && vm.vQ2().LJII == 2) {
                C766270U4b.LIZLLL(2131853910);
            }
            if (C01HE.LIZJ() && i == 1) {
                this.LLILZLL.LIZ(C924240a9u.LIZ().endAnimation);
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        VM vm2 = this.LL;
        Long lValueOf2 = null;
        if (vm2 != 0 && (countdownForAllContentWQ2 = vm2.wQ2()) != null && (countdownForAllConfig = countdownForAllContentWQ2.playConfig) != null) {
            lValueOf = Long.valueOf(countdownForAllConfig.targetScore);
        } else {
            lValueOf = null;
        }
        VM vm3 = this.LL;
        if (vm3 != 0) {
            lValueOf2 = Long.valueOf(vm3.AQ2(Long.valueOf(UserService.getInstance().user().getCurrentUserId())));
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1 || numValueOf.intValue() == 2) {
                C319501Lt.LJFF();
            } else if (numValueOf.intValue() == 3) {
                if (C01HE.LIZJ() && C310501Ih.LIZJ != 0) {
                    C319501Lt.LIZLLL(lValueOf, lValueOf2);
                }
                if (!C01HE.LIZJ() && C310501Ih.LIZLLL != 0) {
                    C319501Lt.LIZ();
                }
            }
        }
        super.C1(i, i2);
    }
}
