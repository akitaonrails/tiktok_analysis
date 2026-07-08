package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1057540dcu extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientKey", required = false)
    String getClientKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = false)
    String getPath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "previewImageUrl", required = false)
    String getPreviewImageUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "queryParams", required = false)
    Map<String, Object> getQueryParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subtitle", required = false)
    String getSubtitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "templateType", required = false)
    Number getTemplateType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();
}
