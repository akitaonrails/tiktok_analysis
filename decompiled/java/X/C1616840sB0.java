package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0sB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616840sB0<T> implements InterfaceC300801Eo {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ EnumC1616780sAu LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1791930wjP LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ List<C1615330s8Z> LLIZ;

    public C1616840sB0(List<String> list, List<String> list2, EnumC1616780sAu enumC1616780sAu, String str, InterfaceC1791930wjP interfaceC1791930wjP, Map<String, String> map, List<C1615330s8Z> list3) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = enumC1616780sAu;
        this.LLILZ = str;
        this.LLILZIL = interfaceC1791930wjP;
        this.LLILZLL = map;
        this.LLIZ = list3;
    }

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<C1616800sAw> interfaceC2329309At) {
        final ConcurrentHashMap concurrentHashMap;
        final AtomicReference atomicReference;
        final AtomicInteger atomicInteger;
        final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final AtomicInteger atomicInteger2 = new AtomicInteger((!this.LL.isEmpty() ? 1 : 0) + (!this.LLILLJJLI.isEmpty() ? 1 : 0));
        if (!this.LL.isEmpty()) {
            C1617170sBX c1617170sBX = new C1617170sBX(C1616810sAx.LIZIZ.LJIIJJI(this.LLILLL, EnumC1615550s8v.PGC_OPTION_TYPE_ONE_TIME), this.LL, "inapp");
            C1616970sBD.LIZ(c1617170sBX, this.LLILZ, "oneTime");
            InterfaceC1791930wjP interfaceC1791930wjP = this.LLILZIL;
            final String str = this.LLILZ;
            final Map<String, String> map = this.LLILZLL;
            final List<C1615330s8Z> list = this.LLIZ;
            final C11KT c11kt = (C11KT) interfaceC2329309At;
            atomicReference = atomicReference2;
            concurrentHashMap = concurrentHashMap2;
            atomicInteger = atomicInteger2;
            interfaceC1791930wjP.LIZ(c1617170sBX, new InterfaceC1791300wiO() { // from class: X.0sB2
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    LinkedHashMap linkedHashMap;
                    IapProductDetail iapProductDetail;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    C1617230sBd c1617230sBd;
                    String str8;
                    Objects.toString(c518150KTt.LIZJ);
                    Map<String, IapProductDetail> map2 = c518150KTt.LIZIZ;
                    if (map2 != null) {
                        linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                        Iterator<T> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            IapProductDetail iapProductDetail2 = (IapProductDetail) entry.getValue();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("(countryCode=");
                            sbLIZ.append(iapProductDetail2.countryCode);
                            sbLIZ.append(", oneTime.price=");
                            C1617230sBd c1617230sBd2 = iapProductDetail2.oneTimePurchaseProduct;
                            if (c1617230sBd2 != null) {
                                str8 = c1617230sBd2.price;
                            } else {
                                str8 = null;
                            }
                            sbLIZ.append(str8);
                            sbLIZ.append(')');
                            linkedHashMap.put(key, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    Objects.toString(linkedHashMap);
                    C1616970sBD.LIZIZ(c518150KTt, str, "oneTime");
                    atomicReference2.set(c518150KTt.LIZJ);
                    Map<String, IapProductDetail> map3 = c518150KTt.LIZIZ;
                    if (map3 != null) {
                        Map<String, String> map4 = map;
                        Map<String, C1616830sAz> map5 = concurrentHashMap2;
                        for (Map.Entry<String, IapProductDetail> entry2 : map3.entrySet()) {
                            String key2 = entry2.getKey();
                            IapProductDetail value = entry2.getValue();
                            String str9 = map4.get(key2);
                            if (str9 != null) {
                                iapProductDetail = map3.get(str9);
                            } else {
                                iapProductDetail = null;
                            }
                            C1617230sBd c1617230sBd3 = value.oneTimePurchaseProduct;
                            if (c1617230sBd3 != null) {
                                str2 = c1617230sBd3.price;
                            } else {
                                str2 = null;
                            }
                            C517350KQr c517350KQr = C517350KQr.LIZ;
                            if (str2 == null) {
                                str3 = "";
                            } else {
                                str3 = str2;
                            }
                            c517350KQr.getClass();
                            String str10 = (String) C517350KQr.LIZIZ(str3).getFirst();
                            if (iapProductDetail != null && (c1617230sBd = iapProductDetail.oneTimePurchaseProduct) != null) {
                                str4 = c1617230sBd.price;
                            } else {
                                str4 = null;
                            }
                            int protoValue = EnumC1615550s8v.PGC_OPTION_TYPE_ONE_TIME.getProtoValue();
                            if (str2 == null || (str5 = C517370KQt.LIZ(str2).LIZIZ) == null || str5.length() <= 0) {
                                str5 = null;
                            }
                            if (str4 == null || (str6 = C517370KQt.LIZ(str4).LIZIZ) == null || str6.length() <= 0) {
                                str6 = null;
                            }
                            String str11 = value.countryCode;
                            if (str10.length() <= 0) {
                                str10 = null;
                            }
                            if (c1617230sBd3 != null) {
                                str7 = c1617230sBd3.LIZ;
                            } else {
                                str7 = null;
                            }
                            map5.put(key2, new C1616830sAz(protoValue, key2, str9, str5, str6, str11, str10, str7, null, null, 7680));
                        }
                    }
                    C1616840sB0.LIZ(atomicInteger2, c11kt, concurrentHashMap2, concurrentHashMap3, list, atomicReference2, atomicReference3);
                }
            });
        } else {
            concurrentHashMap = concurrentHashMap2;
            atomicReference = atomicReference2;
            atomicInteger = atomicInteger2;
        }
        if (!this.LLILLJJLI.isEmpty()) {
            C1617170sBX c1617170sBX2 = new C1617170sBX(C1616810sAx.LIZIZ.LJIIJJI(this.LLILLL, EnumC1615550s8v.PGC_OPTION_TYPE_SUBSCRIPTION), this.LLILLJJLI, "subs");
            C1616970sBD.LIZ(c1617170sBX2, this.LLILZ, "subscription");
            InterfaceC1791930wjP interfaceC1791930wjP2 = this.LLILZIL;
            final String str2 = this.LLILZ;
            final List<C1615330s8Z> list2 = this.LLIZ;
            final C11KT c11kt2 = (C11KT) interfaceC2329309At;
            interfaceC1791930wjP2.LIZ(c1617170sBX2, new InterfaceC1791300wiO() { // from class: X.0sB3
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    ArrayList arrayList;
                    Objects.toString(c518150KTt.LIZJ);
                    Map<String, IapProductDetail> map2 = c518150KTt.LIZIZ;
                    LinkedHashMap linkedHashMap = null;
                    if (map2 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                        Iterator<T> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            IapProductDetail iapProductDetail = (IapProductDetail) entry.getValue();
                            StringBuilder sb = new StringBuilder("(countryCode=");
                            sb.append(iapProductDetail.countryCode);
                            sb.append(", (productId=");
                            sb.append(iapProductDetail.productId);
                            sb.append(", offers=");
                            List<IapSubscriptionProduct> list3 = iapProductDetail.subscriptionOffer;
                            if (list3 != null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                for (IapSubscriptionProduct iapSubscriptionProduct : list3) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("(basePlanId=");
                                    sbLIZ.append(iapSubscriptionProduct.basePlanId);
                                    sbLIZ.append(", offerId=");
                                    sbLIZ.append(iapSubscriptionProduct.offerId);
                                    sbLIZ.append(", clientPayload=");
                                    sbLIZ.append(iapSubscriptionProduct.clientPayload);
                                    sbLIZ.append(", offerToken=");
                                    sbLIZ.append(iapSubscriptionProduct.offerToken);
                                    sbLIZ.append(')');
                                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            } else {
                                arrayList = null;
                            }
                            sb.append(arrayList);
                            sb.append(')');
                            linkedHashMap2.put(key, sb.toString());
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    Objects.toString(linkedHashMap);
                    C1616970sBD.LIZIZ(c518150KTt, str2, "subscription");
                    atomicReference3.set(c518150KTt.LIZJ);
                    Map<String, IapProductDetail> map3 = c518150KTt.LIZIZ;
                    if (map3 != null) {
                        Map<String, IapProductDetail> map4 = concurrentHashMap3;
                        for (Map.Entry<String, IapProductDetail> entry2 : map3.entrySet()) {
                            map4.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    C1616840sB0.LIZ(atomicInteger, c11kt2, concurrentHashMap, concurrentHashMap3, list2, atomicReference, atomicReference3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.util.concurrent.atomic.AtomicInteger r30, X.InterfaceC2329309At<X.C1616800sAw> r31, java.util.Map<java.lang.String, X.C1616830sAz> r32, java.util.Map<java.lang.String, com.bytedance.android.livesdk.iap.IapProductDetail> r33, java.util.List<X.C1615330s8Z> r34, java.util.concurrent.atomic.AtomicReference<X.C0KQW> r35, java.util.concurrent.atomic.AtomicReference<X.C0KQW> r36) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1616840sB0.LIZ(java.util.concurrent.atomic.AtomicInteger, X.09At, java.util.Map, java.util.Map, java.util.List, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference):void");
    }
}
