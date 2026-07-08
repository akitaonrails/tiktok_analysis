package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1799140wv2 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientKey", required = true)
    String getClientKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rewardData", required = false)
    Map<String, Object> getRewardData();
}
