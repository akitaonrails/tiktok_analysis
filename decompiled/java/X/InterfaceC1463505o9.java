package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.05o9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface InterfaceC1463505o9 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bid", required = true)
    String getBid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cacheTTL", required = true)
    Number getCacheTTL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "campaignId", required = true)
    String getCampaignId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pid", required = true)
    String getPid();
}
