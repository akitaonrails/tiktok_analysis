package com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view;

import X.C098200Yq;
import X.C1117360fBO;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C978980baC;
import X.C979480bb0;
import X.C979500bb2;
import X.C979520bb4;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.coordinator.TriggerCombinedMatchPanelDismissEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TwoMatchInviterSimpleFragment extends TwoMatchInviterSimpleContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2EnPyHELIOSohKDswIGsvJiAhLCwiKDs8OmslJzk6PCA+Zzk6LTJiHTg8BSQ4KicaJjMlPSohGywhOSM2DjctLiI2JjE=";
    public RunnableC781530UlD LLILZ;
    public C1117360fBO LLILZIL;
    public C979480bb0 LLILZLL;
    public DataChannel LLIZ;
    public C979500bb2 LLIZLLLIL;
    public final C979520bb4 LLJ = new C979520bb4(-1, -1);

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        return PR(null);
    }

    public final C978980baC PR(Function0<Unit> function0) {
        ComposeView composeViewLIZIZ;
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIILIIL = false;
        c978980baC.LIZIZ = true;
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131843042));
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(function0, (Function0<Unit>) 158);
        c978980baC.LJIIJJI = new AwS559S0100000_15(function0, (Function0<Unit>) 159);
        C979480bb0 c979480bb0 = this.LLILZLL;
        if (c979480bb0 != null) {
            composeViewLIZIZ = c979480bb0.LJIILLIIL.LIZIZ(c979480bb0.LJIIJJI, c979480bb0.LJIIIIZZ, c979480bb0.LJIIIZ, true);
        } else {
            composeViewLIZIZ = null;
        }
        c978980baC.LJII = composeViewLIZIZ;
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1117360fBO c1117360fBO;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, TriggerCombinedMatchPanelDismissEvent.class, new AwS594S0100000_15(this, 141));
        }
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.o2k);
        this.LLILZ = runnableC781530UlD;
        runnableC781530UlD.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.LLILZIL = new C1117360fBO();
        C979500bb2 c979500bb2 = this.LLIZLLLIL;
        if (c979500bb2 != null) {
            C979480bb0 c979480bb0 = new C979480bb0(this, c979500bb2, getViewLifecycleOwner(), this.LLJ, new AwS594S0100000_15(this, 142));
            this.LLILZLL = c979480bb0;
            c979480bb0.LJIILIIL = new C979520bb4(2, 4);
        }
        C979480bb0 c979480bb02 = this.LLILZLL;
        if (c979480bb02 != null && (c1117360fBO = this.LLILZIL) != null) {
            c1117360fBO.LLLI(C979520bb4.class, c979480bb02);
        }
        C1117360fBO c1117360fBO2 = this.LLILZIL;
        if (c1117360fBO2 != null) {
            c1117360fBO2.LL = Collections.singletonList(this.LLJ);
        }
        runnableC781530UlD.setAdapter(this.LLILZIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated, recyclerView: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", adapter: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", twoMatchInviterItem: ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", binder: ");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LIZIZ("TwoMatchInviterSimpleFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1117360fBO c1117360fBO3 = this.LLILZIL;
        if (c1117360fBO3 != null) {
            c1117360fBO3.notifyDataSetChanged();
        }
        this.LL.Vh(PR(null));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gcu, viewGroup, false);
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
