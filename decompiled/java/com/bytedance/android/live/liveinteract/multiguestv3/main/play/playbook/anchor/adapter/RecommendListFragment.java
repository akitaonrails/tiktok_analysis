package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.adapter;

import X.C01GW;
import X.C098200Yq;
import X.C0DXR;
import X.C1117360fBO;
import X.C1158290gFP;
import X.C13BV;
import X.C15438062q;
import X.C1685300txQ;
import X.C1890550zIT;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20384914pb;
import X.C20390914qZ;
import X.C20395614rK;
import X.C20396614rU;
import X.C20398414rm;
import X.C20399414rw;
import X.C20407814tI;
import X.C20441214yg;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2188811AlT;
import X.C410901il;
import X.C439101nJ;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C978410bZH;
import X.EnumC20429214wk;
import X.InterfaceC20406714t7;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.InteractivePlaybookHeaderHeightData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.adapter.RecommendListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.UserHasLivePermission;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public final class RecommendListFragment extends BaseFragment {
    public static final int LLJ = C439101nJ.LIZ(170);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZiQoKD8nLTdiGyowJyghLCE3BCw/PQkhKSIhLCEn";
    public final int LL;
    public final PlaybookAnchorViewModel LLILLJJLI;
    public final InterfaceC20406714t7 LLILLL;
    public final DataChannel LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C20396614rU(this));
    public RecyclerView LLILZLL;
    public C20395614rK LLIZ;
    public View LLIZLLLIL;

    public final C1117360fBO NR() {
        return (C1117360fBO) this.LLILZIL.getValue();
    }

    public final void OR(C410901il c410901il) {
        try {
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C20384914pb(new C410901il(NR().LL), c410901il), true);
            NR().LLLII(c410901il);
            c21341918fZLIZ.LIZJ(NR());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            NR().LLLII(c410901il);
            NR().notifyDataSetChanged();
        }
    }

    public final void PR(List<Playbook> list) {
        Integer numValueOf;
        boolean z;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateList size:");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("RecommendListFragment", C2188811AlT.LIZIZ(sbLIZ));
        C410901il c410901il = new C410901il();
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Playbook playbook2 : list) {
                PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLJJLI;
                if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && playbook2.playbookId == playbook.playbookId) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C20390914qZ(playbook2, false, z, new C978410bZH("recommend", "recommend_list", this.LL)));
            }
            c410901il.addAll(arrayList);
        }
        OR(c410901il);
        try {
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C20384914pb(new C410901il(NR().LL), c410901il), true);
            NR().LLLII(c410901il);
            c21341918fZLIZ.LIZJ(NR());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            NR().LLLII(c410901il);
            NR().notifyDataSetChanged();
        }
    }

    public final void RR(EnumC20429214wk enumC20429214wk) {
        Integer num;
        List<Playbook> value;
        Integer num2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStateView fetchListState:");
        sbLIZ.append(enumC20429214wk);
        C20441214yg.LIZIZ("RecommendListFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC20429214wk != null) {
            int i = C20399414rw.LIZ[enumC20429214wk.ordinal()];
            int iIntValue = 0;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C500260Jjc.LJLJLJ(this.LLIZLLLIL, false);
                        C500260Jjc.LJLJLJ(this.LLILZLL, true);
                        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLJJLI;
                        if (playbookAnchorViewModel != null && (value = playbookAnchorViewModel.KQ2(this.LL).getValue()) != null) {
                            if (value.size() > 0) {
                                PR(value);
                                return;
                            }
                            C410901il c410901il = new C410901il();
                            DataChannel dataChannel = this.LLILZ;
                            if (dataChannel != null && (num2 = (Integer) dataChannel.gg0(InteractivePlaybookHeaderHeightData.class)) != null) {
                                iIntValue = num2.intValue();
                            }
                            c410901il.add(new C1890550zIT(Math.max(iIntValue, LLJ)));
                            OR(c410901il);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C500260Jjc.LJLJLJ(this.LLILZLL, true);
                C500260Jjc.LJLJLJ(this.LLIZLLLIL, false);
                C410901il c410901il2 = new C410901il();
                DataChannel dataChannel2 = this.LLILZ;
                if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(InteractivePlaybookHeaderHeightData.class)) != null) {
                    iIntValue = num.intValue();
                }
                c410901il2.add(new C20407814tI(Math.max(iIntValue, LLJ)));
                OR(c410901il2);
                return;
            }
            C500260Jjc.LJLJLJ(this.LLILZLL, false);
            C500260Jjc.LJLJLJ(this.LLIZLLLIL, true);
            PR(C13BV.INSTANCE);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        MutableLiveData<C1158290gFP> mutableLiveData;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.t0q);
        this.LLILZLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.LLILZLL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(NR());
        }
        this.LLIZLLLIL = view.findViewById(R.id.nnp);
        this.LLIZ = new C20395614rK(this.LLILZ, this.LLILZLL, this.LLILLJJLI, this.LL, true, null, 32);
        RecyclerView recyclerView3 = this.LLILZLL;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C0DXR() { // from class: X.14sV
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    super.LIZIZ(rect, view2, recyclerView4, c21673919s1);
                    if (this.LL.NR().getItemCount() > 0 && (ListProtector.get(this.LL.NR().LL, 0) instanceof C20390914qZ)) {
                        rect.top = C439101nJ.LIZ(4);
                        rect.bottom = C439101nJ.LIZ(4);
                    }
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLJJLI;
        if (playbookAnchorViewModel != null) {
            playbookAnchorViewModel.KQ2(this.LL).observe(this, new Observer() { // from class: X.14ro
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    EnumC20429214wk enumC20429214wkLIZ;
                    List list = (List) obj;
                    RecommendListFragment recommendListFragment = this.LL;
                    C1158290gFP value = recommendListFragment.LLILLJJLI.LLJJIJIIJIL.getValue();
                    if (value != null) {
                        enumC20429214wkLIZ = C20390314qT.LIZ(value, this.LL.LL);
                    } else {
                        enumC20429214wkLIZ = null;
                    }
                    recommendListFragment.RR(enumC20429214wkLIZ);
                    if (list != null && !list.isEmpty()) {
                        View view2 = view;
                        final RecommendListFragment recommendListFragment2 = this.LL;
                        HandlerHook.viewPost(view2, new Runnable() { // from class: X.14ry
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("RecommendListFragment@2f15.onViewCreated$2$1");
                                try {
                                    C20395614rK c20395614rK = recommendListFragment2.LLIZ;
                                    if (c20395614rK != null) {
                                        c20395614rK.LIZ("recommendListUpdate");
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("RecommendListFragment@2f15.onViewCreated$2$1");
                            }
                        });
                    }
                    RecommendListFragment recommendListFragment3 = this.LL;
                    DataChannel dataChannel = recommendListFragment3.LLILZ;
                    if (dataChannel != null) {
                        dataChannel.BQ2(recommendListFragment3, UserHasLivePermission.class, new C20402814sU(recommendListFragment3));
                    }
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLILLJJLI;
        if (playbookAnchorViewModel2 != null && (mutableLiveData = playbookAnchorViewModel2.LLJJIJIIJIL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.14rq
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    RecommendListFragment recommendListFragment = this.LL;
                    EnumC20429214wk enumC20429214wkLIZ = C20390314qT.LIZ((C1158290gFP) obj, recommendListFragment.LL);
                    RecommendListFragment recommendListFragment2 = this.LL;
                    PlaybookAnchorViewModel playbookAnchorViewModel3 = recommendListFragment2.LLILLJJLI;
                    if (playbookAnchorViewModel3 != null) {
                        playbookAnchorViewModel3.KQ2(recommendListFragment2.LL).getValue();
                    }
                    recommendListFragment.RR(enumC20429214wkLIZ);
                }
            });
        }
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, InteractivePlaybookHeaderHeightData.class, new C20398414rm(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSd = C786410Ut5.Sd(R.layout.h9w, layoutInflater, viewGroup);
        C19GS c19gs = null;
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }

    public RecommendListFragment(int i, PlaybookAnchorViewModel playbookAnchorViewModel, InterfaceC20406714t7 interfaceC20406714t7, DataChannel dataChannel) {
        this.LL = i;
        this.LLILLJJLI = playbookAnchorViewModel;
        this.LLILLL = interfaceC20406714t7;
        this.LLILZ = dataChannel;
    }
}
