package com.bytedance.android.live.liveinteract.matchv2.connection.matchoption;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20174413wk;
import X.C978980baC;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.coordinator.TriggerCombinedMatchPanelDismissEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchOptionSettingFragment extends MatchOptionSettingContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyHELIOSoiJyowPCwjJ2E+KTEvISAjPCwjJ2EeKTEvIQAjPCwjJxw2PDElJygVOiQrJCo9PA==";
    public ComposeView LLILZ;
    public MatchOptionViewModel LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public DataChannel LLJI;
    public Function0<Unit> LLJIJIL = AFwS203S0000000_15.get$arr$(42);
    public boolean LLJILJIL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIIL = true;
        c978980baC.LIZ = SpannableString.valueOf(getString(2131853037));
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = true;
        c978980baC.LIZLLL = true;
        c978980baC.LJIIIZ = true;
        c978980baC.LIZJ = -2;
        c978980baC.LJIJ = true;
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 146);
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ComposeView composeView = this.LLILZ;
        if (composeView != null) {
            C20174413wk.LIZIZ(composeView, new C19719212De(-72141810, new AwS629S0100000_15(this, 16), true));
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.BQ2(this, TriggerCombinedMatchPanelDismissEvent.class, new AwS594S0100000_15(this, 132));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView;
        Context context;
        C19GS c19gs = null;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            composeView = new ComposeView(context, null, 6);
            this.LLILZ = composeView;
        } else {
            composeView = null;
        }
        if (!(composeView instanceof View)) {
            composeView = null;
        }
        if (composeView != null) {
            try {
                ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(composeView, this);
                composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return composeView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return composeView;
    }
}
