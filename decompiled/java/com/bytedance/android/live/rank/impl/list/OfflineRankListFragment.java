package com.bytedance.android.live.rank.impl.list;

import X.C098200Yq;
import X.C0IP3;
import X.C1085110eLN;
import X.C1133830fbx;
import X.C1548820qPI;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C16F5;
import X.C16FV;
import X.C1810210xCt;
import X.C1810330xD5;
import X.C1810340xD6;
import X.C1810440xDG;
import X.C1810470xDJ;
import X.C1811420xEq;
import X.C1864880yd4;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21556319Xt;
import X.C21594519fD;
import X.C235000vU;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC1811400xEo;
import X.InterfaceC21556819Xy;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.rank.impl.list.controller.OfflineRankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.OfflineRankRootViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class OfflineRankListFragment extends Fragment implements C0IP3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slHELIOSJD8/ZiklOjt9ByMqJSY9LRctJyQfITY4Dz0yLygpJzs=";
    public C16FV LL;
    public RunnableC781530UlD LLILLJJLI;
    public C16F5 LLILLL;
    public C21556319Xt LLILZ;
    public View LLILZIL;
    public C21594519fD LLILZLL;
    public final DataChannel LLIZ = new DataChannel();
    public OfflineRankRootController LLIZLLLIL;
    public C1810470xDJ LLJ;
    public boolean LLJI;

    public final RunnableC781530UlD MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w20) : null;
            this.LLILLJJLI = (RunnableC781530UlD) viewFindViewById;
        }
        return (RunnableC781530UlD) viewFindViewById;
    }

    public final C21556319Xt NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wya) : null;
            this.LLILZ = (C21556319Xt) viewFindViewById;
        }
        return (C21556319Xt) viewFindViewById;
    }

    public final C21594519fD OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.view_pager) : null;
            this.LLILZLL = (C21594519fD) viewFindViewById;
        }
        return (C21594519fD) viewFindViewById;
    }

    public final C16F5 getTitleFromXml() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.title) : null;
            this.LLILLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1810470xDJ c1810470xDJ = this.LLJ;
        if (c1810470xDJ != null) {
            C1548820qPI.LJIIIIZZ("ttlive_anchor_ranking_open_event", c1810470xDJ.LJFF);
            C1548820qPI.LJIIIIZZ("ttlive_rest_card_id_update_event", c1810470xDJ.LJFF);
            C1548820qPI.LJIIIIZZ("LEAGUE_MATCH_INIT_DATA", c1810470xDJ.LJFF);
        }
        C1085110eLN.LIZIZ();
        C1810210xCt.LJIIIIZZ();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        OfflineRankRootController offlineRankRootController = this.LLIZLLLIL;
        if (offlineRankRootController == null) {
            offlineRankRootController = null;
        }
        List<RankTabInfo> list = offlineRankRootController.LLILLL.LIZJ;
        if (list == null || list.isEmpty()) {
            OfflineRankRootController offlineRankRootController2 = this.LLIZLLLIL;
            if (offlineRankRootController2 == null) {
                offlineRankRootController2 = null;
            }
            OfflineRankRootViewModel offlineRankRootViewModelLJFF = offlineRankRootController2.LJFF();
            OfflineRankRootController offlineRankRootController3 = this.LLIZLLLIL;
            offlineRankRootViewModelLJFF.CQ2((offlineRankRootController3 != null ? offlineRankRootController3 : null).LLILLL.LJFF.type, this, new C1810440xDG(this));
            return;
        }
        OfflineRankRootController offlineRankRootController4 = this.LLIZLLLIL;
        if (offlineRankRootController4 == null) {
            offlineRankRootController4 = null;
        }
        C1810340xD6 c1810340xD6 = offlineRankRootController4.LLILLL;
        ArrayList arrayList = new ArrayList();
        List<RankTabInfo> list2 = c1810340xD6.LIZJ;
        if (list2 != null) {
            for (RankTabInfo rankTabInfo : list2) {
                RankTabInfo rankTabInfo2 = new RankTabInfo();
                int i = rankTabInfo.rankType;
                String str = rankTabInfo.LIZ;
                rankTabInfo2.rankType = i;
                rankTabInfo2.LIZ = str;
                arrayList.add(rankTabInfo2);
            }
        }
        RR(arrayList, null, null);
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.LLIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        r7 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r7.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        r6 = (com.bytedance.android.livesdk.rank.model.RankTabInfo) r7.next();
        r0 = r14.rankView.subTabs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        r5 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r5.hasNext() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        r4 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r4.rankType != r6.rankType) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        if (r4 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        r3 = r6.rankType;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.OfflineRankListFragment.PR(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.OfflineRankListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void RR(List<RankTabInfo> list, RankListV2Response.Data data, String str) {
        String str2;
        RankListV2Response.RankView rankView;
        RankListV2Response.RankView rankView2;
        List<SubRankTabInfo> list2;
        ArrayList<RankTabInfo> arrayList = (ArrayList) list;
        OfflineRankRootController offlineRankRootController = null;
        if (arrayList.size() == 1) {
            if (data != null && (rankView2 = data.rankView) != null && (list2 = rankView2.subTabs) != null && list2.size() > 1) {
                getTitleFromXml().setText(C497740JfY.LJIJI(2131851975));
            } else {
                getTitleFromXml().setText(C1133830fbx.LJIILIIL(((RankTabInfo) ListProtector.get(list, 0)).title, ((RankTabInfo) ListProtector.get(list, 0)).LIZ).toString());
            }
        } else {
            getTitleFromXml().setText(C497740JfY.LJIJI(2131851975));
            C21556319Xt c21556319XtNR = NR();
            int visibility = c21556319XtNR.getVisibility();
            c21556319XtNR.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c21556319XtNR);
            View viewFindViewById = this.LLILZIL;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.wyc);
                } else {
                    viewFindViewById = null;
                }
                this.LLILZIL = viewFindViewById;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            if (arrayList.size() <= 3) {
                NR().setTabMode(1);
                NR().setTabGravity(0);
                NR().setAutoFillWhenScrollable(false);
            } else {
                NR().setTabMode(0);
                NR().setAutoFillWhenScrollable(true);
            }
            NR().LLILLL.setPadding(0, 0, 0, 0);
            NR().setCustomTabViewResId(R.layout.h37);
            NR().setupWithViewPager(OR());
            NR().LIZIZ(new InterfaceC21556819Xy() { // from class: X.0xDF
                @Override // X.InterfaceC21556819Xy
                public final void LIZ() {
                }

                @Override // X.InterfaceC21556819Xy
                public final void LIZIZ(C21556219Xs c21556219Xs) {
                    View view2;
                    TextView textView;
                    if (c21556219Xs != null && (view2 = c21556219Xs.LJ) != null && (textView = (TextView) view2.findViewById(android.R.id.text1)) != null) {
                        textView.setTextColor(C20736316Cj.LIZIZ(R.attr.fy3, this.LIZ.getContext()));
                    }
                }

                @Override // X.InterfaceC21556819Xy
                public final void LIZJ(C21556219Xs c21556219Xs) {
                    TextView textView;
                    View view2 = c21556219Xs.LJ;
                    if (view2 != null && (textView = (TextView) view2.findViewById(android.R.id.text1)) != null) {
                        textView.setTextColor(C20736316Cj.LIZIZ(R.attr.fy6, this.LIZ.getContext()));
                    }
                }
            });
            OR().addOnPageChangeListener(new C1864880yd4(this, 0));
        }
        C21594519fD c21594519fDOR = OR();
        C1810330xD5 c1810330xD5 = new C1810330xD5(getChildFragmentManager());
        ArrayList arrayList2 = new ArrayList();
        for (RankTabInfo rankTabInfo : arrayList) {
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            RankTypeV2 rankTypeV2LIZ = C235000vU.LIZ(rankTabInfo.rankType, 0);
            C1811420xEq c1811420xEq = EnumC1811400xEo.Companion;
            int i = C235000vU.LIZ(rankTabInfo.rankType, 0).group_type;
            c1811420xEq.getClass();
            EnumC1811400xEo enumC1811400xEoLIZ = C1811420xEq.LIZ(i);
            OfflineRankRootController offlineRankRootController2 = this.LLIZLLLIL;
            if (offlineRankRootController2 == null) {
                offlineRankRootController2 = null;
            }
            AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(66);
            if (data != null && (rankView = data.rankView) != null && rankTabInfo.rankType == rankView.rankType) {
                str2 = str;
            } else {
                str2 = null;
            }
            RankPageFragment rankPageFragment = new RankPageFragment();
            rankPageFragment.LLILZIL = rankTypeV2LIZ;
            rankPageFragment.LLILZLL = enumC1811400xEoLIZ;
            rankPageFragment.LLJI = aFwS216S0000000_27;
            rankPageFragment.LLJ = offlineRankRootController2;
            rankPageFragment.LLIZ = str2;
            arrayList2.add(rankPageFragment);
        }
        c1810330xD5.LJJIJLIJ(arrayList2, list);
        c21594519fDOR.setAdapter(c1810330xD5);
        C21594519fD c21594519fDOR2 = OR();
        OfflineRankRootController offlineRankRootController3 = this.LLIZLLLIL;
        if (offlineRankRootController3 != null) {
            offlineRankRootController = offlineRankRootController3;
        }
        c21594519fDOR2.setCurrentItem(offlineRankRootController.LJFF().LLIZLLLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gki, viewGroup, false);
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
