package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1ATe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface InterfaceC2179921ATe extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraEventParams", required = false)
    Map<String, Object> getExtraEventParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftId", required = false)
    Number getGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "guideType", required = false)
    String getGuideType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "triggerName", required = false)
    String getTriggerName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = true)
    String getType();
}
