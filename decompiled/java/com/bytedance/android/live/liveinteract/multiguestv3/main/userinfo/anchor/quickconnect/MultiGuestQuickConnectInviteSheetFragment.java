package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect;

import X.C098200Yq;
import X.C0KFD;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438590HHt;
import X.C465770IOh;
import X.C497740JfY;
import X.C786410Ut5;
import X.C918230a0D;
import X.C919110a1d;
import X.C922810a7b;
import X.C929770aIp;
import X.C931950aML;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ATListenerS448S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorBatchInviteConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestQuickConnectInviteSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzogLTclJyHELIOSk8ZiQiKic8Oms9PCYwIyYjJyE2KzFiBDo/PCwLPCogPBQ5ICw4CyoiJyowPAwiPyYnLRYkLConDjctLiI2JjE=";
    public Function2<? super C918230a0D, ? super List<? extends LinkPlayerInfo>, Unit> LLILLJJLI;
    public C931950aML LLILLL;
    public RecyclerView LLILZ;
    public boolean LLJ;
    public boolean LLJI;
    public List<? extends LinkPlayerInfo> LL = C13BV.INSTANCE;
    public final HashSet<Long> LLILZIL = new HashSet<>();
    public final C465770IOh LLILZLL = new C465770IOh(new C919110a1d(this));
    public final ARunnableS115S0100000_15 LLIZ = new ARunnableS115S0100000_15(this, 58);
    public final C929770aIp LLIZLLLIL = new C0KFD() { // from class: X.0aIp
        @Override // X.InterfaceC21676019sM
        public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.LL.MR();
            return false;
        }
    };

    public final void MR() {
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLIZ);
        }
    }

    public final void NR() {
        C931950aML c931950aML = this.LLILLL;
        if (c931950aML != null) {
            if (this.LLJ) {
                c931950aML.setEnabled(false);
                c931950aML.setText(C497740JfY.LJIJI(2131854541));
            } else {
                c931950aML.setEnabled(true);
                c931950aML.setText(C497740JfY.LJIJI(2131854540));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLIZ);
        }
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener(this.LLIZLLLIL);
        }
        this.LLILZ = null;
        this.LLILLL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        RadiusLayout radiusLayout;
        super.onViewCreated(view, bundle);
        if (this.LL.isEmpty()) {
            C438590HHt.LIZ(this);
            return;
        }
        this.LLILLL = (C931950aML) view.findViewById(R.id.crb);
        this.LLILZ = (RecyclerView) view.findViewById(R.id.twu);
        View viewFindViewById = view.findViewById(R.id.smi);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new ATListenerS448S0100000_15(this, 1));
        }
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.cov), new ACListenerS150S0100000_15(this, 133));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ezn);
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (view2 = parentFragment.getView()) != null && (radiusLayout = (RadiusLayout) view2.findViewById(R.id.spp)) != null) {
            radiusLayout.setRadius(C418440Gaw.LIZIZ(16));
        }
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            recyclerView.setClipToOutline(true);
        }
        RecyclerView recyclerView2 = this.LLILZ;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        }
        RecyclerView recyclerView3 = this.LLILZ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LLILZLL);
        }
        RecyclerView recyclerView4 = this.LLILZ;
        if (recyclerView4 != null) {
            recyclerView4.addOnItemTouchListener(this.LLIZLLLIL);
        }
        C465770IOh c465770IOh = this.LLILZLL;
        List<? extends LinkPlayerInfo> list = this.LL;
        ((ArrayList) c465770IOh.LLILLJJLI).clear();
        ((ArrayList) c465770IOh.LLILLJJLI).addAll(list);
        c465770IOh.notifyDataSetChanged();
        C922810a7b.LIZ(this.LL.size(), "show");
        NR();
        long batchInviteSheetAutoDismissTime = MultiGuestAnchorBatchInviteConfig.INSTANCE.getBatchInviteSheetAutoDismissTime();
        if (batchInviteSheetAutoDismissTime > 0 && !this.LLJI) {
            View view3 = getView();
            if (view3 != null) {
                HandlerHook.viewRemoveCallbacks(view3, this.LLIZ);
            }
            View view4 = getView();
            if (view4 != null) {
                HandlerHook.viewPostDelay(view4, this.LLIZ, batchInviteSheetAutoDismissTime);
            }
        }
        C931950aML c931950aML = this.LLILLL;
        if (c931950aML != null) {
            C786410Ut5.q8(c931950aML, new ACListenerS150S0100000_15(this, 134));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hew, viewGroup, false);
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
