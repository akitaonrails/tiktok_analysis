package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0QlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040E
public interface InterfaceC679660QlI extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = true)
    Map<String, Object> getTrackParams();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "trackParams", required = true)
    void setTrackParams(Map<String, ? extends Object> map);
}
