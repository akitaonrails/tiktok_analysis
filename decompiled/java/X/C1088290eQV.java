package X;

import java.util.List;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088290eQV extends AbstractC1088350eQb<Integer> implements InterfaceC1088470eQn<Integer> {
    public C1088290eQV() {
        super(new AbstractC1084540eKS<Integer>() { // from class: X.0eJz
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088470eQn
    public final Integer LIZ() {
        List<Long> list = C472970Igh.LIZ;
        Integer numLJII = C472970Igh.LJII(null, false);
        return Integer.valueOf(numLJII != null ? numLJII.intValue() : ((Number) this.LL.LIZIZ).intValue());
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.roomFeature;
    }
}
