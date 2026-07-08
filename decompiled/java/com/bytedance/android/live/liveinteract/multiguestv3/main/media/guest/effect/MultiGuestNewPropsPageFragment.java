package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C098200Yq;
import X.C0U96;
import X.C0UH5;
import X.C0UH6;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C474640IjO;
import X.C475510Ikn;
import X.C786410Ut5;
import X.InterfaceC1268640j7O;
import X.InterfaceC769000UEo;
import X.InterfaceC769940UIe;
import X.InterfaceC923870a9J;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.MultiGuestClickMoreStickerEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestNewPropsPageFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyI2LCwtZygmLTY4Zyo1LiAvPWEePSk4IAgmLTY4ByokGDcjOTwDKSIpDz0yLygpJzs=";
    public AbsMultiGuestEffectViewModel LL;
    public FrameLayout LLILLJJLI;
    public int LLILLL;
    public LiveEffect LLILZ;
    public InterfaceC923870a9J LLILZIL;
    public boolean LLILZLL;
    public Function0<Unit> LLIZ;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, MultiGuestClickMoreStickerEvent.class, new AwS591S0100000_12(this, 132));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        C0UH6 effectWrapperProxy;
        ViewGroup viewGroup2;
        InterfaceC769940UIe liveStream;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c95, viewGroup, false);
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LL;
        C19GS c19gs = null;
        if (absMultiGuestEffectViewModel != null) {
            IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
            FrameLayout frameLayout = this.LLILLJJLI;
            int i = this.LLILLL;
            InterfaceC923870a9J interfaceC923870a9J = absMultiGuestEffectViewModel.LLILZ;
            if (interfaceC923870a9J != null && (liveStream = interfaceC923870a9J.getLiveStream()) != null) {
                interfaceC1268640j7OLJIIL = liveStream.LJIIL();
            } else {
                interfaceC1268640j7OLJIIL = null;
            }
            InterfaceC769000UEo interfaceC769000UEoVQ2 = absMultiGuestEffectViewModel.vQ2();
            boolean z = this.LLILZLL;
            InterfaceC923870a9J interfaceC923870a9J2 = this.LLILZIL;
            if (interfaceC923870a9J2 != null) {
                effectWrapperProxy = interfaceC923870a9J2.getEffectWrapperProxy();
            } else {
                effectWrapperProxy = null;
            }
            C0UH5 c0uh5 = new C0UH5(effectWrapperProxy);
            LiveEffect liveEffect = this.LLILZ;
            Function0 function0 = C474640IjO.LJFF;
            if (function0 == null) {
                function0 = AFwS199S0000000_12.get$arr$(38);
            }
            View multiGuestStickerListView = iEffectService.getMultiGuestStickerListView(this, frameLayout, i, interfaceC1268640j7OLJIIL, interfaceC769000UEoVQ2, new C0U96(z, c0uh5, liveEffect, function0, new AwS556S0100000_12(this, 70)));
            if (multiGuestStickerListView != null) {
                if (viewTd instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) viewTd;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    viewGroup2.addView(multiGuestStickerListView, layoutParams);
                }
            }
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
