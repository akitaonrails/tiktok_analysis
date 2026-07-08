package X;

import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.general.GeneralSearchLynxImagePreloadModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08XH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService$preloadProductImageForFirstScreen$1", f = "AbsSearchService.kt", l = {}, m = "invokeSuspend")
public final class C08XH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchMixFeedList LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08XH(SearchMixFeedList searchMixFeedList, InterfaceC1364105Vn<? super C08XH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchMixFeedList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08XH c08xh = new C08XH(this.LLILLJJLI, interfaceC1364105Vn);
        c08xh.LL = obj;
        return c08xh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SearchMixFeed next;
        DynamicPatch dynamicPatch;
        C1C7U.LIZ("AbsSearchService@8881.preloadProductImageForFirstScreen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            List<SearchMixFeed> list = this.LLILLJJLI.mItems;
            if (list != null) {
                Iterator<SearchMixFeed> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        SearchMixFeed searchMixFeed = next;
                        C01GW c01gw = C08XI.LIZJ;
                        if (((Boolean) c01gw.getValue()).booleanValue()) {
                            DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
                            GeneralSearchLynxImagePreloadModel generalSearchLynxImagePreloadModel = (GeneralSearchLynxImagePreloadModel) C08XI.LIZIZ.getValue();
                            if (dynamicPatch2 != null && ((Boolean) c01gw.getValue()).booleanValue()) {
                                List<Integer> list2 = generalSearchLynxImagePreloadModel.originTypeList;
                                if (list2 != null && list2.contains(Integer.valueOf(dynamicPatch2.getOriginType()))) {
                                    break;
                                }
                                if (generalSearchLynxImagePreloadModel.channelList == null) {
                                    continue;
                                } else {
                                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(dynamicPatch2.schema), "channel");
                                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                                    }
                                    if (generalSearchLynxImagePreloadModel.channelList.contains(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                        break;
                                    }
                                }
                            }
                        } else if (searchMixFeed != null && (dynamicPatch = searchMixFeed.getDynamicPatch()) != null && dynamicPatch.getOriginType() == 9) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SearchMixFeed searchMixFeed2 = next;
                if (searchMixFeed2 != null) {
                    HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C1741890vQh.LJIIIIZZ(searchMixFeed2));
                    C2286608xc.LJ(Log.d("ppbz_preload_image", "data_has_product"));
                    if (mapLJIIJ != null && (!mapLJIIJ.isEmpty())) {
                        EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("/data_product/self_define");
                        sbLIZ.append(EnumC1993307rP.GENERAL_SEARCH_STREAM.getPath());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        ecomResourceBystander.getClass();
                        EcomResourceBystander.LJIILLIIL(mapLJIIJ, strLIZIZ, null, null, null);
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsSearchService@8881.preloadProductImageForFirstScreen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
