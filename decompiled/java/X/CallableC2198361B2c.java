package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1B2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class CallableC2198361B2c extends AbstractC2198351B2b implements Callable<C1B2U> {
    @Override // java.util.concurrent.Callable
    public final C1B2U call() {
        C1B2U c1b2u;
        C1C7U.LIZ("CheckUrlSecManager$CheckUrlCallable@3276.call");
        try {
            URL urlLIZJ = AbstractC2198351B2b.LIZJ(false);
            if (C2198391B2f.LJFF == null) {
                C2198391B2f.LJFF = new C2192908iV();
            }
            String strLIZ = C2198391B2f.LJFF.LIZ(urlLIZJ.toString(), LIZIZ(false));
            if (TextUtils.isEmpty(strLIZ)) {
                c1b2u = new C1B2U();
            } else {
                try {
                    c1b2u = AbstractC2198351B2b.LJFF(strLIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1b2u = new C1B2U();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("source:  ");
                    sbLIZ.append(strLIZ);
                    sbLIZ.append("  case : ");
                    sbLIZ.append(e.getMessage());
                    AbstractC2198351B2b.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            c1b2u = new C1B2U();
            AbstractC2198351B2b.LIZLLL(e2.getMessage());
        }
        C1C7U.LIZIZ("CheckUrlSecManager$CheckUrlCallable@3276.call");
        return c1b2u;
    }

    public CallableC2198361B2c(C2198401B2g c2198401B2g) {
        super(c2198401B2g);
    }
}
