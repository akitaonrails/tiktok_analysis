package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09VI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface C09VI extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "args", required = false)
    Map<String, Object> getArgs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source", required = false)
    String getSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = false)
    String getType();
}
