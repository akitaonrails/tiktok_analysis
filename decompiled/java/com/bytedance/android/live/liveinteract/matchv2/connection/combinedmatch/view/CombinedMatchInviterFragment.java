package com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.view;

import X.AbstractC934930aR9;
import X.C01HZ;
import X.C098200Yq;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C1397510mTF;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C20484615Do;
import X.C497740JfY;
import X.C748880TZe;
import X.C753770ThX;
import X.C786410Ut5;
import X.C915900ZwS;
import X.C915980Zwa;
import X.C954460awe;
import X.C961300b7g;
import X.C962520b9e;
import X.C977630bY1;
import X.C978090bYl;
import X.C978100bYm;
import X.C978130bYp;
import X.C978340bZA;
import X.C978350bZB;
import X.C978980baC;
import X.C979690bbL;
import X.EnumC499801x6;
import X.EnumC919170a1j;
import X.EnumC974980bTk;
import X.InterfaceC1631620sYq;
import X.InterfaceC975870bVB;
import X.InterfaceC978260bZ2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchPlaybookPanelDialog;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes16.dex */
public final class CombinedMatchInviterFragment extends CombinedMatchInviterPanelContract$AbsView implements InterfaceC978260bZ2 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowHELIOSPCwjJ2EwJyguICE2LCgtPSw7ZjMlLDh9CyohKyY9LSEBKDswIAwiPyYnLTcKOy40JSAiPQ==";
    public C977630bY1 LLILZ;
    public C978090bYl LLILZIL;
    public DataChannel LLIZ;
    public InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> LLIZLLLIL;
    public C978100bYm LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public EnumC974980bTk LLJILJIL;
    public C1397510mTF LLJILJILJ;
    public InteractDisconnectDialog LLJILLL;
    public boolean LLJJ;
    public boolean LLJJIJI;
    public Function0<Unit> LLILZLL = AFwS203S0000000_15.get$arr$(40);
    public boolean LLJJI = true;
    public final long LLJJIII = System.currentTimeMillis();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        return new C978980baC();
    }

    public final void PR() {
        FragmentManager fragmentManager;
        InteractDisconnectDialog interactDisconnectDialog;
        InteractDisconnectDialog interactDisconnectDialog2 = new InteractDisconnectDialog();
        this.LLJILLL = interactDisconnectDialog2;
        interactDisconnectDialog2.LLIZLLLIL = C497740JfY.LJIJI(2131842675);
        interactDisconnectDialog2.LLJ = C497740JfY.LJIJI(2131842676);
        interactDisconnectDialog2.LLJI = 3;
        interactDisconnectDialog2.LLJILJIL = C497740JfY.LJIJI(2131842737);
        interactDisconnectDialog2.LLJJI = new AwS559S0100000_15(this, 141);
        interactDisconnectDialog2.LLJIJIL = C497740JfY.LJIJI(2131842677);
        boolean z = this.LLJI;
        interactDisconnectDialog2.LLJJ = new AwS559S0100000_15(this, 142);
        interactDisconnectDialog2.LLJILJILJ = z;
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null || (interactDisconnectDialog = this.LLJILLL) == null) {
            return;
        }
        interactDisconnectDialog.show(fragmentManager, "InteractDisconnectDialog");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0aR9, X.0bYv] */
    @Override // X.InterfaceC978260bZ2
    public final void zr() {
        List<Playbook> listLJ;
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", "onMatchPlaybookEntranceClick");
        DataChannel dataChannel = this.LLIZ;
        C979690bbL c979690bbL = dataChannel != null ? (C979690bbL) dataChannel.gg0(C962520b9e.class) : null;
        final int i = 0;
        boolean z = c979690bbL != null && c979690bbL.LIZJ;
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        C978350bZB.LIZIZ(z, "match_panel", false, (interfaceC975870bVBLJFF == null || (listLJ = interfaceC975870bVBLJFF.LJ()) == null) ? 0 : listLJ.size(), "click", LSPassThroughRecordSizeConfig.DEFAULT, this.LLIZ, "entrance", 64);
        C961300b7g c961300b7g = C961300b7g.LIZ;
        C20484615Do c20484615Do = this.LLILLJJLI.LLJJIJIL;
        DataChannel dataChannel2 = this.LLIZ;
        ?? r2 = new AbstractC934930aR9(i) { // from class: X.0bYv
        };
        c961300b7g.getClass();
        if (dataChannel2 == null || c20484615Do == null) {
            return;
        }
        String str = MatchPlaybookPanelDialog._pnsPageId;
        r2.LIZ = dataChannel2;
        c20484615Do.LJIIJ(new MatchPlaybookPanelDialog(r2), "cohost_match_playbook_dialog");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_panel"));
        }
        C01HZ c01hzKi12 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi12 != null) {
            c01hzKi12.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_icon"));
        }
        C978090bYl c978090bYl = this.LLILZIL;
        if (c978090bYl != null) {
            C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", "onDestroy");
            C1548820qPI.LJIIIIZZ("live.match.inviterPanelButtonClick", c978090bYl);
            C1548820qPI.LJIIIIZZ("live.match.inviterPanelPositionForGuide", c978090bYl);
            C1548820qPI.LJIIIIZZ("live.match.inviterPanelStateChangedByUser", c978090bYl);
            C1548820qPI.LJIIIIZZ("live.match.inviterPanelLynxError", c978090bYl);
            C1295960jpS c1295960jpS = c978090bYl.LLIZ;
            if (c1295960jpS != null) {
                c1295960jpS.removeAllAnimatorListeners();
            }
        }
        C977630bY1 c977630bY1 = this.LLILZ;
        if (c977630bY1 != null) {
            c977630bY1.LJJII.setValue(new C978130bYp(false, 0));
            c977630bY1.LJJIIZI.setValue("");
            MutableLiveData<Boolean> mutableLiveData = c977630bY1.LJJJJJ;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            c977630bY1.LJJJJL.setValue(bool);
        }
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C753770ThX.class, null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C978340bZA.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r30, android.os.Bundle r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.view.CombinedMatchInviterFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h7f, viewGroup, false);
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
