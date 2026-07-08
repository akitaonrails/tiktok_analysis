package X;

import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.IECSearchFilterAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingFragment;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.mob.SearchNimbleImageMob;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0R3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689750R3t extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        if (1 - this.$t != 0) {
            super.onPageScrollStateChanged(i);
        } else {
            onPageScrollStateChanged$0(this, i);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (1 - this.$t != 0) {
            super.onPageScrolled(i, f, i2);
        } else {
            onPageScrolled$0(this, i, f, i2);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C689750R3t(SearchImageLandingFragment searchImageLandingFragment, int i) {
        this.$t = i;
        this.l1 = searchImageLandingFragment;
    }

    public static final void onPageScrollStateChanged$0(C689750R3t c689750R3t, int i) {
        if (i == 0) {
            ((EcSearchResultContainerAssem) c689750R3t.l0).yp(false);
        }
    }

    public static final void onPageSelected$0(C689750R3t c689750R3t, int i) {
        Integer numValueOf;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        ImageData imageData;
        Integer num = (Integer) c689750R3t.l0;
        if (num != null) {
            SearchImageLandingFragment searchImageLandingFragment = (SearchImageLandingFragment) c689750R3t.l1;
            int iIntValue = num.intValue();
            searchImageLandingFragment.ZR().LIZJ(i, iIntValue);
            searchImageLandingFragment.ZR().LIZLLL(iIntValue);
            ImageData imageData2 = (ImageData) C0QC3.LIZ(i, searchImageLandingFragment.WR());
            if (imageData2 != null) {
                Iterator it2 = ((ArrayList) searchImageLandingFragment.LLJILJILJ).iterator();
                while (it2.hasNext()) {
                    ((C0Q0G) it2.next()).LIZ(imageData2);
                }
            }
        }
        c689750R3t.l0 = Integer.valueOf(i);
        boolean z = SearchImageLandingFragment.LLJJI;
        if (z && Intrinsics.LJFF(((SearchImageLandingFragment) c689750R3t.l1).UR().getInflowDetailPageOpt(), Boolean.TRUE) && (imageData = (ImageData) C0QC3.LIZ(i, ((SearchImageLandingFragment) c689750R3t.l1).WR())) != null) {
            SearchNimbleImageMob searchNimbleImageMobZR = ((SearchImageLandingFragment) c689750R3t.l1).ZR();
            searchNimbleImageMobZR.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(searchNimbleImageMobZR.LL);
            c2344009Gk.LJII(searchNimbleImageMobZR.LIZ(imageData));
            C20684815ws.LJIILLIIL("search_result_show", c2344009Gk.LIZ);
        }
        ((SearchImageLandingFragment) c689750R3t.l1).bS(i + 1);
        C21646019nW c21646019nW = ((SearchImageLandingFragment) c689750R3t.l1).LLJI;
        if (c21646019nW != null) {
            c21646019nW.setSelectedIndex(i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected position = ");
        sbLIZ.append(i);
        sbLIZ.append(" currentIndex = ");
        sbLIZ.append(((SearchImageLandingFragment) c689750R3t.l1).LJLJJL());
        sbLIZ.append(" getState.size = ");
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((SearchImageLandingFragment) c689750R3t.l1).LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            numValueOf = Integer.valueOf(state.LJIIIIZZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" imagesize = ");
        sbLIZ.append(((SearchImageLandingFragment) c689750R3t.l1).WR().size());
        C2188811AlT.LIZIZ(sbLIZ);
        if (z && i >= ((SearchImageLandingFragment) c689750R3t.l1).WR().size() - 2) {
            ((SearchImageLandingFragment) c689750R3t.l1).LLJILJIL.LIZJ();
        }
    }

    public static final void onPageSelected$1(C689750R3t c689750R3t, int i) {
        EnumC669620QOi enumC669620QOiLIZIZ;
        Integer numValueOf;
        int i2;
        boolean z;
        C676920Qgs c676920QgsLIZ;
        int i3;
        SearchContainerHeaderVM searchContainerHeaderVM;
        EnumC669620QOi enumC669620QOiLIZIZ2;
        ((EcSearchResultContainerAssem) c689750R3t.l0).up().LLILZ.setValue(Integer.valueOf(i));
        EcSearchResultContainerAssem ecSearchResultContainerAssem = (EcSearchResultContainerAssem) c689750R3t.l0;
        for (InterfaceC677130QhD interfaceC677130QhD : (ArrayList) ecSearchResultContainerAssem.LLLFZ) {
            C669790QOz c669790QOz = ecSearchResultContainerAssem.LLJLILLLLZIIL;
            if (c669790QOz != null) {
                c669790QOz.LIZIZ(i);
            }
            interfaceC677130QhD.LIZ();
        }
        boolean z2 = true;
        String tabName = null;
        if (((EcSearchResultContainerAssem) c689750R3t.l0).GX()) {
            C669790QOz c669790QOz2 = ((EcSearchResultContainerAssem) c689750R3t.l0).LLJLILLLLZIIL;
            if (c669790QOz2 != null) {
                enumC669620QOiLIZIZ2 = c669790QOz2.LIZIZ(i);
            } else {
                enumC669620QOiLIZIZ2 = null;
            }
            if (enumC669620QOiLIZIZ2 != ((EcSearchResultContainerAssem) c689750R3t.l0).yC0()) {
                AssemVMLazy assemVMLazy = ((EcSearchResultContainerAssem) c689750R3t.l0).LLJZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EcSearchResultContainerAssem.LLLII;
                assemVMLazy.getValue().setState(new AwS589S0100000_10(AFwS241S0000000_10.get$arr$(590), (Function1<? super h, Unit>) 387));
            }
        }
        IECSearchFilterAbility iECSearchFilterAbility = (IECSearchFilterAbility) C1558520qew.LIZ(C1558520qew.LJIIL((EcSearchResultContainerAssem) c689750R3t.l0), IECSearchFilterAbility.class, null);
        if (iECSearchFilterAbility != null) {
            iECSearchFilterAbility.H41();
        }
        if (C0QV7.LIZ()) {
            C669790QOz c669790QOz3 = ((EcSearchResultContainerAssem) c689750R3t.l0).LLJLILLLLZIIL;
            if (c669790QOz3 != null) {
                numValueOf = Integer.valueOf(c669790QOz3.LIZ(EnumC669620QOi.SHOP));
            } else {
                numValueOf = null;
            }
            SearchContainerHeaderVM searchContainerHeaderVM2 = (SearchContainerHeaderVM) ((EcSearchResultContainerAssem) c689750R3t.l0).LLLFFI.getValue();
            if (searchContainerHeaderVM2 != null) {
                i2 = searchContainerHeaderVM2.LL;
            } else {
                i2 = 0;
            }
            if (numValueOf != null && i == numValueOf.intValue()) {
                z = true;
                c676920QgsLIZ = C673140Qam.LIZ((SearchResultParam) c689750R3t.l1, ((EcSearchResultContainerAssem) c689750R3t.l0).LLLI, "OuterContainer", "PageSelected");
            } else {
                z = false;
                c676920QgsLIZ = null;
            }
            boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ec_shop_search_top_tab_layout_state_fix", true, true);
            if (zLJIIIZ) {
                if (!z || c676920QgsLIZ == null || !c676920QgsLIZ.LIZ) {
                    z2 = false;
                    i3 = i2;
                }
                i3 = 0;
            } else {
                z2 = z;
                if (z) {
                    i3 = 0;
                } else {
                    i3 = i2;
                }
            }
            FrameLayout frameLayoutMp = ((EcSearchResultContainerAssem) c689750R3t.l0).mp();
            if (frameLayoutMp != null) {
                frameLayoutMp.setPadding(0, i3, 0, 0);
            }
            new C676880Qgo(z2, i3, i2, i, (EcSearchResultContainerAssem) c689750R3t.l0, numValueOf, c676920QgsLIZ, zLJIIIZ, (SearchResultParam) c689750R3t.l1);
            C1931907hV.LIZ();
            int i4 = ((EcSearchResultContainerAssem) c689750R3t.l0).LLJLL;
            if (numValueOf != null && i4 == numValueOf.intValue() && i != numValueOf.intValue() && (searchContainerHeaderVM = (SearchContainerHeaderVM) ((EcSearchResultContainerAssem) c689750R3t.l0).LLLFFI.getValue()) != null) {
                searchContainerHeaderVM.resetState();
            }
        }
        if (i != ((EcSearchResultContainerAssem) c689750R3t.l0).LLJLL) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", System.currentTimeMillis() - ((EcSearchResultContainerAssem) c689750R3t.l0).LLJL);
                jSONObject.put("enter_method", "switch_tab");
                jSONObject.put("next_tab", C669740QOu.LIZLLL(i));
                jSONObject.put("search_entrance", ((SearchResultParam) c689750R3t.l1).getSearchEnterParam().getEnterSearchFrom());
                jSONObject.put("search_id", ((ISearchService) ServiceManager.get().getService(ISearchService.class)).getLatestSearchId());
                jSONObject.put("search_keyword", ((SearchResultParam) c689750R3t.l1).getKeyword());
                C669790QOz c669790QOz4 = ((EcSearchResultContainerAssem) c689750R3t.l0).up().LLILLJJLI;
                if (c669790QOz4 != null && (enumC669620QOiLIZIZ = c669790QOz4.LIZIZ(((EcSearchResultContainerAssem) c689750R3t.l0).LLJLL)) != null) {
                    tabName = enumC669620QOiLIZIZ.getTabName();
                }
                jSONObject.put("current_tab", tabName);
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZLLL("rd_ec_search_switch_tab_finish", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((EcSearchResultContainerAssem) c689750R3t.l0).LLJL = System.currentTimeMillis();
        ((EcSearchResultContainerAssem) c689750R3t.l0).LLJLL = i;
    }

    public C689750R3t(EcSearchResultContainerAssem ecSearchResultContainerAssem, SearchResultParam searchResultParam, int i) {
        this.$t = i;
        this.l0 = ecSearchResultContainerAssem;
        this.l1 = searchResultParam;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageScrolled$0(X.C689750R3t r6, int r7, float r8, int r9) {
        /*
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem) r0
            X.0QOz r0 = r0.LLJLILLLLZIIL
            r5 = 1
            if (r0 == 0) goto L6a
            java.util.List<X.0QOi> r0 = r0.LIZ
            if (r0 == 0) goto L6a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r1 >= r5) goto L16
            r1 = 1
        L16:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L63
            r2 = r7
        L1d:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem r0 = (com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem) r0
            com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchContainerVM r0 = r0.up()
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<java.lang.Integer> r1 = r0.LLILZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.setValue(r0)
            java.lang.Object r4 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem r4 = (com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem) r4
            r4.getClass()
            boolean r0 = X.C0QV7.LIZ()
            r3 = 0
            if (r0 == 0) goto L5d
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "ec_shop_search_tab_swipe_padding_fix"
            boolean r0 = r2.LJIIIZ(r1, r0, r5, r5)
            if (r0 == 0) goto L5d
            X.0QOz r1 = r4.LLJLILLLLZIIL
            if (r1 == 0) goto L61
            X.0QOi r0 = X.EnumC669620QOi.SHOP
            int r1 = r1.LIZ(r0)
            if (r9 == 0) goto L5d
            if (r7 == r1) goto L5c
            int r0 = r7 + 1
            if (r0 != r1) goto L61
        L5c:
            r3 = r5
        L5d:
            r4.yp(r3)
            return
        L61:
            r5 = 0
            goto L5c
        L63:
            int r2 = r7 + 1
            int r1 = r1 - r5
            if (r2 <= r1) goto L1d
            r2 = r1
            goto L1d
        L6a:
            r1 = 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C689750R3t.onPageScrolled$0(X.0R3t, int, float, int):void");
    }
}
