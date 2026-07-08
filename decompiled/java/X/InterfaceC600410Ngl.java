package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ngl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC600410Ngl extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "perfParams", required = false)
    Map<String, Object> getPerfParams();
}
