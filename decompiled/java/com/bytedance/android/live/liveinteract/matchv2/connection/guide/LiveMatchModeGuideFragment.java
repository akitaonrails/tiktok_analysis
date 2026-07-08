package com.bytedance.android.live.liveinteract.matchv2.connection.guide;

import X.C098200Yq;
import X.C0N59;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.C20174413wk;
import X.C475510Ikn;
import X.C786410Ut5;
import X.C917450Zyx;
import X.C973660bRc;
import X.C978980baC;
import X.EnumC919170a1j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchModeGuideFragment extends LiveMatchModeGuideContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP3HELIOS19KyoiJyowPCwjJ2E0PSwoLGEfITMpBC4nKy0BJis2DzAlLSoVOiQrJCo9PA==";
    public Function1<? super EnumC919170a1j, Unit> LLILZ;
    public EnumC919170a1j LLILZIL = EnumC919170a1j.UNKNOWN;
    public C0N59 LLILZLL = C0N59.NONE;
    public C1324720kZq LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public C16FS LLJI;
    public boolean LLJIJIL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIIL = false;
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = true;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = C917450Zyx.LIZ[this.LLILZIL.ordinal()];
        String str = (i == 1 || !(i == 2 || i == 3 || i != 4)) ? "solo" : "1vn";
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C973660bRc.LJJLJLI(str, this.LLJIJIL ? "try_now" : "blank", null, 4);
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.guide.LiveMatchModeGuideFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.gg0(RoomChannel.class);
        }
        C19GS c19gs = null;
        if (this.LLILZLL == C0N59.ICY_CLASH) {
            ComposeView composeView = new ComposeView(requireContext(), null, 6);
            composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
            C20174413wk.LIZIZ(composeView, new C19719212De(-1528932721, new AwS629S0100000_15(this, 15), true));
            viewTd = composeView;
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.g8f, viewGroup, false);
        }
        boolean z = viewTd instanceof View;
        View view = viewTd;
        if (!z) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
