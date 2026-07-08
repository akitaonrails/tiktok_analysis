package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eKC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1084380eKC<T, M> extends AbstractC1088260eQS<T, M> {
    @Override // X.AbstractC1088350eQb
    public Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.roomFeature;
    }

    public AbstractC1084380eKC(DataChannel dataChannel, AbstractC1084540eKS<T> abstractC1084540eKS, Class<? extends NextLiveData<M>> cls) {
        super(dataChannel, abstractC1084540eKS, cls);
    }
}
