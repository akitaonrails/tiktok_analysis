package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.Locale;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332670D2j {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(String str) {
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

    public static int LIZLLL(UcpRecommendationItem ucpRecommendationItem, PdpSupplementData pdpSupplementData) {
        Integer numLIZ;
        Integer num;
        PdpSupplementData pdpSupplementData2 = ucpRecommendationItem.pdpSupplementData;
        if (pdpSupplementData2 != null && (num = pdpSupplementData2.protocolType) != null) {
            return num.intValue();
        }
        String str = null;
        if ((pdpSupplementData != null && (numLIZ = pdpSupplementData.protocolType) != null) || (numLIZ = LIZ(ucpRecommendationItem.url)) != null) {
            return numLIZ.intValue();
        }
        if (pdpSupplementData != null) {
            str = pdpSupplementData.url;
        }
        Integer numLIZ2 = LIZ(str);
        if (numLIZ2 != null) {
            return numLIZ2.intValue();
        }
        return ucpRecommendationItem.getProtocolType();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e1 A[LOOP:1: B:95:0x02db->B:97:0x02e1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r48, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r49, java.lang.String r50, java.util.Map r51, X.C332710D2n r52, java.lang.String r53) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332670D2j.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, java.lang.String, java.util.Map, X.0D2n, java.lang.String):void");
    }
}
