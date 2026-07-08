package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.ucp.AcShopData;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.AcShopDataDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.AcShopDetailDto;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332700D2m {
    public static final C332700D2m LIZ = new C332700D2m();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("spu_id", "spuid");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("external_product_id", "product_id", "productid", "shopify_upid");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("shop_domain", "shopdomain");
    public static final List<String> LJ = Collections.singletonList("pid");
    public static final List<String> LJFF = C1697810uHb.LJIIJJI("product_platform_id", "productPlatformId");
    public static final List<String> LJI = C1697810uHb.LJIIJJI("protocol_type", "protocolType");

    public static AcShopDataDto LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AcShopData acShopData;
        Object c098200Yq;
        Object objFromJson;
        Object obj = null;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (acShopData = awemeRawAd.getAcShopData()) == null) {
            return null;
        }
        try {
            String strLIZLLL = C051K.LIZLLL(false, false, false, acShopData);
            if (strLIZLLL != null && strLIZLLL.length() != 0) {
                objFromJson = GsonProtectorUtils.fromJson(C051K.LIZJ(), strLIZLLL, (Class<Object>) AcShopDataDto.class);
            } else {
                objFromJson = null;
            }
            c098200Yq = (AcShopDataDto) objFromJson;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (AcShopDataDto) obj;
    }

    public static Integer LJFF(String str) {
        String lowerCase;
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "";
        }
        if (a0.LJJJIL(lowerCase)) {
            return null;
        }
        if (!u.LJJIIJZLJL(lowerCase, "aweme://acshop/acppdp", false) && !a0.LJJIIZI(lowerCase, "//acshop/acppdp", false)) {
            return null;
        }
        return 1;
    }

    public static String LJIIIIZZ(String str) {
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return C13LQ.LJJIJIL(MessageDigest.getInstance("SHA-256").digest(string.getBytes(Charsets.UTF_8)), "", AFwS231S0000000_3.get$arr$(7));
    }

    public static String LIZJ(Bundle bundle, String str) {
        Object obj;
        try {
            obj = bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            return String.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return String.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return String.valueOf((int) ((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return String.valueOf((int) ((Number) obj).doubleValue());
        }
        return obj.toString();
    }

    public static String LIZLLL(Bundle bundle, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String string = bundle.getString((String) it2.next());
            if (string != null && string.length() != 0) {
                return string;
            }
        }
        return null;
    }

    public static AcShopDetailDto LJ(Aweme aweme, String str) {
        Map<String, AcShopDetailDto> map;
        Object objLJJJLIIL;
        Object objFromJson;
        AcShopDataDto acShopDataDtoLIZ = LIZ(aweme);
        if (acShopDataDtoLIZ != null && (map = acShopDataDtoLIZ.products) != null) {
            if (map.containsKey(str)) {
                objLJJJLIIL = map.get(str);
            } else {
                objLJJJLIIL = C13LP.LJJJLIIL(map.values());
            }
            try {
                String strLIZLLL = C051K.LIZLLL(false, false, false, objLJJJLIIL);
                if (strLIZLLL != null && strLIZLLL.length() != 0) {
                    objFromJson = GsonProtectorUtils.fromJson(C051K.LIZJ(), strLIZLLL, (Class<Object>) AcShopDetailDto.class);
                } else {
                    objFromJson = null;
                }
                return (AcShopDetailDto) objFromJson;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r1, java.lang.String r2, java.lang.String r3) {
        /*
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.AcShopDetailDto r2 = LJ(r1, r2)
            r1 = 0
            if (r2 != 0) goto L8
            return r1
        L8:
            int r0 = r3.hashCode()
            switch(r0) {
                case -2103918028: goto L10;
                case -1678358350: goto L1b;
                case -1431212400: goto L26;
                case -57860416: goto L31;
                case 34106052: goto L3c;
                case 161056242: goto L47;
                case 460274320: goto L50;
                case 707795073: goto L5b;
                case 756285279: goto L6d;
                case 1025150231: goto L78;
                case 2074267299: goto L83;
                default: goto Lf;
            }
        Lf:
            return r1
        L10:
            java.lang.String r0 = "shop_name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.shopName
            return r1
        L1b:
            java.lang.String r0 = "spu_name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.spuName
            return r1
        L26:
            java.lang.String r0 = "external_shop_logo_url"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.shopLogoUrl
            return r1
        L31:
            java.lang.String r0 = "external_shop_name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.shopifyShopName
            return r1
        L3c:
            java.lang.String r0 = "spu_image_url"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.spuImageUrl
            return r1
        L47:
            java.lang.String r0 = "protocolType"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L64
            return r1
        L50:
            java.lang.String r0 = "external_shop_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.externalShopId
            return r1
        L5b:
            java.lang.String r0 = "protocol_type"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L64
            return r1
        L64:
            java.lang.Integer r0 = r2.protocolType
            if (r0 == 0) goto Lf
            java.lang.String r1 = r0.toString()
            return r1
        L6d:
            java.lang.String r0 = "external_product_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.productId
            return r1
        L78:
            java.lang.String r0 = "product_platform_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.productPlatformId
            return r1
        L83:
            java.lang.String r0 = "stripe_profile_id"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r2.stripeProfileId
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332700D2m.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x0101. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0196 A[PHI: r13
      0x0196: PHI (r13v15 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData) = 
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v3 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
      (r13v16 com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData)
     binds: [B:498:0x0732, B:500:0x0738, B:502:0x073e, B:504:0x0744, B:506:0x0748, B:508:0x0750, B:510:0x0756, B:512:0x0760, B:121:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029a A[PHI: r4
      0x029a: PHI (r4v9 java.lang.String) = (r4v8 java.lang.String), (r4v94 java.lang.String) binds: [B:187:0x0290, B:190:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x040b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0532 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C332730D2p LJI(X.C19EG r49, android.os.Bundle r50, com.ss.android.ugc.aweme.feed.model.Aweme r51) {
        /*
            Method dump skipped, instruction units count: 2214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332700D2m.LJI(X.19EG, android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme):X.0D2p");
    }

    public static String LJII(PdpSupplementData pdpSupplementData, Aweme aweme, String str, int i) {
        String strLIZIZ;
        AwemeRawAd awemeRawAd;
        AcShopData acShopData;
        if (i != 1) {
            return null;
        }
        if (((pdpSupplementData == null || (strLIZIZ = pdpSupplementData.sellerProfileId) == null) && ((aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (acShopData = awemeRawAd.getAcShopData()) == null || (strLIZIZ = acShopData.stripeProfileId) == null) && (strLIZIZ = LIZIZ(aweme, str, "stripe_profile_id")) == null)) || !(!a0.LJJJIL(strLIZIZ))) {
            return null;
        }
        return strLIZIZ;
    }
}
