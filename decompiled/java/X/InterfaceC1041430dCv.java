package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1041430dCv extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "event", required = true)
    String getEvent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    Map<String, Object> getParams();
}
