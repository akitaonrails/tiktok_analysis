package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yrc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1873900yrc extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "platform", required = false)
    String getPlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prevReactIds", primitiveClassType = String.class, required = false)
    List<String> getPrevReactIds();
}
