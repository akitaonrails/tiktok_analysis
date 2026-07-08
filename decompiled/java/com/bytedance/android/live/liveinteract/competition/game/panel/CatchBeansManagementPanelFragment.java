package com.bytedance.android.live.liveinteract.competition.game.panel;

import X.C098200Yq;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C785410UrT;
import X.C786410Ut5;
import X.C978980baC;
import X.EnumC983140bgu;
import X.InterfaceC963450bB9;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CatchBeansManagementPanelFragment extends CatchBeansManagementPanelContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnHELIOSISoiZygyJSBiOS49LSliCi4nKy0OLC49OwgtJy40LSgpJzsDKSspJQkhKSIhLCEn";
    public LiveDialog LLILZ;
    public Function2<? super EnumC983140bgu, ? super Long, Unit> LLILZIL = AFwS299S0000000_15.get$arr$(13);
    public C1324720kZq LLILZLL;
    public C16FS LLIZ;
    public C1324720kZq LLIZLLLIL;
    public C1324720kZq LLJ;
    public C1324720kZq LLJI;
    public C1324720kZq LLJIJIL;
    public C1324720kZq LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public C16F5 LLJJ;
    public C16F5 LLJJI;
    public C16F5 LLJJIII;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIL = false;
        c978980baC.LJIIIIZZ = true;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LiveDialog liveDialog = this.LLILZ;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
        if (interfaceC963450bB9 != null) {
            interfaceC963450bB9.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C16FS c16fs = (C16FS) view.findViewById(R.id.co_);
        this.LLIZ = c16fs;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131851555));
        }
        C16FS c16fs2 = this.LLIZ;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(this, 105));
        }
        TextView textView = (TextView) view.findViewById(R.id.zcn);
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131851549));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.zcm);
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131851551));
        }
        TextView textView3 = (TextView) view.findViewById(R.id.zcl);
        if (textView3 != null) {
            textView3.setText(C497740JfY.LJIJI(2131851550));
        }
        this.LLIZLLLIL = (C1324720kZq) view.findViewById(R.id.lat);
        C1143680frq.LIZLLL(this.LLIZLLLIL, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_management_panel_point_1.png");
        this.LLJ = (C1324720kZq) view.findViewById(R.id.lau);
        C1143680frq.LIZLLL(this.LLJ, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_management_panel_point_10.png");
        this.LLJI = (C1324720kZq) view.findViewById(R.id.lav);
        C1143680frq.LIZLLL(this.LLJI, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_management_panel_point_105.png");
        this.LLJIJIL = (C1324720kZq) view.findViewById(R.id.law);
        C1143680frq.LIZLLL(this.LLJIJIL, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_management_panel_point_1100.png");
        this.LLJILJIL = (C1324720kZq) view.findViewById(R.id.lax);
        C1143680frq.LIZLLL(this.LLJILJIL, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_management_panel_point_11500.png");
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.zce);
        this.LLJILJILJ = c16f5;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131851561, "1"));
        }
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.zcf);
        this.LLJILLL = c16f52;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJJ(2131851561, "10"));
        }
        C16F5 c16f53 = (C16F5) view.findViewById(R.id.zcg);
        this.LLJJ = c16f53;
        if (c16f53 != null) {
            c16f53.setText(C497740JfY.LJIJJ(2131851561, "105"));
        }
        C16F5 c16f54 = (C16F5) view.findViewById(R.id.zch);
        this.LLJJI = c16f54;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJJ(2131851561, "1100"));
        }
        C16F5 c16f55 = (C16F5) view.findViewById(R.id.zci);
        this.LLJJIII = c16f55;
        if (c16f55 != null) {
            c16f55.setText(C497740JfY.LJIJJ(2131851561, "11500"));
        }
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.lay);
        this.LLILZLL = c1324720kZq;
        if (c1324720kZq != null) {
            C786410Ut5.e8(c1324720kZq, new ACListenerS150S0100000_15(this, 39));
        }
        C1324720kZq c1324720kZq2 = this.LLILZLL;
        if (C497740JfY.LJJ()) {
            str = "ttlive_icon_catch_beans_management_panel_exit_left.png";
        } else {
            str = "ttlive_icon_catch_beans_management_panel_exit.png";
        }
        C1143680frq.LIZLLL(c1324720kZq2, "tiktok_live_interaction_demand_10", str);
        HandlerHook.viewPost(view, new ARunnableS84S0200000_15(view, this, 8));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hr5, viewGroup, false);
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
