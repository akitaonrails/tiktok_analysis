package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1801180wyK extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "categoryIds", primitiveClassType = Number.class, required = false)
    List<Number> getCategoryIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelId", required = false)
    Number getChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackingParams", nestedClassType = InterfaceC1801190wyL.class, required = false)
    InterfaceC1801190wyL getTrackingParams();
}
