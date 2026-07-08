package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043320dFy {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public final String toString() {
        try {
            return C786410Ut5.J3(new JSONObject().putOpt("url", this.LIZ).putOpt("isblackResource", Integer.valueOf(this.LIZIZ ? 1 : 0)).putOpt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(this.LIZJ)));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return "";
        }
    }

    public /* synthetic */ C1043320dFy(String str, int i, int i2) {
        this(str, false, (i2 & 4) != 0 ? -1 : i);
    }

    public C1043320dFy(String str, boolean z, int i) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = i;
    }
}
