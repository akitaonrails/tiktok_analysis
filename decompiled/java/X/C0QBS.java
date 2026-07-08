package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.LiveInnerFlowAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0QBS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.detail.shoptab.jsb.EcSearchLoadMoreLiveRooms$handle$1", f = "EcSearchLoadMoreLiveRooms.kt", l = {69}, m = "invokeSuspend")
public final class C0QBS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C0QBR LLILZIL;
    public final /* synthetic */ CompletionBlock<InterfaceC1476705qH> LLILZLL;
    public final /* synthetic */ IEcomSearchService LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QBS(Map<String, ? extends Object> map, Integer num, View view, C0QBR c0qbr, CompletionBlock<InterfaceC1476705qH> completionBlock, IEcomSearchService iEcomSearchService, InterfaceC1364105Vn<? super C0QBS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = num;
        this.LLILZ = view;
        this.LLILZIL = c0qbr;
        this.LLILZLL = completionBlock;
        this.LLIZ = iEcomSearchService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QBS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        long jIntValue;
        String str2;
        String str3;
        Integer num;
        int iIntValue;
        String str4;
        Integer num2;
        int iIntValue2;
        String str5;
        Integer num3;
        int iIntValue3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Integer num4;
        int iIntValue4;
        int i;
        Long l;
        Integer num5;
        String str14;
        String paramByName;
        String paramByName2;
        String str15;
        Integer num6;
        int iIntValue5;
        Integer num7;
        int iIntValue6;
        String strLJLIL;
        View view;
        C1C7U.LIZ("EcSearchLoadMoreLiveRooms@65c1.handle$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI.get("keyword");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            Integer num8 = this.LLILLL;
            if (num8 != null) {
                jIntValue = num8.intValue();
            } else {
                jIntValue = 6;
            }
            Object obj3 = this.LLILLJJLI.get("search_channel");
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            Object obj4 = this.LLILLJJLI.get("source");
            if (obj4 instanceof String) {
                str3 = (String) obj4;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            Object obj5 = this.LLILLJJLI.get("count");
            if (obj5 instanceof Integer) {
                num = (Integer) obj5;
            } else {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 6;
            }
            Object obj6 = this.LLILLJJLI.get("search_id");
            if (obj6 instanceof String) {
                str4 = (String) obj6;
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            Object obj7 = this.LLILLJJLI.get("query_correct_type");
            if (obj7 instanceof Integer) {
                num2 = (Integer) obj7;
            } else {
                num2 = null;
            }
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            Object obj8 = this.LLILLJJLI.get("enter_from");
            if (obj8 instanceof String) {
                str5 = (String) obj8;
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str5 = "";
            }
            Object obj9 = this.LLILLJJLI.get("hot_search");
            if (obj9 instanceof Integer) {
                num3 = (Integer) obj9;
            } else {
                num3 = null;
            }
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            } else {
                iIntValue3 = 0;
            }
            Object obj10 = this.LLILLJJLI.get("search_source");
            if (obj10 instanceof String) {
                str6 = (String) obj10;
            } else {
                str6 = null;
            }
            if (str6 == null) {
                str6 = "";
            }
            Object obj11 = this.LLILLJJLI.get("last_search_id");
            if (obj11 instanceof String) {
                str7 = (String) obj11;
            } else {
                str7 = null;
            }
            Object obj12 = this.LLILLJJLI.get("sug_tag_text");
            if (obj12 instanceof String) {
                str8 = (String) obj12;
            } else {
                str8 = null;
            }
            Object obj13 = this.LLILLJJLI.get("sug_type");
            if (obj13 instanceof String) {
                str9 = (String) obj13;
            } else {
                str9 = null;
            }
            Object obj14 = this.LLILLJJLI.get("sug_query_state");
            if (obj14 instanceof String) {
                str10 = (String) obj14;
            } else {
                str10 = null;
            }
            Object obj15 = this.LLILLJJLI.get("attach_products");
            if (obj15 instanceof String) {
                str11 = (String) obj15;
            } else {
                str11 = null;
            }
            Object obj16 = this.LLILLJJLI.get("traffic_source_list");
            if (obj16 instanceof String) {
                str12 = (String) obj16;
            } else {
                str12 = null;
            }
            Object obj17 = this.LLILLJJLI.get("sug_creator_id");
            if (obj17 instanceof String) {
                str13 = (String) obj17;
            } else {
                str13 = null;
            }
            Object obj18 = this.LLILLJJLI.get("is_filter_search");
            if (obj18 instanceof Integer) {
                num4 = (Integer) obj18;
            } else {
                num4 = null;
            }
            if (num4 != null) {
                iIntValue4 = num4.intValue();
            } else {
                iIntValue4 = 0;
            }
            C0QES c0qes = C0QES.LIZ;
            Object obj19 = this.LLILLJJLI.get("end_to_end_search_session_id");
            if (obj19 instanceof Long) {
                l = (Long) obj19;
                i = 6;
            } else {
                i = 6;
                l = null;
            }
            Long lLIZ = C0QES.LIZ(c0qes, l, false, i);
            Object obj20 = this.LLILLJJLI.get("is_non_personalized_search");
            if (obj20 instanceof Integer) {
                num5 = (Integer) obj20;
            } else {
                num5 = null;
            }
            Object obj21 = this.LLILLJJLI.get("enter_from_second");
            if (obj21 instanceof String) {
                str14 = (String) obj21;
            } else {
                str14 = null;
            }
            String containerID = null;
            C674800QdS c674800QdS = new C674800QdS(str, str6, str3, iIntValue3, iIntValue2, str4, str7, jIntValue, iIntValue, str5, str2, str8, str9, str10, str13, str11, null, str12, null, null, iIntValue4, null, null, null, null, lLIZ, null, num5, null, null, null, null, null, str14, null);
            Map<String, Object> map = this.LLILLJJLI;
            IEcomSearchService iEcomSearchService = this.LLIZ;
            C0QBR c0qbr = this.LLILZIL;
            Object obj22 = map.get("ec_search_session_id");
            if (obj22 instanceof String) {
                paramByName = (String) obj22;
            } else {
                paramByName = null;
            }
            if (paramByName == null && (paramByName = iEcomSearchService.getParamByName("ec_search_session_id")) == null) {
                paramByName = "";
            }
            c674800QdS.setEcSearchSessionId(paramByName);
            Object obj23 = map.get("search_session_id");
            if (obj23 instanceof String) {
                paramByName2 = (String) obj23;
            } else {
                paramByName2 = null;
            }
            if (paramByName2 == null && (paramByName2 = iEcomSearchService.getParamByName("search_session_id")) == null) {
                paramByName2 = "";
            }
            c674800QdS.setSearchSessionId(paramByName2);
            Object obj24 = map.get("search_context");
            if (obj24 instanceof String) {
                str15 = (String) obj24;
            } else {
                str15 = null;
            }
            if (str15 == null) {
                str15 = "";
            }
            c674800QdS.setSearchContext(str15);
            C0PSG c0psg = new C0PSG();
            Object obj25 = map.get("sort_type");
            if (obj25 instanceof Integer) {
                num6 = (Integer) obj25;
            } else {
                num6 = null;
            }
            if (num6 != null) {
                iIntValue5 = num6.intValue();
            } else {
                iIntValue5 = 0;
            }
            c0psg.setSortType(iIntValue5);
            Object obj26 = map.get("filter_by");
            if (obj26 instanceof Integer) {
                num7 = (Integer) obj26;
            } else {
                num7 = null;
            }
            if (num7 != null) {
                iIntValue6 = num7.intValue();
            } else {
                iIntValue6 = 0;
            }
            c0psg.setFilterBy(iIntValue6);
            Object objLJ = map.get("is_filter_search");
            if (objLJ == null) {
                objLJ = C2286608xc.LJ(0);
            }
            c0psg.setDefaultOption(Intrinsics.LJFF(objLJ, C2286608xc.LJ(0)));
            c674800QdS.setFilterOption(c0psg);
            IEcomSearchService iEcomSearchService2 = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            if (iEcomSearchService2 != null) {
                InterfaceC634840OvC interfaceC634840OvC = c0qbr.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    view = interfaceC634840OvC.getView();
                } else {
                    view = null;
                }
                strLJLIL = iEcomSearchService2.LJLIL(view, "");
            } else {
                strLJLIL = null;
            }
            c674800QdS.setBcmChain(strLJLIL);
            try {
                LiveInnerFlowAbility liveInnerFlowAbility = (LiveInnerFlowAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.LLILZ, null), LiveInnerFlowAbility.class, null);
                if (liveInnerFlowAbility != null) {
                    InterfaceC634840OvC interfaceC634840OvC2 = this.LLILZIL.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    }
                    CompletionBlock<InterfaceC1476705qH> completionBlock = this.LLILZLL;
                    this.LL = 1;
                    if (liveInnerFlowAbility.TB(containerID, c674800QdS, completionBlock, this) == objLJFF) {
                        C1C7U.LIZIZ("EcSearchLoadMoreLiveRooms@65c1.handle$1");
                        return objLJFF;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchLoadMoreLiveRooms@65c1.handle$1");
        return unit;
    }
}
