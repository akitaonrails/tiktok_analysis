package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.C098200Yq;
import X.C0IJT;
import X.C13BV;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C950220apo;
import X.C955400ayA;
import X.C960270b61;
import X.C962250b9D;
import X.C962830bA9;
import X.C978980baC;
import X.InterfaceC1059280dfi;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSelectInterestTagListContract$AbsView;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostSelectInterestTagListFragment extends MultiCoHostSelectInterestTagListContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGsuIDV9HELIOSJCwiImE1OiQrJCo9PGsBPCMnIQYjASAgPBYpJSowPAwiPSohLTY4HS40BCw/PQkhKSIhLCEn";
    public View LLILZ;
    public RecyclerView LLILZIL;
    public C962830bA9 LLILZLL;
    public SparkContext LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public String LLJI = "";
    public String LLJIJIL = "";
    public List<QuickCohostContent> LLJILJIL = C13BV.INSTANCE;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131851660));
        Context context = getContext();
        View view = null;
        c978980baC.LJI = context == null ? null : C962250b9D.LJI(context, new AwS559S0100000_15(this, 984));
        c978980baC.LIZIZ = true;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        if (layoutInflaterNe != null) {
            View view2 = getView();
            View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.ht3, view2 instanceof ViewGroup ? (ViewGroup) view2 : null, false);
            if (viewTd != null) {
                C500260Jjc.LJLIIIL(500L, viewTd, new AwS594S0100000_15(this, 924));
                view = viewTd;
            }
        }
        c978980baC.LJII = view;
        c978980baC.LIZIZ = true;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        super.onDestroyView();
        C962830bA9 c962830bA9 = this.LLILZLL;
        if (c962830bA9 != null && c962830bA9.LIZLLL) {
            C960270b61.LIZIZ("MultiCoHostSelectInterestTagListFragment_destroy", c962830bA9.LIZIZ());
        }
        SparkContext sparkContext = this.LLIZ;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C960270b61.LIZ(), null, null, null, 0, null, AFwS250S0000000_15.get$arr$(85), 31);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        String str = this.LLIZLLLIL ? "back" : "quick";
        String str2 = this.LLJ ? "big_card" : "small_card";
        C955400ayA.LLIIL("tag_selection_panel", str, str2, this.LLJI, this.LLJIJIL, strLJJLIIIJ, !Intrinsics.LJFF(r7, strLJJLIIIJ), null);
    }

    public static void PR(boolean z) {
        String str;
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(C950220apo.LJ()));
        if (C915980Zwa.LJI().LJIIJ().getChannelId() > 0) {
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
        }
        map.put("icon_name", "FAQ");
        if (z) {
            str = "livesdk_tag_selection_icon_show";
        } else {
            str = "livesdk_tag_selection_icon_click";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZ = view;
        this.LLILZIL = (RecyclerView) view.findViewById(R.id.tw3);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.LJJI(0);
        flexboxLayoutManager.LJJIII(0);
        C962830bA9 c962830bA9 = new C962830bA9();
        this.LLILZLL = c962830bA9;
        c962830bA9.LIZJ(this.LLILZIL, flexboxLayoutManager, 16, 10, false);
        this.LLJIJIL = C13LP.LJJLIIIJ(C960270b61.LIZ(), null, null, null, 0, null, AFwS229S0000000_2.get$arr$(796), 31);
        C962830bA9 c962830bA92 = this.LLILZLL;
        if (c962830bA92 != null) {
            c962830bA92.LIZ(this.LLJILJIL);
        }
        PR(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gjw, viewGroup, false);
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
