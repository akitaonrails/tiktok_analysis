package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface C0Q7Y extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "auto_send_msg_content", required = false)
    String getAutoSendMsgContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "carryup_scene", required = false)
    Number getCarryupScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "carryup_type", required = false)
    String getCarryupType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_info", required = false)
    Map<String, Object> getExtraInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nimble_params", required = false)
    Map<String, Object> getNimbleParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "origin_type", required = true)
    Number getOriginType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "passExtra", required = false)
    Map<String, Object> getPassExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "search_landing_page_request", required = false)
    Map<String, Object> getSearchLandingPageRequest();
}
