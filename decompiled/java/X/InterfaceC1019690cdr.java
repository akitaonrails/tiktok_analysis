package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0cdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1019690cdr extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "category", required = false)
    String getCategory();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "creative_id", required = false)
    Object getCreativeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extParam", required = false)
    Map<String, Object> getExtParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "func", required = false)
    String getFunc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "group_id", required = false)
    String getGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "has_ad_info", required = false)
    Boolean getHasAdInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "label", required = false)
    String getLabel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_extra", required = false)
    String getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refer", required = false)
    String getRefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tag", required = false)
    String getTag();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_live", required = false)
    Boolean isLive();
}
