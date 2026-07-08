package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: X.0pzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533050pzr implements InterfaceC1532650pzD {
    public final /* synthetic */ WebResourceResponse LIZ;
    public final /* synthetic */ EnumC1535440q3i LIZIZ;

    @Override // X.InterfaceC1532650pzD
    public final String LIZ() {
        String reasonPhrase = this.LIZ.getReasonPhrase();
        return reasonPhrase == null ? "" : reasonPhrase;
    }

    @Override // X.InterfaceC1532650pzD
    public final String LIZIZ() {
        return this.LIZ.getEncoding();
    }

    @Override // X.InterfaceC1532650pzD
    public final InputStream getData() {
        return this.LIZ.getData();
    }

    @Override // X.InterfaceC1532650pzD
    public final Map<String, String> getHeaders() {
        return this.LIZ.getResponseHeaders();
    }

    @Override // X.InterfaceC1532650pzD
    public final String getMimeType() {
        return this.LIZ.getMimeType();
    }

    @Override // X.InterfaceC1532650pzD
    public final int getStatusCode() {
        return this.LIZ.getStatusCode();
    }

    @Override // X.InterfaceC1532650pzD
    public final EnumC1535440q3i LIZJ() {
        return this.LIZIZ;
    }

    public C1533050pzr(WebResourceResponse webResourceResponse, EnumC1535440q3i enumC1535440q3i) {
        this.LIZ = webResourceResponse;
        this.LIZIZ = enumC1535440q3i;
    }
}
