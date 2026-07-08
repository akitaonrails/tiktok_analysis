package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210231Bev implements InterfaceC844070X9h {
    public final /* synthetic */ C2209911BeP LIZ;

    public final JSONObject LIZ() {
        JSONObject header = this.LIZ.LLILLL.getHeader();
        if (this.LIZ.LLILLL.LJIILLIIL != null) {
            C2210791Bfp.LIZ(header);
        }
        try {
            return new JSONObject(header, new String[]{"carrier_region", "region", "app_region"});
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C2210231Bev(C2209911BeP c2209911BeP) {
        this.LIZ = c2209911BeP;
    }
}
