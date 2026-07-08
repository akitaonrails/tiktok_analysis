package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import java.util.Map;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0eKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1084840eKw<T, M> extends AbstractC1087280eOs<T, M> {
    @Override // X.AbstractC1088350eQb
    public final Map<String, String> LJI(UploadFeatureRequest uploadFeatureRequest) {
        return uploadFeatureRequest.roomFeature;
    }

    public AbstractC1084840eKw(DataChannel dataChannel, AbstractC1084540eKS<T> abstractC1084540eKS, Class<? extends Event<M>> cls) {
        super(dataChannel, abstractC1084540eKS, cls);
    }
}
