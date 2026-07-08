package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C01GW;
import X.C098200Yq;
import X.C0UEU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C769740UHk;
import X.C769790UHp;
import X.C781710UlV;
import X.C786410Ut5;
import X.InterfaceC1813060xHU;
import X.InterfaceC769780UHo;
import X.ViewOnClickListenerC1836610xtT;
import Y.AObserverS216S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestGuestPropsPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZyI2LCwtZygmLTY4Zyo1LiAvPWEePSk4IAgmLTY4Djo2OzEcOyAjOxUtLioVOiQrJCo9PA==";
    public RecyclerView LL;
    public C0UEU LLILLJJLI;
    public AbsMultiGuestEffectViewModel LLILLL;
    public ViewOnClickListenerC1836610xtT LLILZ;
    public C781710UlV LLILZIL;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C769740UHk c769740UHk;
        LiveData liveData;
        DataChannel dataChannel;
        LiveData liveData2;
        LiveData liveData3;
        LiveData liveData4;
        LiveData liveData5;
        LiveData liveData6;
        LiveData liveData7;
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.se3);
        this.LLILZ = viewOnClickListenerC1836610xtT;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.LIZLLL();
        }
        this.LL = (RecyclerView) view.findViewById(R.id.w73);
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LLILLL;
        if (absMultiGuestEffectViewModel != null && (liveData7 = (LiveData) absMultiGuestEffectViewModel.LLJI.getValue()) != null) {
            liveData7.observe(this, new AObserverS216S0100000_12(this, 72));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LLILLL;
        if (absMultiGuestEffectViewModel2 != null && (liveData6 = (LiveData) absMultiGuestEffectViewModel2.LLJIJIL.getValue()) != null) {
            liveData6.observe(this, new AObserverS216S0100000_12(this, 73));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel3 = this.LLILLL;
        if (absMultiGuestEffectViewModel3 != null && (liveData5 = (LiveData) absMultiGuestEffectViewModel3.LLJILJIL.getValue()) != null) {
            liveData5.observe(this, new AObserverS216S0100000_12(this, 74));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel4 = this.LLILLL;
        if (absMultiGuestEffectViewModel4 != null && (liveData4 = (LiveData) absMultiGuestEffectViewModel4.LLILZLL.getValue()) != null) {
            liveData4.observe(this, new AObserverS216S0100000_12(this, 11));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel5 = this.LLILLL;
        if (absMultiGuestEffectViewModel5 != null && (liveData3 = (LiveData) absMultiGuestEffectViewModel5.LLIZ.getValue()) != null) {
            liveData3.observe(this, new AObserverS216S0100000_12(this, 12));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel6 = this.LLILLL;
        if (absMultiGuestEffectViewModel6 != null && (liveData2 = (LiveData) absMultiGuestEffectViewModel6.LLIZLLLIL.getValue()) != null) {
            liveData2.observe(this, new AObserverS216S0100000_12(this, 13));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel7 = this.LLILLL;
        if (absMultiGuestEffectViewModel7 != null && (dataChannel = absMultiGuestEffectViewModel7.LLILLJJLI) != null) {
            dataChannel.BQ2(this, MultiGuestPreviewCameraOpenEvent.class, new AwS591S0100000_12(this, 851));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel8 = this.LLILLL;
        if (absMultiGuestEffectViewModel8 != null && (c769740UHk = (C769740UHk) absMultiGuestEffectViewModel8.LLILZIL.getValue()) != null) {
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel9 = c769740UHk.LIZIZ;
            if (absMultiGuestEffectViewModel9 != null && (liveData = (LiveData) absMultiGuestEffectViewModel9.LLJIJIL.getValue()) != null) {
                liveData.setValue(Boolean.TRUE);
            }
            InterfaceC769780UHo interfaceC769780UHoLIZ = c769740UHk.LIZ();
            C01GW<String> c01gw = C769740UHk.LJI;
            interfaceC769780UHoLIZ.LIZJ(C769790UHp.LIZ(), c769740UHk.LJ);
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LLILZ;
        if (viewOnClickListenerC1836610xtT2 != null) {
            viewOnClickListenerC1836610xtT2.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0UHm
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    C769740UHk c769740UHk2;
                    LiveData liveData8;
                    AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel10 = this.LIZ.LLILLL;
                    if (absMultiGuestEffectViewModel10 == null || (c769740UHk2 = (C769740UHk) absMultiGuestEffectViewModel10.LLILZIL.getValue()) == null) {
                        return;
                    }
                    AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel11 = c769740UHk2.LIZIZ;
                    if (absMultiGuestEffectViewModel11 != null && (liveData8 = (LiveData) absMultiGuestEffectViewModel11.LLJIJIL.getValue()) != null) {
                        liveData8.setValue(Boolean.TRUE);
                    }
                    InterfaceC769780UHo interfaceC769780UHoLIZ2 = c769740UHk2.LIZ();
                    C01GW<String> c01gw2 = C769740UHk.LJI;
                    interfaceC769780UHoLIZ2.LIZJ(C769790UHp.LIZ(), c769740UHk2.LJ);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hdp, viewGroup, false);
        C19GS c19gs = null;
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
