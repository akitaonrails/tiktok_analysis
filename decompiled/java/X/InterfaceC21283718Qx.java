package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.18Qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C040D
public interface InterfaceC21283718Qx extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bcm", required = true)
    Map<String, Object> getBcm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clear_old_value", required = false)
    Boolean getClearOldValue();
}
