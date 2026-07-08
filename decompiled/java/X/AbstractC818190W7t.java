package X;

import Y.ARunnableS46S0300000_13;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC818190W7t {
    public abstract JSONObject LIZ();

    public abstract EnumC818210W7v LIZIZ();

    public final void LIZJ() {
        C818230W7x c818230W7x = NxRewordManager.LJI;
        if (c818230W7x == null) {
            c818230W7x = null;
        }
        c818230W7x.getClass();
        String.valueOf(LIZ());
        C0W82 c0w82 = c818230W7x.LIZ;
        if (c0w82 != null) {
            c818230W7x.LIZIZ.execute(new ARunnableS46S0300000_13(this, c818230W7x, c0w82, 20));
        }
    }
}
