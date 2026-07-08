package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.C098200Yq;
import X.C0IJT;
import X.C0UX6;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C474500IjA;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C950220apo;
import X.C978980baC;
import X.InterfaceC960800b6s;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostCollectionContract$AbsView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostShowHistoryListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase1;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostSettingPanelLynxMigrationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostCollectionFragment extends MultiCoHostCollectionContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGHELIOSsuIDV9JCwiImE1OiQrJCo9PGsBPCMnIQYjASAgPAYjJSM2KzElJiEVOiQrJCo9PA==";
    public Function1<? super Long, Unit> LLILZ;
    public View LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public ViewGroup LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public View LLJILJIL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        int i = CoHostShowHistoryListSetting.INSTANCE.isEnable() ? 188 : 136;
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(getString(2131851709));
        c978980baC.LIZJ = i;
        c978980baC.LIZLLL = true;
        c978980baC.LIZIZ = true;
        c978980baC.LJIILL = false;
        c978980baC.LJIILJJIL = false;
        c978980baC.LJIILIIL = false;
        return c978980baC;
    }

    public final void PR(boolean z) {
        Long lValueOf;
        String str;
        if (!z) {
            if (this.LLJI) {
                return;
            } else {
                this.LLJI = true;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ != null) {
            lValueOf = Long.valueOf(roomLIZJ.getId());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("room_id", String.valueOf(lValueOf));
        linkedHashMap.put("anchor_id", String.valueOf(C950220apo.LJ()));
        linkedHashMap.put("current_connection_cnts", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        linkedHashMap.put("channel_id", String.valueOf(C915980Zwa.LJII().getChannelId()));
        if (z) {
            str = "livesdk_connection_history_icon_click";
        } else {
            str = "livesdk_connection_history_icon_show";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public final void RR(boolean z) {
        Long lValueOf;
        String str;
        if (!z) {
            if (this.LLJIJIL) {
                return;
            } else {
                this.LLJIJIL = true;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ != null) {
            lValueOf = Long.valueOf(roomLIZJ.getId());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("room_id", String.valueOf(lValueOf));
        linkedHashMap.put("anchor_id", String.valueOf(C950220apo.LJ()));
        linkedHashMap.put("current_connection_cnts", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        linkedHashMap.put("action_page", "invite_setting_page");
        linkedHashMap.put("current_connection_cnts", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
        linkedHashMap.put("channel_id", String.valueOf(C915980Zwa.LJII().getChannelId()));
        if (z) {
            str = "livesdk_connection_search_icon_click";
        } else {
            str = "livesdk_connection_search_icon_show";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZIL = view;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.dxg);
        this.LLILZLL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS150S0100000_15(this, 257));
        }
        ViewGroup viewGroup2 = this.LLILZLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        RR(false);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.dxf);
        if (CoHostShowHistoryListSetting.INSTANCE.isEnable()) {
            ViewGroup viewGroup3 = this.LLIZ;
            if (viewGroup3 != null) {
                C786410Ut5.K7(viewGroup3, new ACListenerS150S0100000_15(this, 256));
            }
            PR(false);
            ViewGroup viewGroup4 = this.LLIZ;
            if (viewGroup4 != null) {
                C786410Ut5.LJLZ(0, viewGroup4);
            }
        } else {
            ViewGroup viewGroup5 = this.LLIZ;
            if (viewGroup5 != null) {
                C786410Ut5.LJLZ(8, viewGroup5);
            }
        }
        if (LiveCohostSettingPanelLynxMigrationSetting.INSTANCE.isEnabled()) {
            ViewGroup viewGroup6 = (ViewGroup) view.findViewById(R.id.dxh);
            this.LLIZLLLIL = viewGroup6;
            if (viewGroup6 != null) {
                C786410Ut5.K7(viewGroup6, new ACListenerS150S0100000_15(this, 259));
            }
            this.LLJILJIL = view.findViewById(R.id.lup);
            if (InterfaceC960800b6s.LLLLLJLJLL.LIZIZ().intValue() >= 5) {
                View view2 = this.LLJILJIL;
                if (view2 != null) {
                    C500260Jjc.LJIILIIL(view2);
                }
            } else {
                RedDotExtensionKt.LJI(this.LLJILJIL, this, null, C0UX6.COHOST_SETTING_REDDOT, null);
            }
        } else {
            ViewGroup viewGroup7 = (ViewGroup) view.findViewById(R.id.dxh);
            this.LLIZLLLIL = viewGroup7;
            if (viewGroup7 != null) {
                C786410Ut5.K7(viewGroup7, new ACListenerS150S0100000_15(this, 258));
            }
        }
        ViewGroup viewGroup8 = (ViewGroup) view.findViewById(R.id.dxe);
        this.LLJ = viewGroup8;
        if (viewGroup8 != null) {
            if (CohostWithGuestPhase1.INSTANCE.isEnabled()) {
                C500260Jjc.LLFFF(viewGroup8);
                C786410Ut5.K7(viewGroup8, new ACListenerS147S0100000_12(view, 398));
            } else {
                C500260Jjc.LJIILIIL(viewGroup8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gjq, viewGroup, false);
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
