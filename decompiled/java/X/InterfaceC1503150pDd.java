package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1503150pDd extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extension", required = true)
    String getExtension();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = true, type = DefaultType.BOOL), isGetter = true, keyPath = "needCommonParams", required = false)
    boolean getNeedCommonParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "saveToAlbum", required = false)
    String getSaveToAlbum();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timeoutInterval", required = false)
    Number getTimeoutInterval();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
