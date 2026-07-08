package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C1143680frq;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C973660bRc;
import X.C978980baC;
import X.EnumC452301pR;
import X.EnumC919170a1j;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationSelectionEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CoHostTakeTheStageGuideFragment extends CoHostTakeTheStageGuideContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGHELIOSsuIDV9JCwiImE1OiQrJCo9PGsPJgc8OzEYKCQ2HC0pGjsyLyALPCY3LQM+KCg+LSs4";
    public long LLILZ;
    public Function1<? super EnumC919170a1j, Unit> LLILZIL;
    public C16FS LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS559S0100000_15(this, 399));

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        if (!LivePlazaPanelSimplifiedInfo.INSTANCE.isEnable()) {
            C978980baC c978980baC = new C978980baC();
            c978980baC.LJIIL = false;
            c978980baC.LJIILIIL = false;
            c978980baC.LJIIIIZZ = true;
            return c978980baC;
        }
        C978980baC c978980baC2 = new C978980baC();
        c978980baC2.LJIIL = false;
        c978980baC2.LJIILIIL = false;
        c978980baC2.LJIIIIZZ = true;
        c978980baC2.LJIIIZ = true;
        c978980baC2.LJIIJ = new AwS559S0100000_15(this, 398);
        return c978980baC2;
    }

    public final boolean PR() {
        return ((Boolean) this.LLIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TextView textView;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.x3c);
        if (PR()) {
            str = "ttlive_take_stage_v2_guide_dialog_header_pic.png";
        } else {
            str = "ttlive_take_stage_guide_dialog_header_pic.png";
        }
        C1143680frq.LJ(viewFindViewById, "tiktok_live_interaction_demand_1", str, ImageView.ScaleType.CENTER_CROP);
        C16FS c16fs = (C16FS) view.findViewById(R.id.x3_);
        this.LLILZLL = c16fs;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 159));
        }
        C973660bRc.LIZ.LJJLL("take_stage", null);
        if (PR() && LiveCoHostTakeTheStageDurationSelectionEnableSetting.INSTANCE.isEnabled() && (textView = (TextView) view.findViewById(R.id.x3d)) != null) {
            textView.setText(C497740JfY.LJIJI(2131856847));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (PR()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ht8, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ht7, viewGroup, false);
        }
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
