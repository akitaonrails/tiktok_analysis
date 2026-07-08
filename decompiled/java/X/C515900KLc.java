package X;

import Y.AComparatorS506S0100000_7;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS136S0400000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.pgc_sub.PGCTemplateListData;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515900KLc {
    public final C0KCK LIZ;
    public final C0KLH LIZIZ;
    public final C515950KLh LIZJ = C0KLU.LIZ;

    public static boolean LIZJ(TemplateInfo templateInfo) {
        int i = templateInfo.tplType;
        if (i == 2 || (i == 1 && templateInfo.basePlanId.length() > 0)) {
            return true;
        }
        return false;
    }

    public C515900KLc(C0KCK c0kck, C0KLH c0klh) {
        this.LIZ = c0kck;
        this.LIZIZ = c0klh;
    }

    public final void LIZ(PGCTemplateListData pGCTemplateListData, final C0KLA c0kla) {
        final List listLIZ;
        Object next;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (c0kla.LJII == EnumC513480KBu.PLAN_CHANGE) {
            listLIZ = C0KLY.LIZ(pGCTemplateListData.planChangeOptions);
        } else {
            listLIZ = C0KLY.LIZ(pGCTemplateListData.templateList);
        }
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        Iterator it2 = listLIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((TemplateInfo) next).isDefaultPackage) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateInfo templateInfo = (TemplateInfo) next;
        String str2 = "";
        if (templateInfo == null || (str = templateInfo.packageId) == null) {
            TemplateInfo templateInfo2 = (TemplateInfo) C13LP.LJJJLL(listLIZ);
            if (templateInfo2 == null) {
                str = "";
            } else {
                str = templateInfo2.packageId;
            }
        }
        C0KLD c0kld = c0kla.LJIIJ;
        if (str == null) {
            str = "";
        }
        c0kld.LIZJ(str);
        ArrayList<TemplateInfo> arrayList4 = new ArrayList();
        for (Object obj : listLIZ) {
            if (((TemplateInfo) obj).shouldDisplay) {
                arrayList4.add(obj);
            }
        }
        for (TemplateInfo templateInfo3 : arrayList4) {
            str2 = templateInfo3.currency;
            C516090KLv c516090KLv = new C516090KLv(templateInfo3.packageId, templateInfo3.basePlanId);
            if (LIZJ(templateInfo3)) {
                if (C0K7G.LJFF("live_sub_enable_mock_auto_renewal_sku_query_failed", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(templateInfo3.iapId);
                    sbLIZ.append("-mock-error");
                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    arrayList2.add(templateInfo3.iapId);
                }
                List arrayList5 = (List) map2.get(c516090KLv);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(templateInfo3);
                map2.put(c516090KLv, arrayList5);
            } else if (templateInfo3.tplType == 1) {
                arrayList.add(templateInfo3.iapId);
                List arrayList6 = (List) map.get(c516090KLv);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(templateInfo3);
                map.put(c516090KLv, arrayList6);
            }
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty()) {
            this.LIZ.LJII = true;
            C0KLH.LIZ(this.LIZIZ, -2, C386801es.DEFAULT, -1004);
        }
        final HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map3 = new HashMap<>();
        final C516110KLx c516110KLx = new C516110KLx();
        if (arrayList.isEmpty()) {
            List<PGCTemplateInfo> list = pGCTemplateListData.fallbackTemplateList;
            ArrayList arrayList7 = new ArrayList();
            for (PGCTemplateInfo pGCTemplateInfo : list) {
                if (pGCTemplateInfo.shouldDisplay) {
                    arrayList7.add(pGCTemplateInfo);
                }
            }
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(((PGCTemplateInfo) it3.next()).iapId);
            }
            arrayList3.addAll(arrayList8);
            List listLIZ2 = C0KLY.LIZ(pGCTemplateListData.fallbackTemplateList);
            ArrayList arrayList9 = new ArrayList();
            for (Object obj2 : (ArrayList) listLIZ2) {
                if (((TemplateInfo) obj2).shouldDisplay) {
                    arrayList9.add(obj2);
                }
            }
            c516110KLx.LJ = new ArrayList(arrayList9);
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty() && arrayList3.isEmpty()) {
            this.LIZ.LJII = true;
            C0KLH.LIZ(this.LIZIZ, -2, C386801es.DEFAULT, -1004);
            return;
        }
        if (!arrayList.isEmpty()) {
            C515950KLh c515950KLh = this.LIZJ;
            C1617170sBX c1617170sBX = new C1617170sBX("80UJVV6Y1101", arrayList, "inapp");
            final C0KCK c0kck = this.LIZ;
            final C0KLH c0klh = this.LIZIZ;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final String str3 = str2;
            c515950KLh.LIZ(c1617170sBX, new C0KM5(str3, map, map3, c516110KLx, jCurrentTimeMillis, c0kck, listLIZ, c0klh) { // from class: X.0KLe
                public final String LIZ;
                public final long LIZIZ = System.currentTimeMillis();
                public final String LIZJ;
                public final String LIZLLL;
                public final /* synthetic */ Map<C516090KLv, List<TemplateInfo>> LJFF;
                public final /* synthetic */ HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> LJI;
                public final /* synthetic */ C516110KLx LJII;
                public final /* synthetic */ C0KCK LJIIIIZZ;
                public final /* synthetic */ List<TemplateInfo> LJIIIZ;
                public final /* synthetic */ C0KLH LJIIJ;

                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.C0KM5
                public final boolean isAutoRenew() {
                    return false;
                }

                @Override // X.C0KM5
                public final long LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.C0KM5
                public final String LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.C0KM5
                public final String LIZJ() {
                    return this.LIZ;
                }

                @Override // X.C0KM5
                public final String getShowEntrance() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    C0KLD c0kld2;
                    String str4;
                    IapProductDetail iapProductDetail;
                    C515990KLl.LIZ(this, c518150KTt);
                    if (c518150KTt.LIZ) {
                        Map<String, IapProductDetail> map4 = c518150KTt.LIZIZ;
                        if (map4 != null && !map4.isEmpty()) {
                            for (Map.Entry<C516090KLv, List<TemplateInfo>> entry : this.LJFF.entrySet()) {
                                C516090KLv key = entry.getKey();
                                for (TemplateInfo templateInfo4 : entry.getValue()) {
                                    IapProductDetail iapProductDetail2 = map4.get(templateInfo4.iapId);
                                    String str5 = "";
                                    String strLIZ = null;
                                    if (templateInfo4.tplType == 1 && iapProductDetail2 != null) {
                                        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = new PGCSubscriptionProductDetailWithTemplateInfo(templateInfo4, null);
                                        C1617230sBd c1617230sBd = iapProductDetail2.oneTimePurchaseProduct;
                                        Map<String, IapProductDetail> map5 = c518150KTt.LIZIZ;
                                        if (map5 != null && (iapProductDetail = map5.get(templateInfo4.iapId)) != null) {
                                            strLIZ = iapProductDetail.LIZ(templateInfo4.basePlanId, "");
                                        }
                                        pGCSubscriptionProductDetailWithTemplateInfo.setOneTimeProductDetail(c1617230sBd, strLIZ);
                                        List<PGCSubscriptionProductDetailWithTemplateInfo> arrayList10 = this.LJI.get(key.LIZ);
                                        if (arrayList10 == null) {
                                            arrayList10 = new ArrayList<>();
                                        }
                                        arrayList10.add(pGCSubscriptionProductDetailWithTemplateInfo);
                                        List<TemplateInfo> list2 = this.LJIIIZ;
                                        if (arrayList10.size() > 1) {
                                            C08XD.LJJ(arrayList10, new AComparatorS506S0100000_7(list2, 3));
                                        }
                                        this.LJI.put(key.LIZ, arrayList10);
                                    } else {
                                        C516000KLm c516000KLm = C516000KLm.LIZ;
                                        String str6 = this.LJ.LIZLLL;
                                        String str7 = templateInfo4.iapId;
                                        String str8 = templateInfo4.basePlanId;
                                        OfferInfo offerInfo = templateInfo4.offerInfo;
                                        if (offerInfo != null && (str4 = offerInfo.id) != null) {
                                            str5 = str4;
                                        }
                                        String str9 = templateInfo4.packageId;
                                        String str10 = this.LIZLLL;
                                        c516000KLm.getClass();
                                        C516000KLm.LJIJI(str6, str7, str8, str5, false, str9, str10);
                                    }
                                }
                            }
                            C516110KLx c516110KLx2 = this.LJII;
                            c516110KLx2.LIZ = Boolean.TRUE;
                            if (c516110KLx2.LIZ()) {
                                C0KLA c0kla2 = this.LJ;
                                C513470KBt.LJFF(c0kla2.LIZ, c0kla2.LIZJ, c0kla2.LJII, this.LJI);
                                C0KLD c0kld3 = this.LJ.LJIIJ;
                                if (c0kld3 != null) {
                                    c0kld3.LIZIZ();
                                }
                                C0KLD c0kld4 = this.LJ.LJIIJ;
                                if (c0kld4 != null) {
                                    c0kld4.LJFF(this.LJI, this.LJIIIIZZ);
                                }
                                C513840KDe.LJIILL(this.LJI);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AwS136S0400000_7 awS136S0400000_7 = new AwS136S0400000_7(c518150KTt, this.LJIIJ, this.LJIIIIZZ, this.LJ, 2);
                    C516110KLx c516110KLx3 = this.LJII;
                    c516110KLx3.LIZ = Boolean.FALSE;
                    if (c516110KLx3.LIZJ()) {
                        awS136S0400000_7.invoke();
                    } else {
                        if (!this.LJII.LIZIZ() || (c0kld2 = this.LJ.LJIIJ) == null) {
                            return;
                        }
                        c0kld2.LJFF(this.LJI, this.LJIIIIZZ);
                    }
                }

                {
                    this.LJFF = map;
                    this.LJI = map3;
                    this.LJII = c516110KLx;
                    this.LJIIIIZZ = c0kck;
                    this.LJIIIZ = listLIZ;
                    this.LJIIJ = c0klh;
                    this.LIZ = this.LJ.LIZLLL;
                    this.LIZJ = str3;
                    this.LIZLLL = this.LJ.LJIJ;
                }
            });
        } else {
            c516110KLx.LIZIZ = false;
            c516110KLx.LIZ = Boolean.TRUE;
        }
        if (!arrayList2.isEmpty()) {
            C515950KLh c515950KLh2 = this.LIZJ;
            C1617170sBX c1617170sBX2 = new C1617170sBX("80UJVV6Y1101", arrayList2, "subs");
            final C0KCK c0kck2 = this.LIZ;
            final C0KLH c0klh2 = this.LIZIZ;
            final String str4 = str2;
            final List list2 = listLIZ;
            c515950KLh2.LIZ(c1617170sBX2, new C0KM5(str4, map2, this, map3, c516110KLx, c0kck2, list2, c0klh2) { // from class: X.0KLf
                public final String LIZ;
                public final String LIZJ;
                public final String LJ;
                public final /* synthetic */ Map<C516090KLv, List<TemplateInfo>> LJI;
                public final /* synthetic */ C515900KLc LJII;
                public final /* synthetic */ HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> LJIIIIZZ;
                public final /* synthetic */ C516110KLx LJIIIZ;
                public final /* synthetic */ C0KCK LJIIJ;
                public final /* synthetic */ List<TemplateInfo> LJIIJJI;
                public final /* synthetic */ C0KLH LJIIL;
                public final long LIZIZ = System.currentTimeMillis();
                public final boolean LIZLLL = true;

                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.C0KM5
                public final long LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.C0KM5
                public final String LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.C0KM5
                public final String LIZJ() {
                    return this.LIZ;
                }

                @Override // X.C0KM5
                public final String getShowEntrance() {
                    return this.LJ;
                }

                @Override // X.C0KM5
                public final boolean isAutoRenew() {
                    return this.LIZLLL;
                }

                /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
                @Override // X.InterfaceC1791300wiO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZLLL(X.C518150KTt r27) {
                    /*
                        Method dump skipped, instruction units count: 631
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C515930KLf.LIZLLL(X.0KTt):void");
                }

                {
                    this.LJI = map2;
                    this.LJII = this;
                    this.LJIIIIZZ = map3;
                    this.LJIIIZ = c516110KLx;
                    this.LJIIJ = c0kck2;
                    this.LJIIJJI = list2;
                    this.LJIIL = c0klh2;
                    this.LIZ = this.LJFF.LIZLLL;
                    this.LIZJ = str4;
                    this.LJ = this.LJFF.LJIJ;
                }
            });
        } else {
            c516110KLx.LIZLLL = false;
            c516110KLx.LIZJ = Boolean.TRUE;
        }
        if (arrayList2.isEmpty() && arrayList.isEmpty() && (!arrayList3.isEmpty())) {
            LIZLLL(0, c516110KLx, map3, new AwS251S0300000_7(c0kla, (C0KLA) map3, (HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>>) this, (C515900KLc) 12), new AwS551S0100000_7(this, 572));
        }
    }

    public final void LIZIZ(final PGCTemplateListData pGCTemplateListData, final C0KLA c0kla) {
        long jLongValue;
        final boolean z;
        List listLJJJJI;
        String currentUserID;
        Long lLJIILIIL;
        if (c0kla.LJIIIZ == null) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        long jLongValue2 = 0;
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(currentUserID)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        if (c0kla.LJII == EnumC513480KBu.PLAN_CHANGE) {
            z = true;
        } else {
            z = false;
        }
        if (c0kla.LJIIZILJ.length() == 0) {
            User user = pGCTemplateListData.anchorDetail;
            if (user != null) {
                jLongValue2 = user.getId();
            }
        } else {
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(c0kla.LJIIZILJ);
            if (lLJIILIIL2 != null) {
                jLongValue2 = lLJIILIIL2.longValue();
            }
        }
        if (z) {
            List<PGCTemplateInfo> list = pGCTemplateListData.planChangeOptions;
            ArrayList arrayList = new ArrayList();
            for (PGCTemplateInfo pGCTemplateInfo : list) {
                if (pGCTemplateInfo.tplType == 2) {
                    arrayList.add(pGCTemplateInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PGCTemplateInfo) it2.next()).iapId);
            }
            listLJJJJI = C13LP.LJJJJI(arrayList2);
        } else {
            List<PGCTemplateInfo> list2 = pGCTemplateListData.templateList;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<PGCTemplateInfo> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().iapId);
            }
            listLJJJJI = C13LP.LJJJJI(arrayList3);
        }
        this.LIZJ.LIZJ(new InterfaceC518100KTo() { // from class: X.0KLi
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0102, code lost:
            
                r0 = X.C13LP.LJJJLIIL(r27.keySet());
             */
            /* JADX WARN: Removed duplicated region for block: B:104:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x01e7  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x01eb A[PHI: r0
              0x01eb: PHI (r0v24 java.lang.String) = (r0v22 java.lang.String), (r0v25 java.lang.String) binds: [B:120:0x01e9, B:118:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:128:0x0209  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0221  */
            /* JADX WARN: Removed duplicated region for block: B:157:0x0102 A[EDGE_INSN: B:157:0x0102->B:63:0x0102 BREAK  A[LOOP:3: B:58:0x00f0->B:159:?], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0185  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
            @Override // X.InterfaceC518100KTo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map<java.lang.String, X.C517630KRt> r27) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 549
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C515960KLi.LIZ(java.util.Map):void");
            }
        }, new C1789940wgC(jLongValue, "80UJVV6Y1101", listLJJJJI, null, jLongValue2, 40));
    }

    public final void LIZLLL(int i, final C516110KLx c516110KLx, final HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map, final Function0<Unit> function0, final Function0<Unit> function02) {
        List<TemplateInfo> list = c516110KLx.LJ;
        if (list != null && ((ArrayList) list).isEmpty()) {
            function02.invoke();
            return;
        }
        if (i != 0) {
            function02.invoke();
            return;
        }
        List<TemplateInfo> list2 = c516110KLx.LJ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((TemplateInfo) it2.next()).iapId);
            }
            this.LIZJ.LIZ(new C1617170sBX("80UJVV6Y1101", arrayList, "inapp"), new InterfaceC1791300wiO() { // from class: X.0KLd
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    C1617230sBd c1617230sBd;
                    String strLIZ;
                    IapProductDetail iapProductDetail;
                    IapProductDetail iapProductDetail2;
                    if (c518150KTt.LIZ) {
                        List<TemplateInfo> list3 = c516110KLx.LJ;
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
                            HashMap<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map2 = map;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                Object key = entry.getKey();
                                List<TemplateInfo> list4 = (List) entry.getValue();
                                if (map2.get(key) == null) {
                                    map2.put((String) key, new ArrayList());
                                }
                                for (TemplateInfo templateInfo : list4) {
                                    String str2 = templateInfo.iapId;
                                    PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = new PGCSubscriptionProductDetailWithTemplateInfo(templateInfo, null);
                                    Map<String, IapProductDetail> map3 = c518150KTt.LIZIZ;
                                    if (map3 != null && (iapProductDetail2 = map3.get(str2)) != null) {
                                        c1617230sBd = iapProductDetail2.oneTimePurchaseProduct;
                                    } else {
                                        c1617230sBd = null;
                                    }
                                    Map<String, IapProductDetail> map4 = c518150KTt.LIZIZ;
                                    if (map4 != null && (iapProductDetail = map4.get(str2)) != null) {
                                        strLIZ = iapProductDetail.LIZ(templateInfo.basePlanId, "");
                                    } else {
                                        strLIZ = null;
                                    }
                                    pGCSubscriptionProductDetailWithTemplateInfo.setOneTimeProductDetail(c1617230sBd, strLIZ);
                                    List<PGCSubscriptionProductDetailWithTemplateInfo> list5 = map2.get(key);
                                    if (list5 != null) {
                                        list5.add(pGCSubscriptionProductDetailWithTemplateInfo);
                                    }
                                }
                            }
                        }
                        C844470XAv.LIZ.getClass();
                        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                            C0JCX.LIZLLL("Local test toast: fallback to common sku");
                        }
                        function0.invoke();
                        return;
                    }
                    function02.invoke();
                }
            });
            return;
        }
        function02.invoke();
    }
}
