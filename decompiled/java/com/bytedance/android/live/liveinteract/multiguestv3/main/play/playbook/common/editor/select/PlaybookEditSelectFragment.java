package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.select;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C0DXR;
import X.C1338790kwX;
import X.C1685300txQ;
import X.C189200o6;
import X.C19411810x2;
import X.C19EG;
import X.C19GS;
import X.C20361214lm;
import X.C20378714ob;
import X.C20736316Cj;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC19411910x3;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class PlaybookEditSelectFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/HELIOSKTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8Oms/LCM2KzFiGSMyMScjJiQWLCw4Gio/LSY4Dz0yLygpJzs=";
    public BasePlaybookEditorViewModel LLILLJJLI;
    public InterfaceC19411910x3 LLILLL;
    public DataChannel LLILZIL;
    public RecyclerView LLILZLL;
    public String LL = "";
    public final C19411810x2 LLILZ = new InterfaceC19411910x3() { // from class: X.10x2
        @Override // X.InterfaceC19411910x3
        public final void Wt(C1868330yid c1868330yid) {
            InterfaceC19411910x3 interfaceC19411910x3 = this.LL.LLILLL;
            if (interfaceC19411910x3 != null) {
                interfaceC19411910x3.Wt(c1868330yid);
            }
        }
    };
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 32));

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20378714ob c20378714ob;
        MutableLiveData<LinkedHashMap<String, List<C20361214lm>>> mutableLiveData;
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.mek).setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ezn, getContext()));
        this.LLILZLL = (RecyclerView) view.findViewById(R.id.tvc);
        final int iLIZ = C1338790kwX.LIZ(12.0f);
        final int iLIZ2 = C1338790kwX.LIZ(16.0f);
        final int iLIZ3 = C1338790kwX.LIZ(16.0f);
        C0DXR c0dxr = new C0DXR(iLIZ, iLIZ2, iLIZ3) { // from class: X.10wW
            public final int LL;
            public final int LLILLJJLI;
            public final int LLILLL;

            {
                this.LL = iLIZ;
                this.LLILLJJLI = iLIZ2;
                this.LLILLL = iLIZ3;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildAdapterPosition(view2) != 0) {
                    rect.top = this.LL;
                }
                rect.left = this.LLILLJJLI;
                rect.right = this.LLILLL;
            }
        };
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(c0dxr);
        }
        RecyclerView recyclerView2 = this.LLILZLL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = this.LLILZLL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((AbstractC21673619ry) this.LLIZ.getValue());
        }
        BasePlaybookEditorViewModel basePlaybookEditorViewModel = this.LLILLJJLI;
        if (basePlaybookEditorViewModel != null && (c20378714ob = basePlaybookEditorViewModel.LLILLL) != null && (mutableLiveData = c20378714ob.LJ) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.1183
                /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r12) {
                    /*
                        Method dump skipped, instruction units count: 394
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1183.onChanged(java.lang.Object):void");
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hav, viewGroup, false);
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
