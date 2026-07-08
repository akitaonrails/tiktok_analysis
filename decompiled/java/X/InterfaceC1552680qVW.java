package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0qVW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1552680qVW extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "channel", required = true)
    String getChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "md5", required = true)
    String getMd5();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "packageType", required = true)
    Number getPackageType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    Number getSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "urlList", primitiveClassType = String.class, required = true)
    List<String> getUrlList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = true)
    Number getVersion();
}
