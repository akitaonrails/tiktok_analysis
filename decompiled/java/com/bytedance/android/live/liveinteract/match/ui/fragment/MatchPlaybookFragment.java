package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.AbstractC979820bbY;
import X.C098200Yq;
import X.C1117360fBO;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C410901il;
import X.C786410Ut5;
import X.C978980baC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchPlaybookFragment extends MatchPlaybookPanelContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyHELIOSIyPCYkZzo6ZiM+KCg+LSs4ZwIyPCYkGSMyMScjJiQVOiQrJCo9PA==";
    public final C1117360fBO LLILZ = new C1117360fBO();
    public DataChannel LLILZIL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        return new C978980baC();
    }

    @Override // com.bytedance.android.live.liveinteract.match.ui.fragment.MatchPlaybookPanelContract$AbsView
    public final void PR() {
        C410901il c410901il;
        C1117360fBO c1117360fBO = this.LLILZ;
        AbstractC979820bbY abstractC979820bbY = (AbstractC979820bbY) this.LLILLL;
        if (abstractC979820bbY == null || (c410901il = abstractC979820bbY.LLILLJJLI) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
        this.LLILZ.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            super.onViewCreated(r13, r14)
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bVB r2 = r0.LJFF()
            if (r2 == 0) goto L17
            kotlin.jvm.internal.AwS559S0100000_15 r1 = new kotlin.jvm.internal.AwS559S0100000_15
            r0 = 139(0x8b, float:1.95E-43)
            r1.<init>(r12, r0)
            r2.LJJIFFI(r1)
        L17:
            r0 = 2131389181(0x7f0a6afd, float:1.8398898E38)
            android.view.View r5 = r13.findViewById(r0)
            boolean r0 = r5 instanceof androidx.recyclerview.widget.RecyclerView
            r1 = 0
            if (r0 == 0) goto L94
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L95
            X.0fBO r0 = r12.LLILZ
            r5.setAdapter(r0)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r12.getContext()
            r2.<init>(r0)
            r5.setLayoutManager(r2)
            X.19rz r0 = r5.getItemAnimator()
        L3c:
            boolean r0 = r0 instanceof X.AbstractC21674919sB
            if (r0 == 0) goto L51
            if (r5 == 0) goto L46
            X.19rz r1 = r5.getItemAnimator()
        L46:
            boolean r0 = r1 instanceof X.AbstractC21674919sB
            if (r0 == 0) goto L51
            X.19sB r1 = (X.AbstractC21674919sB) r1
            if (r1 == 0) goto L51
            r0 = 0
            r1.LLIZ = r0
        L51:
            if (r5 == 0) goto L63
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r12.LLILZIL
            X.0blX r3 = new X.0blX
            java.lang.String r2 = "match_icon"
            java.lang.String r1 = "match_panel"
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.<init>(r1, r0, r1, r2)
            X.C985960blS.LIZ(r5, r12, r4, r3)
        L63:
            X.0fBO r5 = r12.LLILZ
            java.lang.Class<X.0bbw> r4 = X.C980060bbw.class
            X.14rs r3 = new X.14rs
            com.bytedance.ies.sdk.datachannel.DataChannel r6 = r12.LLILZIL
            X.0fBO r7 = r12.LLILZ
            X.0bbf r8 = new X.0bbf
            r8.<init>(r12)
            r9 = 1
            r10 = 0
            r11 = 16
            X.14rA r2 = X.C979070baL.LIZJ(r6, r7, r8, r9, r10, r11)
            X.0bcP r1 = new X.0bcP
            r0 = 2131107314(0x7f061df2, float:1.7827204E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0)
            r3.<init>(r6, r2, r1)
            r5.LLLI(r4, r3)
            T extends com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter r0 = r12.LLILLL
            if (r0 == 0) goto L93
            r0.onCreate()
        L93:
            return
        L94:
            r5 = r1
        L95:
            r0 = r1
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.ui.fragment.MatchPlaybookFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h7v, viewGroup, false);
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
