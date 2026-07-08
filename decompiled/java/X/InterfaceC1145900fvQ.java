package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0fvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1145900fvQ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "container_list", primitiveClassType = String.class, required = false)
    List<String> getContainerList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enable_go_back", required = false)
    Number getEnableGoBack();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "need_wait_complete_transition", required = false)
    Boolean getNeedWaitCompleteTransition();
}
