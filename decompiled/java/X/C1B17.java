package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1B17, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface C1B17 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "live_event_data", required = false)
    String getLiveEventData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "storyData", nestedClassType = C1B19.class, required = false)
    C1B19 getStoryData();
}
