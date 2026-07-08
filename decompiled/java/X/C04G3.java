package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS39S0100100_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.04G3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.recommend.PdpRecommendMgr$preloadRecommendData$1$1", f = "PdpRecommendMgr.kt", l = {617}, m = "invokeSuspend")
public final class C04G3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1748810vbr LLILLL;
    public final /* synthetic */ C04HR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04G3(InterfaceC1748810vbr interfaceC1748810vbr, C04HR c04hr, InterfaceC1364105Vn<? super C04G3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1748810vbr;
        this.LLILZ = c04hr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04G3(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        List<Integer> list;
        long jElapsedRealtime;
        String string;
        List<BrickInfo> list2;
        BrickInfo next;
        Object objLIZLLL = obj;
        C1C7U.LIZ("PdpRecommendMgr@a78b.preloadRecommendData$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LL;
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZLLL);
            LaneParams laneParamsLIZIZ = C1748730vbj.LIZIZ(this.LLILLL, "lib_track_builtin_lane_business");
            Object obj2 = laneParamsLIZIZ.get((Object) "first_source_page");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            Object obj3 = laneParamsLIZIZ.get((Object) "enter_from_info");
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            Object obj4 = laneParamsLIZIZ.get((Object) "author_id");
            if (obj4 instanceof String) {
                str3 = (String) obj4;
            } else {
                str3 = null;
            }
            Object obj5 = laneParamsLIZIZ.get((Object) "traffic_source");
            if (obj5 instanceof Integer) {
                num = (Integer) obj5;
            } else {
                num = null;
            }
            Object obj6 = laneParamsLIZIZ.get((Object) "traffic_source_list");
            if (obj6 instanceof List) {
                list = (List) obj6;
            } else {
                list = null;
            }
            jElapsedRealtime = SystemClock.elapsedRealtime();
            C1758570vrb c1758570vrb = PdpApi.LIZ;
            String productId = this.LLILZ.LIZ.getProductId();
            Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("is_add_cart", C2286608xc.LJ(this.LLILZ.LIZ.LLLJL ? 1 : 0)));
            Integer numAR2 = this.LLILZ.LIZ.AR2();
            if (numAR2 != null) {
                string = numAR2.toString();
            } else {
                string = null;
            }
            this.LL = jElapsedRealtime;
            this.LLILLJJLI = 1;
            objLIZLLL = c1758570vrb.LIZLLL(productId, str, str2, str3, num, list, mapLIZJ, string, this);
            if (objLIZLLL == objLJFF) {
                C1C7U.LIZIZ("PdpRecommendMgr@a78b.preloadRecommendData$1$1");
                return objLJFF;
            }
        }
        PdpRecommendPreloadResponse pdpRecommendPreloadResponse = (PdpRecommendPreloadResponse) objLIZLLL;
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pdpRecommendPreloadResponse);
        C1748720vbi.LIZIZ(this.LLILLL, new C04CK() { // from class: X.04G8
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("duration", new C1747940vaS[0]), new C1748840vbu("is_success", new C1747940vaS[0]), new C1748840vbu("err_msg", new C1747940vaS(new C1748000vaY("is_success", CardStruct.IStatusCode.DEFAULT))));
            }
        }, new AwS39S0100100_1(jElapsedRealtime, pdpRecommendPreloadResponse, 9));
        ProductPackStruct productPackStruct = this.LLILZ.LIZ.LLJILLL;
        if (productPackStruct != null && (list2 = productPackStruct.bricks) != null) {
            Iterator<BrickInfo> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.brickName == EnumC1752690vi7.RECOMMENDATION.getValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BrickInfo brickInfo = next;
            if (brickInfo != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list2.subList(0, list2.indexOf(brickInfo)));
                arrayList.add(new BrickInfo(strLJIIIIZZ, brickInfo.brickBizExtra, brickInfo.brickLynxSchema, brickInfo.brickName, brickInfo.brickOption, brickInfo.brickType, brickInfo.brickVersion, brickInfo.brickStyle));
                this.LLILZ.LIZ.AS2(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 509));
                PdpViewModel pdpViewModel = this.LLILZ.LIZ;
                C1054004Ag c1054004Ag = pdpViewModel.LLJLILLLLZIIL;
                if (c1054004Ag != null) {
                    c1054004Ag.LJJJJJ(pdpViewModel.LLJILLL);
                }
            }
        }
        C04HR c04hr = this.LLILZ;
        c04hr.LIZ.setState(new AwS580S0100000_1(c04hr, 510));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpRecommendMgr@a78b.preloadRecommendData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
