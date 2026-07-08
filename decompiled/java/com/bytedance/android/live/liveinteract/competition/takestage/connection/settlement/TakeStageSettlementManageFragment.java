package com.bytedance.android.live.liveinteract.competition.takestage.connection.settlement;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC981100bdc;
import X.C098200Yq;
import X.C1117360fBO;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C754570Tip;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C946260ajQ;
import X.C954460awe;
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
import X.InterfaceC960800b6s;
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
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionScoreChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeStageSettlementManageFragment extends TakeStageSettlementManageContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISoiZzsyIyA/PSHELIOS40LWsvJiE9LSY4ICA9ZjYpPTs/LSgpJzt9HCQnLBwnKSIpGionPCkpJCo9PAgtJy40LQM+KCg+LSs4";
    public Function2<? super EnumC983140bgu, ? super Long, Unit> LLILZIL;
    public boolean LLILZLL;
    public RunnableC781530UlD LLJ;
    public C16FS LLJI;
    public String LLILZ = EnumC973950bS5.SWITCH_ICON.getValue();
    public final ArrayList<C982910bgX> LLIZ = new ArrayList<>();
    public final C1117360fBO LLIZLLLIL = new C1117360fBO();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = this.LLILZLL ? SpannableString.valueOf(C497740JfY.LJIJI(2131851732)) : SpannableString.valueOf(C497740JfY.LJIJI(2131851809));
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
                C500260Jjc.LJLIIIL(500L, viewTd, new AwS594S0100000_15(this, 578));
                view = viewTd;
            }
        }
        c978980baC.LJII = view;
        return c978980baC;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC981100bdc abstractC981100bdc = (AbstractC981100bdc) this.LLILLL;
        if (abstractC981100bdc != null) {
            abstractC981100bdc.LJIIJ();
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
        long j;
        long j2;
        ImageModel imageModel;
        long j3;
        long j4;
        ImageModel imageModel2;
        AbstractC21673719rz itemAnimator;
        super.onViewCreated(view, bundle);
        AbstractC981100bdc abstractC981100bdc = (AbstractC981100bdc) this.LLILLL;
        if (abstractC981100bdc != null) {
            abstractC981100bdc.LJIIIZ();
        }
        this.LLJ = (RunnableC781530UlD) view.findViewById(R.id.nse);
        this.LLJI = (C16FS) view.findViewById(R.id.crv);
        View viewFindViewById = view.findViewById(R.id.mgc);
        if (this.LLILZLL && !InterfaceC960800b6s.LLLFZ.LIZIZ().booleanValue()) {
            if (viewFindViewById != null) {
                C500260Jjc.LLFFF(viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.lwu);
            if (viewFindViewById2 != null) {
                C500260Jjc.LJLIIIL(500L, viewFindViewById2, new AwS594S0100000_15(viewFindViewById, 579));
            }
        } else if (viewFindViewById != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJ;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJ;
        int i = 0;
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
        this.LLIZLLLIL.LLLI(C982910bgX.class, new C982820bgO(new InterfaceC983770bhv() { // from class: X.0bds
            @Override // X.InterfaceC983770bhv
            public final void LIZ(EnumC983290bh9 enumC983290bh9, C982910bgX c982910bgX) {
            }
        }, false, this.LLILZLL, false, 10));
        C16FS c16fs = this.LLJI;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
        this.LLIZ.clear();
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        if (this.LLILZLL) {
            for (C954460awe c954460awe : C13LP.LJLLLL(new AComparatorS514S0100000_15(this, 6), listLJJLI)) {
                C982390bfh c982390bfhPR = PR(c954460awe.LJ);
                if (c982390bfhPR != null) {
                    j3 = c982390bfhPR.LIZJ;
                } else {
                    j3 = 0;
                }
                String strValueOf = String.valueOf(j3);
                if (c982390bfhPR != null) {
                    j4 = c982390bfhPR.LIZIZ;
                } else {
                    j4 = 0;
                }
                String strValueOf2 = String.valueOf(j4);
                long j5 = c954460awe.LJ;
                C754570Tip c754570Tip = c954460awe.LJIJJ;
                if (c754570Tip != null) {
                    imageModel2 = c754570Tip.LIZJ;
                } else {
                    imageModel2 = null;
                }
                this.LLIZ.add(new C982910bgX(j5, imageModel2, C946260ajQ.LIZ(c754570Tip), c954460awe.LJFF, false, false, false, false, false, null, false, null, false, false, strValueOf, strValueOf2, false, false, 0, 466928));
            }
        } else {
            for (C954460awe c954460awe2 : listLJJLI) {
                int i2 = i + 1;
                if (i >= 0) {
                    C954460awe c954460awe3 = c954460awe2;
                    C982390bfh c982390bfhPR2 = PR(c954460awe3.LJ);
                    if (c982390bfhPR2 != null) {
                        j = c982390bfhPR2.LIZJ;
                    } else {
                        j = 0;
                    }
                    String strLIZ = C982410bfj.LIZ(j);
                    if (c982390bfhPR2 != null) {
                        j2 = c982390bfhPR2.LIZIZ;
                    } else {
                        j2 = 0;
                    }
                    String strValueOf3 = String.valueOf(j2);
                    long j6 = c954460awe3.LJ;
                    C754570Tip c754570Tip2 = c954460awe3.LJIJJ;
                    if (c754570Tip2 != null) {
                        imageModel = c754570Tip2.LIZJ;
                    } else {
                        imageModel = null;
                    }
                    this.LLIZ.add(new C982910bgX(j6, imageModel, C946260ajQ.LIZ(c754570Tip2), c954460awe3.LJFF, false, false, false, false, false, null, false, null, false, C500260Jjc.LJJIIZ(strLIZ), strLIZ, strValueOf3, false, false, 0, 466928));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C1117360fBO c1117360fBO = this.LLIZLLLIL;
        c1117360fBO.LL = this.LLIZ;
        c1117360fBO.notifyDataSetChanged();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, CompetitionScoreChangeEvent.class, new AwS594S0100000_15(this, 580));
        }
        C973930bS3.LJI(this.LLILZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gcb, viewGroup, false);
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
