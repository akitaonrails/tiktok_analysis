package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubEnableMockAutoRenewalSkuQueryFailedSetting;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515710KKj {
    public final C0KH1 LIZ;
    public final C0KKQ LIZIZ;
    public final IapService LIZJ = (IapService) C1161920gLG.LIZJ(IapService.class);

    public static boolean LIZIZ(TemplateInfo templateInfo) {
        int i = templateInfo.tplType;
        if (i == 2 || (i == 1 && templateInfo.basePlanId.length() > 0)) {
            return true;
        }
        return false;
    }

    public C515710KKj(C0KH1 c0kh1, C0KKQ c0kkq) {
        this.LIZ = c0kh1;
        this.LIZIZ = c0kkq;
    }

    public final void LIZ(TemplateListData templateListData, final C0KJX c0kjx) {
        List<TemplateInfo> list;
        TemplateInfo next;
        String str;
        HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> map;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (c0kjx.LJII == EnumC513490KBv.PLAN_CHANGE) {
            list = templateListData.planChangeOptions;
        } else {
            list = templateListData.templateList;
        }
        final HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator<TemplateInfo> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.isDefaultPackage) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateInfo templateInfo = next;
        String str2 = "";
        if (templateInfo == null || (str = templateInfo.packageId) == null) {
            TemplateInfo templateInfo2 = (TemplateInfo) C13LP.LJJJLL(list);
            if (templateInfo2 == null) {
                str = "";
            } else {
                str = templateInfo2.packageId;
            }
        }
        C0KKO c0kko = c0kjx.LJIIJ;
        if (str == null) {
            str = "";
        }
        c0kko.LIZJ(str);
        ArrayList<TemplateInfo> arrayList4 = new ArrayList();
        for (TemplateInfo templateInfo3 : list) {
            if (templateInfo3.shouldDisplay) {
                arrayList4.add(templateInfo3);
            }
        }
        for (TemplateInfo templateInfo4 : arrayList4) {
            str2 = templateInfo4.currency;
            C515780KKq c515780KKq = new C515780KKq(templateInfo4.packageId, templateInfo4.basePlanId);
            if (LIZIZ(templateInfo4)) {
                if (LiveSubEnableMockAutoRenewalSkuQueryFailedSetting.INSTANCE.getValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(templateInfo4.iapId);
                    sbLIZ.append("-mock-error");
                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    arrayList2.add(templateInfo4.iapId);
                }
                List arrayList5 = (List) map3.get(c515780KKq);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(templateInfo4);
                map3.put(c515780KKq, arrayList5);
            } else if (templateInfo4.tplType == 1) {
                arrayList.add(templateInfo4.iapId);
                List arrayList6 = (List) map2.get(c515780KKq);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(templateInfo4);
                map2.put(c515780KKq, arrayList6);
            }
        }
        C20441214yg.LIZIZ("SubscribePaymentV2", map2.keySet().toString());
        C20441214yg.LIZIZ("SubscribePaymentV2", map3.keySet().toString());
        C20441214yg.LIZIZ("SubscribePaymentV2", "oneTimeIapIdList:" + arrayList);
        C20441214yg.LIZIZ("SubscribePaymentV2", "subscribeIapIdList:" + arrayList2);
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            this.LIZ.LJII = true;
            C0KKQ.LIZ(this.LIZIZ, -2, C386801es.DEFAULT, -1004);
        }
        final HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> map4 = new HashMap<>();
        final C515770KKp c515770KKp = new C515770KKp();
        if (arrayList.isEmpty()) {
            List<TemplateInfo> list2 = templateListData.fallbackTemplateList;
            ArrayList arrayList7 = new ArrayList();
            for (TemplateInfo templateInfo5 : list2) {
                if (templateInfo5.shouldDisplay) {
                    arrayList7.add(templateInfo5);
                }
            }
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(((TemplateInfo) it3.next()).iapId);
            }
            arrayList3.addAll(arrayList8);
            List<TemplateInfo> list3 = templateListData.fallbackTemplateList;
            ArrayList arrayList9 = new ArrayList();
            for (TemplateInfo templateInfo6 : list3) {
                if (templateInfo6.shouldDisplay) {
                    arrayList9.add(templateInfo6);
                }
            }
            c515770KKp.LJ = new ArrayList(arrayList9);
        }
        C20441214yg.LIZIZ("SubscriptionProcessHandler", "oneTimeIapIdList:" + arrayList);
        C20441214yg.LIZIZ("SubscriptionProcessHandler", "subscribeIapIdList:" + arrayList2);
        C20441214yg.LIZIZ("SubscriptionProcessHandler", "fallbackIapIdList:" + arrayList3);
        if (arrayList2.isEmpty() && arrayList.isEmpty() && arrayList3.isEmpty()) {
            this.LIZ.LJII = true;
            C0KKQ.LIZ(this.LIZIZ, -2, C386801es.DEFAULT, -1004);
            return;
        }
        if (!arrayList.isEmpty()) {
            IapService iapService = this.LIZJ;
            C1617170sBX c1617170sBX = new C1617170sBX("05816USpPkJiyBnttk", arrayList, "inapp");
            final C0KH1 c0kh1 = this.LIZ;
            final C0KKQ c0kkq = this.LIZIZ;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final List<TemplateInfo> list4 = list;
            final String str3 = str2;
            iapService.LJIIIZ(new C0KM6(str3, map2, map4, c515770KKp, jCurrentTimeMillis, c0kh1, list4, c0kkq) { // from class: X.0KKh
                public final String LIZ;
                public final long LIZIZ = System.currentTimeMillis();
                public final String LIZJ;
                public final /* synthetic */ Map<C515780KKq, List<TemplateInfo>> LJ;
                public final /* synthetic */ HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> LJFF;
                public final /* synthetic */ C515770KKp LJI;
                public final /* synthetic */ C0KH1 LJII;
                public final /* synthetic */ List<TemplateInfo> LJIIIIZZ;
                public final /* synthetic */ C0KKQ LJIIIZ;

                @Override // X.C0KM6
                public final boolean isAutoRenew() {
                    return false;
                }

                @Override // X.C0KM6
                public final long LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.C0KM6
                public final String LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.C0KM6
                public final String LIZJ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1791670wiz
                public final void LIZLLL(C518160KTu c518160KTu) {
                    String str4;
                    C516060KLs.LIZIZ(this, c518160KTu);
                    Map<String, IapProductDetail> map5 = c518160KTu.LJIIJ;
                    if (map5 != null && !map5.isEmpty()) {
                        for (Map.Entry<C515780KKq, List<TemplateInfo>> entry : this.LJ.entrySet()) {
                            C515780KKq key = entry.getKey();
                            for (TemplateInfo templateInfo7 : entry.getValue()) {
                                IapProductDetail iapProductDetail = map5.get(templateInfo7.iapId);
                                if (templateInfo7.tplType == 1 && iapProductDetail != null) {
                                    SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = new SubscriptionProductDetailWithTemplateInfo(templateInfo7, null);
                                    subscriptionProductDetailWithTemplateInfo.setOneTimeProductDetail(iapProductDetail.oneTimePurchaseProduct);
                                    List<SubscriptionProductDetailWithTemplateInfo> arrayList10 = this.LJFF.get(key.LIZ);
                                    if (arrayList10 == null) {
                                        arrayList10 = new ArrayList<>();
                                    }
                                    arrayList10.add(subscriptionProductDetailWithTemplateInfo);
                                    final List<TemplateInfo> list5 = this.LJIIIIZZ;
                                    if (arrayList10.size() > 1) {
                                        C08XD.LJJ(arrayList10, new Comparator() { // from class: X.0KKk
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.Comparator
                                            public final int compare(T t, T t2) {
                                                int i;
                                                TemplateInfo templateInfo8;
                                                TemplateInfo templateInfo9;
                                                SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = (SubscriptionProductDetailWithTemplateInfo) t;
                                                Iterator it4 = list5.iterator();
                                                int i2 = 0;
                                                while (true) {
                                                    i = -1;
                                                    if (it4.hasNext()) {
                                                        TemplateInfo templateInfo10 = (TemplateInfo) it4.next();
                                                        TemplateInfo templateInfo11 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
                                                        if (templateInfo11 != null && templateInfo11.subCircle == templateInfo10.subCircle && (templateInfo9 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) != null && templateInfo9.tplType == templateInfo10.tplType) {
                                                            break;
                                                        }
                                                        i2++;
                                                    } else {
                                                        i2 = -1;
                                                        break;
                                                    }
                                                }
                                                Integer numValueOf = Integer.valueOf(i2);
                                                SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo3 = (SubscriptionProductDetailWithTemplateInfo) t2;
                                                Iterator it5 = list5.iterator();
                                                int i3 = 0;
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        break;
                                                    }
                                                    TemplateInfo templateInfo12 = (TemplateInfo) it5.next();
                                                    TemplateInfo templateInfo13 = subscriptionProductDetailWithTemplateInfo3.getTemplateInfo();
                                                    if (templateInfo13 != null && templateInfo13.subCircle == templateInfo12.subCircle && (templateInfo8 = subscriptionProductDetailWithTemplateInfo3.getTemplateInfo()) != null && templateInfo8.tplType == templateInfo12.tplType) {
                                                        i = i3;
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                                return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i));
                                            }
                                        });
                                    }
                                    this.LJFF.put(key.LIZ, arrayList10);
                                } else {
                                    C516010KLn c516010KLn = C516010KLn.LIZ;
                                    String str5 = this.LIZLLL.LIZLLL;
                                    String str6 = templateInfo7.iapId;
                                    String str7 = templateInfo7.basePlanId;
                                    OfferInfo offerInfo = templateInfo7.offerInfo;
                                    if (offerInfo == null || (str4 = offerInfo.id) == null) {
                                        str4 = "";
                                    }
                                    String str8 = templateInfo7.packageId;
                                    c516010KLn.getClass();
                                    C516010KLn.LJJ(str5, str6, str7, str4, str8, false);
                                }
                            }
                        }
                        C515770KKp c515770KKp2 = this.LJI;
                        c515770KKp2.LIZ = Boolean.TRUE;
                        if (c515770KKp2.LIZ()) {
                            C0KJX c0kjx2 = this.LIZLLL;
                            C513500KBw.LJFF(c0kjx2.LIZ, c0kjx2.LIZJ, c0kjx2.LJII, this.LJFF);
                            C0KKO c0kko2 = this.LIZLLL.LJIIJ;
                            if (c0kko2 != null) {
                                c0kko2.LIZIZ();
                            }
                            C0KKO c0kko3 = this.LIZLLL.LJIIJ;
                            if (c0kko3 != null) {
                                c0kko3.LJ(this.LJFF, this.LJII);
                            }
                            C513940KDo.LJIILL(this.LJFF);
                        }
                    }
                }

                @Override // X.InterfaceC1791670wiz
                public final void LJ(C518080KTm c518080KTm) {
                    C0KKO c0kko2;
                    C516060KLs.LIZ(this, c518080KTm);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onFailure: ");
                    sbLIZ2.append(c518080KTm);
                    C20441214yg.LIZIZ("SubscribePaymentV2", C2188811AlT.LIZIZ(sbLIZ2));
                    C515750KKn c515750KKn = new C515750KKn(c518080KTm, this.LJIIIZ, this.LJII, this.LIZLLL);
                    C515770KKp c515770KKp2 = this.LJI;
                    c515770KKp2.LIZ = Boolean.FALSE;
                    if (c515770KKp2.LIZJ()) {
                        c515750KKn.invoke();
                    } else {
                        if (!this.LJI.LIZIZ() || (c0kko2 = this.LIZLLL.LJIIJ) == null) {
                            return;
                        }
                        c0kko2.LJ(this.LJFF, this.LJII);
                    }
                }

                {
                    this.LJ = map2;
                    this.LJFF = map4;
                    this.LJI = c515770KKp;
                    this.LJII = c0kh1;
                    this.LJIIIIZZ = list4;
                    this.LJIIIZ = c0kkq;
                    this.LIZ = this.LIZLLL.LIZLLL;
                    this.LIZJ = str3;
                }
            }, c1617170sBX);
        } else {
            c515770KKp.LIZIZ = false;
            c515770KKp.LIZ = Boolean.TRUE;
        }
        if (!arrayList2.isEmpty()) {
            map = map4;
            this.LIZJ.LJIIIZ(new C0KM6(str2, map3, this, map4, c515770KKp, list, this.LIZ, this.LIZIZ) { // from class: X.0KKi
                public final String LIZ;
                public final String LIZJ;
                public final /* synthetic */ Map<C515780KKq, List<TemplateInfo>> LJFF;
                public final /* synthetic */ C515710KKj LJI;
                public final /* synthetic */ HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> LJII;
                public final /* synthetic */ C515770KKp LJIIIIZZ;
                public final /* synthetic */ List<TemplateInfo> LJIIIZ;
                public final /* synthetic */ C0KH1 LJIIJ;
                public final /* synthetic */ C0KKQ LJIIJJI;
                public final long LIZIZ = System.currentTimeMillis();
                public final boolean LIZLLL = true;

                @Override // X.C0KM6
                public final long LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.C0KM6
                public final String LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.C0KM6
                public final String LIZJ() {
                    return this.LIZ;
                }

                @Override // X.C0KM6
                public final boolean isAutoRenew() {
                    return this.LIZLLL;
                }

                /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
                @Override // X.InterfaceC1791670wiz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZLLL(X.C518160KTu r22) {
                    /*
                        Method dump skipped, instruction units count: 512
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C515700KKi.LIZLLL(X.0KTu):void");
                }

                @Override // X.InterfaceC1791670wiz
                public final void LJ(C518080KTm c518080KTm) {
                    C0KKO c0kko2;
                    C516060KLs.LIZ(this, c518080KTm);
                    C515740KKm c515740KKm = new C515740KKm(this.LJI, c518080KTm, this.LJIIIIZZ, this.LJII, this.LJ, this.LJIIJ, new C515760KKo(c518080KTm, this.LJIIJJI, this.LJIIJ, this.LJ));
                    C515770KKp c515770KKp2 = this.LJIIIIZZ;
                    c515770KKp2.LIZJ = Boolean.FALSE;
                    if (c515770KKp2.LIZJ()) {
                        c515740KKm.invoke();
                    } else {
                        if (!this.LJIIIIZZ.LIZIZ() || (c0kko2 = this.LJ.LJIIJ) == null) {
                            return;
                        }
                        c0kko2.LJ(this.LJII, this.LJIIJ);
                    }
                }

                {
                    this.LJFF = map3;
                    this.LJI = this;
                    this.LJII = map4;
                    this.LJIIIIZZ = c515770KKp;
                    this.LJIIIZ = list;
                    this.LJIIJ = c0kh1;
                    this.LJIIJJI = c0kkq;
                    this.LIZ = this.LJ.LIZLLL;
                    this.LIZJ = str2;
                }
            }, new C1617170sBX("05816USpPkJiyBnttk", arrayList2, "subs"));
        } else {
            map = map4;
            c515770KKp.LIZLLL = false;
            c515770KKp.LIZJ = Boolean.TRUE;
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty() && (!arrayList3.isEmpty())) {
            LIZJ(0, c515770KKp, map, new C515730KKl(c0kjx, map, this), new C515790KKr(this));
        }
    }

    public final void LIZJ(int i, final C515770KKp c515770KKp, final HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> map, final Function0<Unit> function0, final Function0<Unit> function02) {
        List<TemplateInfo> list = c515770KKp.LJ;
        if (list != null && ((ArrayList) list).isEmpty()) {
            function02.invoke();
            return;
        }
        if (i != 0) {
            function02.invoke();
            return;
        }
        List<TemplateInfo> list2 = c515770KKp.LJ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((TemplateInfo) it2.next()).iapId);
            }
            this.LIZJ.LJIIIZ(new InterfaceC1791670wiz() { // from class: X.0KBA
                @Override // X.InterfaceC1791670wiz
                public final void LIZLLL(C518160KTu c518160KTu) {
                    C1617230sBd c1617230sBd;
                    IapProductDetail iapProductDetail;
                    List<TemplateInfo> list3 = c515770KKp.LJ;
                    if (list3 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : (ArrayList) list3) {
                            String str = ((TemplateInfo) obj).packageId;
                            Object arrayList2 = linkedHashMap.get(str);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap.put(str, arrayList2);
                            }
                            ((List) arrayList2).add(obj);
                        }
                        HashMap<String, List<SubscriptionProductDetailWithTemplateInfo>> map2 = map;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            List<TemplateInfo> list4 = (List) entry.getValue();
                            if (map2.get(key) == null) {
                                map2.put((String) key, new ArrayList());
                            }
                            for (TemplateInfo templateInfo : list4) {
                                String str2 = templateInfo.iapId;
                                SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = new SubscriptionProductDetailWithTemplateInfo(templateInfo, null);
                                Map<String, IapProductDetail> map3 = c518160KTu.LJIIJ;
                                if (map3 != null && (iapProductDetail = map3.get(str2)) != null) {
                                    c1617230sBd = iapProductDetail.oneTimePurchaseProduct;
                                } else {
                                    c1617230sBd = null;
                                }
                                subscriptionProductDetailWithTemplateInfo.setOneTimeProductDetail(c1617230sBd);
                                List<SubscriptionProductDetailWithTemplateInfo> list5 = map2.get(key);
                                if (list5 != null) {
                                    list5.add(subscriptionProductDetailWithTemplateInfo);
                                }
                            }
                        }
                    }
                    Map<String, Object> map4 = C1338270kvh.LIZ;
                    function0.invoke();
                }

                @Override // X.InterfaceC1791670wiz
                public final void LJ(C518080KTm c518080KTm) {
                    function02.invoke();
                }
            }, new C1617170sBX("05816USpPkJiyBnttk", arrayList, "inapp"));
            return;
        }
        function02.invoke();
    }
}
