package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KWQ extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomTrackParam", required = true)
    Map<String, Object> getRoomTrackParam();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "roomTrackParam", required = true)
    void setRoomTrackParam(Map<String, ? extends Object> map);
}
