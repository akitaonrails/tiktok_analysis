package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C20736316Cj;
import X.C497740JfY;
import X.C915190ZvJ;
import X.C978360bZC;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookBizListDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiHELIOSZz8/KTxiOSMyMScjJiR9KSsvISAhZjUgKDYxJyonJSYgPGscJS4qKiojIg06MgklOjsXISQgJig=";
    public RecyclerView LLJZIJLIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9n;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854123));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/playbook/anchor/playbooklist/PlaybookBizListDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM9MIRI5VBiqezqppeR88H7JodE8qoOvtDznWg2Sgq27EqLE=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LIZIZ = System.currentTimeMillis();
        this.LLJZIJLIL = (RecyclerView) view.findViewById(R.id.tvf);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = this.LLJZIJLIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLJZIJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(null);
        }
    }
}
