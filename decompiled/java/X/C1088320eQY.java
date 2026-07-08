package X;

import java.util.List;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088320eQY extends AbstractC1088350eQb<Float> implements InterfaceC1088470eQn<Float> {
    public C1088320eQY() {
        super(new AbstractC1084540eKS<Float>() { // from class: X.0eQZ
            {
                Float.valueOf(0.0f);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088470eQn
    public final Float LIZ() {
        List<Long> list = C472970Igh.LIZ;
        Float fLJI = C472970Igh.LJI(null, false);
        return Float.valueOf(fLJI != null ? fLJI.floatValue() : ((Number) this.LL.LIZIZ).floatValue());
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.baseInfo;
    }
}
