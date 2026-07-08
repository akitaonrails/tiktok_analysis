package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0fAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1116940fAi extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "parameters", required = true)
    Map<String, Object> getParameters();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = true)
    String getPath();
}
