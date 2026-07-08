package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0QoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC681460QoC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraRequestParams", required = false)
    Map<String, Object> getExtraRequestParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = true)
    String getKeyword();
}
