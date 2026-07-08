package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.IPushLancetService;

/* JADX INFO: renamed from: X.04bE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1128604bE {
    public static String LIZ(String str) {
        IPushLancetService iPushLancetService = (IPushLancetService) PluggableExtentionKt.pluggableSpiForReal(IPushLancetService.class);
        if (iPushLancetService != null) {
            str = iPushLancetService.i(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
