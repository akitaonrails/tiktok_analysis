package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist;

import X.AbstractC1585810rMx;
import X.C01EI;
import X.C01NB;
import X.C09JN;
import X.C0UPI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C11NJ;
import X.C11S5;
import X.C19487311Lz;
import X.C1AZW;
import X.C20382814pG;
import X.C20384514pX;
import X.C20389214qI;
import X.C20390914qZ;
import X.C20393414qy;
import X.C20393814r2;
import X.C20394714rB;
import X.C20398514rn;
import X.C20402114sN;
import X.C20425514w9;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C403501hZ;
import X.C405101hp;
import X.C480460Ism;
import X.C497740JfY;
import X.C758170Tod;
import X.C784920Uqg;
import X.C915190ZvJ;
import X.C954140aw8;
import X.C978360bZC;
import X.C978410bZH;
import X.EnumC20429314wl;
import X.EnumC20429414wm;
import X.EnumC992490bvz;
import X.InterfaceC20405014sq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookListDialog extends BasePlaybookSheetFragment implements InterfaceC20405014sq {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZjUgKDYxJyonJSYgPGscJS4qKiojIgM6OzEIIC4/JyI=";
    public final DataChannel LLJZIJLIL;
    public final PlaybookAnchorViewModel LLL;
    public final C0UPI LLLF;
    public final C20393414qy LLLFF;
    public RecyclerView LLLFFI;
    public final C1117360fBO LLLFZ;
    public View LLLI;
    public final Set<Long> LLLII;
    public boolean LLLIIII;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9q;
    }

    @Override // X.InterfaceC20405014sq
    public final long LLJJ() {
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
        if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.playbook) == null) {
            return 0L;
        }
        return playbook.playbookId;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        this.LLLFF.getClass();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854068));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodWR = WR(new View.OnClickListener() { // from class: X.14r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        if (c758170TodWR != null) {
            arrayList.add(c758170TodWR);
        }
        c1119170fEJ.LJ = arrayList;
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // X.InterfaceC20405014sq
    public final long m2() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
        if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLJJ) == null || (value = mutableLiveData.getValue()) == null) {
            return 0L;
        }
        return value.longValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(1, null);
        sheetOptionsIS.cornerRadius = (int) C497740JfY.LIZIZ(8.0f);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/playbook/anchor/playbooklist/PlaybookListDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM9MIRI5VBiqezqppeR88H7JodE8qoOXtBgH7mXGIrWg=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        this.LLLFF.getClass();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function1<? super Integer, Unit> function1 = this.LLLF.LJ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public static final void BS(LinearLayoutManager linearLayoutManager, PlaybookListDialog playbookListDialog) {
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (iFindFirstVisibleItemPosition < linearLayoutManager.getItemCount()) {
                Object obj = ListProtector.get(playbookListDialog.LLLFZ.LL, iFindFirstVisibleItemPosition);
                if (obj instanceof C20390914qZ) {
                    C20390914qZ c20390914qZ = (C20390914qZ) obj;
                    if (!playbookListDialog.LLLII.contains(Long.valueOf(c20390914qZ.LIZ.playbookId))) {
                        playbookListDialog.LLLII.add(Long.valueOf(c20390914qZ.LIZ.playbookId));
                        Function1<Long, Unit> function1 = playbookListDialog.LLLF.LJFF;
                        if (function1 != null) {
                            function1.invoke(Long.valueOf(c20390914qZ.LIZ.playbookId));
                        }
                        playbookListDialog.LLLFF.getClass();
                    }
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final C20393414qy c20393414qy = this.LLLFF;
        c20393414qy.getClass();
        PlaybookFetchListParams playbookFetchListParams = new PlaybookFetchListParams();
        PlaybookAnchorViewModel playbookAnchorViewModel = c20393414qy.LIZJ;
        long j = 0;
        if (playbookAnchorViewModel != null) {
            C20384514pX c20384514pX = playbookAnchorViewModel.LLJJJJJIL;
            c20384514pX.getClass();
            long j2 = C20425514w9.LJ;
            if (j2 == 0) {
                C403501hZ.LIZ(new C20389214qI(c20384514pX));
            }
            j = j2;
        }
        playbookFetchListParams.symphonyEngineAppVersion = j;
        playbookFetchListParams.roomId = C954140aw8.LIZJ();
        playbookFetchListParams.onlyNeedRecommendedBooks = true;
        playbookFetchListParams.needPlaybookFirstLevelTagType = 9;
        playbookFetchListParams.keepFavoritesInRecommended = true;
        playbookFetchListParams.businessType = "go_live_anchor";
        playbookFetchListParams.needMyCreationPlaybooks = true;
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).fetchList(playbookFetchListParams), "PlaybookGoLiveAnchorLisViewPresenter", "fetch_list").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00ir
            @Override // X.C09JN
            public final void accept(Object obj) {
                MutableLiveData<List<Playbook>> mutableLiveData;
                C1C7U.LIZ("PlaybookGoLiveAnchorListPresenter@87b8.fetchGoLiveAnchorList$1");
                C470590Icr c470590Icr = (C470590Icr) obj;
                C930480aJy.LIZ.getClass();
                if (C930480aJy.LJJIFFI(c470590Icr) && (mutableLiveData = c20393414qy.LJ) != null) {
                    mutableLiveData.postValue(((PlaybookFetchListResponse.ResponseData) c470590Icr.data).recommendedPlaybooks);
                }
                C1C7U.LIZIZ("PlaybookGoLiveAnchorListPresenter@87b8.fetchGoLiveAnchorList$1");
            }
        })), (C11NJ) c20393414qy.LIZ.getValue(), null, null, 30);
        this.LLLFFI = (RecyclerView) view.findViewById(R.id.twd);
        this.LLLI = view.findViewById(R.id.vg_empty);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = this.LLLFFI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLLFFI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLLFZ);
        }
        RecyclerView recyclerView3 = this.LLLFFI;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        RecyclerView recyclerView4 = this.LLLFFI;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.14r3
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView5, int i) {
                    PlaybookListDialog.BS(linearLayoutManager, this);
                }
            });
        }
        MutableLiveData<List<Playbook>> mutableLiveData = this.LLLFF.LJ;
        if (mutableLiveData != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.14qs
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Integer numValueOf;
                    ?? arrayList;
                    boolean z;
                    MutableLiveData<ActivePlaybook> mutableLiveData2;
                    ActivePlaybook value;
                    Playbook playbook;
                    List<Playbook> list = (List) obj;
                    String strLIZ = C01EI.LIZ(0, "PlaybookListDialog");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update playbookListLiveData size:");
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    if (list != null && !list.isEmpty()) {
                        PlaybookListDialog playbookListDialog = this;
                        if (!playbookListDialog.LLLIIII) {
                            Function0<Unit> function0 = playbookListDialog.LLLF.LIZLLL;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            this.LLLIIII = true;
                        }
                        View view2 = this.LLLI;
                        if (view2 != null) {
                            C500260Jjc.LJLJLJ(view2, false);
                        }
                        RecyclerView recyclerView5 = this.LLLFFI;
                        if (recyclerView5 != null) {
                            C500260Jjc.LJLJLJ(recyclerView5, true);
                        }
                        final PlaybookListDialog playbookListDialog2 = this;
                        RecyclerView recyclerView6 = playbookListDialog2.LLLFFI;
                        if (recyclerView6 != null) {
                            final LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                            HandlerHook.viewPost(recyclerView6, new Runnable() { // from class: X.14r0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("PlaybookListDialog@e04d.onViewCreated$2$1");
                                    try {
                                        PlaybookListDialog.BS(linearLayoutManager2, playbookListDialog2);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("PlaybookListDialog@e04d.onViewCreated$2$1");
                                }
                            });
                        }
                    } else {
                        PlaybookListDialog playbookListDialog3 = this;
                        View view3 = playbookListDialog3.LLLI;
                        if (view3 != null) {
                            playbookListDialog3.LLLFF.getClass();
                            C500260Jjc.LJLJLJ(view3, false);
                        }
                        RecyclerView recyclerView7 = this.LLLFFI;
                        if (recyclerView7 != null) {
                            C500260Jjc.LJLJLJ(recyclerView7, false);
                        }
                    }
                    C410901il c410901il = new C410901il(this.LLLFZ.LL);
                    if (list != null) {
                        PlaybookListDialog playbookListDialog4 = this;
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (Playbook playbook2 : list) {
                            PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookListDialog4.LLL;
                            if (playbookAnchorViewModel2 != null && (mutableLiveData2 = playbookAnchorViewModel2.LLILLJJLI) != null && (value = mutableLiveData2.getValue()) != null && (playbook = value.playbook) != null && playbook2.playbookId == playbook.playbookId) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(new C20390914qZ(playbook2, false, z, new C978410bZH("favorite", "favorite_list", 1)));
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    C410901il c410901il2 = new C410901il((Collection<?>) arrayList);
                    C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C20384914pb(c410901il, c410901il2), true);
                    C1117360fBO c1117360fBO = this.LLLFZ;
                    c1117360fBO.LL = c410901il2;
                    c21341918fZLIZ.LIZJ(c1117360fBO);
                }
            });
        }
    }

    @Override // X.InterfaceC20405014sq
    public final void tq(Playbook playbook, C20402114sN c20402114sN) {
        Context context = getContext();
        if (context != null) {
            C20394714rB c20394714rB = C20394714rB.LIZ;
            DataChannel dataChannel = this.LLJZIJLIL;
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
            C1117360fBO c1117360fBO = this.LLLFZ;
            c20394714rB.getClass();
            C20394714rB.LJ(dataChannel, context, playbook, playbookAnchorViewModel, C20394714rB.LIZJ(playbook, c1117360fBO, playbookAnchorViewModel), this.LLLF.LIZIZ, null, new C20393814r2(this, c20402114sN));
        }
    }

    public PlaybookListDialog(DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel, C0UPI c0upi) {
        C20393414qy c20393414qy;
        this.LLJZIJLIL = dataChannel;
        this.LLL = playbookAnchorViewModel;
        this.LLLF = c0upi;
        if (c0upi.LIZ == EnumC20429414wm.GO_LIVE_ANCHOR_LIST) {
            c20393414qy = new C20393414qy(dataChannel, playbookAnchorViewModel, c0upi);
        } else {
            c20393414qy = new C20393414qy(dataChannel, playbookAnchorViewModel, c0upi);
        }
        this.LLLFF = c20393414qy;
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(C20390914qZ.class, new C20398514rn((InterfaceC20405014sq) this, EnumC992490bvz.GO_LIVE_ANCHOR_TYPE, false, dataChannel));
        this.LLLFZ = c1117360fBO;
        this.LLLII = new LinkedHashSet();
    }

    @Override // X.InterfaceC20405014sq
    public final void nn(Playbook playbook, boolean z, C978410bZH c978410bZH) {
        long j;
        String strLIZ = C01EI.LIZ(hashCode(), "PlaybookListDialog");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemClick playbook playbook:");
        sbLIZ.append(playbook.playbookId);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        for (Object obj : this.LLLFZ.LL) {
            if ((obj instanceof C20390914qZ) && ((C20390914qZ) obj).LIZ.playbookId == playbook.playbookId) {
                break;
            }
        }
        Function1<Long, Unit> function1 = this.LLLF.LJI;
        if (function1 != null) {
            function1.invoke(Long.valueOf(playbook.playbookId));
        }
        C20393414qy c20393414qy = this.LLLFF;
        c20393414qy.getClass();
        long j2 = playbook.playbookId;
        if (c978410bZH != null) {
            C978360bZC.LJJIIZ(j2, c978410bZH);
        }
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(c20393414qy.LIZIZ);
        if (playbookAnchorServiceV2LIZIZ != null) {
            long j3 = playbook.playbookId;
            PlaybookContent playbookContent = playbook.content;
            if (playbookContent != null) {
                j = playbookContent.playbookContentId;
            } else {
                j = 0;
            }
            boolean z2 = playbook.isUpdatedVersion;
            C0UPI c0upi = c20393414qy.LIZLLL;
            playbookAnchorServiceV2LIZIZ.LJJIFFI(new C20382814pG(j3, j, z2, false, false, null, "from_list", null, c0upi.LJIIL, 0, null, c0upi.LIZIZ, null, null, c0upi.LJII, c0upi.LJIIIIZZ, c0upi.LJIIIZ, null, c0upi.LJIIJ, c0upi.LJIIJJI, null, null, null, null, null, null, null, false, -3613256), "goLiveAnchor item click", new C915190ZvJ("fyp_go_live_button", false, 6), EnumC20429314wl.INTERACT, false);
        }
    }
}
