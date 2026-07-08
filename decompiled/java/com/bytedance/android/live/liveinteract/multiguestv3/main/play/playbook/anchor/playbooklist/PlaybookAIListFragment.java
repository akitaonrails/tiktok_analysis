package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist;

import X.AbstractC960460b6K;
import X.C01GW;
import X.C01NB;
import X.C09JN;
import X.C0HTI;
import X.C0TVI;
import X.C0UO0;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C11NJ;
import X.C14K9;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19487311Lz;
import X.C20373514nl;
import X.C20411614tu;
import X.C20413514uD;
import X.C20414114uJ;
import X.C20414214uK;
import X.C20441214yg;
import X.C20736316Cj;
import X.C418440Gaw;
import X.C452501pT;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954140aw8;
import X.C978360bZC;
import X.InterfaceC20409614ta;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookAIListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multilive.model.AiPlaybookSummary;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetAIGenHistoryParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetAIGenHistoryResponse;
import com.bytedance.android.livesdk.model.PlaybookRepublishSuccessEvent;
import com.bytedance.android.livesdk.model.PlaybookUnPublishSuccessEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookAIListFragment extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiHELIOSZz8/KTxiOSMyMScjJiR9KSsvISAhZjUgKDYxJyonJSYgPGscJS4qKiojIg4aBCw/PQkhKSIhLCEn";
    public final DataChannel LLJZIJLIL;
    public final boolean LLL;
    public RecyclerView LLLF;
    public C1749280vcc LLLFF;
    public View LLLFFI;
    public final C01GW LLLFZ = C452501pT.LIZIZ(new C20411614tu());
    public final C1117360fBO LLLI;
    public final LinearLayoutManager LLLII;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9k;
    }

    public final void BS() {
        C20441214yg.LIZIZ("PlaybookAIListFragment", "showLoadingView");
        C1749280vcc c1749280vcc = this.LLLFF;
        if (c1749280vcc != null) {
            C500260Jjc.LJLJLJ(c1749280vcc, false);
        }
        RecyclerView recyclerView = this.LLLF;
        if (recyclerView != null) {
            C500260Jjc.LJLJLJ(recyclerView, false);
        }
        View view = this.LLLFFI;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, true);
        }
        C480460Ism.LIZ().getClass();
        IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
        PlaybookGetAIGenHistoryParams playbookGetAIGenHistoryParams = new PlaybookGetAIGenHistoryParams();
        playbookGetAIGenHistoryParams.roomId = C954140aw8.LIZJ();
        C19487311Lz.LIZJ(C01NB.LIZIZ(iPlaybookApi.fetchPlaybookAIList(playbookGetAIGenHistoryParams), "PlaybookAIListFragment", "fetchAIPlaybookList").LJFF(new C0UO0()), (C11NJ) this.LLLFZ.getValue(), new C09JN() { // from class: X.14uG
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlaybookAIListFragment@c3d0.reFreshAIPlaybookList$2");
                C470590Icr c470590Icr = (C470590Icr) obj;
                C930480aJy.LIZ.getClass();
                if (C930480aJy.LJJIFFI(c470590Icr)) {
                    List<AiPlaybookSummary> list = ((PlaybookGetAIGenHistoryResponse.ResponseData) c470590Icr.data).aiGenPlaybooks;
                    if (list.isEmpty()) {
                        this.LL.S6();
                    } else {
                        PlaybookAIListFragment playbookAIListFragment = this.LL;
                        playbookAIListFragment.getClass();
                        C20441214yg.LIZIZ("PlaybookAIListFragment", "showContentView");
                        C1749280vcc c1749280vcc2 = playbookAIListFragment.LLLFF;
                        if (c1749280vcc2 != null) {
                            C500260Jjc.LJLJLJ(c1749280vcc2, false);
                        }
                        RecyclerView recyclerView2 = playbookAIListFragment.LLLF;
                        if (recyclerView2 != null) {
                            C500260Jjc.LJLJLJ(recyclerView2, true);
                        }
                        View view2 = playbookAIListFragment.LLLFFI;
                        if (view2 != null) {
                            C500260Jjc.LJLJLJ(view2, false);
                        }
                    }
                    this.LL.LLLI.LL = new C410901il(new ArrayList(list));
                    this.LL.LLLI.notifyDataSetChanged();
                }
                C1C7U.LIZIZ("PlaybookAIListFragment@c3d0.reFreshAIPlaybookList$2");
            }
        }, new C09JN() { // from class: X.14uH
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlaybookAIListFragment@c3d0.reFreshAIPlaybookList$3");
                this.LL.S6();
                C20441214yg.LJ("PlaybookAIListFragment", "fetchAIPlaybookList failure");
                C1C7U.LIZIZ("PlaybookAIListFragment@c3d0.reFreshAIPlaybookList$3");
            }
        }, 24);
    }

    public final void S6() {
        C20441214yg.LIZIZ("PlaybookAIListFragment", "showEmptyView");
        C1749280vcc c1749280vcc = this.LLLFF;
        if (c1749280vcc != null) {
            C500260Jjc.LJLJLJ(c1749280vcc, true);
        }
        RecyclerView recyclerView = this.LLLF;
        if (recyclerView != null) {
            C500260Jjc.LJLJLJ(recyclerView, false);
        }
        View view = this.LLLFFI;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        if (this.LLL) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C758170Tod(R.attr.d33, new View.OnClickListener() { // from class: X.14uI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlaybookAIListFragment playbookAIListFragment = this.LL;
                    playbookAIListFragment.getClass();
                    C1911200zpm.LIZIZ(playbookAIListFragment);
                }
            }));
            c1119170fEJ.LJ = arrayList;
        }
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131855155));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C11NJ) this.LLLFZ.getValue()).LJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsLIZ = C20373514nl.LIZ(this.LLL);
        if (!this.LLL) {
            sheetOptionsLIZ.canceledOnTouchOutside = true;
        }
        return sheetOptionsLIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.14tY] */
    public PlaybookAIListFragment(DataChannel dataChannel, boolean z) {
        this.LLJZIJLIL = dataChannel;
        this.LLL = z;
        final ?? r3 = new InterfaceC20409614ta() { // from class: X.14tY
            @Override // X.InterfaceC20409614ta
            public final void LIZ(AiPlaybookSummary aiPlaybookSummary) {
                C20382814pG c20382814pG = new C20382814pG(aiPlaybookSummary.playbookId, aiPlaybookSummary.playbookContentId, false, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -4);
                c20382814pG.LJIILJJIL = new C20409314tX(c20382814pG, this.LIZ);
                C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LIZ.LLJZIJLIL);
                if (c0utjPl1 != null) {
                    c0utjPl1.LJJIFFI(c20382814pG, "aiList", C978360bZC.LIZJ, EnumC20429314wl.INTERACT, false);
                }
            }
        };
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(AiPlaybookSummary.class, new AbstractC960460b6K<AiPlaybookSummary, C20413514uD>(r3) { // from class: X.14uC
            public final InterfaceC20409614ta LIZIZ;

            {
                this.LIZIZ = r3;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20413514uD(C786410Ut5.Td(layoutInflater, R.layout.h_8, viewGroup, false), this.LIZIZ);
            }

            @Override // X.C0J8P
            public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                C20413514uD c20413514uD = (C20413514uD) viewHolder;
                AiPlaybookSummary aiPlaybookSummary = (AiPlaybookSummary) obj;
                if (!list.isEmpty()) {
                    c20413514uD.getLayoutPosition();
                    c20413514uD.L5(aiPlaybookSummary);
                } else {
                    LIZJ(c20413514uD, aiPlaybookSummary);
                }
            }
        });
        this.LLLI = c1117360fBO;
        this.LLLII = new LinearLayoutManager(getContext(), 1, false);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLL) {
            View viewFindViewById = view.findViewById(R.id.n65);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.eqx);
            if (viewFindViewById2 != null) {
                C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.14v6
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        view2.setPadding(view2.getPaddingLeft(), c20246014Ju.LIZ(7).LIZIZ, view2.getPaddingRight(), 0);
                        return c20246014Ju;
                    }
                });
                viewFindViewById2.setBackgroundColor(QM(requireContext()));
            }
        }
        view.findViewById(R.id.qom).setBackgroundColor(C20736316Cj.LIZIZ(R.attr.exw, getContext()));
        this.LLLF = (RecyclerView) view.findViewById(R.id.qoo);
        this.LLLFF = (C1749280vcc) view.findViewById(R.id.qoh);
        this.LLLFFI = view.findViewById(R.id.qon);
        RecyclerView recyclerView = this.LLLF;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.LLLII);
        }
        RecyclerView recyclerView2 = this.LLLF;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLLI);
        }
        RecyclerView recyclerView3 = this.LLLF;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        Context context = getContext();
        if (context != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n6;
            Drawable drawableLIZ = c0hti.LIZ(context);
            C1749280vcc c1749280vcc = this.LLLFF;
            if (c1749280vcc != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LIZJ = 2;
                c1722300uv6.LIZ = drawableLIZ;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                c1722300uv6.LIZLLL = iLIZIZ;
                c1722300uv6.LJ = iLIZIZ2;
                c1722300uv6.LJIIIIZZ = C497740JfY.LJIJI(2131855154);
                c1749280vcc.setStatus(c1722300uv6);
            }
        }
        DataChannel dataChannel = this.LLJZIJLIL;
        dataChannel.BQ2(this, PlaybookRepublishSuccessEvent.class, new C20414114uJ(this));
        dataChannel.BQ2(this, PlaybookUnPublishSuccessEvent.class, new C20414214uK(this));
        BS();
        C978360bZC.LJIJJLI(null, "ai_generate_list", "", null, false);
    }
}
