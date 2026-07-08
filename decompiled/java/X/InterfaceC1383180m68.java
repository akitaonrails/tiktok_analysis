package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0m68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1383180m68 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "desc", required = false)
    String getDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageUrl", required = false)
    String getImageUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "query", required = false)
    Map<String, Object> getQuery();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();
}
