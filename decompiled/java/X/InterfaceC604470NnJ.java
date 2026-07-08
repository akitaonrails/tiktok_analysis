package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC604470NnJ extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "gps_coordinate", required = true)
    Map<String, Object> getGpsCoordinate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_supported", required = true)
    Boolean isSupported();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gps_coordinate", required = true)
    void setGpsCoordinate(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_supported", required = true)
    void setSupported(Boolean bool);
}
