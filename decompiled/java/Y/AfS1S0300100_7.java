package Y;

import X.AbstractC516150KMb;
import X.C00CC;
import X.C098200Yq;
import X.C09JN;
import X.C09OK;
import X.C0J7Y;
import X.C0K6D;
import X.C0K6E;
import X.C0K77;
import X.C0K7R;
import X.C0KCK;
import X.C0KFM;
import X.C0KL2;
import X.C0KLA;
import X.C0KLD;
import X.C0KLH;
import X.C0KLK;
import X.C0KLL;
import X.C0KLM;
import X.C0KLW;
import X.C0KLY;
import X.C0KM8;
import X.C0KMZ;
import X.C0KNS;
import X.C13LP;
import X.C13LQ;
import X.C189200o6;
import X.C1C7U;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C386801es;
import X.C512310K7h;
import X.C512320K7i;
import X.C513470KBt;
import X.C516000KLm;
import X.C516100KLw;
import X.C516160KMc;
import X.C516410KNb;
import X.C516490KNj;
import X.EnumC513480KBu;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.pgc_sub.PGCRecoverContractInAppResponse;
import webcast.api.pgc_sub.PGCTemplateListData;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public class AfS1S0300100_7 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0300100_7 afS1S0300100_7, Object obj) {
        Map<Long, Long> mapLIZ;
        C0J7Y c0j7y = (C0J7Y) afS1S0300100_7.l0;
        C09JN c09jn = (C09JN) afS1S0300100_7.l1;
        long j = afS1S0300100_7.j3;
        List<User> list = (List) afS1S0300100_7.l2;
        LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
        c0j7y.getClass();
        C1C7U.LIZ("LiveStateManager@a4a7.refreshSingleUser$1L");
        if (liveStateResponse != null && c09jn != null && (mapLIZ = liveStateResponse.mapUserIdRoomId.LIZ()) != null) {
            Long l = mapLIZ.get(Long.valueOf(j));
            if (l == null) {
                l = 0L;
            }
            if (l.longValue() != 0) {
                ((HashMap) c0j7y.LIZ).put(Long.valueOf(j), l);
                ((HashMap) c0j7y.LJ).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            }
            c0j7y.LJIIIIZZ.put(Long.valueOf(j), l);
            ((HashMap) c0j7y.LJII).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            c0j7y.LJIIL(list, mapLIZ);
            c09jn.accept(l);
        }
        C1C7U.LIZIZ("LiveStateManager@a4a7.refreshSingleUser$1L");
    }

    public static final void accept$1(AfS1S0300100_7 afS1S0300100_7, Object obj) throws JSONException {
        C0KLW c0klw;
        Unit unit;
        C1C7U.LIZ("SubscribeCreateContractRepo@5d14.createContract$2");
        Throwable th = (Throwable) obj;
        C0K6E c0k6eLIZ = C09OK.LIZ(null, th);
        int iIntValue = ((Number) C512320K7i.LIZ(th).getFirst()).intValue();
        ((Function2) afS1S0300100_7.l0).invoke(Integer.valueOf(iIntValue), th);
        C516160KMc c516160KMcLIZ = AbstractC516150KMb.LIZ(((C516490KNj) afS1S0300100_7.l1).LIZLLL, (C0KFM) afS1S0300100_7.l2, System.currentTimeMillis() - afS1S0300100_7.j3, null, th, C512310K7h.LIZJ(th), 4);
        ((C516490KNj) afS1S0300100_7.l1).LIZLLL.getClass();
        AbstractC516150KMb.LIZIZ(c516160KMcLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("contract/failed failed: ");
        sbLIZ.append(th);
        sbLIZ.append(", logId=");
        String str = c0k6eLIZ.LIZLLL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append("show_entrance=");
        sbLIZ.append(((C0KFM) afS1S0300100_7.l2).LIZIZ);
        sbLIZ.append(" detail_code=");
        sbLIZ.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("contract/failed failed: ");
        sbLIZ2.append(th);
        sbLIZ2.append(", logId=");
        String str3 = c0k6eLIZ.LIZLLL;
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ2.append(str3);
        sbLIZ2.append(",tpl_id=");
        sbLIZ2.append(((C0KFM) afS1S0300100_7.l2).LJIL);
        sbLIZ2.append(" clientParam=");
        sbLIZ2.append(((C0KFM) afS1S0300100_7.l2).LJIILIIL);
        sbLIZ2.append(" show_entrance=");
        sbLIZ2.append(((C0KFM) afS1S0300100_7.l2).LIZIZ);
        C0K6D.LIZJ(th, "SubscribeCreateContractRepo#createContract", C2097908Jt.LIZJ(new Pair("detail", C2188811AlT.LIZIZ(sbLIZ2))));
        C0KNS.LIZIZ("ttlive_create_subscription", 31, iIntValue, th.getMessage(), ((C516490KNj) afS1S0300100_7.l1).LIZIZ.LIZ);
        C516410KNb c516410KNb = C516410KNb.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(th.getClass());
        sbLIZ3.append(" : ");
        sbLIZ3.append(th);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        HashMap<String, Object> map = ((C516490KNj) afS1S0300100_7.l1).LIZIZ.LIZ;
        c516410KNb.getClass();
        try {
            C0K77 c0k77LIZ = C516410KNb.LIZ();
            if (c0k77LIZ != null) {
                c0k77LIZ.LIZIZ(iIntValue, strLIZIZ, map);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        int[] iArr = {4025009};
        Integer num = C09OK.LIZ(null, th).LIZ;
        if ((num == null || C13LQ.LJJIJ(num.intValue(), iArr) < 0) && (c0klw = ((C0KFM) afS1S0300100_7.l2).LJJII) != null) {
            String message = th.getMessage();
            if (message != null) {
                str2 = message;
            }
            c0klw.onFail(iIntValue, str2);
        }
        C1C7U.LIZIZ("SubscribeCreateContractRepo@5d14.createContract$2");
    }

    public static final void accept$2(AfS1S0300100_7 afS1S0300100_7, Object obj) throws JSONException {
        C1C7U.LIZ("SubscribeCreateContractRepo@5d14.preCreateContract$2");
        Throwable th = (Throwable) obj;
        ((Function2) afS1S0300100_7.l0).invoke(Integer.valueOf(((Number) C512320K7i.LIZ(th).getFirst()).intValue()), th);
        C516160KMc c516160KMcLIZ = AbstractC516150KMb.LIZ(((C516490KNj) afS1S0300100_7.l1).LIZLLL, (C0KFM) afS1S0300100_7.l2, System.currentTimeMillis() - afS1S0300100_7.j3, null, th, C512310K7h.LIZJ(th), 4);
        ((C516490KNj) afS1S0300100_7.l1).LIZLLL.getClass();
        AbstractC516150KMb.LIZIZ(c516160KMcLIZ);
        C1C7U.LIZIZ("SubscribeCreateContractRepo@5d14.preCreateContract$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS1S0300100_7 afS1S0300100_7, Object obj) {
        C00CC c00cc;
        List listLIZ;
        C1C7U.LIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplate$2");
        DataResponse dataResponse = (DataResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS1S0300100_7.j3;
        if (dataResponse == null) {
            c00cc = new C00CC(0, null, null);
        } else {
            c00cc = new C00CC(dataResponse.status_code, dataResponse.data, dataResponse.getLogId());
        }
        PGCTemplateListData pGCTemplateListData = (PGCTemplateListData) c00cc.LIZ;
        if (pGCTemplateListData != null) {
            C0KCK c0kck = (C0KCK) afS1S0300100_7.l0;
            c0kck.LIZ = pGCTemplateListData;
            c0kck.LIZIZ = false;
            c0kck.LIZJ = pGCTemplateListData.subScenario;
            c0kck.LIZLLL = pGCTemplateListData.activeContract;
            c0kck.LJ = null;
            c0kck.LJI = Integer.valueOf(pGCTemplateListData.planChangeBlockStatus);
            if (((C0KL2) afS1S0300100_7.l1).LIZ.LJII == EnumC513480KBu.PLAN_CHANGE) {
                listLIZ = C0KLY.LIZ(pGCTemplateListData.planChangeOptions);
            } else {
                listLIZ = C0KLY.LIZ(pGCTemplateListData.templateList);
            }
            C0KLL c0kllLIZIZ = C0KL2.LIZIZ((C0KL2) afS1S0300100_7.l1, jCurrentTimeMillis, listLIZ, null, 4);
            ((C0KL2) afS1S0300100_7.l1).LJ.getClass();
            C0KLK.LIZIZ(c0kllLIZIZ);
            C0KL2 c0kl2 = (C0KL2) afS1S0300100_7.l1;
            c0kl2.getClass();
            if (listLIZ.isEmpty()) {
                C0KCK c0kck2 = c0kl2.LIZIZ;
                if (c0kck2 != null) {
                    c0kck2.LJII = true;
                }
                C0KLH c0klh = c0kl2.LIZJ;
                if (c0klh != null) {
                    C0KLH.LIZ(c0klh, -1, -1001, -1001);
                }
            } else {
                TemplateInfo templateInfo = (TemplateInfo) C13LP.LJJJLZIJ(0, listLIZ);
                if (templateInfo != null && templateInfo.payChannel == 2) {
                    ((C0KL2) afS1S0300100_7.l1).LIZ.LJIIJ.LIZLLL(0L, pGCTemplateListData);
                    C0KLA c0kla = ((C0KL2) afS1S0300100_7.l1).LIZ;
                    String str = c0kla.LIZ;
                    int i = c0kla.LIZJ;
                    EnumC513480KBu enumC513480KBu = c0kla.LJII;
                    Pair<C00CC<PGCTemplateListData>, PGCTemplateListData> pair = new Pair<>(c00cc, pGCTemplateListData);
                    String strLIZLLL = C513470KBt.LIZLLL(i, str);
                    Map<String, C0K7R> map = C513470KBt.LIZIZ;
                    C0K7R c0k7r = (C0K7R) ((LinkedHashMap) map).get(strLIZLLL);
                    if (c0k7r == null) {
                        c0k7r = new C0K7R(null);
                    }
                    c0k7r.LIZ = pair;
                    c0k7r.LIZJ.add(enumC513480KBu);
                    List<EnumC513480KBu> list = C513470KBt.LIZLLL;
                    if (list.contains(enumC513480KBu)) {
                        c0k7r.LIZJ.addAll(list);
                    }
                    map.put(strLIZLLL, c0k7r);
                    ((C0KLM) afS1S0300100_7.l2).LIZ(pGCTemplateListData);
                } else {
                    C0KCK c0kck3 = c0kl2.LIZIZ;
                    if (c0kck3 != null) {
                        c0kck3.LJII = true;
                    }
                    C0KLH c0klh2 = c0kl2.LIZJ;
                    if (c0klh2 != null) {
                        C0KLH.LIZ(c0klh2, -1, -1001, -1002);
                    }
                }
            }
        }
        C1C7U.LIZIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplate$2");
    }

    public static final void accept$4(AfS1S0300100_7 afS1S0300100_7, Object obj) {
        C1C7U.LIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplate$3");
        Throwable th = (Throwable) obj;
        C0K6E c0k6eLIZ = C09OK.LIZ(null, th);
        C0KLL c0kllLIZIZ = C0KL2.LIZIZ((C0KL2) afS1S0300100_7.l0, System.currentTimeMillis() - afS1S0300100_7.j3, null, th, 2);
        ((C0KL2) afS1S0300100_7.l0).LJ.getClass();
        C0KLK.LIZ(c0kllLIZIZ);
        C0KLD c0kld = ((C0KL2) afS1S0300100_7.l0).LIZ.LJIIJ;
        int iLIZIZ = C512310K7h.LIZIZ(th);
        String strLIZ = c0k6eLIZ.LIZ();
        if (strLIZ == null) {
            strLIZ = th.getMessage();
        }
        c0kld.LIZ(iLIZIZ, strLIZ);
        ((C0KCK) afS1S0300100_7.l1).LJII = true;
        C0KLH c0klh = (C0KLH) afS1S0300100_7.l2;
        int iLIZIZ2 = C512310K7h.LIZIZ(th);
        String str = c0k6eLIZ.LIZJ;
        if (str == null) {
            str = "";
        }
        c0klh.LIZ = -2;
        c0klh.LIZIZ = C386801es.DEFAULT;
        c0klh.LIZJ = iLIZIZ2;
        c0klh.LIZLLL = str;
        C1C7U.LIZIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplate$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS1S0300100_7 afS1S0300100_7, Object obj) throws JSONException {
        String strOptString;
        String str;
        C1C7U.LIZ("ResubscribeStrategy@155b.tryRecoverContract$2$1$1");
        DataResponse dataResponse = (DataResponse) obj;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS1S0300100_7.l0;
        C189200o6.m2constructorimpl(dataResponse);
        interfaceC1364105Vn.resumeWith(dataResponse);
        PGCRecoverContractInAppResponse.RecoverContractInAppResult recoverContractInAppResult = (PGCRecoverContractInAppResponse.RecoverContractInAppResult) dataResponse.data;
        try {
            if (recoverContractInAppResult == null || (str = recoverContractInAppResult.inAppRequest) == null) {
                str = "";
            }
            strOptString = new JSONObject(str).optString("order_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (strOptString == null) {
            strOptString = "";
        }
        C516100KLw c516100KLwLIZ = C0KM8.LIZ();
        C516000KLm c516000KLm = C516000KLm.LIZ;
        String str2 = strOptString;
        c516000KLm.LJIIJ(true, str2, "recover_sub", ((C0KMZ) afS1S0300100_7.l2).LIZ, c516100KLwLIZ, null);
        c516000KLm.LJIIJJI(true, str2, System.currentTimeMillis() - afS1S0300100_7.j3, "recover_sub", ((C0KMZ) afS1S0300100_7.l2).LIZ, c516100KLwLIZ, 0, null);
        c516000KLm.LJI(true, str2, "recover_sub", ((C0KMZ) afS1S0300100_7.l2).LIZ, c516100KLwLIZ, null);
        C1C7U.LIZIZ("ResubscribeStrategy@155b.tryRecoverContract$2$1$1");
    }

    public AfS1S0300100_7(long j, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.j3 = j;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
