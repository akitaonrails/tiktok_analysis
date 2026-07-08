package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1875770yud extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "commonParams", required = true)
    Map<String, Object> getCommonParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = false)
    Map<String, Object> getExtraParams();
}
