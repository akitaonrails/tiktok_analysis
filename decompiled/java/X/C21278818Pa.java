package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21278818Pa {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C21280618Ps());
    public static volatile Aweme LIZIZ;
    public static volatile Aweme LIZJ;
    public static volatile String LIZLLL;

    public static C21279318Pf LJ(Aweme aweme) {
        if (aweme != null) {
            try {
                String aid = aweme.getAid();
                if (aid != null && !a0.LJJJIL(aid)) {
                    return (C21279318Pf) ((ConcurrentHashMap) LIZ.getValue()).get(LIZIZ(aid, null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public static boolean LJFF(Aweme aweme) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null || a0.LJJJIL(aid) || !aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        EcUgVSAData ecUgVSAData;
        if (!LJFF(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (ecUgVSAData = awemeRawAd.getEcUgVSAData()) == null) {
            return false;
        }
        Integer num = ecUgVSAData.adType;
        int value = EnumC587500N2m.EC_UG_PRODUCT_CARD.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Aweme aweme) {
        String aid;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = LIZIZ;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        return Intrinsics.LJFF(aid2, aid);
    }

    public static boolean LJIIJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        EcUgVSAData ecUgVSAData;
        if (LJFF(aweme) && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null && ecUgVSAData.adType != null) {
            return true;
        }
        return false;
    }

    public static void LJIIL(Aweme aweme) {
        Aweme aweme2;
        if (aweme == null) {
            aweme2 = LIZIZ;
        } else {
            aweme2 = null;
        }
        LIZJ = aweme2;
        LIZIZ = aweme;
    }

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("__");
        if (str2 == null) {
            str2 = LIZLLL;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C21279318Pf LIZJ(Aweme aweme, String str) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return LIZLLL(aid, str);
    }

    public static C21279318Pf LIZLLL(String str, String str2) {
        C21279318Pf c21279318Pf;
        if (str != null) {
            try {
                if (!a0.LJJJIL(str) && (c21279318Pf = (C21279318Pf) ((ConcurrentHashMap) LIZ.getValue()).get(LIZIZ(str, str2))) != null) {
                    Integer num = c21279318Pf.LIZLLL.adType;
                    int value = EnumC587500N2m.EC_UG_PRODUCT_CARD.getValue();
                    if (num != null) {
                        if (num.intValue() == value) {
                            return c21279318Pf;
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public static boolean LJI(Aweme aweme, String str) {
        ArrayList arrayList;
        VSACardsResponse.VSACardData vSACardData;
        List<EcUgProduct> list;
        AwemeRawAd awemeRawAd;
        EcUgVSAData ecUgVSAData;
        List<EcUgVSAData.EcUgVSAProductInfo> list2;
        String str2;
        ArrayList arrayList2 = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null && (list2 = ecUgVSAData.productInfoList) != null) {
            arrayList = new ArrayList();
            for (EcUgVSAData.EcUgVSAProductInfo ecUgVSAProductInfo : list2) {
                if (ecUgVSAProductInfo != null && (str2 = ecUgVSAProductInfo.productId) != null) {
                    arrayList.add(str2);
                }
            }
        } else {
            arrayList = null;
        }
        C21279318Pf c21279318PfLIZJ = LIZJ(aweme, str);
        if (c21279318PfLIZJ != null && (vSACardData = c21279318PfLIZJ.LJFF) != null && (list = vSACardData.productList) != null) {
            arrayList2 = new ArrayList();
            Iterator<EcUgProduct> it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = it2.next().productId;
                if (str3 != null) {
                    arrayList2.add(str3);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null || arrayList2.isEmpty() || arrayList.size() != arrayList2.size()) {
            return false;
        }
        return Intrinsics.LJFF(arrayList, arrayList2);
    }

    public static boolean LJII(Aweme aweme, String str) {
        C21279318Pf c21279318PfLIZJ;
        if (LJFF(aweme) && (c21279318PfLIZJ = LIZJ(aweme, str)) != null) {
            String str2 = c21279318PfLIZJ.LIZIZ;
            String uniqueId = null;
            if (aweme != null) {
                uniqueId = AwemeSaaSExtKt.getUniqueId(aweme);
            }
            if (Intrinsics.LJFF(str2, uniqueId)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    long j = c21279318PfLIZJ.LIZJ;
                    Long adId = awemeRawAd.getAdId();
                    if (adId == null || j != adId.longValue()) {
                    }
                }
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null || awemeRawAd2.getEcUgVSAData() == null) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(Aweme aweme, String str) {
        if (!LJIIIIZZ(aweme) && !LJII(aweme, str)) {
            return false;
        }
        return true;
    }

    public static void LJIILIIL(Aweme aweme, String str) {
        C21279318Pf c21279318PfLIZJ;
        AwemeRawAd awemeRawAd;
        if (LJIIIZ(aweme, str) && (c21279318PfLIZJ = LIZJ(aweme, str)) != null && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeRawAd.setEcUgVSAData(c21279318PfLIZJ.LIZLLL);
            awemeRawAd.setOpenUrl(c21279318PfLIZJ.LIZLLL.openUrl);
            String str2 = c21279318PfLIZJ.LJ;
            if (str2 != null && !a0.LJJJIL(str2)) {
                awemeRawAd.setLearnMoreBgColor(c21279318PfLIZJ.LJ);
            }
        }
    }

    public static void LIZ(Context context, String str, List list) {
        String str2;
        String aid;
        String aid2;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            String str3 = "";
            if (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (aweme != null && (aid2 = aweme.getAid()) != null) {
                    str3 = aid2;
                }
                String strLIZIZ = LIZIZ(str3, str);
                if (strLIZIZ != null) {
                    arrayList.add(strLIZIZ);
                }
            } else {
                try {
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
        }
        Iterator it3 = ((ConcurrentHashMap) LIZ.getValue()).entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str4 = (String) entry.getKey();
            if (a0.LJJLIIIJILLIZJL(str4, new String[]{"__"}, 0, 6).size() >= 2 && Intrinsics.LJFF((String) ListProtector.get(a0.LJJLIIIJILLIZJL(str4, new String[]{"__"}, 0, 6), 1), str) && !arrayList.contains(entry.getKey())) {
                C21279318Pf c21279318Pf = (C21279318Pf) entry.getValue();
                String str5 = (String) entry.getKey();
                if (!(!a0.LJJLIIIJILLIZJL(str5, new String[]{"__"}, 0, 6).isEmpty())) {
                    str2 = "";
                } else {
                    str2 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str5, new String[]{"__"}, 0, 6), 0);
                }
                Aweme aweme2 = LIZIZ;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str2)) {
                    C21278918Pb c21278918Pb = C21278918Pb.LIZ;
                    Aweme aweme3 = LIZIZ;
                    c21278918Pb.getClass();
                    C21278918Pb.LIZJ(context, aweme3, str, true);
                }
                c21279318Pf.LJIIJJI = false;
                c21279318Pf.LJIIL = false;
                c21279318Pf.LJIILIIL = false;
                c21279318Pf.LJIILJJIL = false;
                c21279318Pf.LJIILL = false;
                c21279318Pf.LJIILLIIL = false;
                c21279318Pf.LJIIIIZZ = null;
                C18PX c18px = c21279318Pf.LJIIIZ;
                if (c18px != null) {
                    c18px.LIZ();
                }
                c21279318Pf.LJIIIZ = null;
                c21279318Pf.LJIIJ = null;
                it3.remove();
            }
        }
    }
}
