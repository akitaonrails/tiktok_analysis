package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.18RD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C040D
public interface C18RD extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bcm", required = false)
    Map<String, Object> getBcm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "btm", required = true)
    String getBtm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "chain_length", required = false)
    Number getChainLength();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_domain_standard", required = false)
    Boolean isDomainStandard();
}
