package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356300lOm implements InterfaceC1047320dMQ {
    public final JSONObject LIZ;

    @Override // X.InterfaceC1047320dMQ
    public final String getName() {
        return "comment_resize";
    }

    @Override // X.InterfaceC1047320dMQ
    public final /* bridge */ /* synthetic */ Object getParams() {
        return this.LIZ;
    }

    public C1356300lOm(int i, int i2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("comment_width_px", i);
        jSONObject.put("comment_height_px", i2);
        this.LIZ = jSONObject;
    }
}
