package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333980kom implements InterfaceC658750Psf {
    public final InterfaceC658750Psf LL;
    public final InterfaceC658750Psf LLILLJJLI;

    @Override // X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        InterfaceC658750Psf interfaceC658750Psf = this.LL;
        if (interfaceC658750Psf != null) {
            interfaceC658750Psf.Ck(jSONObject);
        }
        this.LLILLJJLI.Ck(jSONObject);
    }

    public C1333980kom(InterfaceC658750Psf interfaceC658750Psf, InterfaceC658750Psf interfaceC658750Psf2) {
        this.LL = interfaceC658750Psf;
        this.LLILLJJLI = interfaceC658750Psf2;
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        InterfaceC658750Psf interfaceC658750Psf = this.LL;
        if (interfaceC658750Psf != null) {
            interfaceC658750Psf.onImageLoaded(z, str, jSONObject);
        }
        this.LLILLJJLI.onImageLoaded(z, str, jSONObject);
    }
}
