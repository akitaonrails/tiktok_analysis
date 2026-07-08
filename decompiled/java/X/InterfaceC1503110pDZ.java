package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1503110pDZ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePath", required = false)
    String getFilePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "formDataBody", nestedClassType = InterfaceC1503130pDb.class, required = false)
    List<InterfaceC1503130pDb> getFormDataBody();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "paramsOption", required = false)
    Number getParamsOption();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
