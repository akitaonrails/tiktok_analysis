package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.167e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface InterfaceC207228167e extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "emotes_show_style", required = false)
    Number getEmotesShowStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logInfo", required = false)
    Map<String, Object> getLogInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "max_count", required = true)
    Number getMaxCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "max_height", required = true)
    Number getMaxHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "max_size", required = true)
    Number getMaxSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "max_width", required = true)
    Number getMaxWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "min_height", required = true)
    Number getMinHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "min_width", required = true)
    Number getMinWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "panel_height_ratio", required = false)
    Number getPanelHeightRatio();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ratio", required = true)
    Number getRatio();
}
