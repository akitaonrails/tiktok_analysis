package X;

import java.util.List;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088310eQX extends AbstractC1088350eQb<Boolean> implements InterfaceC1088470eQn<Boolean> {
    public C1088310eQX() {
        super(new AbstractC1084540eKS<Boolean>() { // from class: X.0eKT
            {
                Boolean bool = Boolean.TRUE;
                C0J0Q c0j0q = C0J0Q.APP;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1088470eQn
    public final Boolean LIZ() {
        List<Long> list = C472970Igh.LIZ;
        Boolean boolLIZJ = C472970Igh.LIZJ(null, false);
        if (boolLIZJ == null) {
            boolLIZJ = (Boolean) this.LL.LIZIZ;
        }
        return Boolean.valueOf(boolLIZJ.booleanValue());
    }

    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.baseInfo;
    }
}
