package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1799690wvv extends XBaseParamModel {
    @InterfaceC1909207dq(option = {0, 1, 2, 3, 4})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "updateLayoutAction", required = true)
    Number getUpdateLayoutAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userIDs", primitiveClassType = String.class, required = true)
    List<String> getUserIDs();
}
