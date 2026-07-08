package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import kotlin.jvm.internal.AwS23S1400000_18;

/* JADX INFO: renamed from: X.0hWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1207540hWq {
    public boolean LIZ;

    public static void LIZ(int i, TokenCert tokenCert) {
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 105:
                C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                String token = tokenCert.getToken();
                String strValueOf = String.valueOf(i);
                c1207400hWc.getClass();
                C1207400hWc.LJII(0, "homepage_hot", token, "location_sdk_reject", strValueOf);
                break;
            case 104:
            default:
                C1207400hWc c1207400hWc2 = C1207400hWc.LIZ;
                String token2 = tokenCert.getToken();
                c1207400hWc2.getClass();
                C1207400hWc.LJII(1, "homepage_hot", token2, null, null);
                break;
        }
    }

    public final void LIZJ(String str, boolean z, InterfaceC20660615sy interfaceC20660615sy, C19EG c19eg, C1207520hWo c1207520hWo, TokenCert tokenCert) {
        ILocationBaseServiceForMT iLocationBaseServiceForMT;
        EnumC1205470hTV enumC1205470hTVLIZ;
        if (z || interfaceC20660615sy == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("have permission ? ");
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        sbLIZ.append(c1207450hWh.LJII(0, c19eg));
        C2188811AlT.LIZIZ(sbLIZ);
        if (!c1207450hWh.LJII(0, c19eg) && (iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null)) != null && iLocationBaseServiceForMT.LJJ()) {
            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
            String token = tokenCert.getToken();
            c1207400hWc.getClass();
            C1207400hWc.LJIIIZ(token);
            if (C300190Bph.LIZ()) {
                ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                if (iLocationServiceForLS != null) {
                    enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(c19eg, tokenCert, "homepage_hot");
                } else {
                    enumC1205470hTVLIZ = null;
                }
                if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                    return;
                }
            } else {
                C1197760hH4.LIZ.getClass();
                if (C1197760hH4.LIZ()) {
                    C1207340hWW.LIZ.getClass();
                    if (!C1207340hWW.LJIIIZ(tokenCert)) {
                        String token2 = tokenCert.getToken();
                        c1207400hWc.getClass();
                        C1207400hWc.LJII(0, "homepage_hot", token2, "cert_error", null);
                        return;
                    }
                }
            }
            PopupManager.LJIJ(new C1207600hWw(interfaceC20660615sy, new AwS23S1400000_18(this, str, c19eg, c1207520hWo, tokenCert, 3)), "location", new C1668306g5("local_permission_gps_feed"));
        }
    }
}
