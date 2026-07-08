package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1877300yx6 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "music", required = false)
    Map<String, Object> getMusic();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourceId", required = true)
    String getSourceId();
}
