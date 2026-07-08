package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C292401Bi;
import X.C497740JfY;
import X.C786410Ut5;
import X.C947820alw;
import X.C950890aqt;
import X.C950900aqu;
import X.C950910aqv;
import X.C950960ar0;
import X.C951060arA;
import X.C951190arN;
import X.C953470av3;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration.common.PreloadLinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestDecorationDialog extends LiveSheetFragment {
    public static long LLLFFI = 0;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZy49Ky0jO2E3LSYjOy4nISoiZwImJDElDjo2OzEILCw8OiQ4ICA9DCwtJSA0";
    public DataChannel LLJLLL;
    public RecyclerView LLJZ;
    public C950960ar0 LLJZIJLIL;
    public final C01GW LLL = C292401Bi.LIZ(new AwS559S0100000_15(this, 182));
    public final C01GW LLLF = C292401Bi.LIZ(new AwS559S0100000_15(this, 180));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS559S0100000_15(this, 181));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854235));
        c1119170fEJ.LJI = false;
        c1119170fEJ.LJ = (ArrayList) this.LLLFF.getValue();
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C951190arN) this.LLLF.getValue()).LLLIIIIL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = true;
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(8.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        LLLFFI = 0L;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJZ = (RecyclerView) view.findViewById(R.id.tvr);
        PreloadLinearLayoutManager preloadLinearLayoutManager = new PreloadLinearLayoutManager(getContext());
        RecyclerView recyclerView = this.LLJZ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(preloadLinearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLJZ;
        if (recyclerView2 != null) {
            recyclerView2.setOverScrollMode(2);
        }
        RecyclerView recyclerView3 = this.LLJZ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((AbstractC21673619ry) this.LLLF.getValue());
        }
        C1117360fBO c1117360fBO = (C1117360fBO) this.LLLF.getValue();
        C951060arA c951060arA = (C951060arA) this.LLL.getValue();
        c951060arA.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C947820alw(c951060arA));
        arrayList.add(new C950900aqu(c951060arA));
        arrayList.add(new C950890aqt(c951060arA));
        arrayList.add(new C950910aqv(c951060arA));
        c1117360fBO.LLLII(arrayList);
        this.LLJZIJLIL = new C950960ar0(this.LLJZ);
        RecyclerView recyclerView4 = this.LLJZ;
        if (recyclerView4 != null) {
            HandlerHook.viewPost(recyclerView4, new ARunnableS115S0100000_15(this, 41));
        }
        C953470av3.LIZ.getClass();
        C953470av3.LIZ(view);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h9j, viewGroup, false);
    }
}
