package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.09ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2400109ap extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "height", required = false)
    Number getHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url_list", primitiveClassType = String.class, required = false)
    List<String> getUrlList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "width", required = false)
    Number getWidth();
}
