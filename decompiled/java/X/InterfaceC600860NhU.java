package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC600860NhU extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "perfParams", required = true)
    Map<String, Object> getPerfParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isSticky", required = true)
    boolean isSticky();
}
