package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.05q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface InterfaceC1475205q2 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "excludedList", primitiveClassType = String.class, required = false)
    List<String> getExcludedList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "includedList", primitiveClassType = String.class, required = false)
    List<String> getIncludedList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "map", required = true)
    Map<String, Object> getMap();
}
