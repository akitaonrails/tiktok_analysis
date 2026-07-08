package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.sort;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C1868240yiU;
import X.C20359414lU;
import X.C20360614lg;
import X.C20370314nF;
import X.C20370914nL;
import X.C20371614nS;
import X.C20371914nV;
import X.C20379114of;
import X.C20483915Dh;
import X.C20736316Cj;
import X.C21688219uK;
import X.C418440Gaw;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751090TdD;
import X.C758170Tod;
import X.C814420VxA;
import X.C915190ZvJ;
import X.C951190arN;
import X.C978360bZC;
import X.EnumC751100TdE;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookEditorSortDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOS8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8Oms/Jj0nZhUgKDYxJyonDCs6PCo+GiAhPAElKCM8Lw==";
    public final BasePlaybookEditorViewModel LLJZIJLIL;
    public final Function0<Long> LLL;
    public final Function0<String> LLLF;
    public final Function0<Boolean> LLLFF;
    public final Function1<List<C20359414lU>, Unit> LLLFFI;
    public final Function1<Integer, Unit> LLLFZ;
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1596));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(544));
    public final List<C20359414lU> LLLIIII = new ArrayList();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hb2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854107));
        c1119170fEJ.LJI = false;
        C751090TdD c751090TdD = new C751090TdD();
        c751090TdD.LIZIZ = C497740JfY.LJIJI(2131854106);
        c751090TdD.LIZ = EnumC751100TdE.SECONDARY;
        c751090TdD.LIZLLL = new ACListenerS165S0100000_31(this, 26);
        c1119170fEJ.LIZLLL = c751090TdD;
        c1119170fEJ.LJ = Collections.singletonList(new C758170Tod(R.attr.d32, new ACListenerS165S0100000_31(this, 27)));
        return c1119170fEJ;
    }

    public final void refreshData() {
        C1117360fBO c1117360fBO = (C1117360fBO) this.LLLII.getValue();
        List<C20359414lU> list = this.LLLIIII;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1868240yiU((C20359414lU) it2.next()));
        }
        c1117360fBO.LLLII(arrayList);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C951190arN) this.LLLII.getValue()).LLLIIIIL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.canceledOnTouchOutside = false;
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLLFZ.invoke(Integer.valueOf(i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AppCompatTextView appCompatTextView;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.qr3);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            recyclerView.setAdapter((AbstractC21673619ry) this.LLLII.getValue());
            ((C21688219uK) this.LLLI.getValue()).LJ(recyclerView);
        }
        C20379114of value = this.LLJZIJLIL.LLILLL.LIZIZ.getValue();
        if (value != null && (c20360614lg = value.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null) {
            ((ArrayList) this.LLLIIII).addAll(list);
        }
        refreshData();
        C20483915Dh c20483915Dh = this.LLIZ;
        if (c20483915Dh != null && (appCompatTextView = (AppCompatTextView) c20483915Dh.findViewById(R.id.tv_right_button)) != null) {
            appCompatTextView.setBackgroundResource(R.drawable.f8_);
            appCompatTextView.setTextColor(C497740JfY.LIZLLL(R.attr.eyv, getContext()));
            C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), appCompatTextView);
            C500260Jjc.LJJLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), appCompatTextView);
            C500260Jjc.LJJLJLI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), appCompatTextView);
            appCompatTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIJJLI(this.LLL.invoke(), "change_order", this.LLLF.invoke(), null, this.LLLFF.invoke().booleanValue());
    }

    public PlaybookEditorSortDialog(BasePlaybookEditorViewModel basePlaybookEditorViewModel, C20371614nS c20371614nS, C20370914nL c20370914nL, C20370314nF c20370314nF, C20371914nV c20371914nV, AwS610S0100000_31 awS610S0100000_31) {
        this.LLJZIJLIL = basePlaybookEditorViewModel;
        this.LLL = c20371614nS;
        this.LLLF = c20370914nL;
        this.LLLFF = c20370314nF;
        this.LLLFFI = c20371914nV;
        this.LLLFZ = awS610S0100000_31;
    }
}
