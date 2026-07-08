package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface InterfaceC2398909ad extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    Map<String, Object> getParams();
}
