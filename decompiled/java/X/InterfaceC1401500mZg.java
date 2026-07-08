package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0mZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1401500mZg extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "backURL", required = false)
    String getBackURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "campaignID", required = true)
    String getCampaignID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourcePlatformChannel", required = false)
    String getSourcePlatformChannel();
}
