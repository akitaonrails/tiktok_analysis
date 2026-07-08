package X;

import java.util.List;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088300eQW extends AbstractC1088350eQb<Float> implements InterfaceC1088470eQn<Float> {
    public C1088300eQW() {
        super(new AbstractC1084540eKS<Float>() { // from class: X.0eKr
            {
                Float.valueOf(0.0f);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088470eQn
    public final Float LIZ() {
        List<Long> list = C472970Igh.LIZ;
        Float fLJ = C472970Igh.LJ(null, false);
        return Float.valueOf(fLJ != null ? fLJ.floatValue() : ((Number) this.LL.LIZIZ).floatValue());
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.baseInfo;
    }
}
