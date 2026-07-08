package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJ4 implements InterfaceC658750Psf {
    public boolean LL;
    public String LLILLJJLI;
    public long LLILLL = -1;

    @Override // X.InterfaceC658750Psf
    public final /* synthetic */ void Ck(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        long jOptLong;
        String strOptString;
        if (str != null && str.length() != 0) {
            this.LL = true;
        }
        if (jSONObject != null) {
            jOptLong = jSONObject.optLong("file_size");
        } else {
            jOptLong = -1;
        }
        this.LLILLL = jOptLong;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("hit_cdn_cache");
        } else {
            strOptString = null;
        }
        this.LLILLJJLI = strOptString;
    }
}
