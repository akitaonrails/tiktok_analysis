package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist;

import X.AbstractC1585810rMx;
import X.C01EI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C1AZW;
import X.C20382814pG;
import X.C20390914qZ;
import X.C20393114qv;
import X.C20394214r6;
import X.C20394714rB;
import X.C20398514rn;
import X.C20402114sN;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C758170Tod;
import X.C784920Uqg;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C978360bZC;
import X.C978410bZH;
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
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicNonMGPlaybookFixTechSwitchSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookFavoritesListDialog extends BasePlaybookSheetFragment implements InterfaceC20405014sq {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/HELIOSKTxiOSMyMScjJiR9KSsvISAhZjUgKDYxJyonJSYgPGscJS4qKiojIgkyPio+IDs2OwklOjsXISQgJig=";
    public final DataChannel LLJZIJLIL;
    public final PlaybookAnchorViewModel LLL;
    public RecyclerView LLLF;
    public final C1117360fBO LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public final Set<Long> LLLI;
    public final String LLLII;
    public final boolean LLLIIII;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9n;
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
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854123));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodWR = WR(new View.OnClickListener() { // from class: X.14r7
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

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final boolean wS() {
        return this.LLLIIII;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLII;
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/playbook/anchor/playbooklist/PlaybookFavoritesListDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM9MIRI5VBiqezqppeR88H7JodE8qoO/lAxrNmWSBsUPBtMnA0ETqrBc=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LIZIZ = System.currentTimeMillis();
        }
    }

    public PlaybookFavoritesListDialog(DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel) {
        this.LLJZIJLIL = dataChannel;
        this.LLL = playbookAnchorViewModel;
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(C20390914qZ.class, new C20398514rn(this, EnumC992490bvz.FAVORITES_TYPE, dataChannel, 8));
        this.LLLFF = c1117360fBO;
        this.LLLI = new LinkedHashSet();
        this.LLLII = "favorites_playbook_list_panel";
        this.LLLIIII = true;
    }

    public static final void BS(LinearLayoutManager linearLayoutManager, PlaybookFavoritesListDialog playbookFavoritesListDialog) {
        boolean z;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (iFindFirstVisibleItemPosition < linearLayoutManager.getItemCount()) {
                Object obj = ListProtector.get(playbookFavoritesListDialog.LLLFF.LL, iFindFirstVisibleItemPosition);
                if (obj instanceof C20390914qZ) {
                    C20390914qZ c20390914qZ = (C20390914qZ) obj;
                    if (!playbookFavoritesListDialog.LLLI.contains(Long.valueOf(c20390914qZ.LIZ.playbookId))) {
                        playbookFavoritesListDialog.LLLI.add(Long.valueOf(c20390914qZ.LIZ.playbookId));
                        C978410bZH c978410bZH = c20390914qZ.LIZLLL;
                        if (c978410bZH != null) {
                            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                            C978360bZC.LJJIIZ(c20390914qZ.LIZ.playbookId, c978410bZH);
                        }
                        C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                        DataChannel dataChannel = playbookFavoritesListDialog.LLJZIJLIL;
                        Playbook playbook2 = c20390914qZ.LIZ;
                        int i = iFindFirstVisibleItemPosition + 1;
                        PlaybookAnchorViewModel playbookAnchorViewModel = playbookFavoritesListDialog.LLL;
                        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null && playbook.playbookId == c20390914qZ.LIZ.playbookId) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C978360bZC.LJIILL(dataChannel, "show", playbook2, "favorite", i, z, false, null, null, 0, null, null, 4032);
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
        MutableLiveData<List<Playbook>> mutableLiveData;
        super.onViewCreated(view, bundle);
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LIZIZ = System.currentTimeMillis();
        this.LLLF = (RecyclerView) view.findViewById(R.id.tvf);
        this.LLLFFI = view.findViewById(R.id.vg_empty);
        View viewFindViewById = view.findViewById(R.id.cnf);
        this.LLLFZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.14qk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.sl();
                }
            }, viewFindViewById);
        }
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = this.LLLF;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLLF;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLLFF);
        }
        RecyclerView recyclerView3 = this.LLLF;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        RecyclerView recyclerView4 = this.LLLF;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.14qj
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView5, int i) {
                    PlaybookFavoritesListDialog.BS(linearLayoutManager, this);
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJILJILJ) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.14qh
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
                    String strLIZ = C01EI.LIZ(0, "PlaybookFavoritesListDialog");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update favoritePlaybookListLiveData size:");
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    if (list != null && !list.isEmpty()) {
                        View view2 = this.LLLFFI;
                        if (view2 != null) {
                            C500260Jjc.LJLJLJ(view2, false);
                        }
                        RecyclerView recyclerView5 = this.LLLF;
                        if (recyclerView5 != null) {
                            C500260Jjc.LJLJLJ(recyclerView5, true);
                        }
                        final PlaybookFavoritesListDialog playbookFavoritesListDialog = this;
                        RecyclerView recyclerView6 = playbookFavoritesListDialog.LLLF;
                        if (recyclerView6 != null) {
                            final LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                            HandlerHook.viewPost(recyclerView6, new Runnable() { // from class: X.14qi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("PlaybookFavoritesListDialog@50b2.onViewCreated$3$1");
                                    try {
                                        PlaybookFavoritesListDialog.BS(linearLayoutManager2, playbookFavoritesListDialog);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("PlaybookFavoritesListDialog@50b2.onViewCreated$3$1");
                                }
                            });
                        }
                    } else {
                        View view3 = this.LLLFFI;
                        if (view3 != null) {
                            C500260Jjc.LJLJLJ(view3, true);
                        }
                        RecyclerView recyclerView7 = this.LLLF;
                        if (recyclerView7 != null) {
                            C500260Jjc.LJLJLJ(recyclerView7, false);
                        }
                    }
                    C410901il c410901il = new C410901il(this.LLLFF.LL);
                    if (list != null) {
                        PlaybookFavoritesListDialog playbookFavoritesListDialog2 = this;
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (Playbook playbook2 : list) {
                            PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookFavoritesListDialog2.LLL;
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
                    C1117360fBO c1117360fBO = this.LLLFF;
                    c1117360fBO.LL = c410901il2;
                    c21341918fZLIZ.LIZJ(c1117360fBO);
                }
            });
        }
    }

    @Override // X.InterfaceC20405014sq
    public final void tq(Playbook playbook, C20402114sN c20402114sN) {
        long j;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook2;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null) {
            j = playbook2.playbookId;
        } else {
            j = 0;
        }
        Context context = getContext();
        if (context != null) {
            C20394714rB c20394714rB = C20394714rB.LIZ;
            DataChannel dataChannel = this.LLJZIJLIL;
            PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLL;
            C1117360fBO c1117360fBO = this.LLLFF;
            c20394714rB.getClass();
            C20394714rB.LJ(dataChannel, context, playbook, playbookAnchorViewModel2, C20394714rB.LIZJ(playbook, c1117360fBO, playbookAnchorViewModel2), null, null, new C20393114qv(this, c20402114sN, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [webcast.data.multi_guest_play.Playbook] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.internal.AwS221S0300000_12] */
    /* JADX WARN: Type inference failed for: r22v0, types: [kotlin.jvm.internal.AwS55S1000000_4] */
    /* JADX WARN: Type inference failed for: r23v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r24v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r25v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.jvm.internal.AwS591S0100000_12] */
    /* JADX WARN: Type inference failed for: r27v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r28v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r31v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r32v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2] */
    /* JADX WARN: Type inference failed for: r42v0, types: [X.14wl] */
    @Override // X.InterfaceC20405014sq
    public final void nn(Playbook playbook, boolean z, C978410bZH c978410bZH) {
        ?? LIZIZ;
        long j;
        boolean z2;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook2;
        String strLIZ = C01EI.LIZ(hashCode(), "PlaybookFavoritesListDialog");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemClick playbook playbook:");
        sbLIZ.append(playbook.playbookId);
        String str = null;
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Iterator<?> it2 = this.LLLFF.LL.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                if ((next instanceof C20390914qZ) && ((C20390914qZ) next).LIZ.playbookId == playbook.playbookId) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (z) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            DataChannel dataChannel = this.LLJZIJLIL;
            if (i < 0) {
                i = 0;
            }
            int i2 = i + 1;
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
            if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null && playbook2.playbookId == playbook.playbookId) {
                z2 = true;
            } else {
                z2 = false;
            }
            str = null;
            C978360bZC.LJIILL(dataChannel, "click", playbook, "favorite", i2, z2, false, null, null, 0, null, null, 4032);
        }
        if (c978410bZH != null) {
            C978360bZC.LJJIIZ(playbook.playbookId, c978410bZH);
        }
        DataChannel dataChannel2 = this.LLJZIJLIL;
        if (dataChannel2 != null && (LIZIZ = C784920Uqg.LIZIZ(dataChannel2)) != 0) {
            long j2 = playbook.playbookId;
            PlaybookContent playbookContent = playbook.content;
            if (playbookContent != null) {
                j = playbookContent.playbookContentId;
            } else {
                j = 0;
            }
            C20382814pG c20382814pG = new C20382814pG(j2, j, playbook.isUpdatedVersion, false, false, str, str, str, false, 0, str, str, str, str, str, str, str, str, str, str, str, str, str, str, str, str, str, false, -2056);
            C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
            Object objLIZ = str;
            if (LinkMicNonMGPlaybookFixTechSwitchSetting.INSTANCE.isEnable()) {
                objLIZ = C20394214r6.LIZ(this.LLL);
            }
            LIZIZ.LJJIFFI(c20382814pG, "favorites item click", c915190ZvJ2, objLIZ, false);
        }
    }
}
