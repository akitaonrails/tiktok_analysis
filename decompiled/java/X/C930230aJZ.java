package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS42S0301000_15;
import kotlin.jvm.internal.AwS73S0301000_15;

/* JADX INFO: renamed from: X.0aJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930230aJZ implements InterfaceC948410amt {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public final /* synthetic */ LayoutSettingContract LJ;
    public final /* synthetic */ View LJFF;
    public final /* synthetic */ List<C948400ams> LJI;

    @Override // X.InterfaceC948410amt
    public final void LIZ(int i, int i2) {
        C931740aM0.LJII(i, i2, "normal", "show", "", this.LJ.LJJIL());
    }

    @Override // X.InterfaceC948410amt
    public final void LIZIZ(int i, C948400ams c948400ams) {
        Integer numValueOf;
        String str;
        LifecycleOwner lifecycleOwner = null;
        if (C937280aUw.LIZ(this.LJ.source)) {
            LayoutSettingContract layoutSettingContract = this.LJ;
            int iLJII = layoutSettingContract.simpleLayoutDataSourceForV3.LJII(c948400ams.LIZIZ);
            layoutSettingContract.LJJJLZIJ(iLJII - 1);
            layoutSettingContract.LJJJLL(c948400ams.LIZIZ);
            C948360amo c948360amoLJIIIZ = layoutSettingContract.LJIIIZ();
            if (c948360amoLJIIIZ != null) {
                int i2 = c948360amoLJIIIZ.LLILZLL;
                c948360amoLJIIIZ.LLLJ(i);
                c948360amoLJIIIZ.notifyItemChanged(i2);
                c948360amoLJIIIZ.notifyItemChanged(c948360amoLJIIIZ.LLILZLL);
            }
            layoutSettingContract.simpleLayoutDataSourceForV3.LJIIIZ(c948400ams.LIZIZ);
            layoutSettingContract.simpleLayoutDataSourceForV3.LIZLLL(iLJII);
            String strLJIL = C940770aaZ.LIZ().getDataSource().LJIL();
            String strLIZ = C940770aaZ.LIZ().getDataSource().LIZ();
            String strValueOf = String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType());
            String strValueOf2 = String.valueOf(c948400ams.LIZIZ);
            List listLJII = C942210act.LIZ.LJII(null, C937280aUw.LIZ(layoutSettingContract.source));
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJII.iterator();
            while (it2.hasNext()) {
                String strValueOf3 = String.valueOf(((C948400ams) it2.next()).LIZIZ);
                if (strValueOf3 != null) {
                    arrayList.add(strValueOf3);
                }
            }
            if (C937280aUw.LIZ(layoutSettingContract.source)) {
                if (C500260Jjc.LJJ()) {
                    str = "playbook";
                } else {
                    str = "setting_playbook";
                }
            } else {
                str = "live_take_detail";
            }
            C931740aM0.LJIIJJI(new C931750aM1("click", strLJIL, strLIZ, strValueOf, "", "", strValueOf2, "1", arrayList, "origin_panel", str));
            return;
        }
        LayoutSettingContract layoutSettingContract2 = this.LJ;
        C948360amo c948360amoLJIIIZ2 = layoutSettingContract2.LJIIIZ();
        if (c948360amoLJIIIZ2 != null) {
            numValueOf = Integer.valueOf(c948360amoLJIIIZ2.LLLIIIIL());
        } else {
            numValueOf = null;
        }
        int i3 = c948400ams.LIZIZ;
        Context context = this.LJFF.getContext();
        RecyclerView recyclerView = this.LJ.layoutChooseV3Rv;
        if (recyclerView != null) {
            lifecycleOwner = ViewTreeLifecycleOwner.get(recyclerView);
        }
        layoutSettingContract2.Fz(numValueOf, i3, context, lifecycleOwner, new AwS73S0301000_15(this, this.LJ, i, c948400ams, 1), new AwS42S0301000_15(this.LJ, (LayoutSettingContract) this, (C930230aJZ) i, (int) this.LJI, (List<C948400ams>) 2), new AwS416S0200000_15(this.LJ, this, 66));
    }

    @Override // X.InterfaceC948410amt
    public final void LIZJ(View view, C948400ams c948400ams) {
        int iLLLIIIIL;
        LayoutSettingContract layoutSettingContract = this.LJ;
        C948360amo c948360amoLJIIIZ = layoutSettingContract.LJIIIZ();
        if (c948360amoLJIIIZ != null) {
            iLLLIIIIL = c948360amoLJIIIZ.LLLIIIIL();
        } else {
            iLLLIIIIL = 0;
        }
        layoutSettingContract.LJJJJI(iLLLIIIIL, view);
    }

    public C930230aJZ(LayoutSettingContract layoutSettingContract, View view, List<C948400ams> list) {
        this.LJ = layoutSettingContract;
        this.LJFF = view;
        this.LJI = list;
    }
}
