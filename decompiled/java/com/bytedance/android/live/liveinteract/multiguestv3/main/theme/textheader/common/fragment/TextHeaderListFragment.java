package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment;

import X.AnonymousClass0206;
import X.C00UM;
import X.C01F5;
import X.C01JX;
import X.C01NB;
import X.C01OF;
import X.C01ZA;
import X.C098200Yq;
import X.C09JN;
import X.C0J8P;
import X.C0UO0;
import X.C13BV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19487311Lz;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C300201Ei;
import X.C354001Za;
import X.C410901il;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C513601zK;
import X.C516201zk;
import X.C516701zp;
import X.C5182020e;
import X.C5183020f;
import X.C782110Um9;
import X.C786410Ut5;
import X.C931810aM7;
import X.C934890aR5;
import X.C946850akN;
import X.C951190arN;
import X.C971880bOk;
import X.C971910bOn;
import X.C971930bOp;
import X.C971940bOq;
import X.C971950bOr;
import X.C971960bOs;
import X.C972000bOw;
import X.C972020bOy;
import X.C972060bP2;
import X.C972080bP4;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import X.EnumC971610bOJ;
import X.EnumC971980bOu;
import X.InterfaceC743640TFa;
import X.InterfaceC951240arS;
import X.InterfaceC971790bOb;
import X.InterfaceC971990bOv;
import X.InterfaceC972070bP3;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import Y.AcS354S0200000_15;
import Y.AcS83S1200000_15;
import Y.AfS151S0200000_15;
import Y.AfS178S0100000_9;
import Y.AsS42S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.api.ITextHeaderApi;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordFetchListParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderUpdateParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS559S0100000_15;
import wh6.AbS505S0200000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TextHeaderListFragment extends BaseTextHeaderFragment implements InterfaceC972070bP3, InterfaceC971990bOv, Function0<Unit> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiHELIOSZzs7LSgpZzs2MDEkLC43LTdiKiA+JSoiZykhKSIhLCEnZhEpMTsbLSQoLD0fITY4Dz0yLygpJzs=";
    public final AnchorTextHeaderViewModel LL;
    public final EnumC971980bOu LLILLJJLI;
    public final EnumC952890au7 LLILLL;
    public final Function0<Unit> LLILZ;
    public boolean LLILZIL;
    public RecyclerView LLILZLL;
    public View LLIZ;
    public final List<Long> LLIZLLLIL = new ArrayList();
    public final C951190arN LLJ;

    public final void NR() {
        C972080bP4.LIZLLL("openCreationPage", "TextHeaderListFragment", 2);
        this.LLILZ.invoke();
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            interfaceC971790bObLIZIZ.LJII(1, getContext(), this.LLILLJJLI, true);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NR();
        return Unit.LIZ;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LL;
        if (anchorTextHeaderViewModel != null) {
            MutableLiveData<List<C01ZA>> mutableLiveData = anchorTextHeaderViewModel.LLJILJIL;
            C13BV c13bv = C13BV.INSTANCE;
            mutableLiveData.setValue(c13bv);
            anchorTextHeaderViewModel.LLJILJILJ.setValue(c13bv);
        }
    }

    @Override // X.InterfaceC972070bP3
    public final void A5(C354001Za c354001Za) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEdit ");
        sbLIZ.append(c354001Za);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderListFragment", 2);
        this.LLILZ.invoke();
        OR(this, EnumC971520bOA.EDIT, c354001Za.LIZIZ);
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            interfaceC971790bObLIZIZ.LIZJ(c354001Za.LIZIZ, this.LLILLJJLI, true);
        }
    }

    @Override // X.InterfaceC972070bP3
    public final void EA(C354001Za c354001Za) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDelete ");
        sbLIZ.append(c354001Za);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderListFragment", 2);
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIZILJ(2131854337);
        c782110Um9.LJII(2131854336);
        c782110Um9.LJIIJ(2131854350, new InterfaceC743640TFa() { // from class: X.0bOl
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131854353, new AcS354S0200000_15(this, c354001Za, 9));
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // X.InterfaceC971990bOv
    public final void Ed(C00UM c00um) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTemplateClick ");
        sbLIZ.append(c00um);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderListFragment", 2);
        this.LLILZ.invoke();
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.CLICK_SHORTCUT;
        Long lValueOf = Long.valueOf(c00um.LIZ.LIZLLL);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "recommend", MultiCanvasUtils.LJIIJJI(enumC952890au7), "header");
        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
        if (interfaceC971790bObLIZIZ != null) {
            interfaceC971790bObLIZIZ.LJIILL(c00um, this.LLILLJJLI, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC972070bP3
    public final void qP(C354001Za c354001Za) {
        List<C01ZA> value;
        List<C00UM> value2;
        long j;
        boolean z;
        MutableLiveData<List<C00UM>> mutableLiveData;
        MutableLiveData<List<C01ZA>> mutableLiveData2;
        List<C01ZA> value3;
        List<C00UM> value4;
        MutableLiveData<List<C00UM>> mutableLiveData3;
        MutableLiveData<List<C01ZA>> mutableLiveData4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateSelectState item : oldSelectedState:");
        sbLIZ.append(c354001Za.LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c354001Za.LIZIZ);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderListFragment", 2);
        if (c354001Za.LIZ) {
            AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LL;
            if (anchorTextHeaderViewModel == null || (mutableLiveData4 = anchorTextHeaderViewModel.LLJILJIL) == null || (value3 = mutableLiveData4.getValue()) == null) {
                value3 = C13BV.INSTANCE;
            }
            AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = this.LL;
            if (anchorTextHeaderViewModel2 == null || (mutableLiveData3 = anchorTextHeaderViewModel2.LLJILJILJ) == null || (value4 = mutableLiveData3.getValue()) == null) {
                value4 = C13BV.INSTANCE;
            }
            PR(null, value3, value4);
            OR(this, EnumC971520bOA.DISABLE, c354001Za.LIZIZ);
            AnchorTextHeaderViewModel anchorTextHeaderViewModel3 = this.LL;
            if (anchorTextHeaderViewModel3 != null) {
                anchorTextHeaderViewModel3.KQ2(AFwS203S0000000_15.get$arr$(118), new C5182020e(this, 72));
                return;
            }
            return;
        }
        OR(this, EnumC971520bOA.USE, c354001Za.LIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("selectedItem item:");
        sbLIZ2.append(c354001Za);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "TextHeaderListFragment", 2);
        C01ZA c01za = c354001Za.LIZIZ;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel4 = this.LL;
        if (anchorTextHeaderViewModel4 == null || (mutableLiveData2 = anchorTextHeaderViewModel4.LLJILJIL) == null || (value = mutableLiveData2.getValue()) == null) {
            value = C13BV.INSTANCE;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel5 = this.LL;
        if (anchorTextHeaderViewModel5 == null || (mutableLiveData = anchorTextHeaderViewModel5.LLJILJILJ) == null || (value2 = mutableLiveData.getValue()) == null) {
            value2 = C13BV.INSTANCE;
        }
        PR(c01za, value, value2);
        AnchorTextHeaderViewModel anchorTextHeaderViewModel6 = this.LL;
        if (anchorTextHeaderViewModel6 == null) {
            return;
        }
        C01ZA c01za2 = c354001Za.LIZIZ;
        AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(184);
        C5183020f c5183020f = new C5183020f(this, 216);
        C01ZA c01za3 = (C01ZA) anchorTextHeaderViewModel6.LLILZ.getValue();
        if (c01za3 != null) {
            j = c01za3.LIZLLL;
        } else {
            j = 0;
        }
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = c01za2.LIZLLL;
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(aFwS250S0000000_15, 365);
            AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c5183020f, 42);
            if (anchorTextHeaderViewModel6.MQ2() > 0) {
                C300201Ei c300201EiWQ2 = anchorTextHeaderViewModel6.wQ2();
                TextHeaderUpdateParams textHeaderUpdateParams = new TextHeaderUpdateParams();
                textHeaderUpdateParams.roomId = C01JX.LJII();
                textHeaderUpdateParams.textHeaderId = anchorTextHeaderViewModel6.MQ2();
                textHeaderUpdateParams.updateType = 1;
                textHeaderUpdateParams.recordId = j2;
                c300201EiWQ2.getClass();
                C480460Ism.LIZ().getClass();
                C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).updatePlay(textHeaderUpdateParams), "AnchorTextHeaderModel", "updatePlay").LJIILL(new C516201zk(c300201EiWQ2, 69))).LJFF(new C0UO0()), anchorTextHeaderViewModel6.vQ2(), new AfS151S0200000_15(awS559S0100000_15, awS553S0100000_9, 29), new AfS178S0100000_9(awS553S0100000_9, 11), 24);
                return;
            }
            anchorTextHeaderViewModel6.NQ2("updatePlay return as textHeaderId is valid");
            awS553S0100000_9.invoke();
            return;
        }
        long j3 = c01za2.LIZLLL;
        AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(aFwS250S0000000_15, 366);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(c5183020f, 41);
        C300201Ei c300201EiWQ22 = anchorTextHeaderViewModel6.wQ2();
        TextHeaderCreateParams textHeaderCreateParams = new TextHeaderCreateParams();
        textHeaderCreateParams.roomId = C01JX.LJII();
        textHeaderCreateParams.recordId = j3;
        textHeaderCreateParams.mgTraceInfo = null;
        c300201EiWQ22.getClass();
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).startPlay(textHeaderCreateParams), "AnchorTextHeaderModel", "startPlay").LJIILL(new C516201zk(c300201EiWQ22, 68))).LJFF(new C0UO0()), anchorTextHeaderViewModel6.vQ2(), new AfS151S0200000_15(awS559S0100000_152, awS553S0100000_92, 28), new AfS178S0100000_9(awS553S0100000_92, 10), 24);
    }

    @Override // X.InterfaceC972070bP3
    public final void xd(C354001Za c354001Za) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUseAsTitle ");
        sbLIZ.append(c354001Za);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderListFragment", 2);
        C01F5 c01f5 = c354001Za.LIZIZ.LIZ;
        if (c01f5 != null) {
            str = c01f5.LIZ;
        } else {
            str = null;
        }
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131854276, str));
        c782110Um9.LJIIJ(2131854350, new InterfaceC743640TFa() { // from class: X.0bOm
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131851918, new AcS83S1200000_15(this, c354001Za, str, 0));
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC971610bOJ enumC971610bOJ;
        MutableLiveData<List<C00UM>> mutableLiveData;
        MutableLiveData<List<C01ZA>> mutableLiveData2;
        MutableLiveData mutableLiveData3;
        super.onViewCreated(view, bundle);
        this.LLILZLL = (RecyclerView) view.findViewById(R.id.xnt);
        View viewFindViewById = view.findViewById(R.id.xnj);
        this.LLIZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 232), viewFindViewById);
        }
        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
        if (this.LLILLJJLI == EnumC971980bOu.ALL_LIST_TYPE) {
            enumC971610bOJ = EnumC971610bOJ.BOARD;
        } else {
            enumC971610bOJ = EnumC971610bOJ.HEADER;
        }
        MultiCanvasUtils.LIZ.getClass();
        C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), enumC971610bOJ, "header");
        if (this.LLILLJJLI == EnumC971980bOu.ONLY_TEXT_HEADER_AND_CREATE_TYPE && C934890aR5.LIZ() && this.LLILLL != EnumC952890au7.DESIGN_PANEL) {
            this.LLILZIL = true;
        }
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new AsS42S0100000_15(this, 7));
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LL;
        if (anchorTextHeaderViewModel != null && (mutableLiveData3 = anchorTextHeaderViewModel.LLILZLL) != null) {
            mutableLiveData3.observe(this, new C513601zK(this, 44));
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = this.LL;
        if (anchorTextHeaderViewModel2 != null && (mutableLiveData2 = anchorTextHeaderViewModel2.LLJILJIL) != null) {
            mutableLiveData2.observe(this, new C513601zK(this, 45));
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel3 = this.LL;
        if (anchorTextHeaderViewModel3 != null && (mutableLiveData = anchorTextHeaderViewModel3.LLJILJILJ) != null) {
            mutableLiveData.observe(this, new C513601zK(this, 46));
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel4 = this.LL;
        if (anchorTextHeaderViewModel4 != null) {
            C5183020f c5183020f = new C5183020f(this, 215);
            AnonymousClass0206 anonymousClass0206 = AnonymousClass0206.get$arr$(372);
            C300201Ei c300201EiWQ2 = anchorTextHeaderViewModel4.wQ2();
            TextHeaderRecordFetchListParams textHeaderRecordFetchListParams = new TextHeaderRecordFetchListParams();
            textHeaderRecordFetchListParams.roomId = C01JX.LJII();
            c300201EiWQ2.getClass();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).fetchRecordList(textHeaderRecordFetchListParams), "AnchorTextHeaderModel", "fetchRecordList").LJIILL(new C09JN() { // from class: X.00SM
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BaseTextHeaderModel@7171.fetchRecordList$1");
                    C930480aJy.LIZ.getClass();
                    C1C7U.LIZIZ("BaseTextHeaderModel@7171.fetchRecordList$1");
                }
            })).LJFF(new C0UO0()), anchorTextHeaderViewModel4.vQ2(), new C516701zp(anchorTextHeaderViewModel4, c5183020f, anonymousClass0206, 2), new C516201zk(anonymousClass0206, 65), 24);
        }
        RecyclerView recyclerView2 = this.LLILZLL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = this.LLILZLL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LLJ);
        }
    }

    public static void OR(TextHeaderListFragment textHeaderListFragment, EnumC971520bOA enumC971520bOA, C01ZA c01za) {
        textHeaderListFragment.getClass();
        Long lValueOf = Long.valueOf(c01za.LIZLLL);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "header");
    }

    public final void PR(C01ZA c01za, List<C01ZA> list, List<C00UM> list2) {
        boolean z;
        boolean z2;
        InterfaceC951240arS<Object> interfaceC951240arS;
        View view = this.LLIZ;
        if (this.LLILLJJLI == EnumC971980bOu.ONLY_TEXT_HEADER_AND_CREATE_TYPE && (!list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LJLJLJ(view, z);
        C410901il c410901il = new C410901il();
        if (list.isEmpty()) {
            if (C931810aM7.LIZLLL() && (!list2.isEmpty())) {
                interfaceC951240arS = new InterfaceC951240arS<Object>() { // from class: X.0bOr
                    @Override // X.InterfaceC951240arS
                    public final boolean LIZIZ(Object obj) {
                        return obj instanceof C971950bOr;
                    }

                    @Override // X.InterfaceC951240arS
                    public final boolean LJII(Object obj) {
                        return obj instanceof C971950bOr;
                    }
                };
            } else {
                interfaceC951240arS = new InterfaceC951240arS<Object>() { // from class: X.0bOs
                    @Override // X.InterfaceC951240arS
                    public final boolean LIZIZ(Object obj) {
                        return obj instanceof C971960bOs;
                    }

                    @Override // X.InterfaceC951240arS
                    public final boolean LJII(Object obj) {
                        return obj instanceof C971960bOs;
                    }
                };
            }
            c410901il.add(interfaceC951240arS);
        } else {
            for (C01ZA c01za2 : list) {
                if (c01za != null && c01za.LIZLLL == c01za2.LIZLLL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c410901il.add(new C354001Za(z2, c01za2));
            }
        }
        if (!list2.isEmpty()) {
            c410901il.add(new C971930bOp(getString(2131854567)));
            c410901il.addAll(list2);
        }
        if (this.LLILLJJLI == EnumC971980bOu.ONLY_TEXT_HEADER_AND_CREATE_TYPE) {
            c410901il.add(new Object() { // from class: X.0bOw
            });
        }
        this.LLJ.LLLIILIL(c410901il, new AwS259S0300000_15(this, c410901il, c01za, 18), AFwS203S0000000_15.get$arr$(119));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gm0, viewGroup, false);
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

    public TextHeaderListFragment(AnchorTextHeaderViewModel anchorTextHeaderViewModel, EnumC971980bOu enumC971980bOu, EnumC952890au7 enumC952890au7, Function0<Unit> function0) {
        this.LL = anchorTextHeaderViewModel;
        this.LLILLJJLI = enumC971980bOu;
        this.LLILLL = enumC952890au7;
        this.LLILZ = function0;
        C951190arN c951190arN = new C951190arN();
        c951190arN.LLLI(C354001Za.class, new C0J8P<C354001Za, C972060bP2>(this) { // from class: X.0bP1
            public final InterfaceC972070bP3 LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C354001Za c354001Za) {
                C972060bP2 c972060bP2 = (C972060bP2) viewHolder;
                C354001Za c354001Za2 = c354001Za;
                C786410Ut5.I7(new AbS505S0200000_15(c972060bP2, c354001Za2, 6), c972060bP2.LLILLJJLI);
                C01F5 c01f5 = c354001Za2.LIZIZ.LIZ;
                if (c01f5 != null) {
                    c972060bP2.LLILLL.LJIIIIZZ(c01f5);
                }
                C786410Ut5.I7(new ACListenerS118S0200000_15(c972060bP2, c354001Za2, 58), c972060bP2.LLILZLL);
                c972060bP2.LLILLJJLI.setSelected(c354001Za2.LIZ);
                int i = c354001Za2.LIZIZ.LIZIZ;
                if (i != 1) {
                    if (i != 3) {
                        C439101nJ.LJI(c972060bP2.LLILZ);
                        C439101nJ.LJI(c972060bP2.LLILZIL);
                        return;
                    } else {
                        C12ES.LJIILL(0, c972060bP2.LLILZ);
                        C12ES.LJIILL(0, c972060bP2.LLILZIL);
                        c972060bP2.LLILZ.setIconAttr(R.attr.dn9);
                        c972060bP2.LLILZIL.setText(C497740JfY.LJIJI(2131854330));
                        return;
                    }
                }
                C12ES.LJIILL(0, c972060bP2.LLILZ);
                C12ES.LJIILL(0, c972060bP2.LLILZIL);
                c972060bP2.LLILZ.setIconAttr(R.attr.d4e);
                c972060bP2.LLILZIL.setText(C497740JfY.LJIJI(2131854335));
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C972060bP2(C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.gvs, viewGroup, false), this.LIZIZ);
            }
        });
        c951190arN.LLLI(C971960bOs.class, new C0J8P<C971960bOs, C971940bOq>(this) { // from class: X.0bOj
            public final Function0<Unit> LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.h_u, viewGroup, false);
                final Function0<Unit> function02 = this.LIZIZ;
                return new RecyclerView.ViewHolder(viewTd, function02) { // from class: X.0bOq
                    {
                        super(viewTd);
                        ((C972030bOz) viewTd.findViewById(R.id.h3n)).setCreateAction(function02);
                    }
                };
            }

            @Override // X.C0J8P
            public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, C971960bOs c971960bOs) {
            }
        });
        if (C931810aM7.LIZLLL()) {
            c951190arN.LLLI(C971950bOr.class, new C0J8P<C971950bOr, C971880bOk>(this) { // from class: X.0bOi
                public final Function0<Unit> LIZIZ;

                {
                    this.LIZIZ = this;
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    final View viewTd = C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.h_v, viewGroup, false);
                    final Function0<Unit> function02 = this.LIZIZ;
                    return new RecyclerView.ViewHolder(viewTd, function02) { // from class: X.0bOk
                        public final View LL;

                        {
                            super(viewTd);
                            View viewFindViewById = viewTd.findViewById(R.id.xn4);
                            this.LL = viewFindViewById;
                            C786410Ut5.I7(new ACListenerS150S0100000_15(function02, 261), viewFindViewById);
                        }
                    };
                }

                @Override // X.C0J8P
                public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, C971950bOr c971950bOr) {
                }
            });
            c951190arN.LLLI(C971930bOp.class, new C0J8P<C971930bOp, C971910bOn>() { // from class: X.0bOh
                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, C971930bOp c971930bOp) {
                    ((C971910bOn) viewHolder).LL.setText(c971930bOp.LIZ);
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C971910bOn(C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.gvt, viewGroup, false));
                }
            });
            c951190arN.LLLI(C00UM.class, new C0J8P<C00UM, C972020bOy>(this) { // from class: X.0bOx
                public final InterfaceC971990bOv LIZIZ;

                {
                    this.LIZIZ = this;
                }

                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, C00UM c00um) {
                    C972020bOy c972020bOy = (C972020bOy) viewHolder;
                    C00UM c00um2 = c00um;
                    c972020bOy.LLILLJJLI.setSelected(false);
                    C439101nJ.LJI(c972020bOy.LLILZLL);
                    C439101nJ.LJI(c972020bOy.LLILZ);
                    C439101nJ.LJI(c972020bOy.LLILZIL);
                    C01F5 c01f5 = c00um2.LIZ.LIZ;
                    if (c01f5 != null) {
                        c972020bOy.LLILLL.LJIIIIZZ(c01f5);
                    }
                    C786410Ut5.I7(new AbS505S0200000_15(c972020bOy, c00um2, 5), c972020bOy.LLILLJJLI);
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C972020bOy(C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.gvs, viewGroup, false), this.LIZIZ);
                }
            });
        }
        c951190arN.LLLI(C972000bOw.class, new C0J8P<C972000bOw, RecyclerView.ViewHolder>() { // from class: X.0bOg
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View view = new View(viewGroup.getContext());
                C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, C439101nJ.LIZ(106)));
                return new RecyclerView.ViewHolder(view) { // from class: X.0bOo
                };
            }

            @Override // X.C0J8P
            public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, C972000bOw c972000bOw) {
            }
        });
        this.LLJ = c951190arN;
    }
}
