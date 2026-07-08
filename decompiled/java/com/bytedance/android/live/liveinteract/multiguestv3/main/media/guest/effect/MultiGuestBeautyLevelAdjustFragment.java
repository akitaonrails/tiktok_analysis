package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C098200Yq;
import X.C12ES;
import X.C1685300txQ;
import X.C189200o6;
import X.C19748912Op;
import X.C19EG;
import X.C19GS;
import X.C786050UsV;
import X.C786410Ut5;
import X.InterfaceC769650UHb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestBeautyLevelAdjustFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiHELIOSZyI2LCwtZygmLTY4Zyo1LiAvPWEePSk4IAgmLTY4CyoyPTE1BSolLSkNLSUmOzEKOy40JSAiPQ==";
    public AbsMultiGuestEffectViewModel LL;
    public C19748912Op LLILLJJLI;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19748912Op c19748912Op;
        InterfaceC769650UHb interfaceC769650UHb;
        Integer numValueOf;
        int iIntValue;
        super.onViewCreated(view, bundle);
        if (view instanceof C19748912Op) {
            c19748912Op = (C19748912Op) view;
        } else {
            c19748912Op = null;
        }
        this.LLILLJJLI = c19748912Op;
        if (c19748912Op != null) {
            C12ES.LJIILL(0, c19748912Op);
        }
        C19748912Op c19748912Op2 = this.LLILLJJLI;
        if (c19748912Op2 != null) {
            c19748912Op2.setSeekbarListener(new C786050UsV(this, 0));
        }
        C19748912Op c19748912Op3 = this.LLILLJJLI;
        if (c19748912Op3 != null) {
            c19748912Op3.setMaxProgress(5);
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LL;
        if (absMultiGuestEffectViewModel != null && (interfaceC769650UHb = absMultiGuestEffectViewModel.LLJILJILJ) != null && (iIntValue = (numValueOf = Integer.valueOf(interfaceC769650UHb.LJI())).intValue()) >= 0 && iIntValue < 6) {
            int iIntValue2 = numValueOf.intValue();
            C19748912Op c19748912Op4 = this.LLILLJJLI;
            if (c19748912Op4 != null) {
                c19748912Op4.setCurrentProgress(iIntValue2);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        C19748912Op c19748912Op5 = this.LLILLJJLI;
        if (c19748912Op5 != null) {
            c19748912Op5.setCurrentProgress(2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dd5, viewGroup, false);
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
