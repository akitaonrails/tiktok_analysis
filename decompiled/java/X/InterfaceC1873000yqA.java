package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873000yqA extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "gp", required = false)
    Map<String, Object> getGp();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "param", required = false)
    Map<String, Object> getParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = true)
    String getUid();
}
