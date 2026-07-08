package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0cQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011700cQy {
    public static void LIZ(InterfaceC1011690cQx interfaceC1011690cQx, C622570ObP c622570ObP) {
        String awemeRawAdIdStr;
        if (interfaceC1011690cQx.LJIJJLI()) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(c622570ObP.LJIIIZ, ",", null, null, 0, null, null, 62);
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(c622570ObP.LJIIJ, ",", null, null, 0, null, null, 62);
            String strLJJLIIIJ3 = C13LP.LJJLIIIJ(c622570ObP.LJIIJJI, ",", null, null, 0, null, null, 62);
            String strLJJLIIIJ4 = C13LP.LJJLIIIJ(c622570ObP.LJIIL, ",", null, null, 0, null, null, 62);
            if (C625790Ogb.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("calculateBrandSafetyDiff cid= ");
                Aweme aweme = c622570ObP.LIZIZ;
                if (aweme != null) {
                    awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme);
                } else {
                    awemeRawAdIdStr = null;
                }
                sbLIZ.append(awemeRawAdIdStr);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) PluggableExtentionKt.pluggableSpi$default(ISearchAdEventLogger.class, false, false, false, 14, null);
            if (interfaceC1009950cO9 != null) {
                interfaceC1009950cO9.logAd(C1011890cRH.LIZ, new C1011880cRG(c622570ObP, strLJJLIIIJ, strLJJLIIIJ2, strLJJLIIIJ3, strLJJLIIIJ4));
            }
        }
        interfaceC1011690cQx.LJIIIZ(false);
    }
}
