package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageContentAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208680hYg extends AbstractC712240Rwk {
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

    public static final void onPageScrollStateChanged$0(C1208680hYg c1208680hYg, int i) {
        Integer numValueOf;
        List<InterfaceC1891350zJl> listLIZ = ((ViewOnAttachStateChangeListenerC20631115oD) c1208680hYg.l0).getViewItemOperator().LIZ();
        if (listLIZ != null) {
            numValueOf = Integer.valueOf(listLIZ.size());
        } else {
            numValueOf = null;
        }
        int iLIZJ = C1175120ggY.LIZJ(numValueOf);
        if (iLIZJ > 1) {
            C1197190hG9 c1197190hG9 = (C1197190hG9) c1208680hYg.l1;
            if (c1197190hG9.LLIZ == iLIZJ - 1 && c1197190hG9.LLILZIL) {
                c1197190hG9.LLILZLL = true;
                return;
            }
        }
        ((C1197190hG9) c1208680hYg.l1).LLILZLL = false;
    }

    public static final void onPageSelected$0(C1208680hYg c1208680hYg, int i) {
        C1157090gDT c1157090gDT;
        PoiDetailApi.PoiTopVideosLoadMoreResponse poiTopVideosLoadMoreResponse;
        List<PoiDetailApi.PoiMultiMediumTab> tabList;
        PoiDetailApi.PoiMultiMediumTab next;
        String tabCode;
        C1187300h0C c1187300h0CBQ2;
        PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab;
        String tabCode2;
        String str;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, ((ViewOnAttachStateChangeListenerC20631115oD) c1208680hYg.l0).getViewItemOperator().getState().LJII());
        if (objLJJJLZIJ instanceof C1157090gDT) {
            c1157090gDT = (C1157090gDT) objLJJJLZIJ;
        } else {
            c1157090gDT = null;
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelGo = ((PoiAlbumMixPageContentAssem) c1208680hYg.l1).Go();
        if (poiHeaderTopVideosSharedViewModelGo != null && (poiTopVideosLoadMoreResponse = poiHeaderTopVideosSharedViewModelGo.LLIZLLLIL) != null && (tabList = poiTopVideosLoadMoreResponse.getTabList()) != null) {
            Iterator<PoiDetailApi.PoiMultiMediumTab> it2 = tabList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab2 = next;
                    if (poiMultiMediumTab2 != null) {
                        tabCode2 = poiMultiMediumTab2.getTabCode();
                    } else {
                        tabCode2 = null;
                    }
                    if (c1157090gDT != null) {
                        str = c1157090gDT.LL;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(tabCode2, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab3 = next;
            if (poiMultiMediumTab3 != null) {
                PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelGo2 = ((PoiAlbumMixPageContentAssem) c1208680hYg.l1).Go();
                if (poiHeaderTopVideosSharedViewModelGo2 != null && (c1187300h0CBQ2 = poiHeaderTopVideosSharedViewModelGo2.BQ2()) != null && (poiMultiMediumTab = c1187300h0CBQ2.LLILLJJLI) != null) {
                    tabCode = poiMultiMediumTab.getTabCode();
                } else {
                    tabCode = null;
                }
                if (!Intrinsics.LJFF(tabCode, poiMultiMediumTab3.getTabCode())) {
                    PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelGo3 = ((PoiAlbumMixPageContentAssem) c1208680hYg.l1).Go();
                    if (poiHeaderTopVideosSharedViewModelGo3 != null) {
                        poiHeaderTopVideosSharedViewModelGo3.setStateImmediate(new AwS597S0100000_18(poiMultiMediumTab3, 862));
                    }
                    PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelGo4 = ((PoiAlbumMixPageContentAssem) c1208680hYg.l1).Go();
                    if (poiHeaderTopVideosSharedViewModelGo4 != null) {
                        poiHeaderTopVideosSharedViewModelGo4.DQ2(PageFinder.via(C724240Sb0.LJI((PoiAlbumMixPageContentAssem) c1208680hYg.l1)), C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20631115oD) c1208680hYg.l0, null), "scroll");
                    }
                }
            }
        }
    }

    public static final void onPageSelected$1(C1208680hYg c1208680hYg, int i) {
        ((C1197190hG9) c1208680hYg.l1).LLIZ = i;
    }

    public C1208680hYg(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
