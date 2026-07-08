package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC979790bbV;
import X.C01HZ;
import X.C098200Yq;
import X.C0R9K;
import X.C0UX6;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C13LP;
import X.C163000js;
import X.C1685300txQ;
import X.C176600m4;
import X.C1844470y69;
import X.C1844500y6C;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20394614rA;
import X.C20399014rs;
import X.C20406014t0;
import X.C204587153p;
import X.C410901il;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915900ZwS;
import X.C915980Zwa;
import X.C978980baC;
import X.C979040baI;
import X.C979060baK;
import X.C979070baL;
import X.C979690bbL;
import X.C979880bbe;
import X.C980060bbw;
import X.C980070bbx;
import X.C985960blS;
import X.C986010blX;
import X.EnumC499801x6;
import X.InterfaceC1844530y6F;
import X.InterfaceC204589153r;
import X.InterfaceC975870bVB;
import X.InterfaceC978780bZs;
import X.RunnableC781530UlD;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.MatchPlaybookCapabilityShowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.biz.PlaybookBizDataChanged;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchManagementFragment extends MatchManagementPanelContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyHELIOSIyPCYkZzo6ZiM+KCg+LSs4ZwIyPCYkBC49KSIpJCo9PAM+KCg+LSs4";
    public DataChannel LLILZ;
    public C979690bbL LLILZLL;
    public boolean LLIZLLLIL;
    public String LLJ;
    public RunnableC781530UlD LLJI;
    public C1844470y69 LLJILJIL;
    public View LLJILJILJ;
    public Function1<? super Function1<? super Boolean, Unit>, Unit> LLILZIL = AFwS250S0000000_15.get$arr$(37);
    public Function0<Unit> LLIZ = AFwS203S0000000_15.get$arr$(39);
    public final C1117360fBO LLJIJIL = new C1117360fBO();
    public final long LLJILLL = System.currentTimeMillis();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        return new C978980baC();
    }

    @Override // com.bytedance.android.live.liveinteract.match.ui.fragment.MatchManagementPanelContract$AbsView
    public final void PR() {
        C410901il c410901il;
        C1117360fBO c1117360fBO = this.LLJIJIL;
        AbstractC979790bbV abstractC979790bbV = (AbstractC979790bbV) this.LLILLL;
        if (abstractC979790bbV == null || (c410901il = abstractC979790bbV.LLILLJJLI) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
        this.LLJIJIL.notifyDataSetChanged();
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(C13LP.LJJJLL(this.LLJIJIL.LL) instanceof C980070bbx ? 8 : 0, view);
        }
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.FQ2(PlaybookBizDataChanged.class);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        InterfaceC975870bVB interfaceC975870bVBLJFF;
        if (this.LLJILJIL != null && C163000js.LIZ()) {
            RedDotExtensionKt.LJFF(C0UX6.MATCH_SETTING_AI_COMMENTARY_REDDOT);
        }
        if (this.LLILZLL != null && (interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF()) != null) {
            interfaceC975870bVBLJFF.LIZ();
        }
        C979690bbL c979690bbL = this.LLILZLL;
        if (c979690bbL != null && (weakReference = c979690bbL.LIZ) != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZIZ(true);
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_panel"));
        }
        C01HZ c01hzKi12 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi12 != null) {
            c01hzKi12.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_icon"));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC21673719rz itemAnimator;
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        Boolean boolValueOf;
        AbstractC21673719rz itemAnimator2;
        AbstractC21674919sB abstractC21674919sB;
        C1844470y69 c1844470y69;
        super.onViewCreated(view, bundle);
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF != null) {
            interfaceC975870bVBLJFF.LJIIIZ("1001");
        }
        this.LLJILJIL = (C1844470y69) view.findViewById(R.id.dxq);
        this.LLJI = (RunnableC781530UlD) view.findViewById(R.id.tvy);
        this.LLJILJILJ = view.findViewById(R.id.v_bottom_border);
        C1844470y69 c1844470y692 = this.LLJILJIL;
        if (c1844470y692 != null) {
            c1844470y692.setExitClickListener(new AwS559S0100000_15(this, 1068));
        }
        if (C163000js.LIZ() && (c1844470y69 = this.LLJILJIL) != null) {
            LifecycleOwner viewLifecycleOwner = this.LLILLJJLI.getViewLifecycleOwner();
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1070);
            if (C163000js.LIZ()) {
                LiveIconView liveIconView = c1844470y69.LLILLL;
                if (liveIconView != null) {
                    C500260Jjc.LLFFF(liveIconView);
                }
                RedDotExtensionKt.LJI(c1844470y69.LLILZ, viewLifecycleOwner, null, C0UX6.MATCH_SETTING_AI_COMMENTARY_REDDOT, null);
                LiveIconView liveIconView2 = c1844470y69.LLILLL;
                if (liveIconView2 != null) {
                    C786410Ut5.g8(liveIconView2, new ACListenerS150S0100000_15(awS559S0100000_15, 278));
                }
            }
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJI;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setAdapter(this.LLJIJIL);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJI;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJI;
        if (runnableC781530UlD3 != null) {
            itemAnimator = runnableC781530UlD3.getItemAnimator();
        } else {
            itemAnimator = null;
        }
        if (itemAnimator instanceof AbstractC21674919sB) {
            RunnableC781530UlD runnableC781530UlD4 = this.LLJI;
            if (runnableC781530UlD4 != null) {
                itemAnimator2 = runnableC781530UlD4.getItemAnimator();
            } else {
                itemAnimator2 = null;
            }
            if ((itemAnimator2 instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator2) != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        String str = this.LLJ;
        if (str == null) {
            C979690bbL c979690bbL = this.LLILZLL;
            if (c979690bbL != null) {
                boolValueOf = Boolean.valueOf(c979690bbL.LIZJ);
            } else {
                boolValueOf = null;
            }
            if (C176600m4.LIZIZ(boolValueOf)) {
                str = "room_banner";
            } else {
                str = "match_icon";
            }
        }
        RunnableC781530UlD runnableC781530UlD5 = this.LLJI;
        if (runnableC781530UlD5 != null) {
            C985960blS.LIZ(runnableC781530UlD5, this, this.LLILZ, new C986010blX("match_panel", 1001, "match_panel", str));
        }
        C20394614rA c20394614rALIZJ = C979070baL.LIZJ(this.LLILZ, this.LLJIJIL, new C979880bbe(this), false, null, 24);
        this.LLJIJIL.LLLI(C980070bbx.class, new C20406014t0(c20394614rALIZJ));
        this.LLJIJIL.LLLI(C980060bbw.class, new C20399014rs(this.LLILZ, c20394614rALIZJ, null));
        this.LLJIJIL.LLLI(C979040baI.class, new C1844500y6C((InterfaceC1844530y6F) this.LLILLL));
        this.LLJIJIL.LLLI(C979060baK.class, new C204587153p((InterfaceC204589153r) this.LLILLL));
        T t = this.LLILLL;
        if (t != 0) {
            t.onCreate();
        }
        C0R9K.LIZ(this.LLJI, new ARunnableS115S0100000_15(this, 33));
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MatchPlaybookCapabilityShowEvent.class, new AwS594S0100000_15(this, 127));
        }
        DataChannel dataChannel2 = this.LLILZ;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, ActivePlaybookChannel.class, new AwS594S0100000_15(this, 128));
        }
        C979690bbL c979690bbL2 = this.LLILZLL;
        if (c979690bbL2 != null && (weakReference = c979690bbL2.LIZ) != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("match_panel"), null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h7j, viewGroup, false);
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
