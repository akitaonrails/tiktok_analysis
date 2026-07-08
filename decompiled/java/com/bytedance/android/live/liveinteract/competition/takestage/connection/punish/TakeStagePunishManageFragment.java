package com.bytedance.android.live.liveinteract.competition.takestage.connection.punish;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC981070bdZ;
import X.C098200Yq;
import X.C1117360fBO;
import X.C13LP;
import X.C15438062q;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C754570Tip;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C946260ajQ;
import X.C954460awe;
import X.C973690bRf;
import X.C973930bS3;
import X.C978980baC;
import X.C981210bdn;
import X.C981900beu;
import X.C982390bfh;
import X.C982410bfj;
import X.C982820bgO;
import X.C982910bgX;
import X.EnumC973950bS5;
import X.EnumC983140bgu;
import X.InterfaceC983770bhv;
import X.RunnableC781530UlD;
import Y.AComparatorS514S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionScoreChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeStagePunishManageFragment extends TakeStagePunishManageContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiZzsyIyHELIOSA/PS40LWsvJiE9LSY4ICA9ZjU5JyYgIGsYKCQ2GzEtLioDPSslOiceKSstLioVOiQrJCo9PA==";
    public boolean LLILZLL;
    public RunnableC781530UlD LLJ;
    public C16FS LLJI;
    public C16FS LLJIJIL;
    public LiveDialog LLJILJIL;
    public String LLILZ = EnumC973950bS5.SWITCH_ICON.getValue();
    public Function2<? super EnumC983140bgu, ? super Long, Unit> LLILZIL = AFwS299S0000000_15.get$arr$(15);
    public final ArrayList<C982910bgX> LLIZ = new ArrayList<>();
    public final C1117360fBO LLIZLLLIL = new C1117360fBO();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131851751));
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIL = true;
        c978980baC.LIZIZ = false;
        c978980baC.LJIIIIZZ = true;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        View view = null;
        if (layoutInflaterNe != null) {
            View view2 = getView();
            View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hs_, view2 instanceof ViewGroup ? (ViewGroup) view2 : null, false);
            if (viewTd != null) {
                C500260Jjc.LJLIIIL(500L, viewTd, new AwS594S0100000_15(this, 52));
                view = viewTd;
            }
        }
        c978980baC.LJII = view;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC981070bdZ abstractC981070bdZ = (AbstractC981070bdZ) this.LLILLL;
        if (abstractC981070bdZ != null) {
            abstractC981070bdZ.LJIIJ();
        }
    }

    public final C982390bfh PR(long j) {
        C981900beu c981900beu;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c981900beu = (C981900beu) dataChannelLJ.gg0(CompetitionScoreChangeEvent.class)) != null) {
            return c981900beu.LIZJ.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<C954460awe> listLJJLI;
        String str;
        long j;
        String strLIZ;
        boolean zLJJIIZ;
        long j2;
        AbstractC21673719rz itemAnimator;
        super.onViewCreated(view, bundle);
        AbstractC981070bdZ abstractC981070bdZ = (AbstractC981070bdZ) this.LLILLL;
        if (abstractC981070bdZ != null) {
            abstractC981070bdZ.LJIIIZ();
        }
        this.LLJ = (RunnableC781530UlD) view.findViewById(R.id.nse);
        this.LLJI = (C16FS) view.findViewById(R.id.ctq);
        this.LLJIJIL = (C16FS) view.findViewById(R.id.cuc);
        RunnableC781530UlD runnableC781530UlD = this.LLJ;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJ;
        if (runnableC781530UlD2 != null && (itemAnimator = runnableC781530UlD2.getItemAnimator()) != null && (itemAnimator instanceof AbstractC21674919sB)) {
            ((AbstractC21674919sB) itemAnimator).LLIZ = false;
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJ;
        if (runnableC781530UlD3 != null) {
            runnableC781530UlD3.addItemDecoration(new C981210bdn((int) C497740JfY.LIZIZ(8.0f)));
        }
        RunnableC781530UlD runnableC781530UlD4 = this.LLJ;
        if (runnableC781530UlD4 != null) {
            runnableC781530UlD4.setAdapter(this.LLIZLLLIL);
        }
        this.LLIZLLLIL.LLLI(C982910bgX.class, new C982820bgO(new InterfaceC983770bhv() { // from class: X.0bdr
            @Override // X.InterfaceC983770bhv
            public final void LIZ(EnumC983290bh9 enumC983290bh9, C982910bgX c982910bgX) {
            }
        }, false, false, this.LLILZLL, 6));
        C16FS c16fs = this.LLJI;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS594S0100000_15(this, 53));
        }
        C16FS c16fs2 = this.LLJIJIL;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new AwS594S0100000_15(this, 54));
        }
        C973690bRf.LIZ.LJIL();
        this.LLIZ.clear();
        if (this.LLILZLL) {
            listLJJLI = C13LP.LJLLLL(new AComparatorS514S0100000_15(this, 1), C915980Zwa.LJII().LJJLI());
        } else {
            listLJJLI = C915980Zwa.LJII().LJJLI();
        }
        if (this.LLILZLL) {
            str = "micPos_then_rank";
        } else {
            str = "micPos_only";
        }
        StringBuilder sb = new StringBuilder("initData performer order: sortMode=");
        sb.append(str);
        sb.append(", isStyleV3=");
        sb.append(this.LLILZLL);
        sb.append(", uids=");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLI, 10));
        Iterator<C954460awe> it2 = listLJJLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        sb.append(arrayList);
        sb.append(", display=");
        sb.append(C13LP.LJJLIIIJ(listLJJLI, " -> ", null, null, 0, null, AFwS250S0000000_15.get$arr$(20), 30));
        C20441214yg.LIZIZ("TakeStagePunishManageFragment", sb.toString());
        int i = 0;
        for (C954460awe c954460awe : listLJJLI) {
            int i2 = i + 1;
            ImageModel imageModel = null;
            if (i >= 0) {
                C954460awe c954460awe2 = c954460awe;
                C982390bfh c982390bfhPR = PR(c954460awe2.LJ);
                long j3 = 0;
                if (this.LLILZLL) {
                    if (c982390bfhPR != null) {
                        j2 = c982390bfhPR.LIZJ;
                    } else {
                        j2 = 0;
                    }
                    strLIZ = String.valueOf(j2);
                } else {
                    if (c982390bfhPR != null) {
                        j = c982390bfhPR.LIZJ;
                    } else {
                        j = 0;
                    }
                    strLIZ = C982410bfj.LIZ(j);
                }
                if (c982390bfhPR != null) {
                    j3 = c982390bfhPR.LIZIZ;
                }
                String strValueOf = String.valueOf(j3);
                ArrayList<C982910bgX> arrayList2 = this.LLIZ;
                long j4 = c954460awe2.LJ;
                C754570Tip c754570Tip = c954460awe2.LJIJJ;
                if (c754570Tip != null) {
                    imageModel = c754570Tip.LIZJ;
                }
                String strLIZ2 = C946260ajQ.LIZ(c754570Tip);
                long j5 = c954460awe2.LJFF;
                if (this.LLILZLL) {
                    zLJJIIZ = false;
                } else {
                    zLJJIIZ = C500260Jjc.LJJIIZ(strLIZ);
                }
                arrayList2.add(new C982910bgX(j4, imageModel, strLIZ2, j5, false, false, false, false, false, null, false, null, false, zLJJIIZ, strLIZ, strValueOf, false, false, 0, 466928));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1117360fBO c1117360fBO = this.LLIZLLLIL;
        ArrayList<C982910bgX> arrayList3 = this.LLIZ;
        c1117360fBO.LL = arrayList3;
        C13LP.LJJJLZIJ(0, arrayList3);
        this.LLIZLLLIL.notifyDataSetChanged();
        C973930bS3.LJI(this.LLILZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gca, viewGroup, false);
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
