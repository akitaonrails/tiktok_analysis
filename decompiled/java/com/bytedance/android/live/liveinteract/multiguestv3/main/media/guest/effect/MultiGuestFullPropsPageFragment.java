package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C098200Yq;
import X.C0UH5;
import X.C0UH6;
import X.C0UHS;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C475510Ikn;
import X.C767820UAa;
import X.C786410Ut5;
import X.InterfaceC1268640j7O;
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
import com.bytedance.android.live.effect.api.MultiGuestStickerFullPanelHiddenStateChangedEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestFullPropsPageFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyI2LCwtZygmLTY4Zyo1LiAvPWEePSk4IAgmLTY4Dzo/JBU+Jj8gGCQrLAkhKSIhLCEn";
    public FrameLayout LL;
    public C0UHS LLILLJJLI;
    public AbsMultiGuestEffectViewModel LLILLL;
    public int LLILZ;
    public InterfaceC923870a9J LLILZIL;
    public boolean LLILZLL;
    public C767820UAa LLIZ;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/media/guest/effect/MultiGuestFullPropsPageFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT/CcsUYmx2t+g2iOAWwrtb2WFWAacyvXjqgKNXY1/6Cdhi0rQYIsS1D020JYs4+0cb9F", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(MultiGuestStickerFullPanelHiddenStateChangedEvent.class, Boolean.valueOf(z));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0UH6 effectWrapperProxy;
        ViewGroup viewGroup2;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        InterfaceC769940UIe liveStream;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c94, viewGroup, false);
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LLILLL;
        C19GS c19gs = null;
        if (absMultiGuestEffectViewModel != null) {
            boolean z = this.LLILZLL;
            InterfaceC923870a9J interfaceC923870a9J = this.LLILZIL;
            if (interfaceC923870a9J != null) {
                effectWrapperProxy = interfaceC923870a9J.getEffectWrapperProxy();
            } else {
                effectWrapperProxy = null;
            }
            C0UH5 c0uh5 = new C0UH5(effectWrapperProxy);
            if (viewTd instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewTd;
            } else {
                viewGroup2 = null;
            }
            this.LLIZ = new C767820UAa(z, c0uh5, viewGroup2, new AwS413S0200000_12(this, absMultiGuestEffectViewModel, 8));
            IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
            FrameLayout frameLayout = this.LL;
            int i = this.LLILZ;
            InterfaceC923870a9J interfaceC923870a9J2 = absMultiGuestEffectViewModel.LLILZ;
            if (interfaceC923870a9J2 != null && (liveStream = interfaceC923870a9J2.getLiveStream()) != null) {
                interfaceC1268640j7OLJIIL = liveStream.LJIIL();
            } else {
                interfaceC1268640j7OLJIIL = null;
            }
            iEffectService.getMultiGuestFullStickerListView(this, frameLayout, i, interfaceC1268640j7OLJIIL, absMultiGuestEffectViewModel.vQ2(), this.LLIZ);
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
