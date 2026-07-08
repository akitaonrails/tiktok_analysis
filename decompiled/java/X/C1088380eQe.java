package X;

import java.util.List;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088380eQe extends AbstractC1088350eQb<Integer> implements InterfaceC1088470eQn<Integer> {
    public C1088380eQe() {
        super(new AbstractC1084540eKS<Integer>() { // from class: X.0eQf
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088470eQn
    public final Integer LIZ() {
        List<Long> list = C472970Igh.LIZ;
        Integer numLIZLLL = C472970Igh.LIZLLL(null, false);
        return Integer.valueOf(numLIZLLL != null ? numLIZLLL.intValue() : ((Number) this.LL.LIZIZ).intValue());
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.performance;
    }
}
