package X;

import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DCS, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCS<I> implements InterfaceC2251961DCg {
    public static final C1DCS<I> LIZ = new C1DCS<>();

    @Override // X.InterfaceC2251961DCg
    public final void LIZIZ(C204535151p c204535151p) {
        C2183911AdZ c2183911AdZ;
        InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
        if ((interfaceC582850MtX instanceof C2183911AdZ) && (c2183911AdZ = (C2183911AdZ) interfaceC582850MtX) != null) {
            SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
            sessionFeatureItem.vv++;
            sessionFeatureItem.awemeType = 101;
            sessionFeatureItem.isEcom = Boolean.valueOf(c2183911AdZ.LIZLLL);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttkec_live_fyp_log_id_switch", true, false) && Intrinsics.LJFF(sessionFeatureItem.isEcom, Boolean.TRUE)) {
                sessionFeatureItem.logId = c2183911AdZ.LIZIZ.getRequestId();
            }
        }
    }
}
