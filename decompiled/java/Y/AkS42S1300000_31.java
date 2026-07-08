package Y;

import X.AbstractC1361510lXB;
import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0BOP;
import X.C0SKF;
import X.C0SZC;
import X.C161C;
import X.C161N;
import X.C161R;
import X.C162U;
import X.C162W;
import X.C162X;
import X.C162Z;
import X.C163A;
import X.C163S;
import X.C163W;
import X.C164F;
import X.C1869620yki;
import X.C1869630ykj;
import X.C1869650ykl;
import X.C207099162f;
import X.C207128163i;
import X.C2188811AlT;
import X.EnumC207100162g;
import X.InterfaceC1389740mGi;
import X.InterfaceC1487280oo2;
import X.InterfaceC207105162l;
import com.ss.android.ugc.aweme.editpost.ClientTextWrapper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import com.ss.android.ugc.aweme.translation.model.PerfMetric;

/* JADX INFO: loaded from: classes32.dex */
public class AkS42S1300000_31 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS42S1300000_31 akS42S1300000_31, Object obj) {
        boolean z;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        Integer num3;
        DescriptionTranslationResult descriptionTranslationResult = (DescriptionTranslationResult) obj;
        PerfMetric perfMetric = descriptionTranslationResult.perfMetrics;
        Integer num4 = null;
        boolean z2 = false;
        if (((Boolean) C0BOP.LIZ.getValue()).booleanValue() && descriptionTranslationResult.translatedContent == null && descriptionTranslationResult.translatedClientText == null) {
            C163W c163w = C163W.SERVER_ERROR;
            EnumC207100162g enumC207100162gLIZLLL = C162W.LJ.LIZLLL(null);
            String str4 = descriptionTranslationResult.variant;
            if (perfMetric != null) {
                str3 = perfMetric.serverCacheType;
                num3 = perfMetric.serverTransTime;
                num4 = perfMetric.aiLabTransTime;
            } else {
                str3 = null;
                num3 = null;
            }
            C163A.LJIIJJI(enumC207100162gLIZLLL, (C162U) akS42S1300000_31.l1, "EMPTY_COMMENT_TRANSLATION_CONTENT", c163w, (InterfaceC1389740mGi) akS42S1300000_31.l2, str3, num3, num4, str4);
        } else {
            C163S[] c163sArrValues = C163S.values();
            int length = c163sArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    int statusCode = c163sArrValues[i].getStatusCode();
                    Integer num5 = descriptionTranslationResult.translationStatusCode;
                    if (num5 != null && statusCode == num5.intValue()) {
                        C163W c163w2 = C163W.SERVER_ERROR;
                        EnumC207100162g enumC207100162gLIZLLL2 = C162W.LJ.LIZLLL(null);
                        String str5 = descriptionTranslationResult.variant;
                        if (perfMetric != null) {
                            str2 = perfMetric.serverCacheType;
                            num2 = perfMetric.serverTransTime;
                            num4 = perfMetric.aiLabTransTime;
                        } else {
                            str2 = null;
                            num2 = null;
                        }
                        C163A.LJIIJJI(enumC207100162gLIZLLL2, (C162U) akS42S1300000_31.l1, "LEGACY_API_FAILED", c163w2, (InterfaceC1389740mGi) akS42S1300000_31.l2, str2, num2, num4, str5);
                    } else {
                        i++;
                    }
                } else {
                    ClientTextWrapper clientTextWrapper = descriptionTranslationResult.translatedClientText;
                    String strLIZIZ = C0SKF.LIZIZ((Aweme) akS42S1300000_31.l3);
                    String str6 = "";
                    if (strLIZIZ == null) {
                        strLIZIZ = "";
                    }
                    String str7 = descriptionTranslationResult.translatedContent;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    String strLLIIZ = C161N.LIZIZ.LLIIZ();
                    if (((InterfaceC1389740mGi) akS42S1300000_31.l2) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1869620yki c1869620yki = new C1869620yki(clientTextWrapper, strLIZIZ, str6, strLLIIZ, z, descriptionTranslationResult.variant, null);
                    C162W c162w = C162W.LJ;
                    c162w.getClass();
                    C01GW c01gw = C162W.LJFF;
                    ((AbstractC1361510lXB) c01gw.getValue()).LJFF(c1869620yki, (Aweme) akS42S1300000_31.l3, akS42S1300000_31.s0);
                    C01GW<AbstractC1604130rqV> c01gw2 = C207128163i.LJ;
                    AbstractC1604130rqV abstractC1604130rqVLIZ = C0SZC.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DescTranslationRepo");
                    sbLIZ.append(", setCache, aweme=");
                    sbLIZ.append(((Aweme) akS42S1300000_31.l3).getAid());
                    sbLIZ.append(", targetLang=");
                    sbLIZ.append(akS42S1300000_31.s0);
                    sbLIZ.append(", key=");
                    Object value = c01gw.getValue();
                    Aweme aweme = (Aweme) akS42S1300000_31.l3;
                    String str8 = akS42S1300000_31.s0;
                    value.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(aweme.getAid());
                    sbLIZ2.append(str8);
                    sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                    sbLIZ.append(", cacheValue=");
                    sbLIZ.append(c1869620yki);
                    sbLIZ.append('}');
                    abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    EnumC207100162g enumC207100162gLIZLLL3 = c162w.LIZLLL(null);
                    String str9 = descriptionTranslationResult.variant;
                    if (perfMetric != null) {
                        str = perfMetric.serverCacheType;
                        num = perfMetric.serverTransTime;
                        num4 = perfMetric.aiLabTransTime;
                    } else {
                        str = null;
                        num = null;
                    }
                    C163A.LJIILIIL(c162w, enumC207100162gLIZLLL3, (C162U) akS42S1300000_31.l1, 0, false, (InterfaceC1389740mGi) akS42S1300000_31.l2, str, num, num4, str9, 24);
                    z2 = true;
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object apply$1(AkS42S1300000_31 akS42S1300000_31, Object obj) {
        boolean z;
        boolean z2;
        String str;
        Integer num;
        String str2;
        Integer num2;
        DescriptionTranslationResult descriptionTranslationResult = (DescriptionTranslationResult) obj;
        PerfMetric perfMetric = descriptionTranslationResult.perfMetrics;
        C163S[] c163sArrValues = C163S.values();
        int length = c163sArrValues.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i < length) {
                int statusCode = c163sArrValues[i].getStatusCode();
                Integer num3 = descriptionTranslationResult.translationStatusCode;
                if (num3 != null && statusCode == num3.intValue()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        Integer num4 = null;
        if (z) {
            C163W c163w = C163W.SERVER_ERROR;
            EnumC207100162g enumC207100162gLIZLLL = C162X.LJ.LIZLLL(null);
            String str3 = descriptionTranslationResult.variant;
            if (perfMetric != null) {
                str2 = perfMetric.serverCacheType;
                num2 = perfMetric.serverTransTime;
                num4 = perfMetric.aiLabTransTime;
            } else {
                str2 = null;
                num2 = null;
            }
            C163A.LJIIJJI(enumC207100162gLIZLLL, (C162U) akS42S1300000_31.l1, "LEGACY_API_FAILED", c163w, (InterfaceC1389740mGi) akS42S1300000_31.l2, str2, num2, num4, str3);
        } else {
            C162X c162x = C162X.LJ;
            c162x.getClass();
            C01GW c01gw = C162X.LJFF;
            C162Z c162z = (C162Z) c01gw.getValue();
            Aweme aweme = (Aweme) akS42S1300000_31.l3;
            String strLIZIZ = C0SKF.LIZIZ(aweme);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            String str4 = descriptionTranslationResult.translatedContent;
            if (str4 == null) {
                str4 = "";
            }
            String strLLIIZ = C161N.LIZIZ.LLIIZ();
            if (((InterfaceC1389740mGi) akS42S1300000_31.l2) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1869630ykj c1869630ykjLJII = c162z.LJII(aweme, strLIZIZ, str4, strLLIIZ, descriptionTranslationResult.variant, z2);
            C01GW<AbstractC1604130rqV> c01gw2 = C207128163i.LJ;
            AbstractC1604130rqV abstractC1604130rqVLIZ = C0SZC.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DescTranslationRepo");
            sbLIZ.append(", setCache, aweme=");
            sbLIZ.append(((Aweme) akS42S1300000_31.l3).getAid());
            sbLIZ.append(", targetLang=");
            sbLIZ.append(akS42S1300000_31.s0);
            sbLIZ.append(", key=");
            sbLIZ.append(((AbstractC1361510lXB) c01gw.getValue()).LIZIZ((Aweme) akS42S1300000_31.l3, akS42S1300000_31.s0));
            sbLIZ.append(", cacheValue=");
            sbLIZ.append(c1869630ykjLJII);
            sbLIZ.append('}');
            abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
            EnumC207100162g enumC207100162gLIZLLL2 = c162x.LIZLLL(null);
            int iIntValue = c1869630ykjLJII.c5().intValue();
            String str5 = descriptionTranslationResult.variant;
            if (perfMetric != null) {
                str = perfMetric.serverCacheType;
                num = perfMetric.serverTransTime;
                num4 = perfMetric.aiLabTransTime;
            } else {
                str = null;
                num = null;
            }
            C163A.LJIILIIL(c162x, enumC207100162gLIZLLL2, (C162U) akS42S1300000_31.l1, Integer.valueOf(iIntValue), false, (InterfaceC1389740mGi) akS42S1300000_31.l2, str, num, num4, str5, 24);
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    public static final Object apply$2(AkS42S1300000_31 akS42S1300000_31, Object obj) {
        String strValueOf;
        String strLIZ;
        C161R c161r = (C161R) obj;
        c161r.LIZ();
        AbstractC1361510lXB abstractC1361510lXB = (AbstractC1361510lXB) ((C207099162f) akS42S1300000_31.l1).LJII.getValue();
        Aweme aweme = (Aweme) akS42S1300000_31.l2;
        String str = akS42S1300000_31.s0;
        abstractC1361510lXB.getClass();
        abstractC1361510lXB.LJFF(new C1869650ykl(c161r, 0), aweme, str);
        boolean zContains = C161C.LIZ.contains(((C207099162f) akS42S1300000_31.l1).LJ);
        C162U c162u = (C162U) akS42S1300000_31.l3;
        if (c162u != null) {
            Boolean boolValueOf = null;
            EnumC207100162g enumC207100162gLIZLLL = ((C207099162f) akS42S1300000_31.l1).LIZLLL(null);
            if (zContains) {
                strValueOf = String.valueOf(C161C.LIZIZ((Aweme) akS42S1300000_31.l2));
                strLIZ = C161C.LIZ((Aweme) akS42S1300000_31.l2);
            } else {
                strValueOf = null;
                strLIZ = null;
            }
            if (c161r instanceof InterfaceC207105162l) {
                boolValueOf = Boolean.valueOf(((C164F) c161r).LIZIZ());
            }
            c162u.LIZIZ(enumC207100162gLIZLLL, true, false, null, null, null, null, null, null, null, strValueOf, strLIZ, boolValueOf, null);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS42S1300000_31(Object obj, C207099162f<C161R> c207099162f, Aweme aweme, String str, C162U c162u) {
        this.$t = c162u;
        this.l1 = obj;
        this.l2 = c207099162f;
        this.s0 = aweme;
        this.l3 = str;
    }
}
