package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599470NfF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC600280NgY enumC600280NgY) {
        try {
            C1421105hJ.LIZLLL("rd_tiktokec_fcp_step_event", new Pair("step", enumC600280NgY.name().toLowerCase(Locale.ROOT)));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
