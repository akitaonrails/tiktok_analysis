package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890810zIt implements InterfaceC658750Psf {
    public final InterfaceC658750Psf LL;

    public C1890810zIt(InterfaceC658750Psf interfaceC658750Psf) {
        this.LL = interfaceC658750Psf;
    }

    @Override // X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        InterfaceC658750Psf interfaceC658750Psf = this.LL;
        if (interfaceC658750Psf != null) {
            interfaceC658750Psf.Ck(jSONObject);
        }
        if (!C1890800zIs.LIZIZ) {
            return;
        }
        C1890800zIs.LIZIZ(jSONObject.optLong("duration"), jSONObject.optString("uri"), jSONObject.optString("scene_tag"));
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        InterfaceC658750Psf interfaceC658750Psf = this.LL;
        if (interfaceC658750Psf != null) {
            interfaceC658750Psf.onImageLoaded(z, str, jSONObject);
        }
    }
}
