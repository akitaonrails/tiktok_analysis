package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1876610yvz extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "aweme_list", nestedClassType = InterfaceC1876680yw6.class, required = true)
    List<InterfaceC1876680yw6> getAwemeList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "load_behavior", required = true)
    String getLoadBehavior();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "next_cursor", required = true)
    String getNextCursor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pre_cursor", required = true)
    String getPreCursor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "react_id", required = true)
    String getReactId();
}
