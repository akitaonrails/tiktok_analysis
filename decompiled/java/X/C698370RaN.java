package X;

import com.ss.android.ugc.aweme.outreach.signal.model.SignalTrackingModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698370RaN {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(355));
    public static final SignalTrackingModel LIZIZ;

    static {
        SignalTrackingModel signalTrackingModel = new SignalTrackingModel(new ArrayList(), false, false, false, 10);
        SignalTrackingModel signalTrackingModel2 = (SignalTrackingModel) C0C64.LJIILLIIL().LJJIIJ(true, "signal_tracking_config", 31744, SignalTrackingModel.class, signalTrackingModel, 2);
        if (signalTrackingModel2 != null) {
            signalTrackingModel = signalTrackingModel2;
        }
        LIZIZ = signalTrackingModel;
    }
}
