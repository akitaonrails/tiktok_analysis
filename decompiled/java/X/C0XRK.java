package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0XRK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C040D
public interface C0XRK extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "audioUrl", required = true)
    String getAudioUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channel", required = false)
    String getChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "localKey", required = false)
    String getLocalKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isLoop", required = false)
    Boolean isLoop();
}
