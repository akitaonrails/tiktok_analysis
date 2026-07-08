package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0dIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1044930dIZ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accessKey", required = true)
    String getAccessKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelList", primitiveClassType = String.class, required = true)
    List<String> getChannelList();
}
