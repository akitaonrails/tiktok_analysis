package X;

import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1088400eQg<T> extends AbstractC1088350eQb<T> {
    public AbstractC1088400eQg(AbstractC1084540eKS<T> abstractC1084540eKS) {
        super(abstractC1084540eKS);
    }

    @Override // X.AbstractC1088350eQb
    public Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.userProfile;
    }
}
