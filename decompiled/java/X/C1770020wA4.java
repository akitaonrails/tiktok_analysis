package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.fps.EComFpsScrollMonitorModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Random;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0wA4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770020wA4 extends AbstractC1585810rMx {
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(361));
    public int LLILLJJLI;

    public final void LJJIJIIJIL() throws InterruptedException {
        EComFpsScrollMonitorModel eComFpsScrollMonitorModelLIZIZ = C1770030wA5.LIZIZ();
        long frame = eComFpsScrollMonitorModelLIZIZ.getFrame() > 0 ? (((long) eComFpsScrollMonitorModelLIZIZ.getFrame()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 60) : eComFpsScrollMonitorModelLIZIZ.getMs();
        if (frame <= 0 || eComFpsScrollMonitorModelLIZIZ.getRandom() <= 0 || ((Random) this.LL.getValue()).nextInt(100) >= eComFpsScrollMonitorModelLIZIZ.getRandom()) {
            return;
        }
        this.LLILLJJLI++;
        Thread.sleep(frame);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) throws InterruptedException {
        if (i == 1) {
            this.LLILLJJLI = 0;
        }
        int type = C1770030wA5.LIZIZ().getType();
        if (type != 1) {
            if (type != 3 || i != 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        LJJIJIIJIL();
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) throws InterruptedException {
        if (C1770030wA5.LIZIZ().getType() == 2) {
            LJJIJIIJIL();
        } else {
            if (C1770030wA5.LIZIZ().getType() != 4 || this.LLILLJJLI != 0) {
                return;
            }
            LJJIJIIJIL();
        }
    }
}
