package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesHistoryMainPageAssem;
import com.ss.android.ugc.aweme.series.feed.mylist.assme.opt.SeriesYourListsMainPageAssem;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssem;
import kotlin.jvm.internal.AwS36S0001000_24;

/* JADX INFO: renamed from: X.0sHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620670sHB extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C1620670sHB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C1620670sHB c1620670sHB, int i) {
        C1578940rBs c1578940rBs = ((SeriesHistoryMainPageAssem) c1620670sHB.l0).LLJI;
        if (c1578940rBs != null) {
            C1578940rBs.LIZ(c1578940rBs, i);
        }
        AssemViewModel assemViewModel = (AssemViewModel) ((SeriesHistoryMainPageAssem) c1620670sHB.l0).LLIZLLLIL.getValue();
        if (C296920BkQ.LIZ()) {
            assemViewModel.setState(new AwS36S0001000_24(i, 7));
        } else {
            assemViewModel.setState(new AwS36S0001000_24(i, 3));
        }
    }

    public static final void onPageSelected$1(C1620670sHB c1620670sHB, int i) {
        C1846060y8i c1846060y8i = ((SeriesYourListsMainPageAssem) c1620670sHB.l0).LLJI;
        if (c1846060y8i != null) {
            C1845940y8W c1845940y8WLJII = c1846060y8i.LJII(i);
            C1085640eME c1085640eME = C1846060y8i.LLJL;
            c1846060y8i.LJIILL(c1845940y8WLJII, true);
        }
        AssemViewModel value = ((SeriesYourListsMainPageAssem) c1620670sHB.l0).LLIZLLLIL.getValue();
        if (C296920BkQ.LIZ()) {
            value.setState(new AwS36S0001000_24(i, 7));
        } else {
            value.setState(new AwS36S0001000_24(i, 3));
        }
    }

    public static final void onPageSelected$2(C1620670sHB c1620670sHB, int i) {
        int itemCount;
        String str;
        boolean z;
        String str2;
        C1578940rBs c1578940rBs;
        RecyclerView recyclerView;
        AbstractC21673619ry adapter;
        C1578940rBs c1578940rBs2 = ((SeriesCenterMainPageAssem) c1620670sHB.l0).LLJIJIL;
        if (c1578940rBs2 != null && (recyclerView = c1578940rBs2.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        C1578940rBs c1578940rBs3 = ((SeriesCenterMainPageAssem) c1620670sHB.l0).LLJIJIL;
        if (c1578940rBs3 != null && c1578940rBs3.getVisibility() == 0 && i >= 0 && i < itemCount && (c1578940rBs = ((SeriesCenterMainPageAssem) c1620670sHB.l0).LLJIJIL) != null) {
            C1578940rBs.LIZ(c1578940rBs, i);
        }
        SeriesCenterMainPageAssem seriesCenterMainPageAssem = (SeriesCenterMainPageAssem) c1620670sHB.l0;
        if (seriesCenterMainPageAssem.LLJJI) {
            seriesCenterMainPageAssem.LLJJI = false;
            return;
        }
        C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
        C1561130qj9 c1561130qj9Go = seriesCenterMainPageAssem.Go();
        if (c1561130qj9Go != null) {
            str = c1561130qj9Go.LLILZ;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        SeriesCenterCenterScene seriesCenterCenterScene = (SeriesCenterCenterScene) C13LP.LJJJLZIJ(i, ((SeriesCenterMainPageAssem) c1620670sHB.l0).Ho().getState().LLIZ);
        if (seriesCenterCenterScene != null && (str2 = seriesCenterCenterScene.metricName) != null) {
            str3 = str2;
        }
        C1561130qj9 c1561130qj9Go2 = ((SeriesCenterMainPageAssem) c1620670sHB.l0).Go();
        if (c1561130qj9Go2 != null && c1561130qj9Go2.LLIZ) {
            z = true;
        } else {
            z = false;
        }
        C1611660s2e.LJJIJLIJ(i, "series_center", str, str3, null, z);
    }
}
