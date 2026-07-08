package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0cWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1015270cWj extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "disclaimerType", required = true)
    Number getDisclaimerType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageUrl", required = false)
    String getImageUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "jumpType", required = true)
    Number getJumpType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "openUrl", required = false)
    String getOpenUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pid", required = true)
    String getPid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "text", required = true)
    String getText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "webUrl", required = true)
    String getWebUrl();
}
