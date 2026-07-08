package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface InterfaceC519770KZz extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cacheDuration", required = false)
    Number getCacheDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "forceFetch", required = false)
    Boolean getForceFetch();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parameters", required = false)
    Map<String, Object> getParameters();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = true)
    String getPath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isOneTimeCache", required = false)
    Boolean isOneTimeCache();
}
