package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.ss.android.ugc.tiktok.location_api.service.experiment.FypLocationPopUpCertCheckOpt;
import kotlin.jvm.internal.AwS57S1300000_18;

/* JADX INFO: renamed from: X.0hWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1207590hWv {
    public static void LIZJ(int i) {
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 105:
                C1207400hWc c1207400hWc = C1207400hWc.LIZ;
                String token = C1207610hWx.LIZ().getToken();
                String strValueOf = String.valueOf(i);
                c1207400hWc.getClass();
                C1207400hWc.LJII(0, "homepage_hot", token, "location_sdk_reject", strValueOf);
                break;
            case 104:
            default:
                C1207400hWc c1207400hWc2 = C1207400hWc.LIZ;
                String token2 = C1207610hWx.LIZ().getToken();
                c1207400hWc2.getClass();
                C1207400hWc.LJII(1, "homepage_hot", token2, null, null);
                break;
        }
    }

    public static final boolean LIZ(C19EG c19eg, TokenCert tokenCert) {
        EnumC1205470hTV enumC1205470hTVLIZ;
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            if (iLocationServiceForLS != null) {
                enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(c19eg, tokenCert, "homepage_hot");
            } else {
                enumC1205470hTVLIZ = null;
            }
            if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                return false;
            }
            return true;
        }
        C1197760hH4.LIZ.getClass();
        if (C1197760hH4.LIZ()) {
            C1207340hWW.LIZ.getClass();
            boolean zLJIIIZ = C1207340hWW.LJIIIZ(tokenCert);
            if (zLJIIIZ) {
                return zLJIIIZ;
            }
            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
            String token = tokenCert.getToken();
            c1207400hWc.getClass();
            C1207400hWc.LJII(0, "homepage_hot", token, "cert_error", null);
            return zLJIIIZ;
        }
        return true;
    }

    public final void LIZLLL(String str, boolean z, InterfaceC20660615sy interfaceC20660615sy, C19EG c19eg, C1207520hWo c1207520hWo) {
        boolean z2;
        boolean z3;
        if (z || interfaceC20660615sy == null || C1207450hWh.LIZ.LJII(0, c19eg)) {
            return;
        }
        C1207680hX4 c1207680hX4 = C1207680hX4.LIZ;
        c1207680hX4.getClass();
        long j = C1207680hX4.LIZ().firstHitExpWaitingThreshold;
        if (j > 0) {
            C20489080x.LIZ.getClass();
            long jLIZ = C20489080x.LIZ();
            if (jLIZ < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (System.currentTimeMillis() - jLIZ < j) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 || z3) {
                C20489080x.LJIIIIZZ();
                return;
            }
        }
        c1207680hX4.getClass();
        if (C1207680hX4.LIZ().waitingThreshold > 0) {
            C20489080x.LIZ.getClass();
            if (C20489080x.LIZIZ() < 0) {
                return;
            }
            if (C20489080x.LIZIZ() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - C20489080x.LIZIZ();
                c1207680hX4.getClass();
                if (jCurrentTimeMillis < C1207680hX4.LIZ().waitingThreshold) {
                    return;
                }
            }
        }
        TokenCert tokenCertLIZ = C1207610hWx.LIZ();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null && iLocationBaseServiceForMT.LJJ()) {
            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
            String token = tokenCertLIZ.getToken();
            c1207400hWc.getClass();
            C1207400hWc.LJIIIZ(token);
            if (FypLocationPopUpCertCheckOpt.INSTANCE.enable() && !LIZ(c19eg, tokenCertLIZ)) {
                return;
            }
            PopupManager.LJIJ(new C1207600hWw(interfaceC20660615sy, new AwS57S1300000_18(this, str, c19eg, c1207520hWo, 9)), "location", new C1668306g5("local_permission_gps_feed"));
        }
    }
}
