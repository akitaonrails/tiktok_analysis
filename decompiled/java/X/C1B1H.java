package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1B1H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface C1B1H extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "creativeID", required = false)
    String getCreativeID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = false)
    Map<String, Object> getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupID", required = false)
    String getGroupID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "label", required = true)
    String getLabel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = false)
    String getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refer", required = false)
    String getRefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tag", required = true)
    String getTag();
}
