package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532610pz9 implements InterfaceC1532650pzD {
    public final /* synthetic */ WebResourceResponse LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ EnumC1535440q3i LIZJ;

    @Override // X.InterfaceC1532650pzD
    public final String LIZ() {
        return this.LIZ.getReasonPhrase();
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
        return C2097608Jq.LJIIL(this.LIZ.getResponseHeaders(), C2097908Jt.LIZJ(new Pair("pia_forest_from", this.LIZIZ)));
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
        return this.LIZJ;
    }

    public C1532610pz9(WebResourceResponse webResourceResponse, EnumC1535440q3i enumC1535440q3i, String str) {
        this.LIZ = webResourceResponse;
        this.LIZIZ = str;
        this.LIZJ = enumC1535440q3i;
    }
}
