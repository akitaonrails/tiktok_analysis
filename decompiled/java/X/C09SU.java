package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.09SU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09SU {
    public static final InterfaceC2661011f LIZ = C09S2.LIZ(C0CQT.LIZJ);

    public static RateSettingsResponse LIZ() {
        int errorCode;
        try {
            return ((C09SV) LIZ.create(C09SV.class)).LIZ().get();
        } catch (IncompatibleClassChangeError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if ((e2.getCause() instanceof C0XIR) && ((errorCode = ((C23112093u) e2.getCause()).getErrorCode()) == 9 || errorCode == 14)) {
                return null;
            }
            throw AbstractC2126608Uu.getCompatibleException(e2);
        }
    }
}
