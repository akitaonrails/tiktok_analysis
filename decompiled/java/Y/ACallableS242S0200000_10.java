package Y;

import X.AbstractC1255880imo;
import X.AbstractC2126608Uu;
import X.C0BRN;
import X.C0PM7;
import X.C0Q3E;
import X.C0QTU;
import X.C0QTX;
import X.C1388190mED;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1603960rqE;
import X.C19724912Fj;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2082308Dt;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2344009Gk;
import X.C644510PPt;
import X.C645920PVe;
import X.C645930PVf;
import X.C645940PVg;
import X.C650410PfD;
import X.C650460PfI;
import X.C653400Pk2;
import X.C653660PkS;
import X.C654760PmE;
import X.C662440Pyc;
import X.C662670Pyz;
import X.C663230Pzt;
import X.C663260Pzw;
import X.C683670Qrl;
import X.C683680Qrm;
import X.C686150Qvl;
import X.InterfaceC1210900hcG;
import X.InterfaceC670870QTd;
import X.ViewOnClickListenerC662370PyV;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.ecom.data.ShopIcon;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ACallableS242S0200000_10 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:345:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x08af A[PHI: r12
      0x08af: PHI (r12v16 java.lang.String) = (r12v15 java.lang.String), (r12v21 java.lang.String) binds: [B:397:0x08ab, B:329:0x078c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08b4 A[PHI: r3 r12
      0x08b4: PHI (r3v15 java.lang.String) = (r3v14 java.lang.String), (r3v23 java.lang.String), (r3v23 java.lang.String) binds: [B:400:0x08b0, B:332:0x0798, B:334:0x07a2] A[DONT_GENERATE, DONT_INLINE]
      0x08b4: PHI (r12v17 java.lang.String) = (r12v16 java.lang.String), (r12v20 java.lang.String), (r12v20 java.lang.String) binds: [B:400:0x08b0, B:332:0x0798, B:334:0x07a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0ff8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ$1() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS242S0200000_10.LIZIZ$1():void");
    }

    public static String LIZ$0(Intent intent) {
        try {
            return intent.getStringExtra("school_innerfeed_entrance_group_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object call$0(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        Boolean boolValueOf;
        Activity activityLIZ;
        C1C7U.LIZ("OpenFeedsFlowMethod@2da2.handle$2$3");
        C1603960rqE.LIZ = ((OpenFeedsFlowMethod) aCallableS242S0200000_10.l0).possibleModel();
        Context context = ((OpenFeedsFlowMethod) aCallableS242S0200000_10.l0).getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            boolValueOf = Boolean.valueOf(C19724912Fj.LIZLLL().LJI(activityLIZ, ((C686150Qvl) aCallableS242S0200000_10.l1).LIZJ()));
        } else {
            boolValueOf = null;
        }
        C1C7U.LIZIZ("OpenFeedsFlowMethod@2da2.handle$2$3");
        return boolValueOf;
    }

    public static final Object call$1(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        AbstractC1255880imo abstractC1255880imo;
        C1C7U.LIZ("OpenFeedsFlowMethod@1180.handle$2$3");
        Activity activity = (Activity) ((com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod) aCallableS242S0200000_10.l0).getActContext();
        Activity activityLIZ = null;
        if (activity != null) {
            abstractC1255880imo = (AbstractC1255880imo) activity.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.cjt);
        } else {
            abstractC1255880imo = null;
        }
        C1603960rqE.LIZ = abstractC1255880imo;
        C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
        Context context = ((com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod) aCallableS242S0200000_10.l0).mContextRef.get();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        }
        Boolean boolValueOf = Boolean.valueOf(c19724912FjLIZLLL.LJI(activityLIZ, ((C686150Qvl) aCallableS242S0200000_10.l1).LIZJ()));
        C1C7U.LIZIZ("OpenFeedsFlowMethod@1180.handle$2$3");
        return boolValueOf;
    }

    public static final /* bridge */ /* synthetic */ Object call$10(ACallableS242S0200000_10 aCallableS242S0200000_10) throws Throwable {
        C1C7U.LIZ("SearchFragment@f345.sendSearchEvent$1");
        aCallableS242S0200000_10.LIZIZ$1();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchFragment@f345.sendSearchEvent$1");
        return unit;
    }

    public static final Object call$11(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        int awemeType;
        String aid;
        String str;
        DetailLynxCardStruct lynxCardStruct;
        DynamicPatch dynamicPatch;
        C1C7U.LIZ("DetailLynxCardMobUtils@9ceb.mobCardContainerInit$1");
        Aweme aweme = (Aweme) aCallableS242S0200000_10.l0;
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(awemeType, "card_type");
        Aweme aweme2 = (Aweme) aCallableS242S0200000_10.l0;
        String str2 = "";
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        String eventType = ((C2189821An6) aCallableS242S0200000_10.l1).getEventType();
        if (eventType == null) {
            eventType = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        String enterMethodValue = ((C2189821An6) aCallableS242S0200000_10.l1).getEnterMethodValue();
        if (enterMethodValue != null) {
            str2 = enterMethodValue;
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        Aweme aweme3 = (Aweme) aCallableS242S0200000_10.l0;
        if (aweme3 == null || (lynxCardStruct = aweme3.getLynxCardStruct()) == null || (dynamicPatch = lynxCardStruct.dynamicPatch) == null || (str = dynamicPatch.schema) == null) {
            str = "no schema";
        }
        c2344009Gk.LJIIIIZZ("schema", str);
        C20684815ws.LJIILLIIL("rd_feed_detail_lynx_card_container_init", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DetailLynxCardMobUtils@9ceb.mobCardContainerInit$1");
        return unit;
    }

    public static final Object call$12(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        int awemeType;
        String aid;
        String str;
        DetailLynxCardStruct lynxCardStruct;
        DynamicPatch dynamicPatch;
        C1C7U.LIZ("DetailLynxCardMobUtils@9ceb.mobCardContainerLoadResult$1");
        Aweme aweme = (Aweme) aCallableS242S0200000_10.l0;
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(awemeType, "card_type");
        Aweme aweme2 = (Aweme) aCallableS242S0200000_10.l0;
        String str2 = "";
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        String eventType = ((C2189821An6) aCallableS242S0200000_10.l1).getEventType();
        if (eventType == null) {
            eventType = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        String enterMethodValue = ((C2189821An6) aCallableS242S0200000_10.l1).getEnterMethodValue();
        if (enterMethodValue != null) {
            str2 = enterMethodValue;
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        Aweme aweme3 = (Aweme) aCallableS242S0200000_10.l0;
        if (aweme3 == null || (lynxCardStruct = aweme3.getLynxCardStruct()) == null || (dynamicPatch = lynxCardStruct.dynamicPatch) == null || (str = dynamicPatch.schema) == null) {
            str = "no schema";
        }
        c2344009Gk.LJIIIIZZ("schema", str);
        C20684815ws.LJIILLIIL("rd_feed_detail_lynx_card_load_result", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DetailLynxCardMobUtils@9ceb.mobCardContainerLoadResult$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e A[PHI: r5
      0x016e: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:70:0x016a, B:20:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS242S0200000_10 r20) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS242S0200000_10.call$2(Y.ACallableS242S0200000_10):java.lang.Object");
    }

    public static final Object call$3(ACallableS242S0200000_10 aCallableS242S0200000_10) throws Exception {
        String str;
        String str2;
        Object obj;
        Object obj2;
        C1C7U.LIZ("BatchDetailListModel@b960.sendRequest$1");
        Object[] objArr = (Object[]) aCallableS242S0200000_10.l0;
        String strLIZIZ = "";
        if (objArr.length <= 1 || (obj2 = objArr[1]) == null) {
            str = "";
        } else {
            str = (String) obj2;
        }
        if (objArr.length <= 2 || (obj = objArr[2]) == null) {
            str2 = "";
        } else {
            str2 = (String) obj;
        }
        C683670Qrl c683670Qrl = (C683670Qrl) aCallableS242S0200000_10.l1;
        int i = c683670Qrl.LLILLJJLI;
        int iMin = Math.min(C683680Qrm.LIZ + i, ((ArrayList) c683670Qrl.LLILLL).size() - 1);
        if (i <= iMin) {
            while (true) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append((String) ListProtector.get(((C683670Qrl) aCallableS242S0200000_10.l1).LLILLL, i));
                sbLIZ.append(',');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        if (strLIZIZ.length() > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ ");
            sbLIZ2.append(strLIZIZ.substring(0, strLIZIZ.length() - 1));
            sbLIZ2.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        BatchDetailList batchDetailListLIZJ = DetailApi.LIZJ(0, strLIZIZ, 0, str, str2, 0, null);
        C1C7U.LIZIZ("BatchDetailListModel@b960.sendRequest$1");
        return batchDetailListLIZJ;
    }

    public static final Object call$4(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        C1C7U.LIZ("EcSearchSugOptimizedOperatorImpl@f637.submitOptimizedRequest$1");
        try {
            try {
                ((C0QTU) aCallableS242S0200000_10.l0).LLZLLIL((C0QTX) aCallableS242S0200000_10.l1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!(e instanceof CancellationException)) {
                    ((C0QTX) aCallableS242S0200000_10.l1).LJ.LJ = Long.valueOf(System.currentTimeMillis());
                    InterfaceC670870QTd interfaceC670870QTd = ((C0QTU) aCallableS242S0200000_10.l0).LLILZ;
                    C0QTX c0qtx = (C0QTX) aCallableS242S0200000_10.l1;
                    interfaceC670870QTd.LIZJ(c0qtx.LIZLLL, c0qtx.LJ);
                }
            }
            ((C0QTU) aCallableS242S0200000_10.l0).LLJILJIL.decrementAndGet();
            ((C0QTU) aCallableS242S0200000_10.l0).C0();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcSearchSugOptimizedOperatorImpl@f637.submitOptimizedRequest$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C0QTU) aCallableS242S0200000_10.l0).LLJILJIL.decrementAndGet();
            ((C0QTU) aCallableS242S0200000_10.l0).C0();
            throw th;
        }
    }

    public static final Object call$5(ACallableS242S0200000_10 aCallableS242S0200000_10) throws InterruptedException {
        C1C7U.LIZ("LiveLoadMoreImpl@a288.onTryLoadMore$1");
        SearchApi searchApi = SearchApi.LIZ;
        C644510PPt c644510PPt = (C644510PPt) aCallableS242S0200000_10.l0;
        String str = c644510PPt.LIZ;
        long j = c644510PPt.LJII;
        String str2 = c644510PPt.LIZIZ;
        String str3 = c644510PPt.LIZJ;
        String str4 = c644510PPt.LIZLLL;
        Integer num = (Integer) aCallableS242S0200000_10.l1;
        searchApi.getClass();
        try {
            SearchApi.RealApi realApiLIZ = SearchApi.LIZ();
            Long lValueOf = Long.valueOf(((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL);
            C662670Pyz.LIZ.getClass();
            SearchLiveList searchLiveList = realApiLIZ.searchLiveList(j, str, 20, "load_more_general_list", str3, str4, "", str2, "", "", "", num, null, lValueOf, C662670Pyz.LIZ(), null, C2097608Jq.LJ()).get();
            ((C644510PPt) aCallableS242S0200000_10.l0).LJII = searchLiveList.cursor;
            List<SearchLiveStruct> listLJI = searchLiveList.LJI();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
            Iterator it2 = ((ArrayList) listLJI).iterator();
            while (it2.hasNext()) {
                arrayList.add(((SearchLiveStruct) it2.next()).getLiveAweme());
            }
            Pair pair = new Pair(searchLiveList, arrayList);
            C1C7U.LIZIZ("LiveLoadMoreImpl@a288.onTryLoadMore$1");
            return pair;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static final Object call$6(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        C1C7U.LIZ("EcSearchSugAssemVM@477d.init$1$1$onSuccess$1");
        EcSearchSugAssemVM ecSearchSugAssemVM = (EcSearchSugAssemVM) aCallableS242S0200000_10.l0;
        EcSearchSugResponse ecSearchSugResponse = (EcSearchSugResponse) aCallableS242S0200000_10.l1;
        List listWQ2 = ecSearchSugAssemVM.wQ2(ecSearchSugResponse.requestId, ecSearchSugResponse);
        C1C7U.LIZIZ("EcSearchSugAssemVM@477d.init$1$1$onSuccess$1");
        return listWQ2;
    }

    public static final Object call$7(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        C1C7U.LIZ("EcSearchSugAssemVM@477d.initOpt$1$1$onSuccess$1");
        EcSearchSugAssemVM ecSearchSugAssemVM = (EcSearchSugAssemVM) aCallableS242S0200000_10.l0;
        EcSearchSugResponse ecSearchSugResponse = (EcSearchSugResponse) aCallableS242S0200000_10.l1;
        List listWQ2 = ecSearchSugAssemVM.wQ2(ecSearchSugResponse.requestId, ecSearchSugResponse);
        C1C7U.LIZIZ("EcSearchSugAssemVM@477d.initOpt$1$1$onSuccess$1");
        return listWQ2;
    }

    public static final Object call$8(ACallableS242S0200000_10 aCallableS242S0200000_10) throws JSONException {
        String strE6;
        boolean zLJFF;
        String str;
        String uniqueId;
        Integer numValueOf;
        String uid;
        int i;
        String str2;
        String string;
        String str3;
        ProductGroup productGroup;
        ShopIcon shopIcon;
        Integer num;
        Aweme aweme;
        int iIntValue;
        Integer numValueOf2;
        String aid;
        List<Aweme> list;
        Aweme aweme2;
        List<Aweme> list2;
        ProductGroup productGroup2;
        ShopIcon shopIcon2;
        Integer num2;
        ProductGroup productGroup3;
        ProductGroup productGroup4;
        Integer num3;
        User user;
        ProductGroup productGroup5;
        List<Product> list3;
        User user2;
        String searchUserDesc;
        User user3;
        User user4;
        ProductGroup productGroup6;
        User user5;
        User user6;
        C1C7U.LIZ("SearchUserViewHolder@dde6.mobAladinCardShow$1");
        SearchUser searchUser = ((ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0).LLJLIL;
        String str4 = "";
        if (searchUser == null || (user6 = searchUser.user) == null) {
            strE6 = "";
        } else {
            strE6 = ViewOnClickListenerC662370PyV.e6(user6, ((ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0).LLLII);
        }
        C653660PkS c653660PkSL3 = ((ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0).l3();
        String uid2 = c653660PkSL3.LJIL;
        if (TextUtils.isEmpty(uid2) && ((user5 = ((ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0).LLLFZ) == null || (uid2 = user5.getUid()) == null)) {
            uid2 = "";
        }
        SearchUser searchUser2 = ((ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0).LLJLIL;
        if (searchUser2 != null && (productGroup6 = searchUser2.productGroup) != null) {
            zLJFF = Intrinsics.LJFF(productGroup6.showEntrance, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF) {
            str = "";
        } else {
            str = "showcase_entrance";
        }
        C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c653660PkSL3);
        ViewOnClickListenerC662370PyV viewOnClickListenerC662370PyV = (ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0;
        Integer num4 = (Integer) aCallableS242S0200000_10.l1;
        c654760PmELIZIZ.LJIJI("user_tag", strE6);
        c654760PmELIZIZ.LJIIZILJ("user_list", uid2);
        String strC6 = viewOnClickListenerC662370PyV.c6();
        SearchUser searchUser3 = viewOnClickListenerC662370PyV.LLJLIL;
        if (searchUser3 != null && (user4 = searchUser3.user) != null) {
            uniqueId = user4.getUniqueId();
        } else {
            uniqueId = null;
        }
        c654760PmELIZIZ.LJIIZILJ("user_name", uniqueId);
        SearchUser searchUser4 = viewOnClickListenerC662370PyV.LLJLIL;
        if (searchUser4 != null && (user3 = searchUser4.user) != null) {
            numValueOf = Integer.valueOf(C662440Pyc.LIZ(user3));
        } else {
            numValueOf = null;
        }
        c654760PmELIZIZ.LJIIZILJ("relation_tag", String.valueOf(numValueOf));
        SearchUser searchUser5 = viewOnClickListenerC662370PyV.LLJLIL;
        if (searchUser5 != null && !searchUser5.isAladdin() && c653660PkSL3.LIZ) {
            c654760PmELIZIZ.LJIIZILJ("item_rank", String.valueOf(viewOnClickListenerC662370PyV.getAdapterPosition()));
        }
        if (c653660PkSL3.LJJLIIIJJIZ != null) {
            c654760PmELIZIZ.LJIIZILJ("list_result_type", "user");
            c654760PmELIZIZ.LJJIJL(Integer.valueOf(viewOnClickListenerC662370PyV.getAdapterPosition()));
            User user7 = viewOnClickListenerC662370PyV.LLJL;
            if (user7 == null || (searchUserDesc = user7.getSearchUserDesc()) == null) {
                searchUserDesc = "";
            }
            c654760PmELIZIZ.LJ("aladdin_words", searchUserDesc);
        }
        if (num4 != null) {
            c654760PmELIZIZ.LJIIZILJ("list_result_type", "video");
            c654760PmELIZIZ.LJJIJL(num4);
        }
        SearchUser searchUser6 = viewOnClickListenerC662370PyV.LLJLIL;
        if (searchUser6 == null || !searchUser6.isAladdin()) {
            uid = "";
        } else {
            SearchUser searchUser7 = viewOnClickListenerC662370PyV.LLJLIL;
            if (searchUser7 == null || (user2 = searchUser7.user) == null || (uid = user2.getUid()) == null) {
                uid = "";
            }
            c654760PmELIZIZ.LJJIZ(uid);
        }
        c654760PmELIZIZ.LJJIJIL(strC6);
        SearchUser searchUser8 = viewOnClickListenerC662370PyV.LLJLIL;
        if (searchUser8 != null && (productGroup5 = searchUser8.productGroup) != null && (list3 = productGroup5.productList) != null && (!list3.isEmpty())) {
            i = 1;
        } else {
            i = 0;
        }
        c654760PmELIZIZ.LJJIJLIJ(Integer.valueOf(i));
        c654760PmELIZIZ.LJIIZILJ("is_aladdin", viewOnClickListenerC662370PyV.a6());
        c654760PmELIZIZ.LJJIJIIJI(viewOnClickListenerC662370PyV.b6());
        SearchUser searchUser9 = viewOnClickListenerC662370PyV.LLJLIL;
        if (searchUser9 != null && (user = searchUser9.user) != null && user.isLive()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c654760PmELIZIZ.LJIIZILJ("is_live", str2);
        c654760PmELIZIZ.LJIIZILJ("product_window_type", str);
        c654760PmELIZIZ.LJIIZILJ("ecom_user_type", viewOnClickListenerC662370PyV.W5());
        String str5 = viewOnClickListenerC662370PyV.LLJZ;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c654760PmELIZIZ.LJFF("section_type", str5, c2082308Dt);
        SearchUser searchUser10 = viewOnClickListenerC662370PyV.LLLI;
        if (searchUser10 == null || (productGroup4 = searchUser10.productGroup) == null || (num3 = productGroup4.productVolume) == null || (string = num3.toString()) == null) {
            string = "";
        }
        c654760PmELIZIZ.LJFF("product_volume", string, c2082308Dt);
        SearchUser searchUser11 = viewOnClickListenerC662370PyV.LLLI;
        if (searchUser11 != null && (productGroup3 = searchUser11.productGroup) != null && productGroup3.soldCount != null) {
            str3 = "sold";
        } else {
            str3 = "products";
        }
        c654760PmELIZIZ.LJFF("volume_type", str3, c2082308Dt);
        SearchUser searchUser12 = viewOnClickListenerC662370PyV.LLLI;
        if (searchUser12 != null && (productGroup2 = searchUser12.productGroup) != null && (shopIcon2 = productGroup2.shopIcon) != null && (num2 = shopIcon2.iconType) != null && num2.intValue() == 8) {
            str4 = "top_choice";
        } else {
            SearchUser searchUser13 = viewOnClickListenerC662370PyV.LLLI;
            if (searchUser13 != null && (productGroup = searchUser13.productGroup) != null && (shopIcon = productGroup.shopIcon) != null && (num = shopIcon.iconType) != null && num.intValue() == 10) {
                str4 = "mall";
            }
        }
        c654760PmELIZIZ.LJ("usercard_tag_type", str4);
        SearchUser searchUser14 = viewOnClickListenerC662370PyV.LLLI;
        if (searchUser14 != null && (list2 = searchUser14.awemeCards) != null) {
            aweme = (Aweme) C13LP.LJJJLL(list2);
        } else {
            aweme = null;
        }
        C653400Pk2.LIZIZ(aweme, c654760PmELIZIZ);
        if (C0BRN.LIZ()) {
            C645920PVe.LIZIZ(c654760PmELIZIZ, viewOnClickListenerC662370PyV.itemView, viewOnClickListenerC662370PyV.b6(), uid);
        }
        C645930PVf.LIZ(c654760PmELIZIZ);
        if (num4 != null) {
            SearchUser searchUser15 = viewOnClickListenerC662370PyV.LLJLIL;
            if (searchUser15 != null && (list = searchUser15.awemeCards) != null && (aweme2 = (Aweme) ListProtector.get(list, num4.intValue())) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            c654760PmELIZIZ.LJJIZ(aid);
        }
        c654760PmELIZIZ.LJJIJIIJIL(c653660PkSL3.LIZLLL);
        c654760PmELIZIZ.LJ("module", c653660PkSL3.LJJJJLL);
        if (C650410PfD.LIZ()) {
            SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewOnClickListenerC662370PyV.itemView, null), SearchServiceCenter$AdapterControlAbility.class, null);
            if (searchServiceCenter$AdapterControlAbility != null && (numValueOf2 = Integer.valueOf(searchServiceCenter$AdapterControlAbility.XR1(viewOnClickListenerC662370PyV.LLLLII))) != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                iIntValue = -1;
            }
            c654760PmELIZIZ.LIZLLL(iIntValue, "actual_rank");
        }
        c654760PmELIZIZ.LJIILJJIL();
        if (str.equals("showcase_entrance") && !((ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0).LLLF) {
            ((ViewOnClickListenerC662370PyV) aCallableS242S0200000_10.l0).LLLF = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entrance_form", "search_usercard_showcase_entrance");
            C20684815ws.LJIJ("rd_ec_product_entrance_will_show", jSONObject);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchUserViewHolder@dde6.mobAladinCardShow$1");
        return unit;
    }

    public static final Object call$9(ACallableS242S0200000_10 aCallableS242S0200000_10) {
        C1C7U.LIZ("SearchMixOperationViewHolder@214c.mobShow$1");
        C650460PfI<C663260Pzw> c650460PfI = new C650460PfI<C663260Pzw>() { // from class: X.0Pzw
        };
        c650460PfI.LJIIZILJ("log_pb", ((C663230Pzt) aCallableS242S0200000_10.l0).l3().LJIIJJI);
        c650460PfI.LJIIZILJ("card_id", ((SearchOperation) aCallableS242S0200000_10.l1).cardId);
        c650460PfI.LJIJJ(((C663230Pzt) aCallableS242S0200000_10.l0).l3().LJIIIIZZ);
        c650460PfI.LJIIZILJ("search_keyword", ((C663230Pzt) aCallableS242S0200000_10.l0).l3().LJFF);
        c650460PfI.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMixOperationViewHolder@214c.mobShow$1");
        return unit;
    }

    public ACallableS242S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ACallableS242S0200000_10(EcSearchSugAssemVM ecSearchSugAssemVM, C19EG c19eg, EcSearchSugResponse ecSearchSugResponse, int i) {
        this.$t = i;
        this.l0 = ecSearchSugAssemVM;
        this.l1 = ecSearchSugResponse;
    }
}
