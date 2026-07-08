package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564170MAt {
    public final int LIZ = 1;
    public long LIZIZ;

    public final void LIZ() throws JSONException {
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LIZIZ) / ((long) this.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) jCurrentTimeMillis);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("pictureCount", Integer.valueOf(this.LIZ));
        c543670LTx.LIZ.put("business", ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() ? "lightening" : "main");
        C1637890six.LIZJ("aweme_photo_canvas_generate_duration", jSONObject, c543670LTx.LJ());
    }
}
