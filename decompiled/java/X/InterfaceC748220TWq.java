package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0TWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface InterfaceC748220TWq extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "btm", required = false)
    String getBtm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "passthrough_params", required = true)
    Map<String, Object> getPassthroughParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_initial", required = true)
    boolean isInitial();
}
