package X;

import java.util.List;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088440eQk extends AbstractC1088350eQb<String> implements InterfaceC1088470eQn<String> {
    public C1088440eQk() {
        super(new AbstractC1084540eKS<String>() { // from class: X.0eQm
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    @Override // X.InterfaceC1088470eQn
    public final String LIZ() {
        String str;
        List<Long> list = C472970Igh.LIZ;
        return (!C472970Igh.LJIIJ("live_session_id", false) || (str = C0IL2.LIZ.LJ) == null) ? this.LL.LIZIZ : str;
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.baseInfo;
    }
}
