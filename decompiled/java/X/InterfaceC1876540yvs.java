package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1876540yvs extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "aweme_ids", primitiveClassType = String.class, required = false)
    List<String> getAwemeIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clear_data", required = false)
    Boolean getClearData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "delete_data", primitiveClassType = Number.class, required = false)
    List<Number> getDeleteData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "has_more", required = false)
    Boolean getHasMore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "next_cursor", required = false)
    String getNextCursor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pre_cursor", required = false)
    String getPreCursor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "react_id", required = true)
    String getReactId();
}
