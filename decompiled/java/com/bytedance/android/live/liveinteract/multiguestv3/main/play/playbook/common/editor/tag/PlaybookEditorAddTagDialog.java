package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.tag;

import X.AbstractC960460b6K;
import X.C00US;
import X.C093400Wu;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C15438062q;
import X.C1868320yic;
import X.C1887960zEI;
import X.C19412310x7;
import X.C1AZW;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C513601zK;
import X.C515101zZ;
import X.C5183020f;
import X.InterfaceC1878990yzp;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.PGCPlaybookEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookEditorAddTagDialog extends BasePlaybookSheetFragment implements InterfaceC1878990yzp {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOS8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8Oms4KCh9GCktMC08Jy4JLSYnJzcNLSsHKSIIIC4/JyI=";
    public final PGCPlaybookEditorViewModel LLJZIJLIL;
    public final Function1<Integer, Unit> LLL;
    public RecyclerView LLLF;
    public final C1117360fBO LLLFF;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.ham;
    }

    public final void BS() {
        PlaybookTagAggregation next;
        List<Integer> list;
        ArrayList arrayList = new ArrayList();
        List<PlaybookTagAggregation> value = this.LLJZIJLIL.LLILLL.LJIIIIZZ.getValue();
        if (value != null) {
            arrayList.add(new C093400Wu("Primary"));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(value, 10));
            for (PlaybookTagAggregation playbookTagAggregation : value) {
                int i = playbookTagAggregation.playbookFirstLevelTagType;
                String str = playbookTagAggregation.firstLevelTagTranslatedName;
                Integer value2 = this.LLJZIJLIL.LLILLL.LJIIJJI.getValue();
                arrayList2.add(new C1868320yic(i, str, true, value2 != null && i == value2.intValue(), true));
            }
            arrayList.add(new C00US(arrayList2));
            arrayList.add(new C093400Wu("Secondary"));
            Iterator<PlaybookTagAggregation> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                int i2 = next.playbookFirstLevelTagType;
                Integer value3 = this.LLJZIJLIL.LLILLL.LJIIJJI.getValue();
                if (value3 != null && i2 == value3.intValue()) {
                    break;
                }
            }
            PlaybookTagAggregation playbookTagAggregation2 = next;
            if (playbookTagAggregation2 != null) {
                List<PlaybookTagInfo> list2 = playbookTagAggregation2.tags;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (PlaybookTagInfo playbookTagInfo : list2) {
                    int i3 = playbookTagInfo.tagType;
                    String str2 = playbookTagInfo.tagTranslatedName;
                    List<Integer> value4 = this.LLJZIJLIL.LLILLL.LJIIL.getValue();
                    boolean z = value4 != null && value4.contains(Integer.valueOf(playbookTagInfo.tagType));
                    Map<Integer, List<Integer>> value5 = this.LLJZIJLIL.LLILLL.LJIIIZ.getValue();
                    arrayList3.add(new C1868320yic(i3, str2, false, z, !((value5 == null || (list = value5.get(Integer.valueOf(playbookTagAggregation2.playbookFirstLevelTagType))) == null || !list.contains(Integer.valueOf(playbookTagInfo.tagType))) ? false : true)));
                }
                arrayList.add(new C00US(arrayList3));
            }
        }
        C1117360fBO c1117360fBO = this.LLLFF;
        c1117360fBO.LL = arrayList;
        c1117360fBO.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131843824), R.style.a82, new C515101zZ(this, 2)));
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131851935), R.style.a7b, new C515101zZ(this, 3)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ("Add tag");
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorDialog", "onDestroy", null, null);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if (i == 2) {
            this.LLJZIJLIL.IQ2();
        }
        this.LLL.invoke(Integer.valueOf(i));
    }

    public PlaybookEditorAddTagDialog(PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel, C5183020f c5183020f) {
        this.LLJZIJLIL = pGCPlaybookEditorViewModel;
        this.LLL = c5183020f;
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(C093400Wu.class, new AbstractC960460b6K<C093400Wu, C19412310x7>() { // from class: X.10x6
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C19412310x7(C786410Ut5.Td(layoutInflater, R.layout.hao, viewGroup, false));
            }

            @Override // X.C0J8P
            public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                C19412310x7 c19412310x7 = (C19412310x7) viewHolder;
                C093400Wu c093400Wu = (C093400Wu) obj;
                if (!list.isEmpty()) {
                    c19412310x7.getLayoutPosition();
                    c19412310x7.LL.setText(c093400Wu.LIZ);
                } else {
                    LIZJ(c19412310x7, c093400Wu);
                }
            }
        });
        c1117360fBO.LLLI(C00US.class, new AbstractC960460b6K<C00US, C1887960zEI>(this) { // from class: X.0zEL
            public final InterfaceC1878990yzp LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                C21532619Oq c21532619Oq = new C21532619Oq(viewGroup.getContext(), null);
                C786410Ut5.d7(c21532619Oq, new ViewGroup.LayoutParams(-1, -2));
                c21532619Oq.setFlexDirection(0);
                c21532619Oq.setFlexWrap(1);
                c21532619Oq.setJustifyContent(0);
                return new C1887960zEI(c21532619Oq, this.LIZIZ);
            }

            @Override // X.C0J8P
            public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                C1887960zEI c1887960zEI = (C1887960zEI) viewHolder;
                C00US c00us = (C00US) obj;
                if (!list.isEmpty()) {
                    c1887960zEI.getLayoutPosition();
                    c1887960zEI.L5(c00us);
                } else {
                    LIZJ(c1887960zEI, c00us);
                }
            }
        });
        this.LLLFF = c1117360fBO;
    }

    @Override // X.InterfaceC1878990yzp
    public final void AM(int i, boolean z) {
        if (z) {
            PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel = this.LLJZIJLIL;
            pGCPlaybookEditorViewModel.LLILLL.LJIIJJI.postValue(Integer.valueOf(i));
            pGCPlaybookEditorViewModel.LLILLL.LJIIL.postValue(null);
        } else {
            MutableLiveData<List<Integer>> mutableLiveData = this.LLJZIJLIL.LLILLL.LJIIL;
            List<Integer> value = mutableLiveData.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            value.add(Integer.valueOf(i));
            mutableLiveData.postValue(value);
        }
    }

    @Override // X.InterfaceC1878990yzp
    public final void gz(int i, boolean z) {
        if (z) {
            PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel = this.LLJZIJLIL;
            pGCPlaybookEditorViewModel.LLILLL.LJIIJJI.postValue(0);
            pGCPlaybookEditorViewModel.LLILLL.LJIIL.postValue(null);
        } else {
            MutableLiveData<List<Integer>> mutableLiveData = this.LLJZIJLIL.LLILLL.LJIIL;
            List<Integer> value = mutableLiveData.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            value.remove(Integer.valueOf(i));
            mutableLiveData.postValue(value);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorDialog", "onViewCreated", null, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.txc);
        this.LLLF = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView2 = this.LLLF;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLLFF);
        }
        this.LLJZIJLIL.LLILLL.LJIIIIZZ.observe(this, new C513601zK(this, 9));
        this.LLJZIJLIL.LLILLL.LJIIJJI.observe(this, new C513601zK(this, 10));
        this.LLJZIJLIL.LLILLL.LJIIL.observe(this, new C513601zK(this, 11));
    }
}
