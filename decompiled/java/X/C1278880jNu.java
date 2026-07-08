package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS17S0200100_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.pusher.core.params.PushBase;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1278880jNu {
    public final C1278910jNx LIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final ARunnableS120S0100000_20 LIZIZ = new ARunnableS120S0100000_20(this, 469);
    public int LJ = -1;
    public int LJFF = 0;
    public long LJI = -1;
    public boolean LJII = true;

    public final void LIZ() {
        C1278740jNg c1278740jNg;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LJI;
        int i = this.LJ;
        boolean z = true;
        if (i != 200 && (this.LJFF != 1 || j >= this.LIZLLL * LSPassThroughRecordSizeConfig.DEFAULT || i != -1)) {
            z = false;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("success", z).put("error_code", i).put("is_cancelled_manually", this.LJFF).put("upload_interval_mill_second", j).put("report_time_mill_second", this.LIZJ * LSPassThroughRecordSizeConfig.DEFAULT).put("report_threshold_mill_second", this.LIZLLL * LSPassThroughRecordSizeConfig.DEFAULT);
            WeakReference<C1278740jNg> weakReference = this.LIZ.LJI;
            if (weakReference == null || (c1278740jNg = weakReference.get()) == null) {
                return;
            }
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS17S0200100_20(jCurrentTimeMillis, c1278740jNg, jSONObjectPut, 0));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1278880jNu(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LIZJ = 10;
        this.LIZLLL = 5;
        this.LIZ = c1278910jNx;
        PushBase pushBase = c1277590jLp.LJI.mPushBase;
        int i = pushBase.LJJJJJL;
        if (i > 0) {
            this.LIZJ = i;
        }
        int i2 = pushBase.LJJJJL;
        if (i2 >= 0) {
            this.LIZLLL = i2;
        }
    }
}
