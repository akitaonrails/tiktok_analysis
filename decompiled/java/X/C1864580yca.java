package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingFirstTabPageFragment;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabData;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabsResponse;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateMultiTabAssem;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864580yca extends AbstractC712240Rwk {
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
            case 3:
                onPageSelected$3(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C1864580yca(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C1864580yca c1864580yca, int i) {
        Integer numValueOf;
        C1785470wYz c1785470wYz;
        C1785510wZ3 c1785510wZ3 = ((CreatorRankingFirstTabPageFragment) c1864580yca.l0).LLJILJILJ;
        if (c1785510wZ3 != null && (c1785470wYz = c1785510wZ3.LIZ) != null) {
            numValueOf = Integer.valueOf(c1785470wYz.LIZIZ);
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSubPagerPageSelected firstRankType=");
        sbLIZ.append(((CreatorRankingFirstTabPageFragment) c1864580yca.l0).PR());
        sbLIZ.append(" position=");
        sbLIZ.append(i);
        sbLIZ.append(" current=");
        sbLIZ.append(numValueOf);
        sbLIZ.append(" programmatic=");
        sbLIZ.append(((CreatorRankingFirstTabPageFragment) c1864580yca.l0).LLILZ);
        C20441214yg.LIZIZ("CreatorRankingFirstTabPageFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!((CreatorRankingFirstTabPageFragment) c1864580yca.l0).LLILZ && numValueOf != null && i != numValueOf.intValue()) {
            ((CreatorRankingPageViewModel) ((CreatorRankingFirstTabPageFragment) c1864580yca.l0).LLILLJJLI.getValue()).onEvent(new C991810but(i));
        }
    }

    public static final void onPageSelected$1(C1864580yca c1864580yca, int i) {
        int i2 = ((C1785460wYy) ((CreatorRankingPageDialogFragment) c1864580yca.l0).MR().LLILLJJLI.getValue()).LIZIZ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstPagerPageSelected position=");
        sbLIZ.append(i);
        sbLIZ.append(" current=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (i != i2) {
            ((CreatorRankingPageDialogFragment) c1864580yca.l0).MR().onEvent(new C991820buu(i, false));
        }
    }

    public static final void onPageSelected$2(C1864580yca c1864580yca, int i) {
        C1808830xAf c1808830xAfLLLFZ;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C1835840xsE c1835840xsE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected position = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("BaseAutoPostLivingListFragment", C2188811AlT.LIZIZ(sbLIZ));
        BaseAutoPostLivingListFragment baseAutoPostLivingListFragment = (BaseAutoPostLivingListFragment) c1864580yca.l0;
        baseAutoPostLivingListFragment.LLJ = i;
        AutoPostLivingViewModel autoPostLivingViewModelPR = baseAutoPostLivingListFragment.PR();
        C1808480xA6 c1808480xA6 = ((BaseAutoPostLivingListFragment) c1864580yca.l0).LLIZ;
        C1808830xAf c1808830xAfLLLFZ2 = null;
        if (c1808480xA6 != null) {
            c1808830xAfLLLFZ = c1808480xA6.LLLFZ(i);
        } else {
            c1808830xAfLLLFZ = null;
        }
        autoPostLivingViewModelPR.vQ2(new C1777270wLl(c1808830xAfLLLFZ));
        BaseAutoPostLivingListFragment baseAutoPostLivingListFragment2 = (BaseAutoPostLivingListFragment) c1864580yca.l0;
        C1835760xs6 c1835760xs6 = baseAutoPostLivingListFragment2.LL;
        RecyclerView recyclerView = baseAutoPostLivingListFragment2.LLILZ;
        if (recyclerView != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if (viewHolderFindViewHolderForAdapterPosition instanceof C1835840xsE) {
            c1835840xsE = (C1835840xsE) viewHolderFindViewHolderForAdapterPosition;
        } else {
            c1835840xsE = null;
        }
        C1808480xA6 c1808480xA62 = ((BaseAutoPostLivingListFragment) c1864580yca.l0).LLIZ;
        if (c1808480xA62 != null) {
            c1808830xAfLLLFZ2 = c1808480xA62.LLLFZ(i);
        }
        c1835760xs6.LIZLLL(c1835840xsE, c1808830xAfLLLFZ2);
    }

    public static final void onPageSelected$3(C1864580yca c1864580yca, int i) {
        String str;
        String str2;
        String str3;
        String strLIZJ;
        List<TemplateTabData> list;
        TemplateTabData templateTabData;
        List<TemplateTabData> list2;
        TemplateTabData templateTabData2;
        List<TemplateTabData> list3;
        TemplateTabData templateTabData3;
        C1203130hPj c1203130hPj = ((TakoImageCreateMultiTabAssem) c1864580yca.l0).LLJJI;
        if (c1203130hPj != null) {
            c1203130hPj.LIZ(i, true, C1203200hPq.LIZ);
        }
        TakoImageCreateMultiTabAssem takoImageCreateMultiTabAssem = (TakoImageCreateMultiTabAssem) c1864580yca.l0;
        int i2 = takoImageCreateMultiTabAssem.LLJJIJIL;
        if (i2 != -1 && i2 != i) {
            TemplateTabsResponse templateTabsResponse = takoImageCreateMultiTabAssem.LLJJJIL;
            if (templateTabsResponse == null || (list3 = templateTabsResponse.tabs) == null || (templateTabData3 = (TemplateTabData) C13LP.LJJJLZIJ(i, list3)) == null || (str = templateTabData3.tabId) == null) {
                str = "";
            }
            TemplateTabsResponse templateTabsResponse2 = ((TakoImageCreateMultiTabAssem) c1864580yca.l0).LLJJJIL;
            String str4 = null;
            if (templateTabsResponse2 != null && (list2 = templateTabsResponse2.tabs) != null && (templateTabData2 = (TemplateTabData) C13LP.LJJJLZIJ(i, list2)) != null) {
                str2 = templateTabData2.tabEnName;
            } else {
                str2 = null;
            }
            TemplateTabsResponse templateTabsResponse3 = ((TakoImageCreateMultiTabAssem) c1864580yca.l0).LLJJJIL;
            if (templateTabsResponse3 != null && (list = templateTabsResponse3.tabs) != null && (templateTabData = (TemplateTabData) C13LP.LJJJLZIJ(i, list)) != null) {
                str3 = templateTabData.tabName;
            } else {
                str3 = null;
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            C1852270yIj.LIZ.getClass();
            String str5 = C1852270yIj.LIZJ.get("enter_from");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = C1852270yIj.LIZJ.get("enter_method");
            if (str6 == null) {
                str6 = "";
            }
            String str7 = C1852270yIj.LIZJ.get("process_id");
            if (str7 == null) {
                str7 = "";
            }
            String str8 = C1852270yIj.LIZJ.get("tako_session_id");
            if (str8 == null) {
                str8 = "";
            }
            String str9 = C1852270yIj.LIZJ.get("tako_chat_id");
            if (str9 == null) {
                str9 = "";
            }
            C1852650yJL c1852650yJL = C1852270yIj.LIZLLL;
            if (c1852650yJL != null) {
                strLIZJ = C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL.LIZ));
            } else {
                strLIZJ = null;
            }
            C1852650yJL c1852650yJL2 = C1852270yIj.LIZLLL;
            if (c1852650yJL2 != null) {
                str4 = c1852650yJL2.LJI;
            }
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("tab_id", str);
            if (str2 == null) {
                str2 = str3;
            }
            pairArr[1] = new Pair("template_tab", str2);
            C1862330yYx.LJJ(c1862330yYx, str5, str6, str7, str8, str9, "create_image_template", "slide", null, null, strLIZJ, str4, null, null, null, C2097608Jq.LJIIJ(pairArr), 47488);
        }
        ((TakoImageCreateMultiTabAssem) c1864580yca.l0).LLJJIJIL = i;
    }
}
