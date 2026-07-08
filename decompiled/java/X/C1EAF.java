package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1EAF, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1EAF extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftEnterMethod", required = true)
    String getGiftEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftEnterPage", required = false)
    String getGiftEnterPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftEnterSource", required = true)
    String getGiftEnterSource();
}
