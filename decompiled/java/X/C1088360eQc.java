package X;

import java.util.List;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088360eQc extends AbstractC1088350eQb<Boolean> implements InterfaceC1088470eQn<Boolean> {
    public C1088360eQc() {
        super(new AbstractC1084540eKS<Boolean>() { // from class: X.0eQd
            {
                Boolean bool = Boolean.FALSE;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088470eQn
    public final Boolean LIZ() {
        List<Long> list = C472970Igh.LIZ;
        Boolean boolLIZIZ = C472970Igh.LIZIZ(null, false);
        if (boolLIZIZ == null) {
            boolLIZIZ = (Boolean) this.LL.LIZIZ;
        }
        return Boolean.valueOf(boolLIZIZ.booleanValue());
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.baseInfo;
    }
}
