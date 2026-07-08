package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS100S0201000_15;
import kotlin.jvm.internal.AwS123S0101000_15;
import kotlin.jvm.internal.AwS139S0201000_15;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0adX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942610adX implements InterfaceC948410amt {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public final /* synthetic */ LayoutMarketFragment LJ;

    @Override // X.InterfaceC948410amt
    public final void LIZ(int i, int i2) {
    }

    public C942610adX(LayoutMarketFragment layoutMarketFragment) {
        this.LJ = layoutMarketFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC948410amt
    public final void LIZIZ(int i, C948400ams c948400ams) {
        ?? arrayList;
        Integer numValueOf = null;
        if (C942240acw.LIZ(this.LJ.LLLFFI)) {
            LayoutMarketFragment layoutMarketFragment = this.LJ;
            layoutMarketFragment.getClass();
            String strLJIL = C940770aaZ.LIZ().getDataSource().LJIL();
            String strLIZ = C940770aaZ.LIZ().getDataSource().LIZ();
            String strValueOf = String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType());
            String strValueOf2 = String.valueOf(c948400ams.LIZIZ);
            List<C948400ams> listUS = layoutMarketFragment.uS();
            if (listUS != null) {
                arrayList = new ArrayList();
                Iterator<C948400ams> it2 = listUS.iterator();
                while (it2.hasNext()) {
                    String strValueOf3 = String.valueOf(it2.next().LIZIZ);
                    if (strValueOf3 != null) {
                        arrayList.add(strValueOf3);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            String str = layoutMarketFragment.LLLFFI;
            if (str == null) {
                str = "unknown";
            }
            C931740aM0.LJIIJJI(new C931750aM1("click", strLJIL, strLIZ, strValueOf, "", "", strValueOf2, "1", arrayList, "show_all_panel", str));
            LayoutMarketFragment.LayoutItemClickHandler layoutItemClickHandler = layoutMarketFragment.LLL;
            if (layoutItemClickHandler != null) {
                C948360amo c948360amo = layoutMarketFragment.LLJZIJLIL;
                if (c948360amo != null) {
                    numValueOf = Integer.valueOf(c948360amo.LLLIIIIL());
                }
                layoutItemClickHandler.Fz(numValueOf, c948400ams.LIZIZ, layoutMarketFragment.getContext(), layoutMarketFragment.getViewLifecycleOwner(), AFwS203S0000000_15.get$arr$(302), new AwS123S0101000_15(layoutMarketFragment, i, 5), AFwS203S0000000_15.get$arr$(303));
                return;
            }
            return;
        }
        LayoutMarketFragment layoutMarketFragment2 = this.LJ;
        LayoutMarketFragment.LayoutItemClickHandler layoutItemClickHandler2 = layoutMarketFragment2.LLL;
        if (layoutItemClickHandler2 != null) {
            C948360amo c948360amo2 = layoutMarketFragment2.LLJZIJLIL;
            if (c948360amo2 != null) {
                numValueOf = Integer.valueOf(c948360amo2.LLLIIIIL());
            }
            layoutItemClickHandler2.Fz(numValueOf, c948400ams.LIZIZ, this.LJ.getContext(), this.LJ.getViewLifecycleOwner(), new AwS139S0201000_15(i, this, this.LJ, 0), new AwS100S0201000_15(i, this, this.LJ, 1), new AwS416S0200000_15(this.LJ, this, 20));
        }
    }

    @Override // X.InterfaceC948410amt
    public final void LIZJ(View view, C948400ams c948400ams) {
        LayoutMarketFragment.LayoutItemClickHandler layoutItemClickHandler = this.LJ.LLL;
        if (layoutItemClickHandler != null) {
            layoutItemClickHandler.Mf(c948400ams.LIZIZ, view);
        }
    }
}
