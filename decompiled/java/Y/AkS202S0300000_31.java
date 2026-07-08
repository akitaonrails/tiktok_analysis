package Y;

import X.AbstractC1361510lXB;
import X.AnonymousClass1636;
import X.C012V;
import X.C161C;
import X.C161N;
import X.C161R;
import X.C162S;
import X.C162U;
import X.C162Y;
import X.C162Z;
import X.C163A;
import X.C163S;
import X.C163W;
import X.C1869630ykj;
import X.C207099162f;
import X.C207132163m;
import X.EnumC207100162g;
import X.InterfaceC1389740mGi;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.translation.model.PerfMetric;
import com.ss.android.ugc.aweme.translation.model.PhotoTitleTranslationResult;
import com.ss.android.ugc.aweme.translation.model.StickerTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslatedSticker;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class AkS202S0300000_31 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS202S0300000_31 akS202S0300000_31, Object obj) {
        String strLIZ;
        boolean zContains = C161C.LIZ.contains(((C207099162f) akS202S0300000_31.l0).LJ);
        C162U c162u = (C162U) akS202S0300000_31.l2;
        if (c162u != null) {
            String strValueOf = null;
            EnumC207100162g enumC207100162gLIZLLL = ((C207099162f) akS202S0300000_31.l0).LIZLLL(null);
            if (zContains) {
                strValueOf = String.valueOf(C161C.LIZIZ((Aweme) akS202S0300000_31.l1));
                strLIZ = C161C.LIZ((Aweme) akS202S0300000_31.l1);
            } else {
                strLIZ = null;
            }
            c162u.LIZIZ(enumC207100162gLIZLLL, false, false, null, null, null, null, null, null, null, strValueOf, strLIZ, null, null);
        }
        return Boolean.FALSE;
    }

    public static final Object apply$1(AkS202S0300000_31 akS202S0300000_31, Object obj) {
        boolean z;
        String title;
        boolean z2;
        String str;
        Integer num;
        String str2;
        Integer num2;
        PhotoTitleTranslationResult photoTitleTranslationResult = (PhotoTitleTranslationResult) obj;
        PerfMetric perfMetric = photoTitleTranslationResult.perfMetrics;
        C163S[] c163sArrValues = C163S.values();
        int length = c163sArrValues.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (c163sArrValues[i].getStatusCode() == photoTitleTranslationResult.translationStatusCode) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        Integer num3 = null;
        if (z) {
            EnumC207100162g enumC207100162gLIZLLL = C162Y.LJ.LIZLLL(null);
            C162U c162u = (C162U) akS202S0300000_31.l0;
            C163W c163w = C163W.SERVER_ERROR;
            InterfaceC1389740mGi interfaceC1389740mGi = (InterfaceC1389740mGi) akS202S0300000_31.l1;
            if (perfMetric != null) {
                str2 = perfMetric.serverCacheType;
                num2 = perfMetric.serverTransTime;
                num3 = perfMetric.aiLabTransTime;
            } else {
                str2 = null;
                num2 = null;
            }
            C163A.LJIIJJI(enumC207100162gLIZLLL, c162u, "LEGACY_API_FAILED", c163w, interfaceC1389740mGi, str2, num2, num3, photoTitleTranslationResult.variant);
        } else {
            C162Y c162y = C162Y.LJ;
            c162y.getClass();
            C162Z c162z = (C162Z) C162Y.LJI.getValue();
            Aweme aweme = (Aweme) akS202S0300000_31.l2;
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            String str3 = "";
            if (photoModeImageInfo == null || (title = photoModeImageInfo.getTitle()) == null) {
                title = "";
            }
            String str4 = photoTitleTranslationResult.translatedContent;
            if (str4 != null) {
                str3 = str4;
            }
            String strLLIIZ = C161N.LIZIZ.LLIIZ();
            if (((InterfaceC1389740mGi) akS202S0300000_31.l1) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1869630ykj c1869630ykjLJII = c162z.LJII(aweme, title, str3, strLLIIZ, photoTitleTranslationResult.variant, z2);
            EnumC207100162g enumC207100162gLIZLLL2 = c162y.LIZLLL(null);
            C162U c162u2 = (C162U) akS202S0300000_31.l0;
            Integer numC5 = c1869630ykjLJII.c5();
            InterfaceC1389740mGi interfaceC1389740mGi2 = (InterfaceC1389740mGi) akS202S0300000_31.l1;
            if (perfMetric != null) {
                str = perfMetric.serverCacheType;
                num = perfMetric.serverTransTime;
                num3 = perfMetric.aiLabTransTime;
            } else {
                str = null;
                num = null;
            }
            C163A.LJIILIIL(c162y, enumC207100162gLIZLLL2, c162u2, numC5, false, interfaceC1389740mGi2, str, num, num3, photoTitleTranslationResult.variant, 24);
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    public static final Object apply$2(AkS202S0300000_31 akS202S0300000_31, Object obj) {
        HashMap map;
        String str;
        Integer num;
        boolean z;
        String str2;
        Integer num2;
        StickerTranslationResult stickerTranslationResult = (StickerTranslationResult) obj;
        PerfMetric perfMetric = stickerTranslationResult.perfMetrics;
        List<TranslatedSticker> list = stickerTranslationResult.translatedStickers;
        Integer num3 = null;
        if (list == null) {
            map = null;
        } else {
            map = new HashMap();
            for (TranslatedSticker translatedSticker : list) {
                map.put(translatedSticker.srcContent, translatedSticker.translatedContent);
            }
        }
        boolean z2 = false;
        if (map != null && !map.isEmpty()) {
            C162S c162s = C162S.LJ;
            c162s.getClass();
            AbstractC1361510lXB abstractC1361510lXB = (AbstractC1361510lXB) C162S.LJFF.getValue();
            Aweme aweme = (Aweme) akS202S0300000_31.l0;
            String strLLIIZ = C161N.LIZIZ.LLIIZ();
            if (((InterfaceC1389740mGi) akS202S0300000_31.l1) != null) {
                z = true;
            } else {
                z = false;
            }
            String str3 = stickerTranslationResult.variant;
            abstractC1361510lXB.getClass();
            C012V c012v = new C012V(strLLIIZ, str3, map, z);
            abstractC1361510lXB.LJFF(c012v, aweme, strLLIIZ);
            EnumC207100162g enumC207100162gLIZLLL = c162s.LIZLLL(null);
            C162U c162u = (C162U) akS202S0300000_31.l2;
            Integer num4 = c012v.LJ;
            InterfaceC1389740mGi interfaceC1389740mGi = (InterfaceC1389740mGi) akS202S0300000_31.l1;
            if (perfMetric != null) {
                str2 = perfMetric.serverCacheType;
                num2 = perfMetric.serverTransTime;
                num3 = perfMetric.aiLabTransTime;
            } else {
                str2 = null;
                num2 = null;
            }
            C163A.LJIILIIL(c162s, enumC207100162gLIZLLL, c162u, num4, false, interfaceC1389740mGi, str2, num2, num3, stickerTranslationResult.variant, 24);
        } else {
            EnumC207100162g enumC207100162gLIZLLL2 = C162S.LJ.LIZLLL(null);
            C162U c162u2 = (C162U) akS202S0300000_31.l2;
            C163W c163w = C163W.CLIENT_ERROR;
            InterfaceC1389740mGi interfaceC1389740mGi2 = (InterfaceC1389740mGi) akS202S0300000_31.l1;
            if (perfMetric != null) {
                str = perfMetric.serverCacheType;
                num = perfMetric.serverTransTime;
                num3 = perfMetric.aiLabTransTime;
            } else {
                str = null;
                num = null;
            }
            C163A.LJIIJJI(enumC207100162gLIZLLL2, c162u2, "TEXT_STICKER_EMPTY_RESULT", c163w, interfaceC1389740mGi2, str, num, num3, stickerTranslationResult.variant);
        }
        if (map == null || map.isEmpty()) {
            z2 = true;
        }
        return Boolean.valueOf(!z2);
    }

    public static final Object apply$3(AkS202S0300000_31 akS202S0300000_31, Object obj) {
        return new C207132163m(((AnonymousClass1636) akS202S0300000_31.l0).LIZJ(), ((Boolean) obj).booleanValue(), ((List) akS202S0300000_31.l1).size(), (EnumMap) akS202S0300000_31.l2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AkS202S0300000_31(com.ss.android.ugc.aweme.feed.model.Aweme r2, X.InterfaceC1389740mGi r3, X.C162U r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS202S0300000_31.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, X.0mGi, X.162U, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS202S0300000_31(Object obj, C207099162f<C161R> c207099162f, Aweme aweme, C162U c162u) {
        this.$t = c162u;
        this.l0 = obj;
        this.l1 = c207099162f;
        this.l2 = aweme;
    }
}
