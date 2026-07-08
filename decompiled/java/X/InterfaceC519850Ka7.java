package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ka7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface InterfaceC519850Ka7 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "auto_fill_text", required = false)
    String getAutoFillText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "default_panel", required = false)
    Number getDefaultPanel();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "other", type = DefaultType.STRING), isGetter = true, keyPath = "mode", required = false)
    String getMode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "show_entrance", required = false)
    String getShowEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "track_info", required = false)
    Map<String, Object> getTrackInfo();
}
