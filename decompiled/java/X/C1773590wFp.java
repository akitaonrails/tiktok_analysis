package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackDataDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventGroup;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773590wFp implements InterfaceC1774910wHx {
    public final Map<String, Object> LIZ = C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("rd_mix_page", 1), new Pair("mall_event_version", 3540));
    public final List<String> LIZIZ = C1768020w6q.LIZ;
    public final List<String> LIZJ = C1768020w6q.LIZIZ;
    public final C13BV LIZLLL = C13BV.INSTANCE;

    @Override // X.InterfaceC1774910wHx
    public final Map<String, Object> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1774910wHx
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1774910wHx
    public final List<String> LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1774910wHx
    public final C13BV LJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1774910wHx
    public final Map<String, ECMixMallTrackEventGroup> LIZIZ(C1775190wIP c1775190wIP) {
        ECMixMallTrackDataDTO eCMixMallTrackDataDTO = c1775190wIP.LIZ;
        if (eCMixMallTrackDataDTO != null) {
            return eCMixMallTrackDataDTO.appLog;
        }
        return null;
    }

    @Override // X.InterfaceC1774910wHx
    public final Map<String, Object> LIZJ(C1774840wHq c1774840wHq) {
        return c1774840wHq.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    @Override // X.InterfaceC1774910wHx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.InterfaceC1773310wFN r15, java.lang.String r16, java.util.Map<java.lang.String, ? extends java.lang.Object> r17, com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventParams r18, X.C1774840wHq r19) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773590wFp.LJ(X.0wFN, java.lang.String, java.util.Map, com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventParams, X.0wHq):void");
    }
}
